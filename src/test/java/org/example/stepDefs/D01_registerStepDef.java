package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

 P01_Register register = new P01_Register();
 WebDriver driver;


 @Given("user go to register page")
 public void RegisterPage () throws InterruptedException {
  register.registerLink.click();
  Thread.sleep(3000);}

 @When("user select gender type")
 public void GenderType(){
  register.genderLink.click();}

 @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
 public void valid_user_name (String firstName, String lastName) {
  register.RegisterName(driver, firstName, lastName);}

@And("user enter date of birth")
 public void date_of_birth ()  {
 Select select = new Select(register.dateOfBirthLink);
 select.selectByIndex(20);
 select = new Select(register.BirthMonthLink);
 select.selectByValue("12");
 select= new Select(register.BirthYearLink);
 select.selectByVisibleText("1989");
}
@And("user enter email field")
 public void mail_field () throws InterruptedException {
 Faker fake = new Faker();
 String email =fake.internet().safeEmailAddress();
 System.out.println("Email is " + email);
 register.mailLink.sendKeys( email);
 Thread.sleep(3000);
}

 @And("^user fills Password fields \"(.*)\" \"(.*)\"$")
 public void valid_password (String password, String confirmPassword) {
  register.RegisterPassword(driver, password, confirmPassword);}

@And("user clicks on register button")
public void register_button(){
register.registerButtonLink.click();}

@Then("success message is displayed")
public void success_displayed(){
 String ExpectedResult = "Your registration completed";
 //Message Assertion.
 String ActualResult = register.successMessageLink.getText();
 SoftAssert soft = new SoftAssert();
 soft.assertTrue(ActualResult.contains(ExpectedResult),"First Assertion");
 //Message Assertion.
 String ExpectedColor = "rgba(76, 177, 124, 1)";
 String ActualColor = register.successMessageLink.getCssValue("color");
 soft.assertTrue(ActualColor.contains(ExpectedColor)," Second Assertion");
 soft.assertAll();}

}
