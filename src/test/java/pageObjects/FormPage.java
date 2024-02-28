package pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.ExcelUtilsReadFile;
import utilities.ExcelUtilsWriteFile;

public class FormPage extends BasePage{

	public FormPage(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor js =(JavascriptExecutor) driver;
	String[] inputData;
	String data="";
	int row;

	@FindBy(xpath="//a[text()='For Enterprise']")
	WebElement enterprise;
	
	@FindBy(xpath="//a[text()='What We Offer']")
	WebElement product;
	
	@FindBy(xpath="//span[@class='MuiButton-label jss2 jss105']")
	WebElement learnmore;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement emailId;
	
	@FindBy(xpath="//input[@id='Phone']")
	WebElement phoneNumber;
	
	@FindBy(xpath="//select[@id='Institution_Type__c']")
	WebElement institution;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement institutionName;
	
	@FindBy(xpath="//select[@id='Title']")
	WebElement job;
	
	@FindBy(xpath="//select[@id='Department']")
	WebElement dept;
	
	@FindBy(xpath="//select[@id='What_the_lead_asked_for_on_the_website__c']")
	WebElement bDescribes;
	
	@FindBy(xpath="//select[@id='Country']")
	WebElement ctry;
	
	@FindBy(xpath=("//select[@id='State']"))
	WebElement s;
	
	@FindBy(xpath=("//button[text()='Submit']"))
	WebElement submitButton;	
	
	@FindBy(xpath = "//div[@id='ValidMsgEmail']/span")
	WebElement Error_message;
	
	public void scrollTillEnd() 
	{
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	public void clickingEnterprise() {
		js.executeScript("arguments[0].click();",enterprise);
	}
	
	public void clickingProduct() {
		js.executeScript("arguments[0].click();",product);
	}
	
	public void clickingLearnMore() {
		js.executeScript("arguments[0].click();",learnmore);
	}
	
	public void firstName() throws IOException 
	{
		inputData = ExcelUtilsReadFile.readExcelData("ReadingData");
		firstName.sendKeys(inputData[2]);
	}
	
	public void lastName() throws IOException 
	{
		inputData = ExcelUtilsReadFile.readExcelData("ReadingData");
		lastName.sendKeys(inputData[3]);
	}
	
	public void emailId() throws IOException 
	{
		inputData = ExcelUtilsReadFile.readExcelData("ReadingData");
		emailId.sendKeys(inputData[4]);
	}
	
	public void phoneNumber() throws IOException 
	{
		inputData = ExcelUtilsReadFile.readExcelData("ReadingData");
		phoneNumber.sendKeys(inputData[5]);
	}
	
	public void institutionType() {
		Select institutionType = new Select(institution);
		institutionType.selectByVisibleText("University/4 Year College");
	}
	
	public void InstitutionName() throws IOException 
	{
		inputData = ExcelUtilsReadFile.readExcelData("ReadingData");
		institutionName.sendKeys(inputData[6]);
	}
	
	public void jobRole() 
	{
		Select jobRole = new Select(job);
		jobRole.selectByVisibleText("CEO");
	}
	
	public void department() 
	{
		Select department = new Select(dept);
		department.selectByVisibleText("Teaching/Faculty/Research");
	}
	
	public void bestDescribes() {
		Select bestDescribe = new Select(bDescribes);
		bestDescribe.selectByVisibleText("Existing Customer Support");
	}
	
	public void country(){
		Select country = new Select(ctry);
		country.selectByVisibleText("India");
	}
	
	public void state() {
		Select state = new Select(s);
		state.selectByVisibleText("Tamil Nadu");
	}
	
	public void submitButton() {
		js.executeScript("arguments[0].click();",submitButton);
	}
	
    public void captureMessage() throws Exception
	{
    	row=0;
		data = Error_message.getText();
		System.out.println(data);
		ExcelUtilsWriteFile.write("sheet1", row, 5, data);
	}

}
