package com.dina.dina1009944;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FirstTest {

    public WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dina\\Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.yandex.ru/");
    }

    @Test
        public void openYandexTest(){

            WebElement searchInput=driver.findElement(By.id("text"));
            searchInput.sendKeys( "Погода в Пензе");
            WebElement loginButton = driver.findElement(By.cssSelector("button[class='button suggest2-form__button button_theme_websearch button_size_ws-head i-bem button_js_inited']"));
            loginButton.click();

        WebElement checkequal = driver.findElement(By.cssSelector("a[href='https://yandex.ru/pogoda/penza?from=serp_title']"));
        String link = checkequal.getText();
        Assert.assertEquals("Погода в Пензе", link);
        }

        @AfterClass
        public void closebrowser() {
           driver.quit();
        }

    }
