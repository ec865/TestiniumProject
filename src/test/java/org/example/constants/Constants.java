package org.example.constants;

import org.openqa.selenium.By;

public class Constants {
    public static final By MAIN_PROFILE = By.className("header-user-menu");
    public static final By LOGIN = By.id("SignIn");
    public static final By L_EMAIL = By.id("L-UserNameField");
    public static final By L_PASSWORD = By.id("L-PasswordField");
    public static final By L_LOGINBUTTON = By.id("gg-login-enter");
    public static final By M_SEARCH = By.id("header-search-input");
    public static final By SEARCH_ICON = By.id("search-find-button");
    public static final By PRODUCT = By.cssSelector(".catalog-view.products-container > li:nth-of-type(6)");
    public static final By BASKET = By.id("add-to-basket");
}
