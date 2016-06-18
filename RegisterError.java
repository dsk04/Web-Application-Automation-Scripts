import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RegisterError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://bachelorshoes.com/");
		driver.findElement(By.xpath("//a[@id='customer_register_link']")).click();
		driver.findElement(By.xpath("//input[@id='first_name']")).clear();
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Dishant");
		driver.findElement(By.xpath("//input[@id='last_name']")).clear();
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Kalyani");
		driver.findElement(By.xpath("//input[@value='Create']")).click();
		
		String actual_error=driver.findElement(By.xpath(".//*[@id='create_customer']/div[1]/ul/li[1]")).getText();
		String actual_error1=driver.findElement(By.xpath(".//*[@id='create_customer']/div[1]/ul/li[2]")).getText();
		
		   String expected_error="Email can't be blank.";
		   String expected_error1="Password can't be blank.";
		   
		 
		   if(actual_error.equalsIgnoreCase(expected_error))
	
		   System.out.println("Test cases are passed");

	        
		   else
		   
			   System.out.println("Test cases are Failed");
   
		   
        if(actual_error1.equalsIgnoreCase(expected_error1))
        
        	System.out.println("Test cases are passed");
        
        
        else
        
        	System.out.println("Test cases are Failed");
        
}
}
