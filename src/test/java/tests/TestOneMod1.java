package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.GoogleSearchPgObj;

public class TestOneMod1 {
    protected static WebDriver driver = null;
    public static void main(String[] args) {
        googleSearchTest();
    }

    public static void googleSearchTest() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();

        GoogleSearchPgObj searchPgObj = new GoogleSearchPgObj( driver);

        driver.get("https://google.com");
        searchPgObj.setTextInSearchBox("Aloha");
        driver.quit();
    }
}

