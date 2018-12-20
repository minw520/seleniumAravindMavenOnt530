package TestNGOnePack;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClassOne {
    //Declared as public static to use same webdriver instance publicly
    public static WebDriver driver = null;

    //@BeforeSuite annotation describes this method has to run before all suites
    @BeforeSuite 
    public void setup() throws Exception { 
         System.setProperty("webdriver.gecko.driver", "BrowserWebPages//geckodriver");
  driver = new FirefoxDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         //driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
         driver.get("file:///home/ermao750125/eclipse_Aravind/aravindall/BrowserWebPages/only-testing-blog_blogspot_com_2013_11_new-test.html");
    } 
    //@AfterSuite annotation describes this method has to run after execution of all suites
    @AfterSuite
         public void tearDown() throws Exception { 
         driver.quit(); 
    } 
}