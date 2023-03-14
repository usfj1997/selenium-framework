package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class ExtentReportsBasicsDemo {
    private static WebDriver driver = null;
    public static void main(String[] args) {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("Extent.html");
        extent.attachReporter(sparkReporter);

        ExtentTest test1 = extent.createTest("Google Search Test", "This is a test to validate the google search functionality");

        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();

        test1.log(Status.INFO, "Starting Test Case");
        driver.get("https://google.com");
        test1.pass("Navigated to google.com");
        driver.findElement(By.name("q")).sendKeys("Automation");
        test1.pass("Entered text in searchbox");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        test1.pass("Pressed Enter key");
        driver.quit();
        test1.pass("Closed the browser");
        test1.info("Test completed");
        extent.flush();


    }
}
