package com.ionicpartners.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ionicpartners.pages.BlogPage;
import com.ionicpartners.pages.HomePage;

public class TestBlog {

	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();


	}
	@Test
	public void testBlog() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		HomePage homePage = new HomePage(driver);
		BlogPage blogPage = new BlogPage(driver);
		
		System.out.println("     Test 1      ");
		System.out.println("=================");

//		open test page
		String url = "https://www.ionicpartners.com/";
		driver.get(url);
		System.out.println("Home Page is open");

//		maximize browser window
		driver.manage().window().maximize();
		sleep(3000);

		homePage.clickBlogButton();
		System.out.println("Blog Page is open");

//		verify element OurBlog available
		blogPage.OurBlogAvailable();
		System.out.println("OurBlog Element is available");

//		verify element FeaturedBlog available
		blogPage.FeaturedBlogAvailable();
		System.out.println("Featured Blog Element is available");

// 		This  will scroll down the page by  1000 pixel vertical		
		js.executeScript("window.scrollBy(0,1000)");
		
//		verify element LatestArticles available
		blogPage.LatestArticlesAvailable();
		System.out.println("Latest Articles Element is available");

// 		This  will scroll up the page by  1000 pixel vertical		
		js.executeScript("window.scrollBy(0,-1000)");

//      Redirect to HomePage
		blogPage.BacktoHomePage();
		System.out.println("Back to Home Page");

		
	}
	
	@AfterTest
	public void tesrDownTest() {
		
//		close browser
		driver.close();
		driver.quit();
	}

	private static void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
