package AravindAll.aravindall;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SkipTest {
    
    public static WebDriver driver = null;

    
    @BeforeTest
    public void setup() throws Exception { 
         System.setProperty("webdriver.gecko.driver", "BrowserWebPages//geckodriver");
         driver = new FirefoxDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         //driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html"); 
         driver.get("file:///home/ermao750125/eclipse_Aravind/aravindall/BrowserWebPages/only-testing-blog_blogspot_com_2013_11_new-test.html");
    } 
    
    @Test
    public void Intensional_Skip(){
     System.out.println("In Verify_Title");
     String titl = driver.getTitle();
     
     if(titl.equals("Only Testing: New Test")){
                //To Skip Test
      throw new SkipException("Test Check_Checkbox Is Skipped");
      
     }else{
      System.out.println("Check the Checkbox");
         driver.findElement(By.xpath("//input[@value='Bike']")).click();
     }
     System.out.println("After If Else");
    }   
    
    @Test
    public void Radio_check(){
     System.out.println("In Check_Radio");
     driver.findElement(By.xpath("//input[@value='male']")).click();
    }
    
    @AfterTest
         public void tearDown() throws Exception { 
         driver.quit(); 
    } 
}