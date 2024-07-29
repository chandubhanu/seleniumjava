package SeleniumDay2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class dropdownloopingUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://rahulshettyacademy.com/dropdownsPractise/");
driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(2000);
System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
for(int i=1;i<5;i++)
{
	driver.findElement(By.id("hrefIncAdt")).click();
	}
//int i=1;
//while(i<5)
//{
//	driver.findElement(By.id("hrefIncAdt")).click();
//	i++;
//	
//}
driver.findElement(By.id("btnclosepaxoption")).click();
System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

 }

}
