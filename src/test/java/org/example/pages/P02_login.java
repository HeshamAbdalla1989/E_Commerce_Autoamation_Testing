package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {

    public P02_login() {
        PageFactory.initElements(Hooks.driver, this);
    }

     @FindBy(className = "ico-login")
     public WebElement loginLink;
     @FindBy(id = "Email")
     public WebElement emailLink;
    @FindBy(id = "Password")
    public WebElement passwordLink;
    @FindBy(className = "ico-account")
    public WebElement accountDisplay;
    @FindBy(className = "message-error validation-summary-errors")
    public WebElement unsuccessfulMessage;

    public void LoginSteps(WebDriver driver, String email, String password) {

        emailLink.clear();
        emailLink.sendKeys(email);
        passwordLink.clear();
        passwordLink.sendKeys(password);

        }

    }

