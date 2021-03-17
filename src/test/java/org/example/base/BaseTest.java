package org.example.base;

import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    static WebDriver webDriver = null;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

        ChromeOptions option = new ChromeOptions();
        option.addArguments("test-type");
        option.addArguments("disable-popup-blocking");
        option.addArguments("ignore-certificate-errors");
        option.addArguments("disable-translate");
        option.addArguments("start-maximized");
        option.addArguments("disable-automatic-password-saving");
        option.addArguments("allow-silent-push");
        option.addArguments("disable-infobars");
        option.addArguments("--disable-notifications");
        //option.setExperimentalOption("useAutomationExtension", false);

        setDriver(new ChromeDriver(option));
        getDriver().navigate().to("https://www.gittigidiyor.com/");

        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

    }

    public static WebDriver getDriver() {
        return webDriver;
    }

    public static void setDriver(WebDriver webDriver) {
        BaseTest.webDriver = webDriver;
    }

    @After
    public void tearDown(){
        getDriver().quit();
    }

}