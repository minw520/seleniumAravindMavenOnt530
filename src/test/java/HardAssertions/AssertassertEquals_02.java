package HardAssertions;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertassertEquals_02 extends TestNGOnePack.BaseClassOne{
  
 String Actualtext;
 @BeforeClass
 public void load_url(){
  driver.navigate().to("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
 driver.get("file:///home/ermao750125/eclipse_Aravind/aravindall/BrowserWebPages/only-testing-blog_blogspot_com_2014_01_textbox.html");
 
 } 
 //Method Example For Assertion
 @Test
 public void assertion_method_1() {
 Actualtext = driver.findElement(By.xpath("//h2/span")).getText();
 Assert.assertNotEquals(Actualtext, "Tuesday, 28 January 2014", "Expected and actual match in assertion_method_1");
 System.out.print("\n assertion_method_1() -> Part executed");
}

//Assertion Method
@Test
public void assertion_method_2() {  
 Assert.assertNotEquals(Actualtext, "Tuesday, 29 January 2014", "Expected and actual match in assertion_method_2");
 System.out.print("\n assertion_method_2() -> Part executed");
    }
 
 //Method Example For Verification
 @Test
 public void verification_method() {
  
  String time = driver.findElement(By.xpath("//div[@id='timeLeft']")).getText();
  
  if (time == "Tuesday, 28 January 2014")
  {
   System.out.print("\nText Match");
  }
  else
  {
   System.out.print("\nText does Match");
  }
 }
}