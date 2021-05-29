package com.ionicpartners.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterPage {
	
	@FindBy(xpath = "//*[@id='react-root']/div/div/div[2]/main/div/div/div/div[1]/div/div[1]/div[1]/div/div/div/div/div[2]/div/h2/div/div/div/span[2]")
	WebElement IonicPartnersTwitters;
	
	@FindBy(xpath = "//*[@id='react-root']/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div/div/div")
	WebElement FollowButton;
	
	
	WebDriver driver;

	public TwitterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void IonicpartnersTwittersAvailable() {
		IonicPartnersTwitters.isDisplayed();
	}
	
	public void FollowButtonAvailable() {
		FollowButton.isDisplayed();
	}
}
