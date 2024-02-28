package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.CucumberBaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FormPage;

public class C3_Form 
{
	static WebDriver driver;
	FormPage fp;
	

	@Given("navigate to Coursera home page")
	public void navigate_to_coursera_home_page() 
	{
		CucumberBaseClass.getLogger().info("Goto Coursera Home Page");
		fp=new FormPage(CucumberBaseClass.getDriver());	
	}

	@When("the user clicks on For Enterprises")
	public void the_user_clicks_on_for_enterprises() 
	{
		CucumberBaseClass.getLogger().info("Clicking For enterprise");
		fp.scrollTillEnd();
		fp.clickingEnterprise();
	}

	@When("the user clicks on what we offer")
	public void the_user_clicks_on_what_we_offer() 
	{
		CucumberBaseClass.getLogger().info("Clicking What we offer");
		fp.clickingProduct();
	}

	@When("the user clicks on Coursera for campus")
	public void the_user_clicks_on_coursera_for_campus() 
	{
		CucumberBaseClass.getLogger().info("Clicking learn more");
		fp.clickingLearnMore();
	}

	@Then("enter the details in the form")
	public void enter_the_details_in_the_form() throws IOException {
		CucumberBaseClass.getLogger().info("Entering all the fields in the form");
		fp.firstName();
		fp.lastName();
		fp.emailId();
		fp.phoneNumber();
		fp.institutionType();
		fp.InstitutionName();
		fp.jobRole();
		fp.department();
		fp.bestDescribes();
		fp.country();
		fp.state();
		fp.submitButton();
	}

	@Then("verify the error message")
	public void verify_the_error_message() throws Exception 
	{
		CucumberBaseClass.getLogger().info("Printing error message");
	    fp.captureMessage();
	}
}
