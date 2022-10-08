package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
  WebDriver driver;
  P02_login login = new P02_login();

  @Given("user go to login page")
  public void login_Page() throws InterruptedException {
    login.loginLink.click();
    Thread.sleep(3000);}

  @When("^user login with \"(.*)\" and \"(.*)\"$")
  public void valid_user (String email, String password) {
    login.LoginSteps(driver, email, password);
  }
  @And("user press on login button")
  public void login_button () throws InterruptedException {
    login.passwordLink.sendKeys(Keys.ENTER);
    Thread.sleep(3000);
  }

@Then("user login to the system successfully")
 public void success_login () {
  SoftAssert soft = new SoftAssert();
// URL Assertion
  String ExpectedURL = "https://demo.nopcommerce.com/";
  String ActualURL = Hooks.driver.getCurrentUrl();
  soft.assertEquals(ActualURL.contains(ExpectedURL), true, "URL Assertion");
    // My account Assertion
    soft.assertTrue(login.accountDisplay.isDisplayed(),"Account Assertion");
    soft.assertAll();
}
    @Then("user could not login to the system")
    public void unsuccessful_login (){
        //Login was unsuccessful Assert
        String ExpectedMessage = "Login was unsuccessful. Please correct the errors and try again.";
        String ActualMessage = login.unsuccessfulMessage.getText();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(ActualMessage.contains(ExpectedMessage),"unsuccessful Message Assert");
        //Color Assert
        String ExpectedColor = "#e4434b";
        String ActualColor = login.unsuccessfulMessage.getCssValue("color");
        soft.assertTrue(ActualColor.contains(ExpectedColor)," Color Assertion");

        soft.assertAll();
    }


}
