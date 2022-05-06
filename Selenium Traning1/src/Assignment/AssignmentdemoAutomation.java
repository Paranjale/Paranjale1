package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class AssignmentdemoAutomation {

	public static void main(String[] args) {
	SeleniumUtility s1=new SeleniumUtility();
	WebDriver driver=s1.setUp("Chrome", "http://demo.automationtesting.in/Register.html");
	
	WebElement FirstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
	FirstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
	FirstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	
	
	WebElement LastName=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
 LastName.sendKeys(Keys.chord(Keys.CONTROL,"v"));
 LastName.sendKeys(Keys.chord(Keys.TAB,Keys.CONTROL,"v"));
// Actions act=new Actions(driver);
 WebElement Email=driver.findElement(By.cssSelector("input[type='email']"));
 Email.sendKeys("jsndl@gmail.com");
 driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("3864093");
 driver.findElement(By.cssSelector("input[value='Male']")).click();
 driver.findElement(By.id("checkbox1")).click();
 
driver.findElement(By.)
	}

}
