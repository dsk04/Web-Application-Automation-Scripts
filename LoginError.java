import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginError {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://bachelorshoes.com/");
		driver.findElement(By.xpath(".//*[@id='customer_login_link']")).click();
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		
		
		String actual_error=driver.findElement(By.xpath(".//*[@id='customer_login']/div[1]/ul/li")).getText();
		
        String expected_error="Invalid login credentials.";
        
      //  Assert.assertEquals(actual_error,expected_error);
        
   
    //  System.out.println("Test Case Passed");
      
      if(actual_error.equalsIgnoreCase(expected_error))
    	  System.out.println("Test Case Passed");
      else
          System.out.println("Test Case Failed");
	} 

}
