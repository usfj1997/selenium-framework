package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public class DesiredCapabilitiesDemo {
    @BeforeTest
    public static void setUpTest(String[] args) {
        DesiredCapabilities caps = new DesiredCapabilities();
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Meow\n");
        driver.quit();
    }
}