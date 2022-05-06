package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFlipcart {

	private static final String Timeunits = null;

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		String Expectedhomepage="https://www.flipkart.com/";
		String Actualhomepage=driver.getTitle();
		if(Expectedhomepage.equals(Actualhomepage)) {
			System.out.println("Both Given are equal Titles");
		}else {
			System.out.println("Both Given arenot equal Titles");
		}
		
		WebElement Options=driver.findElement(By.cssSelector("_37M3Pb"));
		System.out.println(Options.getText());
	}

}
