package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtilsWriteFile;

public class LanguageLearningPage extends BasePage 
{
	
	public LanguageLearningPage(WebDriver driver) 
	{
		super(driver);
	}
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	String data="";
	int count=' ';
	int row;
	
	@FindBy(xpath="(//div[@data-testid='search-filter-group-Language']//button)[3]")
	WebElement languageShowMore;
	
	@FindBy(xpath="//div[@id='checkbox-group']//div[@class='cds-checkboxAndRadio-labelText']")
	List<WebElement> language;
	
	@FindBy(xpath="(//span[text()='Close'])[2]")
	WebElement close;
	
	@FindBy(xpath="//label[text()='Level']/following-sibling::div/div//div")
	List<WebElement> levels;
	
	@FindBy(xpath="(//img[@class='rc-CourseraLogo'])[1]")
	WebElement coursera;
	
	public void showMore() 
	{
		js.executeScript("arguments[0].click();",languageShowMore);
	}
	
	public void languageCount() throws IOException 
	{
		row=0;
		for(WebElement lang:language) 
		{
			data=lang.getText();
			
			ExcelUtilsWriteFile.write("sheet1", row, 3, data);
			
			row++;
			System.out.println(data);
		}
		System.out.println();
		
		count=language.size();
		
		System.out.println(count + " - "+ "Total number of Language");
		System.out.println();
	}
	
	public void close() throws InterruptedException 
	{
		js.executeScript("arguments[0].click();", close);
	}
	
	public void levelCount() throws IOException {
		row=0;
		for(WebElement l:levels) 
		{
		  data=l.getText();
		  ExcelUtilsWriteFile.write("sheet1", row, 4, data);
		  row++;
		  System.out.println(data);
		}
		System.out.println();
		count=levels.size();
		System.out.println(count+ " - "+ " Counts of level");
	}
	
	public void courseraClick() {
		coursera.click();
	}
}
