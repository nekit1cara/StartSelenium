package Homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework4 {
    @Test
    public void writer() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\IDE\\StartSelenium\\StartSelenium\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/inputs");
        WebElement find = driver.findElement(By.xpath("//input[@type='number']"));
        Thread.sleep(5000);
        find.sendKeys("555121");
        Thread.sleep(5000);
        driver.quit();
    }
}
