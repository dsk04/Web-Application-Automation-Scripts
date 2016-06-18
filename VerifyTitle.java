
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTitle {
	

		public void verifyApplicationTitle()
		{
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://bachelorshoes.com");
			driver.getTitle();
			
			//Actual title
			
			String title=driver.getTitle();
			
			System.out.println("Title is "+title);
			
			String expected_title="Bachelor Shoes";
			
		if(title.equalsIgnoreCase(expected_title))
		{
			System.out.println("Test cases passed");
		}
		else
		{
			System.out.println("Test cases failed");
		}
			
			
		}

	
public static void main(String a[])
{
VerifyTitle t1=new VerifyTitle();
t1.verifyApplicationTitle();
}
}
