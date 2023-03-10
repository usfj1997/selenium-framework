package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.GoogleSearchPage;

public class TestOneMod {
    protected static WebDriver driver = null;
    public static void main(String[] args) throws InterruptedException {
        TestOneMod.searchGoogle();
    }

    public static void searchGoogle () throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
//        Opening google.com
        driver.get("https://www.google.com/");
//        enter text in the text box
//        WebElement searchBox = driver.findElement(By.className("gLFyf"));
//        searchBox.sendKeys("ab");
        GoogleSearchPage.searchBox(driver).sendKeys("ab");

        Thread.sleep(2000);
        GoogleSearchPage.searchBox(driver).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.close();
        System.out.println("Test One ✅");
        driver.quit();

    }

}
