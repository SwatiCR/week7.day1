package stepDefs;

import org.openqa.selenium.By;
import io.cucumber.java.en.And;


public class MyLeadsPage extends ProjectSpecificMethods{
	@And("Click Create Leads Link")
	public void clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}	
	
	@And("Click Find Leads Link")
	public void clickFindLeadsLink() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@And("Click Merge Leads Link")
	public void clickMergeLeadsLink() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}
}
