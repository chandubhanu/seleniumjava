package SeleniumDay6;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
SoftAssert linkcheck=new SoftAssert();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");

List<WebElement> links=driver.findElements(By.xpath("//li[@class='gf-li'] //a"));
for(WebElement link:links) {
	String url=link.getAttribute("href");
	HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
	int a=conn.getResponseCode();
	linkcheck.assertTrue(a<400,"The link with text is"+link.getText()+"is code"+a);
	
}
linkcheck.assertAll();
}
}