package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Locale;

public class D04_searchStepDef {
 P03_homePage home = new P03_homePage();
 @When("user clicks on search field")
 public void search_field()   {
  home.searchField.click();
 }

 @And("user search with {string}")
 public void userSearchWith(String arg0) {
  home.searchField.sendKeys(arg0);
 }

 @Then("user could find {string} relative results")
 public void userCouldFindRelativeResults() {
  for (int x=0 ; x<home.products().size(); x++) {
   String ActualValue =home.products().get(x).getText().toLowerCase(Locale.ROOT);
   String ExpectedValue = "book";
   Assert.assertTrue(ActualValue.contains(ExpectedValue));}
  }

 @Then("user could find {string} inside product detail page")
 public void userCouldFindInsideProductDetailPage() {
  SoftAssert soft = new SoftAssert();
  soft.assertTrue(home.serial.isDisplayed());
  soft.assertAll();

 }



}
