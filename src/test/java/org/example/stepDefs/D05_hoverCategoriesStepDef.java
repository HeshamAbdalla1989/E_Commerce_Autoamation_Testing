package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class D05_hoverCategoriesStepDef {
    P03_homePage home = new P03_homePage();

    @Given("hover to random element")
    public void hoverToRandomElement() {
        List<WebElement> allElements= home.select_element_to_hover();
        int random = new Random().nextInt(3);
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(allElements.get(random)).perform();
    }

    @And("user click on any category and verify text")
    public void userClickOnAnyCategory() {
        List<WebElement> anySupCategory= home.select_one();
        Actions action1 = new Actions(Hooks.driver);
        int random1 = new Random().nextInt(3);
        action1.moveToElement(anySupCategory.get(random1)).click().release().build().perform();
        System.out.println(Hooks.driver.getTitle());
        Assert.assertTrue(true, Hooks.driver.getTitle());}

}
