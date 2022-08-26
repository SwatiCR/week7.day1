package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class EditLead extends ProjectSpecificMethods{
	@And("Change the existing company name (.*)$")
	public void changeCompanyName(String companyName) {
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(companyName);
	}
	
	@And("Click Update Button")
	public void clickUpdate() {
		driver.findElement(By.name("submitButton")).click();
	}
	
}
