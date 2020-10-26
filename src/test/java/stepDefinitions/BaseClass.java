package stepDefinitions;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.buyIphoneObjects;
import pageObjects.loginPageObjects;

public class BaseClass {
	
	public WebDriver driver ;
	public static Logger log;
	public Properties configProp;
	public loginPageObjects lp;
	public buyIphoneObjects buy;
	
	

}
