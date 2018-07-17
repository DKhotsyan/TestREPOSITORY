package com.dina.dina1009944;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.yandex.ru/");
    }
    @Test
    public void openYandexTest() {
        WebElement searchInput=driver.findElement(By.id("text"));
        String str = "Погода в Пензе";
        searchInput.sendKeys(str);
        WebElement findButton = driver.findElement(By.cssSelector("button[type='submit']"));
        findButton.click();
        WebElement checkEqual = driver.findElement(By.xpath("//*[@role='main']/descendant::h2[1]/a"));
        String link = checkEqual.getText();
        Assert.assertEquals(str, link);
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }

}
