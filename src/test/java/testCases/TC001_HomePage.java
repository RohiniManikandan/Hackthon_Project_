package testCases;

import java.io.IOException;
import org.testng.annotations.Test;

import pageObjects.CourseraHomePage;
import pageObjects.WebDevelopment;
import testBase.BaseClass;

public class TC001_HomePage extends BaseClass
{
	
	@Test(priority=1,groups= {"smoke"})
	public void courseraHomePageVerification() throws Exception 
	{
		CourseraHomePage chp = new CourseraHomePage(driver);
		logger.info("---------------------------TC001_HomePage---------------------------");
		logger.info("******Capturing search box1******");
		chp.searchBox1();
		logger.info("******Captured search box1******");
	}
	
	@Test(priority=2,groups= {"smoke"})
	public void webDevelopmentPageVerification()
	{
		WebDevelopment wd = new WebDevelopment(driver);
		logger.info("******Clicking both the check boxes******");
		wd.clickingOptions();
		logger.info("******Check boxes are clicked******");
	}	
	
	@Test(priority=3,groups= {"smoke"})
	public void scrollingUpVerification() {
		WebDevelopment wd = new WebDevelopment(driver);
		logger.info("******Scrolling Up******");
		wd.scrollUp();
		logger.info("******Scrolled Up******");
	}
	
	@Test(priority=4,groups= {"smoke","regression"})
	public void coursesVerification() throws IOException {
		WebDevelopment wd = new WebDevelopment(driver);
		logger.info("******Printing course name,rating and duration******");
		wd.course1();
		logger.info("******Printed all the required details in course1******");
		logger.info("******Printing course name,rating and duration******");
		wd.course2();
		logger.info("******Printed all the required details in course2******");
	}
	
	@Test(priority=5,groups= {"regression"})
	public void searchBox2Verification() throws IOException {
		WebDevelopment wd = new WebDevelopment(driver);
		logger.info("******Clearing the search box and print next value******");
	    wd.searchBox2();	
	    logger.info("******Printed the next value******");
	}
}