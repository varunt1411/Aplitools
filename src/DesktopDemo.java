import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.applitools.eyes.Eyes;
import com.applitools.eyes.RectangleSize;

public class DesktopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
      	
      	
      	
      	
       	
       	
       	
       	Eyes eyes = new Eyes();
        eyes.setApiKey("97OToAmSrS5NifuAcckTFiixadO3mGWEWBAz102tOivyM8110");
        
      //Start the test and set the browser's viewport size to 800x600.
        eyes.open(driver, "JCP Mobiewle", "Mobilevwtrrew home page",new RectangleSize(360, 640));
        
        driver.get("http://www.jcpenney.com/cart");
       	driver.manage().window().maximize();
       	
       	eyes.checkWindow("JCP Mobile Home Page");
       	
        eyes.close();
        
        
        

	}

}
