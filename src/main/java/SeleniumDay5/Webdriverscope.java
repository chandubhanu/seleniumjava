package SeleniumDay5;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webdriverscope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//Print the no of links in the page
int link=driver.findElements(By.tagName("a")).size();
System.out.println(link);
//Limiting Webdriver Scope
WebElement footer= driver.findElement(By.id("gf-BIG"));
System.out.println(footer.findElements(By.tagName("a")).size());
WebElement footer1=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

	System.out.println(footer1.findElements(By.tagName("a")).size());
	//click on every link check if they are opned or not
	for(int i=1;i<footer1.findElements(By.tagName("a")).size();i++)
	{
		String Ctrl=Keys.chord(Keys.CONTROL,Keys.ENTER);
		footer1.findElements(By.tagName("a")).get(i).sendKeys(Ctrl);
		Thread.sleep(5000L);
	}
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	
	
	}

}
