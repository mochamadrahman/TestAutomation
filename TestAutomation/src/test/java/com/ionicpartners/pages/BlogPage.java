package com.ionicpartners.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogPage {
	
	@FindBy(xpath = "//*[@id='header']/div/div[3]/div/div/div/h5")
	WebElement OurBlog;
	
	@FindBy(xpath = "//*[@id='content']/div/div[1]/div[1]/div/div/h1")
	WebElement FeaturedBlog;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div[1]/div/div/div[1]/a")
	WebElement HomePageButton;
	
	@FindBy(xpath = "//*[@id='content']/div/div[2]/div/div[1]/div/div/h1")
	WebElement LatestArticles;
	
	
	WebDriver driver;

	public BlogPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void OurBlogAvailable() {
		OurBlog.isDisplayed();
	}

	public void FeaturedBlogAvailable() {
		FeaturedBlog.isDisplayed();
	}
	
	public void LatestArticlesAvailable() {
		LatestArticles.isDisplayed();
	}
	
	public void BacktoHomePage() {
		HomePageButton.click();
	}
}
