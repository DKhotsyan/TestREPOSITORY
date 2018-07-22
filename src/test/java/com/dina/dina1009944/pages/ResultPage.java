package com.dina.dina1009944.pages;

import com.dina.dina1009944.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ResultPage extends BasePage {

    public ResultPage(WebDriver currentDriver) {
        this.driver = currentDriver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//*[@role='main']/descendant::h2[1]/a")
    private WebElement resultLocator;

    public String getResult() {
        String result=resultLocator.getText();
        return result;
    }
}
