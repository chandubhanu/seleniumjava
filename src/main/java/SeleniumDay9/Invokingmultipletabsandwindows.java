package SeleniumDay9;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invokingmultipletabsandwindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> window=driver.getWindowHandles();
	Iterator<String> it=window.iterator();
	String parentwindow=it.next();
	String Childwindow=it.next();
	driver.switchTo().window(Childwindow);
	driver.get("https://rahulshettyacademy.com/");
	String coursename=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
	driver.switchTo().window(parentwindow);
	WebElement name=driver.findElement(By.cssSelector("[name='name']"));
	name.sendKeys(coursename);
	//screenshot
	File SRC=name.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(SRC,new File("C:\\Users\\cprakash\\screenshot3.png"));
	//Validating the Web element height and width
	
	System.out.println(name.getRect().getDimension().getHeight());
	System.out.println(name.getRect().getDimension().getWidth());
		
		
	}

}
