package day2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeloginAssignment1 {

	public static void main(String[] args) {
	String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	String Title=driver.getTitle();
	System.out.println("Page Title are:"+Title);
	driver.findElement(By.className("nav-a")).click();
	System.out.println("Page Title after click:-"+driver.getTitle());
	driver.navigate().back();
	System.out.println("After bach Page title");
	String pTitle=driver.getTitle();
	System.out.println("Page Title:" +pTitle);
	
	if(Title.equals(pTitle)) {
		System.out.println("Page Title is same");
	}else {
		System.out.println("Page Title is not same");
	}

	driver.close();
	}

}
