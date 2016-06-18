import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class Links {
 
 public static void main(String a[]) 
 {
 WebDriver driver=new FirefoxDriver();
 
 driver.manage().window().maximize();
 
 driver.get("http://bachelorshoes.com/");
 
 List<WebElement> links=driver.findElements(By.tagName("a"));
 
 System.out.println("Total number of links are "+links.size());
 
 for(int i=0;i<links.size();i++)
 {
 
 WebElement element= links.get(i);
 
 String url=element.getAttribute("href");
 
 verifyLinkActive(url);
 
 }
 driver.quit();
 
 }
 
 public static void verifyLinkActive(String linkUrl)
 {
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(2000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
           else
           {
        	   System.out.println("Links are broken"+linkUrl);
           }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
       
     
       
    } 
 
 
 
}