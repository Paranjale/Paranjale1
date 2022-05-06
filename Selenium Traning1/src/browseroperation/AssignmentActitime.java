package browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentActitime {

	public static void main(String[] args) {
		String path= System.getProperty(".\\executables\\chromedriver.exe");	
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String Title1=driver.getTitle();
			System.out.println("Get current title length"+Title1.length());
			if(driver.getCurrentUrl().equals("https://demo.actitime.com/")) {
				System.out.println("Both url are Same");
				
			}else {
				System.out.println("Both url arenot Same");
			}
			
			String sourcecode=driver.getPageSource();
			System.out.println("Source code length"+sourcecode.length());
			driver.close();
		

	}

}
