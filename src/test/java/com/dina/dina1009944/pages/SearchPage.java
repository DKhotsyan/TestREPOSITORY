package com.dina.dina1009944.pages;

import com.dina.dina1009944.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver currentDriver) {
        this.driver = currentDriver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath="//input[@id = 'text']")
    private WebElement searchInput;

    @FindBy(xpath= "//button[@type = 'submit']")
    private WebElement findButton;

    public void inputSearch (final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchIn (String text) {
        searchInput.sendKeys(text);
    }
    public void clickFindButton() {
        findButton.click();
    }
}