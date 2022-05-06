package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentamazone {

	public static void main(String[] args) {
	String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	List<WebElement> Options=driver.findElements(By.cssSelector("div#nav-xshop-container"));
	System.out.println("no of options are "+Options.size());
	for(int i=0;i<Options.size();i++) {
		WebElement option=Options.get(i);
		String Name=option.getText();
		System.out.println("option name "+Name);
		if(Name.equals("Fashion")) {
			option.click();
			break;
		}else {
			System.out.println("Not Matched");
		}
		
		
		System.out.println("Name of Options"+Options.get(i).getText());
		
	}
	
	

	}

}
