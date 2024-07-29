package SeleniumDay4;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/loginpagePractise/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.cssSelector(".blinkingText")).click();
Set<String> windows=driver.getWindowHandles();
Iterator<String> it =windows.iterator();
String parentID=it.next();
String childID=it.next();
driver.switchTo().window(childID);

String Emailid=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];


System.out.println(Emailid);
driver.switchTo().window(parentID);
driver.findElement(By.id("username")).sendKeys(Emailid);
	}

}
