package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class common {
	static WebDriver driver;
	static pageobject p;
	
	
	public static void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://10.232.237.143:443/TestMeeApp/fetchcat.htm");
		
		
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		p=new pageobject(driver);
		
		
	}
	public static void Login() {
		
		p.signin.click();
		p.userName.sendKeys("Lalitha");
		p.password.sendKeys("password123");
		p.login.click();
		
		
		
		
	}

}
