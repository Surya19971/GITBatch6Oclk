package org.stepdefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.runnerclasses.BaseClass;
import org.runnerclasses.RealPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	public RealPojo r;
	@Given("User is in SnuggleBugz Home Page")
	public void user_is_in_SnuggleBugz_Home_Page() {
		launchBrowser();
		url("https://www.snugglebugz.ca/");
		maxBrowwser();
		iwait();
		driver.findElement(By.className("ltkpopup-close")).click();
	    
	}

	@When("User clicks the user account icon present in home page")
	public void user_clicks_the_user_account_icon_present_in_home_page() {
		r= new RealPojo();
		driver.findElement(By.xpath("//a[@data-toggle-class-button='{\"target\":\"#account-menu\",\"class\":\"account-menu--open\"}']")).click();
	   
	}

	@Then("Account menu items is seen in the home page")
	public void account_menu_items_is_seen_in_the_home_page() throws IOException {
		r= new RealPojo();
		String a=r.getMyacc().getAttribute("class");
		Assert.assertTrue("check the menu", a.equals("page-header__account-link"));
		System.out.println(a);
		screenShot("C:\\Users\\welcome\\Downloads\\photon\\eclipse\\RealTime\\Screenshot\\ss1.png");
		
	    
	}

	@Given("User is in SnuggleBugz Home page and clicks the Account icon")
	public void user_is_in_SnuggleBugz_Home_page_and_clicks_the_Account_icon() {
		launchBrowser();
		url("https://www.snugglebugz.ca/");
		maxBrowwser();
		iwait();
		driver.findElement(By.className("ltkpopup-close")).click();
		r= new RealPojo();
		driver.findElement(By.xpath("//a[@data-toggle-class-button='{\"target\":\"#account-menu\",\"class\":\"account-menu--open\"}']")).click();
		
	   
	}

	@When("User clicks the My Account Link")
	public void user_clicks_the_My_Account_Link() {
		r= new RealPojo();
		btnClick(r.getMyacc());
	    
	}

	@Then("User is redirected to the Login Page")
	public void user_is_redirected_to_the_Login_Page() throws IOException {
	   String c=driver.getCurrentUrl();
	   Assert.assertTrue("check the page", c.contains("login"));
	   screenShot("C:\\Users\\welcome\\Downloads\\photon\\eclipse\\RealTime\\Screenshot\\ss2.png");
	   
	}

	@When("User clicks the My Orders Link")
	public void user_clicks_the_My_Orders_Link() {
		r= new RealPojo();
		btnClick(r.getOrder());
	   
	}

	@When("User clicks the Find A Store Link")
	public void user_clicks_the_Find_A_Store_Link() {
		r= new RealPojo();
		btnClick(r.getStore());
	  
	}

	@Then("User is redirected to the Store Locations Page")
	public void user_is_redirected_to_the_Store_Locations_Page() throws IOException {
	   String c = driver.getCurrentUrl();
	   Assert.assertTrue("check the page", c.contains("store_locations"));
	   screenShot("C:\\Users\\welcome\\Downloads\\photon\\eclipse\\RealTime\\Screenshot\\ss4.png");
	   
	}

	@When("User finds the Forgot your password? link")
	public void user_finds_the_Forgot_your_password_link() {
		System.out.println("check");
	  
	}

	@Then("Test case is passed")
	public void test_case_is_passed() throws IOException {
		r = new RealPojo();
		String a = r.getForgot().getAttribute("class");
		Assert.assertTrue("check the link", a.equals("text-button login__forgot-password"));
		System.out.println(a);
		String b = getText(r.getForgot());
		System.out.println(b);
		screenShot("C:\\Users\\welcome\\Downloads\\photon\\eclipse\\RealTime\\Screenshot\\ss5.png");
		
	}

	@When("User clicks the Forgot your password? link")
	public void user_clicks_the_Forgot_your_password_link() {
		r = new RealPojo();
		btnClick(r.getForgot());
	    
	}

	@Then("User is in Forgot your password? page")
	public void user_is_in_Forgot_your_password_page() throws IOException {
	    String c = driver.getCurrentUrl();
	    Assert.assertTrue("CHECK THE PAGE", c.equals("forgot_passwor"));
	    screenShot("C:\\Users\\welcome\\Downloads\\photon\\eclipse\\RealTime\\Screenshot\\ss6.png");
	   
	}

	@When("User clicks the Send button")
	public void user_clicks_the_Send_button() {
		r = new RealPojo();
		btnClick(r.getSend());
	   
	}

	@Then("Error text is seen below the email edit box")
	public void error_text_is_seen_below_the_email_edit_box() throws IOException {
	    r = new RealPojo();
	    String a = r.getForerror1().getAttribute("id");
	    Assert.assertTrue("check the text", a.equals("email-error"));
	    System.out.println(a);
	    screenShot("C:\\Users\\welcome\\Downloads\\photon\\eclipse\\RealTime\\Screenshot\\ss7.png");
	    
	}

	@When("User enters invalid email id in email edit box")
	public void user_enters_invalid_email_id_in_email_edit_box() {
	    r = new RealPojo();
	    sendKeys(r.getForemail(), "src.com@gmail");
	    
	    		
	}

	@When("User clicks the send button")
	public void user_clicks_the_send_button() {
		 r = new RealPojo();
		 btnClick(r.getSend());
	}

	@When("User enters valid Email in Email edit box")
	public void user_enters_valid_Email_in_Email_edit_box() {
		r = new RealPojo();
		sendKeys(r.getLogemail(), "src@gmail.com");
		
	   
	}

	@When("User clicks the Password edit box")
	public void user_clicks_the_Password_edit_box() {
	    r = new RealPojo();
	    btnClick(r.getPass());
	}

	@Then("Error text is not seen below the edit box and the value is accepted")
	public void error_text_is_not_seen_below_the_edit_box_and_the_value_is_accepted() throws IOException {
		r=new RealPojo();
		String a = r.getLogemail().getAttribute("value");
		Assert.assertTrue("check validity", a.equals("src@gmail.com"));
		System.out.println(a);
		screenShot("C:\\\\Users\\\\welcome\\\\Downloads\\\\photon\\\\eclipse\\\\RealTime\\\\Screenshot\\\\ss9.png");
		
		
	   
	}

	@Then("Error text is seen below the edit box")
	public void error_text_is_seen_below_the_edit_box() throws IOException {
	    r=new RealPojo();
	    String a = r.getLoginerror().getAttribute("id");
	    Assert.assertTrue("check the text", a.equals("log_in_email-error"));
	    System.out.println(a);
	    screenShot("C:\\\\Users\\\\welcome\\\\Downloads\\\\photon\\\\eclipse\\\\RealTime\\\\Screenshot\\\\ss10.png");
	    
	    
	}
	
	@When("User enters only characters in Email edit box")
	public void user_enters_only_characters_in_Email_edit_box() {
		r = new RealPojo();
		sendKeys(r.getLogemail(), "src");
	    
	}

	@When("User enters only numbers in Email edit box")
	public void user_enters_only_numbers_in_Email_edit_box() {
		r = new RealPojo();
		sendKeys(r.getLogemail(), "45678");
	}

	@When("User enters only alphanumerics in Email edit box")
	public void user_enters_only_alphanumerics_in_Email_edit_box() {
		r = new RealPojo();
		sendKeys(r.getLogemail(), "src456");
	}

	@When("User enters invalid Email format in Email edit box")
	public void user_enters_invalid_Email_format_in_Email_edit_box() {
		r = new RealPojo();
		sendKeys(r.getLogemail(), "src.com@gmail");
	}
	@Given("User is in Account login page")
	public void user_is_in_Account_login_page() {
		launchBrowser();
		url("https://www.snugglebugz.ca/");
		maxBrowwser();
		iwait();
		driver.findElement(By.className("ltkpopup-close")).click();
		r= new RealPojo();
		driver.findElement(By.xpath("//a[@data-toggle-class-button='{\"target\":\"#account-menu\",\"class\":\"account-menu--open\"}']")).click();
		btnClick(r.getMyacc());
	}

	@Given("User is in Account Login Page")
	public void user_is_in_Account_Login_Page() {
		launchBrowser();
		url("https://www.snugglebugz.ca/");
		maxBrowwser();
		iwait();
		driver.findElement(By.className("ltkpopup-close")).click();
		r= new RealPojo();
		driver.findElement(By.xpath("//a[@data-toggle-class-button='{\"target\":\"#account-menu\",\"class\":\"account-menu--open\"}']")).click();
		btnClick(r.getMyacc());
	}
	@Then("User is redirected to the Order status Page")
	public void user_is_redirected_to_the_Order_status_Page() throws IOException {
		 String c=driver.getCurrentUrl();
		   Assert.assertTrue("check the page", c.contains("orders/status"));
		   screenShot("C:\\Users\\welcome\\Downloads\\photon\\eclipse\\RealTime\\Screenshot\\ss3.png");
	}
	
	@Given("User is in Forgot your Password? page")
	public void user_is_in_Forgot_your_Password_page() {
		launchBrowser();
		url("https://www.snugglebugz.ca/");
		maxBrowwser();
		iwait();
		driver.findElement(By.className("ltkpopup-close")).click();
		r= new RealPojo();
		driver.findElement(By.xpath("//a[@data-toggle-class-button='{\"target\":\"#account-menu\",\"class\":\"account-menu--open\"}']")).click();
		btnClick(r.getMyacc());
		btnClick(r.getForgot());
	}
	
	@Then("Error text is seen below the email Edit box")
	public void error_text_is_seen_below_the_email_Edit_box() throws IOException {
		r = new RealPojo();
	    String a = r.getForerror2().getAttribute("id");
	    Assert.assertTrue("check the text", a.equals("email-error"));
	    System.out.println(a);
	    screenShot("C:\\Users\\welcome\\Downloads\\photon\\eclipse\\RealTime\\Screenshot\\ss8.png");
	}
	
	@Then("Error Text is seen below the edit box")
	public void error_Text_is_seen_below_the_edit_box() throws IOException {
		r=new RealPojo();
	    String a = r.getLoginerror().getAttribute("id");
	    Assert.assertTrue("check the text", a.equals("log_in_email-error"));
	    System.out.println(a);
	    screenShot("C:\\\\Users\\\\welcome\\\\Downloads\\\\photon\\\\eclipse\\\\RealTime\\\\Screenshot\\\\ss11.png");
	}

	@Then("Error text Is seen below the edit box")
	public void error_text_Is_seen_below_the_edit_box() throws IOException {
		r=new RealPojo();
	    String a = r.getLoginerror().getAttribute("id");
	    Assert.assertTrue("check the text", a.equals("log_in_email-error"));
	    System.out.println(a);
	    screenShot("C:\\\\Users\\\\welcome\\\\Downloads\\\\photon\\\\eclipse\\\\RealTime\\\\Screenshot\\\\ss12.png");
	}

	@Then("Error text is Seen below the edit box")
	public void error_text_is_Seen_below_the_edit_box() throws IOException {
		r=new RealPojo();
	    String a = r.getLoginerror().getAttribute("id");
	    Assert.assertTrue("check the text", a.equals("log_in_email-error"));
	    System.out.println(a);
	    screenShot("C:\\\\Users\\\\welcome\\\\Downloads\\\\photon\\\\eclipse\\\\RealTime\\\\Screenshot\\\\ss13.png");
	}



}
