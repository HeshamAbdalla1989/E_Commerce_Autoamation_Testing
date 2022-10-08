package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage home = new P03_homePage();
    WebDriver driver;

 @When("User select euro option")
    public void select_euro(){
     Select select = new Select(home.currency);
     select.selectByVisibleText("Euro");

 }

    @Then("euro symbol is displayed on all products")
    public void euroSymbolIsDisplayedOnAllProducts() {
     for (int x=0 ; x<home.prices().size(); x++) {

         String ActualValue =home.prices().get(x).getText();
         System.out.println( "Product are " + ActualValue);
         String ExpectedValue = "€";
         Assert.assertTrue(ActualValue.contains(ExpectedValue));
     }
    }
}
