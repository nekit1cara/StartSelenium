package Homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework1 {
    @Test
    public void AddElements() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        Thread.sleep(1000);
        for (WebElement c : buttons) {
            c.click();
            Thread.sleep(1000);
        }
        Thread.sleep(1000);
        for (WebElement c : buttons) {
            c.click();
            Thread.sleep(1000);
        }
        Thread.sleep(1000);
        for (WebElement c : buttons) {
            c.click();
            Thread.sleep(1000);
        }

            List<WebElement> buttons2 = driver.findElements(By.className("added-manually"));
            for (WebElement f : buttons2) {
                f.click();
                Thread.sleep(1000);
            }
            driver.quit();

        }
    }
