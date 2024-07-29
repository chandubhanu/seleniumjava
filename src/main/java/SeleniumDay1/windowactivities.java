package SeleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowactivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("ABCD");
		driver.manage().addCookie(null);
		driver.get("Http://google.com");
		driver.navigate().to("https://gmail.com");
		driver.navigate().back();
		driver.navigate().forward();
		}

}
