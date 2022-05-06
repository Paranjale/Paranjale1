package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentcricinfo {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		String expectedhomepage="https://www.gsmarena.com/apple-phones-48.php";
		String actualhomepage=driver.getTitle();
		if(expectedhomepage.equals(actualhomepage)) {
			System.out.println("Both are equal");
		}else {
			System.out.println("both are not equal");
		}
		
		WebElement options=driver.findElement(By.cssSelector(".brandmenu-v2>ul>li>a"));
		System.out.println("All listed phones:"+options.getSize());
		System.out.println("All listed phones:"+options.getText());
	}

}
