import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


	public class Register {

		public void testRegister()
		{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://bachelorshoes.com/");

		    driver.findElement(By.xpath("//a[@id='customer_register_link']")).click();
		    driver.findElement(By.xpath("//input[@id='first_name']")).clear();
		    driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Dishant");
		    driver.findElement(By.xpath("//input[@id='last_name']")).clear();
		    driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Kalyani");
		    driver.findElement(By.xpath("//input[@id='email']")).clear();
		    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dishantkalyani@gmail.com");
		    driver.findElement(By.xpath("//input[@id='password']")).clear();
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("inspiration");
		    driver.findElement(By.xpath("//input[@value='Create']")).click();
		    System.out.println("\n Test case passed");
		    driver.close();
		    driver.quit();
		}
	}

	public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Register r1= new Register ();
          r1.testRegister();
          
         
	}

}
