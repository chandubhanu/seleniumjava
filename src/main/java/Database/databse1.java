package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class databse1 {
    static String host = "DGA1APP39AXODV";
    static String port = "1433";

    private static final String DB_URL = "jdbc:sqlserver://" + host + ":" + port + ";databaseName=Metso-Test;encrypt=false";
    private static final String USER = "sa";
    private static final String PASS = "abc-123";

    public static void main(String[] args) throws SQLException {
    	WebDriver driver=new ChromeDriver();
        Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM Users");
        
        while(rs.next())
        {
        	driver.get("https://newdb-test.imoee.apteancloud.com/OEE/Login.aspx");
        	 driver.findElement(By.xpath("//input[@id='tbUserName']")).clear();
        driver.findElement(By.xpath("//input[@id='tbUserName']")).sendKeys(rs.getString("UserName"));
      
        	
        }
        
      
    }
}
