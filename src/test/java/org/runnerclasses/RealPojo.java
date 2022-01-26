package org.runnerclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RealPojo extends BaseClass{
	public RealPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="ltkpopup-close")
	private WebElement close;
	
	@FindBy(xpath="//a[@data-toggle-class-button='{\\\"target\\\":\\\"#account-menu\\\",\\\"class\\\":\\\"account-menu--open\\\"}']")
	private WebElement accicon;
	
	@FindBy(xpath="//a[text()='My Account']")
	private WebElement myacc;
	
	@FindBy(xpath="//a[text()='My Orders']")
	private WebElement order;
	
	@FindBy(xpath="//a[text()='Find A Store']")
	private WebElement store;
	
	@FindBy(id="log_in_email")
	private WebElement logemail;
	
	@FindBy(id="log_in_password")
	private WebElement pass;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	private WebElement forgot;
	
	@FindBy(xpath="(//input[@type='email'])[1]")
	private WebElement foremail;
	
	@FindBy(xpath="//button[text()='Send']")
	private WebElement send;
	
	@FindBy(xpath="//label[text()='Please enter a valid email address.']")
	private WebElement loginerror;
	
	@FindBy(xpath="//label[text()='This field is required.']")
	private WebElement forerror1;
	
	@FindBy(xpath="//label[text()='Please enter a valid email address.']")
	private WebElement forerror2;

	public WebElement getClose() {
		return close;
	}

	public WebElement getAccicon() {
		return accicon;
	}

	public WebElement getMyacc() {
		return myacc;
	}

	public WebElement getOrder() {
		return order;
	}

	public WebElement getStore() {
		return store;
	}

	public WebElement getLogemail() {
		return logemail;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getForgot() {
		return forgot;
	}

	public WebElement getForemail() {
		return foremail;
	}

	public WebElement getSend() {
		return send;
	}

	public WebElement getLoginerror() {
		return loginerror;
	}

	public WebElement getForerror1() {
		return forerror1;
	}

	public WebElement getForerror2() {
		return forerror2;
	}
}
