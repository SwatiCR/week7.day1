package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;

public class HomePage extends ProjectSpecificMethods{
	@Given("Click CRMSFA Link")
	public void clickCrmLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
}
