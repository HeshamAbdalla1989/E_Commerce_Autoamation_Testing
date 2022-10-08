package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_Register {
    public P01_Register() {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(className = "ico-register")
    public WebElement registerLink;

    @FindBy (id = "gender-male")
    public WebElement genderLink;
    @FindBy (id= "FirstName")
    public WebElement firstNameLink;
    @FindBy(id = "LastName")
    public WebElement lastNameLink;
    @FindBy(name = "DateOfBirthDay")
    public WebElement dateOfBirthLink;
    @FindBy(name = "DateOfBirthMonth")
    public WebElement BirthMonthLink;
    @FindBy(name = "DateOfBirthYear")
    public WebElement BirthYearLink;
    @FindBy(id = "Email")
    public WebElement mailLink;
    @FindBy (id= "Password")
    public WebElement passLink;
    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassLink;
    @FindBy(id = "register-button")
    public WebElement registerButtonLink;
    @FindBy (className = "result")
    public WebElement successMessageLink;



    public void RegisterName(WebDriver driver, String firstName, String lastNAme) {
        firstNameLink.clear();
        firstNameLink.sendKeys(firstName);
        lastNameLink.clear();
        lastNameLink.sendKeys(lastNAme);
    }
    public void RegisterPassword(WebDriver driver, String password, String confirmPassword) {
        passLink.clear();
        passLink.sendKeys(password);
        confirmPassLink.clear();
        confirmPassLink.sendKeys(confirmPassword);
    }





}