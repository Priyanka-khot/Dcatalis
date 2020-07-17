package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.util.log.Log;

public class Testapp {

	public void setup(String browser) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
		System.setProperty("webdriver.gecko.driver", "C:geckodriver-v0.23.0-win64geckodriver.exe");
		driver = new FirefoxDriver();
		}
		 
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
		//set path to chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:Selenium-java-edurekaNew folderchromedriver.exe");
		driver = new ChromeDriver();
		 
		}
		else if(browser.equalsIgnoreCase("Edge")){
		//set path to Edge.exe
		System.setProperty("webdriver.edge.driver","C:Selenium-java-edurekaMicrosoftWebDriver.exe");;span style="font-family: verdana, geneva, sans-serif; font-size: 14px;"&gt;//create Edge instance&lt;/span&gt;
		driver = new EdgeDriver();
		}
		else{
		//If no browser passed throw exception
		throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	
	
	/*public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.midtrans.com/");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		*/driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		Login1 l1=new Login1(driver);
		l1.display1();
		l1.display2();
		l1.display3();
		l1.display4();
		
		Login2 l2=new Login2(driver);
		l2.show1();
		l2.show2();
		l2.show3();
		l2.show4();
		l2.show5();
		l2.show6();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	
	
		
	}
}
