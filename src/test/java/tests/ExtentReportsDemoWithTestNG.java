package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExtentReportsDemoWithTestNG {
    WebDriver driver;
    ExtentReports extent;
    ExtentSparkReporter sparkReporter;
    @BeforeSuite
    public void setUp() {
        driver = new EdgeDriver();
        extent = new ExtentReports();
        sparkReporter = new ExtentSparkReporter("Spark.html");
        extent.attachReporter(sparkReporter);
    }

    @Test
    public void test1() {
        ExtentTest test = extent.createTest("My first Test", "Sample description");
        driver.get("https://google.com");
        test.pass("Navigated to Google");

        test.log(Status.INFO, "This step shows usage of log (status, details)");
        test.info("This step shows usage of info(details)");
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");
    }

    @Test
    public void test2() {
        ExtentTest test = extent.createTest("My second Test", "Sample description");
        test.log(Status.INFO, "This step shows usage of log (status, details)");
        test.info("This step shows usage of info(details)");
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot1.png");
    }
    @AfterSuite
    public void tearDown() {
        driver.quit();
        extent.flush();
    }
}
