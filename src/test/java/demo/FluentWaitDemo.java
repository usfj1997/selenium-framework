package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;
//import java.util.function.Function;

public class FluentWaitDemo {
    @Test
    public static void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        WebDriver driver = new ChromeDriver(options);
        WebDriver driver = new EdgeDriver();

        driver.get("https://google.com");
        WebElement searchKey = driver.findElement(By.name("q"));
        searchKey.sendKeys("Abcd");
        searchKey.sendKeys(Keys.RETURN);
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(webDriver -> {
            WebElement linkElement = driver.findElement(By.className("DKV0Md"));
            if (linkElement.isEnabled()) {
                System.out.println("Link found");
            }
            return linkElement;
        });

        element.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
