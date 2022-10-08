package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage home = new P03_homePage();
    @Given("user opens facebook link")
    public void user_opens_facebook_link(){
        home.open_facebook().click();}


    @Given("user opens twitter link")
    public void userOpensTwitterLink() {
        home.open_twitter().click();}

    @Given("user opens rss link")
    public void userOpensRssLink() {
        home.open_rss().click();}

    @Given("user opens youtube link")
    public void userOpensYoutubeLink() {
        home.open_youtube().click();}

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String window) {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains(window));}

}
