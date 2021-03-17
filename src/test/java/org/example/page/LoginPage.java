package org.example.page;

import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;

import static org.example.constants.Constants.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage hoverProfileandClick(){
        hoverElement(MAIN_PROFILE);
        click(LOGIN);
        return this;
    }

    public LoginPage enterEmail(String product){
        sendKeys(L_EMAIL,product);
        return this;
    }

    public LoginPage enterPass(String product){
        sendKeys(L_PASSWORD,product);
        return this;
    }

    public LoginPage clickLogin(){
        click(L_LOGINBUTTON);
        return this;
    }

    public LoginPage search(String search){
        sendKeys(M_SEARCH,search);
        return this;
    }

    public LoginPage clickSearch(){
        click(SEARCH_ICON);
        return this;
    }

    public LoginPage clickProduct(){
        click(PRODUCT);
        return this;
    }

    public LoginPage clickBasket(){
        click(BASKET);
        return this;
    }



}
