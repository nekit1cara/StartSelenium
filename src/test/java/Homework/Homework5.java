package Homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework5 {
    @Test
    public void clicker(){
        System.setProperty("webdriver.chrome.driver","C:\\IDE\\StartSelenium\\StartSelenium\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        WebElement clickFoo = driver.findElement(By.className("button"));
        clickFoo.click();
        driver.quit();
    }
}
