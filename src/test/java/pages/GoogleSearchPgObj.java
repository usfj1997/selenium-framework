package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPgObj {
    WebDriver driver;
    By searchBox = By.className("gLFyf");

    public GoogleSearchPgObj (WebDriver driver1) {
        this.driver = driver1;
    }

    public void setTextInSearchBox (String text) {
        driver.findElement(searchBox).sendKeys(text);
        driver.findElement(searchBox).sendKeys(Keys.ENTER);
    }
}
