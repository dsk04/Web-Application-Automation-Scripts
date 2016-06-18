
import java.io.IOException;
import java.util.List;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindBrokenImages 
{

private static int invalidImages=0;



public static void main(String args[])
{
	WebDriver driver;

	String url="http://www.bachelorshoes.com";
		driver=new FirefoxDriver();
		driver.get(url);
	
		List<WebElement> listOfImages=driver.findElements(By.tagName("img"));
		
	    System.out.println("Total no.of images ::" +listOfImages.size());
	    
	    for(WebElement imgElement : listOfImages)
	    {
	    	System.out.println(imgElement.getText());
	    	
	    	if(imgElement!=null)
	    	{
	    	verifyImageStatus(imgElement);
	    }
	
}


    System.out.println("Total no of Invalid Images ::" + invalidImages);
    driver.quit();

}




public void validateInvalidImages1()
{
	
}


public static void verifyImageStatus(WebElement imgElement) {
	// TODO Auto-generated method stub
	
	try
	{
		HttpClient httpClient=HttpClientBuilder.create().build();
		String srcElement=imgElement.getAttribute("src");
		HttpGet httpRequest=new HttpGet(srcElement);
		
		org.apache.http.HttpResponse httpResponse= httpClient.execute(httpRequest);
		StatusLine httpResponseLine=httpResponse.getStatusLine();
		int responseCode=httpResponseLine.getStatusCode();
		
		if(responseCode!=200)
		{
			invalidImages++;
			
		}
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}



public void teardown()
{
	WebDriver driver = null;
	driver.close();
	driver.quit();
}




}

