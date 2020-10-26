package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.waithelper;

public class buyIphoneObjects {

	
	
WebDriver ldriver;
waithelper waithelper;
	
	public buyIphoneObjects(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);		
		waithelper =new waithelper(ldriver);
	}
	
	@FindBy(xpath="//input[@class='LM6RPg']")
	@CacheLookup
	WebElement search;
	
	
	@FindBy(xpath="//button[@class='vh79eN']")
	@CacheLookup
	WebElement clicksearch;
	
	@FindBy(xpath="//div[@class='_3wU53n']")
	@CacheLookup
	WebElement Selectphone;	
	
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	@CacheLookup
	WebElement addtokart;
	
	@FindBy(xpath="//div[@class='_3dGepu']")
	@CacheLookup
	WebElement clickhome;	
	
	@FindBy(xpath="//a[@class='_3ko_Ud']")
	@CacheLookup
	WebElement clickkart;	
	
	public void search(String searchs)
	{ 
		waithelper.WaitForElement(search, 20);
		search.sendKeys(searchs);
		
	}
	public void clicksearch()
	{
		clicksearch.click();
		
	}
	public void Selectphone()
	{
		Selectphone.click();
		
	}
	public void addtokart()
	{
		addtokart.click();
		
	}
	public void clickhome()
	{
		clickhome.click();
		
	}
	public void clickkart()
	{
		clickkart.click();
		
	}
}
