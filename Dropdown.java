import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://bachelorshoes.com/collections/all-products");
		driver.manage().window().maximize();

		Select choice=new Select(driver.findElement(By.xpath(".//*[@id='page-content']/div/select")));
		choice.selectByValue("manual");
		
		Select choice1=new Select(driver.findElement(By.xpath(".//*[@id='page-content']/div/select")));
		choice1.selectByValue("price-ascending");
		
	
	    Select choice2=new Select(driver.findElement(By.xpath(".//*[@id='page-content']/div/select")));
		choice2.selectByValue("price-descending");
		

	    Select choice3=new Select(driver.findElement(By.xpath(".//*[@id='page-content']/div/select")));
		choice3.selectByValue("created-descending");

	    Select choice4=new Select(driver.findElement(By.xpath(".//*[@id='page-content']/div/select")));
		choice4.selectByValue("best-selling");
		
		driver.quit();
	}

}
