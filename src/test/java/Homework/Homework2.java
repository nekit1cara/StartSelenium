package Homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class Homework2 {
    @Test
    public void Uploader() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement fileInput = driver.findElement(By.id("file-upload"));
        Thread.sleep(5000);
        fileInput.sendKeys("C:/Users/caran/OneDrive/Рабочий стол/test uploader.txt");
        Thread.sleep(5000);
        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        Thread.sleep(5000);
        uploadButton.click();
        Thread.sleep(5000);

        driver.quit();
    }
}
