package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class MyLeads extends ProjectSpecificMethods{
	
	@And("Click Leads tab")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}
}
