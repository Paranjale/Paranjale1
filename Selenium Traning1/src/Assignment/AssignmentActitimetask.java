package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class AssignmentActitimetask {

	public static void main(String[] args) {
	SeleniumUtility s1=new SeleniumUtility();
	WebDriver driver=s1.setUp("Chrome", "https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.id("container_tasks")).click();
	driver.findElement(By.cssSelector("div[class='title ellipsis']")).click();
	 driver.findElement(By.cssSelector("div[class='item createNewTasks']"));
	 driver.findElement(By.cssSelector("div[class='dropdownButton']:last-child"));
	 driver.findElement(By.cssSelector("div[class='dropdownButton']:nth-of-type(3)"));

	}

}
