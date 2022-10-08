package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
public static WebDriver driver ;

  @Before
   public static void openBrowser() {
      String ChromePath= System.getProperty("user.dir")+ "\\src\\main\\resources\\chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", ChromePath);
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.navigate().to("https://demo.nopcommerce.com/");

  }

@After
    public static void closeDriver() {
     driver.quit();

}



}
