package SeleniumDay5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String month="6";
		String date="15";
		String year="2027";
		String[] Expectedlist= {month,date,year};
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
driver.findElement(By.xpath("//button[contains(@class,'react-date-picker__calendar-button react-date-picker__button')]")).click();
driver.findElement(By.xpath("//span[contains(@class,'react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from')]")).click();
driver.findElement(By.xpath("//span[contains(@class,'react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from')]")).click();
driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
List<WebElement> a=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
for(int i=0;i<a.size();i++)
{
	System.out.println(a.get(i).getAttribute("value"));
	Assert.assertEquals(a.get(i).getAttribute("value"), Expectedlist[i]);
}

driver.close();

	}

}
