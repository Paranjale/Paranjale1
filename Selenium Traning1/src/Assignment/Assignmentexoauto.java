package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentexoauto {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       driver.get("https://demosite.executeautomation.com/Login.html");
       System.out.println("Page title are "+driver.getTitle());
       System.out.println("Page title length "+driver.getTitle().length());
       System.out.println("Page sourcecode "+driver.getPageSource().length());
       String Expected="Execute Automation";
       String Actual=driver.getTitle();
       if(Actual.equals(Expected)) {
    	   System.out.println("Both are Equal");
       }else {
    	   System.out.println("Both are not Equal");
       }
WebDriverException wait=new WebDriverException();
driver.findElement(By.name("UserName")).sendKeys("execution");
driver.findElement(By.name("Password")).sendKeys("admin");
driver.findElement(By.cssSelector("input[name='Login']")).click();
driver.getTitle();
driver.getCurrentUrl();

driver.findElement(By.cssSelector("a[href='Login.html']"));
//driver.close();
	}

}
