package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestOne {
    public static void main(String[] args) throws InterruptedException {
        TestOne.searchGoogle();
    }
    public static void searchGoogle () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
//        Opening google.com
        driver.get("https://www.google.com/");
//        enter text in the text box
        WebElement searchBox = driver.findElement(By.className("gLFyf"));
        searchBox.sendKeys("ab");
        Thread.sleep(2000);
//        searchBox.sendKeys("\\uE007");
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.close();
        System.out.println("Test One ✅");
        driver.quit();

    }

}
