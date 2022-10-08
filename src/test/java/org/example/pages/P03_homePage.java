package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class P03_homePage {
 public P03_homePage() {
        PageFactory.initElements(Hooks.driver, this);
    }

    //Currency Feature
  @FindBy(id = "customerCurrency")
   public WebElement currency;

public List <WebElement> prices(){
    List<WebElement> prices = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    return prices;}

    //Search Feature
@FindBy(id = "small-searchterms")
 public WebElement searchField;

    public List <WebElement> products(){
        List<WebElement> products = Hooks.driver.findElements(By.className("product-title"));
        return products;}
    @FindBy(id="sku-36")
    public WebElement serial;


//Hover Feature
    public List<WebElement> select_element_to_hover() {
        List<WebElement> elements = Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
        return  elements;
    }

    public List<WebElement> select_one(){

        List <WebElement> element = Hooks.driver.findElements(By.cssSelector("ul[class=\"sublist first-level\"]>li>a[href]"));
        return element;}

    public List <WebElement> get_HeadLine (int ran) {
        int random1 = new Random(3).nextInt();
        List<WebElement> elements = (List<WebElement>) Hooks.driver.findElements(By.cssSelector("ul[class=\"sublist first-level\"]>li>a[href]")).get(random1);
        return elements;
    }

    public WebElement find_slider(){

// Home Slider Feature
        WebElement slider_element = Hooks.driver.findElement(By.className("class=\"nivo-imageLink\""));
        return slider_element;
    }
    public WebElement slider_click(){

        WebElement slider_Click= Hooks.driver.findElement(By.className("class=\\\"nivo-imageLink\\\"\""));
        return slider_Click;}


// Follow Us Feature

    public WebElement open_facebook(){
        WebElement element=   Hooks.driver.findElement(By.linkText("Facebook"));
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return element;}

    public WebElement open_twitter(){
        WebElement element=   Hooks.driver.findElement(By.linkText("Twitter"));
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return element;
    }
    public WebElement open_rss(){
        WebElement element=   Hooks.driver.findElement(By.linkText("RSS"));
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return element;
    }
    public WebElement open_youtube(){
        WebElement element=  Hooks.driver.findElement(By.linkText("YouTube"));
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return element;}

//Wish List Feature
public List<WebElement> click_on_wishlist(){
    List<WebElement> elements= Hooks.driver.findElements(By.cssSelector(" button[class=\"button-2 add-to-wishlist-button\"]"));
    return  elements;}

    public WebElement verify_message(){
        WebElement element1 = Hooks.driver.findElement(By.className("content"));
        return element1;}

    public WebElement get_background_color(){
        WebElement element3 = Hooks.driver.findElement(By.className("bar-notification"));
        return element3;}
    public WebElement click_on_wishlist_tab(){
        WebElement element4 = Hooks.driver.findElement(By.className("ico-wishlist"));
        return element4;
    }
    public WebElement get_Qty_number(){
        WebElement element5 = Hooks.driver.findElement(By.className("qty-input"));
        return element5;
    }


}
