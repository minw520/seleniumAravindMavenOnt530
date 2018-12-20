package HardAssertions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertassertAssertAssertFalse extends TestNGOnePack.BaseClassOne{
  
 String Actualtext;
 WebElement chk1, chk2;
@BeforeClass
public void load_url(){
driver.get("http://only-testing-blog.blogspot.in/2014/02/attributes.html");
chk1 = driver.findElement(By.xpath("//input[@name='option1']"));
chk2 = driver.findElement(By.xpath("//input[@name='option2']"));  
} 
//Assertion Method - will pass
@Test
public void asserttrue1() {  
System.out.print("\n"+chk1.isSelected());
Assert.assertTrue(chk1.isSelected());  
System.out.print("\n asserttrue1 - > Executed - means assertion is pass");
} 
//Assertion Method - will fail
@Test
public void asserttrue2() {  
System.out.print("\n"+chk2.isSelected());
Assert.assertTrue(chk2.isSelected());
System.out.print("\n asserttrue2 - > Executed - means assertion is pass");
}
}