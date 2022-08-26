package stepDefs;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods extends AbstractTestNGCucumberTests{

	public static ChromeDriver driver;
	public int i = 1;
	public static String firstLeadID;
	
	@BeforeMethod
	public void init() {				
		WebDriverManager.chromedriver().setup();		
		driver = new ChromeDriver();			
		driver.get("http://leaftaps.com/opentaps");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
