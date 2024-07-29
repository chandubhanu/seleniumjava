package SeleniumDay2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.findElement(By.xpath("//input[@placeholder='Type to Select']")).sendKeys("Ind");
Thread.sleep(3000);
List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
for(WebElement option:options)
{
if(option.getText().equalsIgnoreCase("India"))
{
option.click();
break;
}
}


	}
}
