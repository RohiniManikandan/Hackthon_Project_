package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.CourseraHomePage;
import pageObjects.LanguageLearningPage;
import testBase.BaseClass;

public class TC002_LanguageLearning extends BaseClass{

	@Test(priority=1,groups= {"smoke"})
	public void showMoreVerification() throws InterruptedException 
	{
		LanguageLearningPage l = new LanguageLearningPage(driver);
		logger.info("---------------------------TC002_LanguageLearning---------------------------");
		logger.info("******Clicking Show more******");
		l.showMore();
		logger.info("******Show more is clicked******");
	}
	
	@Test(priority=2,groups= {"smoke"})
	public void languageVerification() throws IOException {
		LanguageLearningPage l = new LanguageLearningPage(driver);
		logger.info("******Printing languages and their count******");
		l.languageCount();
		logger.info("******Printed the details******");
	}
	
	@Test(priority=3,groups= {"smoke"})
	public void closeVerification() throws InterruptedException {
		LanguageLearningPage l = new LanguageLearningPage(driver);
		logger.info("******Closing the language tab******");
		l.close();
		logger.info("******Closed******");
	}
	
	@Test(priority=4,groups= {"smoke"})
	public void levelCountVerification() throws IOException{
		LanguageLearningPage l = new LanguageLearningPage(driver);
		logger.info("******Printing the levels and their counts******");
		l.levelCount();
		logger.info("******Printed the details******");
	}
	
	@Test(priority=5,groups= {"smoke","regression"})
	public void courseraClickVerification(){
		LanguageLearningPage l = new LanguageLearningPage(driver);
		logger.info("******Clicking Coursera******");
		l.courseraClick();
		logger.info("******Clicked******");
	}
	
	@Test(priority=6,groups= {"smoke"})
	public void forEnterpriseVerification() {
		CourseraHomePage chp = new CourseraHomePage(driver);
		logger.info("******Clicking For Enterprise******");
		chp.forenterprise();
		logger.info("******Clicked For Enterprise******");
	}
}
