package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class FindLeadsPage extends ProjectSpecificMethods{
	/*@When("Type the Lead Id in Find Leads Page")
	public void typeLeadId() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}*/
	
	@Then("Verify Lead is deleted.")
	public void verifyDeleted() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) { System.out.println("Text matched");
		} else { System.out.println("Text not matched");}
	}
	
	@And("Type the first name in Find Leads Page as (.*)$")
	public void typeFirstName(String firstName) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName);
		
	}
	
	@And("Click Find Leads Button")
	public void clickFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@And("Click First Matching Lead")
	public void clickFirstMatchingLead() {
		firstLeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
}
