package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPage extends ProjectSpecificMethods{
	
	@Given("Type the username as {string}")	
	public void typeUsername(String username) {
		//find the user name
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@And("Type the password as {string}")
	public void typePassword(String password) {
		//find the password
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on the login button")
	public void loginButton() {
		//click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Verify the home page is displayed")
	public void loginSuccess() {
		//To check if we are on the correct page
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));

		//get the attribute and print
		String attribute = logout.getAttribute("value");
		System.out.println(attribute);

		if (attribute.equals("Logout")){
			System.out.println("Successfully logged in");
		}
		else {
			System.out.println("Login unsuccessful");
		}

	}

	@But("Error message is displayed")
	public void loginNotSuccess() {
		//To check if we are on the correct page
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));

		//get the attribute and print
		String attribute = logout.getAttribute("value");
		System.out.println(attribute);

		if (attribute.equals("Logout")){
			System.out.println("Successfully logged in");
		}
		else {
			System.out.println("Login unsuccessful");
		}
	}

}
