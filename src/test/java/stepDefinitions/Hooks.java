package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.CucumberBaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	 WebDriver driver;
	 Properties p;
	 String name;
     
	@Before
    public void setup() throws IOException
    {
    	driver=CucumberBaseClass.initilizeBrowser();
    	    	
    	p=CucumberBaseClass.getProperties();
    	driver.get(p.getProperty("appURL"));
    	driver.manage().window().maximize();
 			
	}	
    
    @After
    public void tearDown(Scenario scenario) {
        		
       driver.quit();
       
    }
   
    @AfterStep
    public void addScreenshot(Scenario scenario) {
        
    	// this is for cucumber junit report
        if(scenario.isFailed()) {
        	
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName()); 	            
        }
        else 
        {
    		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
    			
    		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
    		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
   			
   			String targetFilePath=System.getProperty("user.dir")+"\\Screenshots\\" + name + "_" + timeStamp + ".png";
   			File targetFile=new File(targetFilePath);
    			
   			sourceFile.renameTo(targetFile);
    		
        }
      
    }
}
