package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.CucumberBaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LanguageLearningPage;
import pageObjects.WebDevelopment;

public class C2_LanguageLearning {
	WebDriver driver;
	WebDevelopment wd;
	LanguageLearningPage l;
	
	@Given("Navigate to the coursera Home page")
	public void navigate_to_the_coursera_home_page() {
		CucumberBaseClass.getLogger().info("Goto Coursera Home Page");
		wd=new WebDevelopment(CucumberBaseClass.getDriver());
		l=new LanguageLearningPage(CucumberBaseClass.getDriver());
	}
	
	@When("user clicks on the search box")
	public void user_clicks_on_the_search_box() throws IOException 
	{
		CucumberBaseClass.getLogger().info("Entering Language learning course name");
		wd.searchBox2();
	}

	@When("the user clicks on show more")
	public void the_user_clicks_on_show_more() 
	{
		CucumberBaseClass.getLogger().info("Clicking show more in the language");
		l.showMore();
	}

	@Then("get the languages and their count")
	public void get_the_languages_and_their_count() throws IOException, InterruptedException 
	{
		CucumberBaseClass.getLogger().info("Printing languages and their count");
		l.languageCount();
		l.close();
	}

	@Then("get the levels and their count")
	public void get_the_levels_and_their_count() throws IOException 
	{
		CucumberBaseClass.getLogger().info("Printing levels and their count");
		l.levelCount();
	}
}
