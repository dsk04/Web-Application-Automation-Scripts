
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
  
public boolean accept = true;

public Object checkErrors;

public WebDriver driver=new FirefoxDriver();

  public void testLogin() throws InterruptedException 
  {
  Thread.sleep(100);
  driver.get("https://bachelorshoes.com/");
  driver.findElement(By.xpath(".//*[@id='customer_login_link']")).click();
  driver.findElement(By.xpath(".//*[@id='customer_email']")).clear();
  driver.findElement(By.xpath(".//*[@id='customer_email']")).sendKeys("dishantkalyani@gmail.com");
  driver.findElement(By.xpath(".//*[@id='customer_password']")).clear();
  driver.findElement(By.xpath(".//*[@id='customer_password']")).sendKeys("inspiration");
  Thread.sleep(100);
  driver.findElement(By.xpath("//input[@value='Sign In']")).click();
  }


  public void check() throws Exception {
    driver.quit();
    String Error = checkErrors.toString();
    if (!"".equals(Error)) {
      fail(Error);
    }
  }

  public void fail(String error) {
  // TODO Auto-generated method stub
  
}


public boolean isLoginSuccessful(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

public boolean isPopUpPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public String getResults() {
    try {
      Alert a1 = driver.switchTo().alert();
      String a2Text = a1.getText();
      if (accept) {
        a1.accept();
      } else {
        a1.dismiss();
      }
      return a2Text;
    } finally {
      accept = true;
    }
  }
}



public class Main2 {

  public static void main(String args[])throws InterruptedException {
    
    Login l = new Login();
      try {
        l.testLogin();
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
        
    // TODO Auto-generated method stub

  }

} 