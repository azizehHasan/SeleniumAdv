package com.WebsitePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Util.TestBase;

public class Homepage extends TestBase{
	
	@FindBy(css= "li a[href='/startrek']")
    private WebElement StarTrek;
	
	@FindBy(css= "li a[href='/captures']")
    private WebElement Capture;
	
	@FindBy(css= "li a[href='/b2b'][target='_blank']")
    private WebElement Businsses;
	
	@FindBy(css= "div.header-right-menu div.dropdown.header__dropdown")
    private WebElement UserMenu;
	
	
	 //initialization the page Object
	 public Homepage() {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public String verifyPageTitle() {
		 return driver.getTitle();
	 }
	 
	 public Boolean VeirfyStarTrek() {
		 return StarTrek.isDisplayed();
		 
	 }
	 
	 public Boolean VerifyUserMenu() {
		 return UserMenu.isDisplayed();
		 
	 }
	 
	 
	 
	 

}
