package HardAssertions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionAssertNull extends TestNGOnePack.BaseClassOne{
  
 String Actualtext;
 WebElement txt1, txt2;
@BeforeClass
public void load_url(){
driver.get("http://only-testing-blog.blogspot.in/2014/02/attributes.html");
txt1 = driver.findElement(By.xpath("//input[@id='text1']"));
txt2 = driver.findElement(By.xpath("//input[@id='text2']"));  
} 
//Example Of Assertion Method - will Pass
@Test
public void null1() {
System.out.print("\n"+txt1.getAttribute("disabled"));
Assert.assertNull(txt1.getAttribute("disabled"));  
} 
//Example Assertion Method - will Fail
@Test
public void null2() {
System.out.print("\n"+txt2.getAttribute("disabled"));
Assert.assertNull(txt2.getAttribute("disabled"));
}
}