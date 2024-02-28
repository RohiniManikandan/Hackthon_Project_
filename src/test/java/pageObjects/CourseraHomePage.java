package pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtilsReadFile;


public class CourseraHomePage extends BasePage
{
	
	
	public CourseraHomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String[] inputData;
	
	@FindBy(xpath="//input[@placeholder='What do you want to learn?']")
	WebElement searchBox1;
	
	@FindBy(xpath="//a[text()='For Enterprise']")
	WebElement forEnterprise;

	public void searchBox1() throws IOException
	{
		inputData = ExcelUtilsReadFile.readExcelData("ReadingData");
		searchBox1.sendKeys(inputData[0]);
		searchBox1.sendKeys(Keys.ENTER);
	}

	public void forenterprise() 
	{
		forEnterprise.click();
	}
}
