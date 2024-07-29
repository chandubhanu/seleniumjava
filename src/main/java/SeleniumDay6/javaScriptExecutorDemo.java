package SeleniumDay6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class javaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scroll(0,500)");
Thread.sleep(3000);
js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");

List<WebElement> amount=driver.findElements(By.xpath("//div[@class='tableFixHead'] /table[@id='product'] /tbody /tr /td[4]"));
int sum=0;
for(int i=0;i<amount.size();i++)
{
	sum=sum+Integer.parseInt(amount.get(i).getText());
}
	
	System.out.println(sum);
	
	int a=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());

	Assert.assertEquals(a,sum);	
	
	
	}

}