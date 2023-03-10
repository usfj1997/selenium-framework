package asynergen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserTest {
    public static void main(String[] args) throws InterruptedException {
//        Edge
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://mvnrepository.com/");
        driver.close();
        Thread.sleep(2000);
        driver.quit();
    }
}
