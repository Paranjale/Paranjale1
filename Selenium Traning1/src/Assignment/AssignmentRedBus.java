package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtility;

public class AssignmentRedBus {

	public static void main(String[] args) {
	
		SeleniumUtility s1= new SeleniumUtility();
		WebDriver driver=s1.setUp("Chrome", "https://www.redbus.in/");
		driver.findElement(By.cssSelector("input#src")).sendKeys("Swargate, Pune");
		driver.findElement(By.cssSelector("input#dest")).sendKeys("Panjim, Goa");
		driver.findElement(By.cssSelector("input#onward_cal")).click();
		driver.findElement(By.cssSelector("td.next")).click();
			driver.findElement(By.cssSelector("div.rb-calendar>table>tbody>tr:nth-of-type(5)>:nth-of-type(3)"));
		driver.findElement(By.cssSelector("label[for='dtAfter 6 pm']:nth-child(2)")).click();
		driver.findElement(By.cssSelector("label[for='bt_AC']:nth-child(2)")).click();
				

	}

}
