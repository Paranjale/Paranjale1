package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentActitime {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		System.out.println("Page Title is: "+driver.getTitle());
		System.out.println("Page Title lenth is "+driver.getTitle().length());
		String Actualurl="https://demo.actitime.com/login.do";
		String Expectedurl=driver.getCurrentUrl();
		if(Actualurl.equals(Expectedurl)) {
			System.out.println("Both url are same");
			
			
		}else {
			System.out.println("Both url are not same");
		}
		
		System.out.println("Given Page Source code"+driver.getPageSource().length());
	}

}
