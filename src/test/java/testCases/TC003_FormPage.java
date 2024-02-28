package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.FormPage;
import testBase.BaseClass;

public class TC003_FormPage extends BaseClass
{
	@Test(priority=1,groups= {"smoke","regression"})
   public void FormValidation() throws IOException {
	   FormPage fp = new FormPage(driver);
	   
	   logger.info("---------------------------TC003_FormPage---------------------------");
	   logger.info("******Scrolling Down******");
	   fp.scrollTillEnd();
	   logger.info("******Scrolled Down******");
	   
	   logger.info("******Clicking For Enterprise******");
	   fp.clickingEnterprise();  
	   logger.info("******For Enterprise is clicked******");
   }
	
	@Test(priority=2,groups= {"smoke","regression"})
	public void clickingProductVerification(){
		FormPage fp = new FormPage(driver);
		
		logger.info("******Scrolling Till End******");
		fp.scrollTillEnd();
		logger.info("******Scrolled Down******");
		
		logger.info("******Clicking What we offer******");
		fp.clickingProduct();
		logger.info("******Clicked What we offer******");
	}
	
	@Test(priority=3,groups= {"smoke","regression"})
	public void learnMoreVerification() throws InterruptedException{
		FormPage fp = new FormPage(driver);
		Thread.sleep(3000);
		logger.info("******Clicking Learn More******");
		fp.clickingLearnMore();
		logger.info("******Clicked Learn More******");
	}
	
	@Test(priority=4,groups= {"smoke","regression"})
	public void nameVerification() throws IOException {
		FormPage fp = new FormPage(driver);
		
		logger.info("******Entering First Name******");
		fp.firstName();
		logger.info("******First Name is entered******");
		
		logger.info("******Entering Last Name******");
		fp.lastName();
		logger.info("******Last Name is entered******");
	}
	
	@Test(priority=5,groups= {"smoke","regression"})
	public void emailVerification() throws IOException{
		FormPage fp = new FormPage(driver);
		
		logger.info("******Entering Email Id******");
		fp.emailId();
		logger.info("******Email Id is entered******");
	}
	
	@Test(priority=6,groups= {"smoke","regression"})
	public void phnoVerification() throws IOException{
		FormPage fp = new FormPage(driver);
		
		logger.info("******Entering Phone Number******");
		fp.phoneNumber();
		logger.info("******Phone Number Entered******");
	}
	
	@Test(priority=7,groups= {"smoke","regression"})
	public void institutionVerification() throws IOException {
		FormPage fp = new FormPage(driver);	
		
		logger.info("******Choosing Institution Type from the dropdown list******");
	    fp.institutionType();
	    logger.info("******Institution Type is choosen******");
	    
	    logger.info("******Entering Institution Name******");
	    fp.InstitutionName();
	    logger.info("******Entered******");
	}
	
	@Test(priority=8,groups= {"smoke","regression"})
	public void jobRoleVerification() {
		FormPage fp = new FormPage(driver);
		
		logger.info("******Choosing Job Role from the dropdown list******");
		fp.jobRole();
		logger.info("******Job Role is choosen******");
	}
	
	@Test(priority=9,groups= {"smoke","regression"})
	public void deptVerification() {
		FormPage fp = new FormPage(driver);
		
		logger.info("******Choosing the department from the dropdown list******");
		fp.department();
		logger.info("******Department is choosen******");
	}
	
	@Test(priority=10,groups= {"smoke","regression"})
	public void bDescVerification() {
		FormPage fp = new FormPage(driver);
		
		logger.info("******Choosing the Best Describes from the dropdown list******");
		fp.bestDescribes();
		logger.info("******Best Describes is choosen******");
	}
	
	@Test(priority=11,groups= {"smoke","regression"})
	public void ctryVerification() {
		FormPage fp = new FormPage(driver);
		
		logger.info("******Choosing the Country from the dropdown list******");
		fp.country();
		logger.info("******Country is choosen******");
	}
	
	@Test(priority=12,groups= {"smoke","regression"})
	public void stateVerification() {
		FormPage fp = new FormPage(driver);
		
		logger.info("******Choosing the State from the dropdown list******");
		fp.state();
		logger.info("******State is choosen******");
	}
	
	@Test(priority=13,groups= {"smoke","regression"})
	public void subButtonVerification() {
		FormPage fp = new FormPage(driver);
		
		logger.info("******Clicking the Submit Button******");
		fp.submitButton();
		logger.info("******Submit Button is clicked******");
	}
	
	@Test(priority=14,groups= {"smoke","regression"})
	public void capturingErrorMessage() throws Exception {
		FormPage fp = new FormPage(driver);
		
		logger.info("******Printing error message******");
		fp.captureMessage();
		logger.info("******Error message is captured******");
	}
}
