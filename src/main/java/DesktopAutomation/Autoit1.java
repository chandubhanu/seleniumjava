package DesktopAutomation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autoit1 {

    public static void main(String[] args) throws InterruptedException, IOException {
        String downloadPath = System.getProperty("user.dir") + "\\Downloads";
        System.out.println("Download Path: " + downloadPath);

        // Chrome will provide the below 3 lines of code
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadPath);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://www.ilovepdf.com/word_to_pdf");
            driver.findElement(By.id("pickfiles")).click();
            Thread.sleep(3000); // Ensure the file dialog is open before running AutoIt script

            String command = "C:\\Users\\cprakash\\Downloads\\autoit-v3\\install\\SciTe\\Autiit2 (2).exe";
            System.out.println("Executing command: " + command);
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor(); // Wait for the AutoIt script to finish

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            By Button = By.id("processTaskTextBtn");
            wait.until(ExpectedConditions.visibilityOfElementLocated(Button));
            driver.findElement(Button).click();
            By download = By.id("pickfiles");
            wait.until(ExpectedConditions.visibilityOfElementLocated(download));

            // Check if the file is downloaded in your system
            String fileName = "Specifiction Halmstad Tata Steel Visualize.pdf";
            File file = new File(downloadPath + "\\" + fileName);
            System.out.println("Checking for file: " + file.getAbsolutePath());
            Thread.sleep(10000); // Increased sleep time to ensure file is fully downloaded

            if (file.exists()) {
                System.out.println("File Found: " + file.getAbsolutePath());
                if (file.delete()) {
                    System.out.println("File Deleted");
                } else {
                    System.out.println("Failed to delete file. It may be in use.");
                }
            } else {
                System.out.println("File not found at: " + file.getAbsolutePath());
            }
        } finally {
            driver.quit();
        }
    }
}
