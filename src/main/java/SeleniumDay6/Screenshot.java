package SeleniumDay6;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("http://google.com");
File SRC=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(SRC,new File("C:\\Users\\cprakash\\screenshot.png"));

	}

}
