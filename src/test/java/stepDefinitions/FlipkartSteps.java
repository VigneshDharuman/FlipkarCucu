package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.buyIphoneObjects;
import pageObjects.loginPageObjects;


public class FlipkartSteps extends BaseClass{
	
	
	@Before 
	public void setup() throws IOException, InterruptedException  
	{
		//reading properties
		configProp = new Properties();
		FileInputStream configPropfile = new FileInputStream("config.properties");
		configProp.load(configPropfile);
		
		String br = configProp.getProperty("browser");
		
		if (br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
			driver=new ChromeDriver();	
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			Thread.sleep(2000);
			
		}
		else if (br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",configProp.getProperty("Firefoxpath"));
			driver=new FirefoxDriver();	
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			Thread.sleep(2000);
		}	
		else if (br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver",configProp.getProperty("edgepath"));
			driver=new EdgeDriver();	
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			Thread.sleep(2000);
		}	
		
	}
	
	
	@Given("I launch browser")
	public void i_launch_browser() throws InterruptedException {
		
		  	log =Logger.getLogger("flipkart");
		  	PropertyConfigurator.configure("Log4j.properties");
		  	log.info("***launching browser***");		
			
						
		}	
	    
	
	@When("Open Flipkart and login as {string} and password as {string}")
	public void open_flipkart_and_login_as_and_password_as(String user, String password) throws InterruptedException {
	    
		driver.get("https://www.flipkart.com/");
		log.info("***launching flipkart***");
		Thread.sleep(2000);
		lp =new loginPageObjects(driver);	
		lp.clickclose();
	    lp.clickloginbutton();
	    log.info("***login ***");
	    Thread.sleep(2000);
	    lp.enterAccountno(user);
	    log.info("***entering user name ***");
	    Thread.sleep(2000);
	    lp.enterpassword(password);
	    log.info("***entering password ***");
	    Thread.sleep(2000);
	    lp.Clicklogin();
	    Thread.sleep(2000);
		
	}

	@Then("Search for {string} and select iphone")
	public void search_for_and_select_iphone(String searchs) throws InterruptedException {
	    
		 buy =new buyIphoneObjects(driver);
		 log.info("***searching product ***");
		 buy.search(searchs);			 
		 Thread.sleep(2000);
		 buy.clicksearch();
		 Thread.sleep(2000);
		 log.info("***selecting product ***");
		 buy.Selectphone();	
		 Thread.sleep(2000);
		 log.info("***switching to new tab ***");
		 ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(newTab.get(1));
		 Thread.sleep(2000);
	}

	@Then("Add to kart and proceed to home")
	public void add_to_kart_and_proceed_to_kart() throws InterruptedException {
		 buyIphoneObjects buy =new buyIphoneObjects(driver);
		 log.info("***sadding to kart  ***");
		 buy.addtokart();
		 Thread.sleep(2000);
		 log.info("***viewing home ***");
		 buy.clickhome();
		 Thread.sleep(2000);
		
	}

	@Then("view the kart")
	public void view_the_kart() throws InterruptedException {
		buyIphoneObjects buy =new buyIphoneObjects(driver);	
		log.info("***opening kart ***");
		buy.clickkart();
		Thread.sleep(2000);
	}


	@Then("close browser")
	public void close_browser() {
		log.info("***closing the browser ***");
		driver.quit();
	}
	

}
