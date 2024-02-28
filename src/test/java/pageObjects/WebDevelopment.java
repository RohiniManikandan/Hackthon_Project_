package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtilsWriteFile;
import utilities.ExcelUtilsReadFile;

public class WebDevelopment extends BasePage{
	
	
	public WebDevelopment(WebDriver driver) 
	{
		super(driver);
	}
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	String[] inputData;
	String data="";
	
	
	@FindBy(xpath="//span[text()='English']")
	WebElement english;
	
	@FindBy(xpath="//span[text()='Beginner']")
	WebElement beginner;
	
	@FindBy(xpath="(//h3[contains(@class,'cds-CommonCard-title')])[1]")
	WebElement courseName1;
	
	@FindBy(xpath=("(//*[@class='cds-119 css-11uuo4b cds-121'])[1]"))
	WebElement ratings1;
	
	@FindBy(xpath=("(//div[@data-e2e='product-card-cds'])[1]"))
	WebElement insideCourse1;
	
	@FindBy(xpath="(//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[8]")
	WebElement duration1;
	
	@FindBy(xpath="(//h3[contains(@class,'cds-CommonCard-title')])[2]")
	WebElement courseName2;
	
	@FindBy(xpath="(//*[@class='cds-119 css-11uuo4b cds-121'])[2]")
	WebElement ratings2;
	
	@FindBy(xpath="(//div[@data-e2e='product-card-cds'])[2]")
	WebElement insideCourse2;
	
	@FindBy(xpath="(//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[8]")
	WebElement duration2;
	
	@FindBy(xpath="//input[@placeholder='What do you want to learn?']")
	WebElement searchBox2;

	public void scrollDown() {
		js.executeScript("window.scrollBy(0,750)"," ");
	}
	public void clickingOptions() {
		js.executeScript("arguments[0].click();",english);
		js.executeScript("arguments[0].click();",beginner);
	}
	
	public void scrollUp() {
	    js.executeScript("window.scrollBy(0,-800)"," ");
	}
	
	public void course1() throws IOException 
	{
	  data = courseName1.getText();
		
		ExcelUtilsWriteFile.write("sheet1", 0, 0, data);
		
		System.out.println(data + "-" + "Course Name");
		
		
		data = ratings1.getText();
		
		ExcelUtilsWriteFile.write("sheet1", 0, 1, data);
		
		System.out.println(data+ "-" + "Course Rating");
        
		insideCourse1.click();
		
		Set<String> windowIds1=driver.getWindowHandles();
		List<String> windowidsList1 = new ArrayList<String>(windowIds1);
		String parentid1=windowidsList1.get(0);
		String childid1=windowidsList1.get(1); 
		driver.switchTo().window(childid1);
	    
		data = duration1.getText();
		
		ExcelUtilsWriteFile.write("sheet1", 0, 2, data);
		
		System.out.println(data);
		System.out.println();
		   
		driver.close();
		
		driver.switchTo().window(parentid1);

	}
	
	public void course2() throws IOException 
	{

		data = courseName2.getText();
		
		ExcelUtilsWriteFile.write("sheet1", 1, 0, data);
		
		System.out.println(data);
		
		data = ratings2.getText();
		
		ExcelUtilsWriteFile.write("sheet1", 1, 1, data);
		
		System.out.println(data);
	
		insideCourse2.click();
		
		Set<String> windowIds2=driver.getWindowHandles();
		List<String> windowidsList2 = new ArrayList<String>(windowIds2);
        String parentid2=windowidsList2.get(0);
		String childid2=windowidsList2.get(1); 
	    driver.switchTo().window(childid2);
		
	    data = duration2.getText();
		
		ExcelUtilsWriteFile.write("sheet1", 1, 2, data);
		
		System.out.println(data);
		System.out.println();
		   
		driver.close();		
		
		driver.switchTo().window(parentid2);
	}
	
	public void searchBox2() throws IOException {
		searchBox2.sendKeys(Keys.CONTROL + "a");
		searchBox2.sendKeys(Keys.DELETE);
		inputData = ExcelUtilsReadFile.readExcelData("ReadingData");
		searchBox2.sendKeys(inputData[1]);
		searchBox2.sendKeys(Keys.ENTER);
	}
}
