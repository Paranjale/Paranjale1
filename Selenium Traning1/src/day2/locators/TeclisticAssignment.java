package day2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeclisticAssignment {

	public static void main(String[] args) {
		String Path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/");
		
	driver.findElement(By.linkText("https://www.techlistic.com/p/java.html")).click();
	String Expectedtitle="https://www.techlistic.com/p/java.html";
	String pagejavatitle=driver.getTitle();
	
	if(pagejavatitle.equals(Expectedtitle)){
		System.out.println("Both Title Are Same");
		
	}else {
		System.out.println("Both Page are not same");
	}
	
	
	driver.navigate().back();
	
		//driver.findElement(By.)

	}

}
