package com.dina.dina1009944.tests;

import com.dina.dina1009944.tests.BaseTest;
import com.dina.dina1009944.pages.ResultPage;
import com.dina.dina1009944.pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ResultTest extends BaseTest {

    @Test
    public void search() {
        this.driver.get("https://www.yandex.ru/");

        SearchPage searchPage = new SearchPage(this.driver);
        ResultPage resultPage = new ResultPage(this.driver);

        searchPage.searchIn("Погода в Пензе");
        searchPage.clickFindButton();
        String str = "Погода в Пензе";
        String results = resultPage.getResult();
        Assert.assertEquals(str, results);
    }
}