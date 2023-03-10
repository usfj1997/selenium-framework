package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestOne {
    public static void main(String[] args) throws InterruptedException {
        TestOne.searchGoogle();
    }
    public static void searchGoogle () throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
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
