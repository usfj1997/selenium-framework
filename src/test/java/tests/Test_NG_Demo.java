package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GoogleSearchPgObj;

public class Test_NG_Demo {
    private static WebDriver driver = null;

    @BeforeTest
    public void setUpTest () {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    @Test
    public static void googleSearchTest() {
        GoogleSearchPgObj searchPgObj = new GoogleSearchPgObj( driver);

        driver.get("https://google.com");
        searchPgObj.setTextInSearchBox("Aloha");
    }

    @AfterTest
    public void tearTest () {
        driver.quit();
    }
}

