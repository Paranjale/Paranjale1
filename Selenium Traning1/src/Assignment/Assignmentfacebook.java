package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentfacebook {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		System.out.println("Home Page Title: "+driver.getTitle());
		String Expected="Facebook-log in or sign up";
		String Actual=driver.getTitle();
		if(Actual.equalsIgnoreCase(Expected)) {
			System.out.println("Both title are equal");
		}else {
			System.out.println("Both title arenot equal");
		}
		driver.close();
	}

}
