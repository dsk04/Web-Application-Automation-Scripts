
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Search {
	
 public WebDriver driver= new FirefoxDriver();
  public boolean accept = true;
  public StringBuffer verificationErrors = new StringBuffer();

  public void testSearch() throws InterruptedException {
	  
	driver.get("http://bachelorshoes.com/");
    driver.findElement(By.id("search-field")).clear();
    driver.findElement(By.id("search-field")).sendKeys("loafers");
    driver.findElement(By.id("search-submit")).click();
    driver.findElement(By.id("search-field")).clear();
    driver.findElement(By.id("search-field")).sendKeys("slippers");
    driver.findElement(By.id("search-submit")).click();
    Thread.sleep(1000);
    driver.close();
    driver.quit();
  }


  public void search() throws Exception {
    driver.quit();
    String Error = verificationErrors.toString();
    if (!"".equals(Error)) {
      fail(Error);
    }
  }

  public void fail(String error) {
	// TODO Auto-generated method stub
	
}


public boolean isElementGiven(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  public boolean isAlertGiven() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public String closeAlertAndGetItsText() {
    try {
      Alert a3 = driver.switchTo().alert();
      String alertText = a3.getText();
      if (accept) {
        a3.accept();
      } else {
        a3.dismiss();
      }
      return alertText;
    } finally {
      accept = true;
    }
  }
}




public class Main4 {

  public static void main(String[] args)throws InterruptedException {
    // TODO Auto-generated method stub
    Search s1=new Search();
    try {
      s1.testSearch();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}

