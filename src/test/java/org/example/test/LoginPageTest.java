package org.example.test;

import org.example.base.BaseTest;
import org.example.page.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @Before
    public void before(){
        loginPage = new LoginPage(getDriver());
    }

    @Test
    public void homePageTest(){
        Assert.assertTrue("Home page could not be opened!", getDriver().getTitle().equals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi"));
    }

    @Test
    public void logInTest(){
        loginPage.hoverProfileandClick();
        loginPage.enterEmail("testinium");
        loginPage.enterPass("123456789");
        loginPage.clickLogin();
        Assert.assertTrue("Could not log in!", getDriver().getTitle().equals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi"));
    }

    @Test
    public void searchTest(){
        loginPage.search("bilgisayar");
        loginPage.clickSearch();
        Assert.assertTrue("Could not search!", getDriver().getTitle().equals("Bilgisayar - GittiGidiyor"));
    }

    @After
    public void after(){
        tearDown();
    }

}
