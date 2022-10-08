package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    P03_homePage home = new P03_homePage();
    @Given("user find  slider and user will ask if it is clickable or not")
    public void is_clickable(){
        home.find_slider().isEnabled();}


    @Then("user will ask if it the same {string}")
    public void userWillAskIfItTheSame(String url) {
        String expected_link=url;
        home.slider_click().click();
        String link= Hooks.driver.getCurrentUrl();
        Assert.assertFalse(link.contains(expected_link));
    }

}
