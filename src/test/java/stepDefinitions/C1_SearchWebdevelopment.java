package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.CucumberBaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CourseraHomePage;
import pageObjects.WebDevelopment;

public class C1_SearchWebdevelopment 
{
	WebDriver driver;
	CourseraHomePage chp;
	WebDevelopment wd;
	
	@Given("User navigate to the coursera Home page")
	public void user_navigate_to_the_coursera_home_page() {
		CucumberBaseClass.getLogger().info("Goto Coursera Home Page");
	    chp=new CourseraHomePage(CucumberBaseClass.getDriver());
	    wd=new WebDevelopment(CucumberBaseClass.getDriver());
	}

	@When("user gives input in the search box")
	public void user_gives_input_in_the_search_box() throws IOException 
	{
		CucumberBaseClass.getLogger().info("Entering Web development course name");		
		chp.searchBox1();  
		wd.scrollDown();
	}

	@When("click the check boxes")
	public void click_the_check_boxes() 
	{
		CucumberBaseClass.getLogger().info("Clicking the English and Beginner check box");
		wd.clickingOptions();
	}

	@Then("get the course details")
	public void get_the_course_details() throws IOException 
	{
		CucumberBaseClass.getLogger().info("Getting the details of first two courses");
		wd.scrollUp();
		wd.course1();
		wd.course2();
	}

}
