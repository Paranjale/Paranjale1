package day2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Executeautomation {

	public static void main(String[] args) {
		String path1 = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path1);
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demosite.executeautomation.com/Login.html");
	String Title=driver.getTitle();
	System.out.println("Page Title is:"+Title);
	System.out.println("page Title length"+Title.length());
	String Actualurl=driver.getCurrentUrl();
	String Expectedurl="https://demosite.executeautomation.com/Login.html";
	if(Actualurl.equals(Expectedurl)) {
		System.out.println("Url are verified");
	}else {
		System.out.println("Url are not verified");}
		
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
		 driver.findElement(By.name("Login")).click();
		//driver.close();
	
	
	}

}
