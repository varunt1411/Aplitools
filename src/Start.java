import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.*;

public class Start {

	public static void main(String[] args) {
		
		//Setting the mobile emulator
		String ProjectPath = System.getProperty("user.dir");
      	System.setProperty("webdriver.chrome.driver", ProjectPath+"\\BrowserDriver\\chromedriver_2.40.exe");
		Map<String, Object> deviceMetrics = new HashMap<>();
		deviceMetrics.put("width", 360);
		deviceMetrics.put("height", 640);
		deviceMetrics.put("pixelRatio", 3.0);
		Map<String, Object> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceMetrics", deviceMetrics);
		mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		WebDriver driver = new ChromeDriver(chromeOptions);
      	
      	//Initialize the eyes SDK and set your private API key.
        Eyes eyes = new Eyes();
        eyes.setApiKey("97OToAmSrS5NifuAcckTFiixadO3mGWEWBAz102tOivyM8110");
        eyes.setForceFullPageScreenshot(true);
        
               
    	//Start the test and set the browser's viewport size to 800x600.
       eyes.open(driver, "JCP Mobile", "Mobile home pasage",new RectangleSize(360, 640));
      	
        //open the browser
        driver.get("http://www.flipkart.com");
      	driver.manage().window().maximize();
      	
      	//click on continue shopping
/*      	WebElement continueshopping = driver.findElement(By.xpath("//button[contains(text(),'Continue Shopping')]"));
      	if(continueshopping.isDisplayed())
      	{
      	 continueshopping.click();
      	}*/

      	//// Visual checkpoint #1.
       eyes.checkWindow("JCP Mobile Home Page");
        
        //Click on track my order
        //driver.findElement(By.cssSelector("[data-automation-id='trackMyOrderLink']")).click();;
        
        //trackMyOrderLinkaisual checkpoint 2
//        eyes.checkWindow("JCP Track order page");
//        
        eyes.close();
      	
      	
      	
      	

	}

}
