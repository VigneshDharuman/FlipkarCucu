package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageObjects {
	
    WebDriver ldriver;
	
	
	public loginPageObjects(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);		
		
	}
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	@CacheLookup
	WebElement clickclose;
	
	
	@FindBy(xpath="//div[@class='_1jcwFN _3dmQRh']")
	@CacheLookup
	WebElement butclicklogin;
	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	@CacheLookup
	WebElement enterAccountno;	
	
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	@CacheLookup
	WebElement enterpassword;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	@CacheLookup
	WebElement clicklogin;	
	
	public void clickclose()
	{
		clickclose.click();
		
	}
	public void clickloginbutton()
	{
		butclicklogin.click();
		
	}
	public void enterAccountno(String user)
	{
		enterAccountno.sendKeys(user);
		
	}
	public void enterpassword(String password)
	{
		enterpassword.sendKeys(password);
		
	}
	public void Clicklogin()
	{
		clicklogin.click();
		
	}
	

}
