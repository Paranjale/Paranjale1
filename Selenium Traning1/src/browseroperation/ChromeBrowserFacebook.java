package browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserFacebook {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://WWW.facebook.com");
String Title1=driver.getTitle();
 if(Title1.equals("https://WWW.facebook.com")) {
	 System.out.println("Both the Title are Same");
 }else {
	 System.out.println("Both the Title are not same");
 }
 System.out.println("Home page Title:"+Title1);
 
 driver.close();
	}

}
