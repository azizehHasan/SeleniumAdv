package com.WebsitePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Util.TestBase;


public class LoginPage extends TestBase{

	 
	 @FindBy(css= "a.hidden-sm.hidden-xs.login-btn")
	    private WebElement loginBtn;
	 
	 @FindBy(id= "login-email")
	    private WebElement EmailT;

	 @FindBy(id= "loginPassword")
	    private WebElement password;
	 
	 @FindBy(name= "submit")
	    private WebElement submit;
	 
	 @FindBy(id= "rememberme")
	    private WebElement rememberMeCheckBox;
	 
	 @FindBy(css= ".forgot-password")
	    private WebElement forgetPassword;
	 
	 @FindBy(css= "img.logo[alt='logo'][src='https://cdn.gameprint.net/figurenhub/logo_.png']")
	    private WebElement logo;
	 
	 @FindBy(css= "button.hidden-sm.hidden-xs.btn-sm.btn-danger.btn.signup-btn[data-target='#signup-btn']")
	    private WebElement SignUpButton;
	 
	 //initialization the page Object
	 public LoginPage() {
		 PageFactory.initElements(driver, this);
	 }
	 
	 //Action
	 public String validatingPageTitle() {
		 return driver.getTitle();
		 
	 }
	 
	 public boolean validatingLogo() {
		 return logo.isDisplayed();
	 }
	 
	 public Homepage login(String email, String pass) {
		 loginBtn.click();
		 EmailT.sendKeys(email);
		 password.sendKeys(pass);
		 //click on login
		 submit.click();
		 return new Homepage();		 
	 }
	 
	 
	 
}
