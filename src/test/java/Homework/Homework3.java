package Homework;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Homework3 {

    @Test
    public void Download() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\IDE\\StartSelenium\\StartSelenium\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/download");
       List<WebElement> connect = driver.findElements(By.xpath("//a[@href]"));
       for (WebElement w : connect){
           ((JavascriptExecutor) driver).executeScript("arguments[0].click;", w);
       }
        driver.quit();
    }
}
