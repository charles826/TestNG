package com.stepdef;
import java.sql.Driver;
import java.util.zip.CheckedOutputStream;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.server.handler.interactions.touch.Down;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.URL;
import com.gargoylesoftware.htmlunit.javascript.host.worker.ServiceWorkerRegistration;

//import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.init.StartDriver;

/**
 * Feature: Search "cucumber" keyword

  @tag1
  Scenario: Title of your scenario
    Given open browser "https://www.baidu.com"

    When Input "Cucumber" keyword
    And click the second lick
    Then I validate the outcomes
 * @throws InterruptedException
 */
public class stepDemo {
	WebDriver driver;
	StartDriver start =new StartDriver();
	//StartDriver start;
    //private static final String String = null;	
	
	@Given("^open browser baidu page$")	
	//public void setUp() throws Exception {
		 public void open_browser_baidu_page() throws Exception {
				//driver =new ChromeDriver();
//				System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
//				driver.get("https://www.baidu.com");
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			    driver.manage().window().maximize();
		        //throw new PendingException();
		//	}
		
			  start.openBrowser();
	} 
   
   @When ("^Input searchbox keyword$")
    public void send_keyword_into_searchbox() throws Exception{
    	//WebElement searchBox;
    	//searchBox = driver.findElement(By.id("kw"));
    	//searchBox.sendKeys("Cucumber");
//	    driver.findElement(By.id("kw")).clear();
//    	driver.findElement(By.id("kw")).sendKeys("Cucumber");
  
        start.InputText();
        //throw new PendingException();
        }
   
   @And ("^I click search button$")
    public void i_click_search_button() throws Exception{
    start.ClickSearch();
    	//throw new PendingException();
    }
   
   
   @Then("^The correct search result is returned$")
    public void the_correct_search_result_is_returned() throws Exception {
//        WebElement searchResult;
//        searchResult = driver.findElement(By.xpath(".//*[@id='container']/div[2]/div/div[2]/span"));
//        Assert.assertTrue(searchResult.isDisplayed());
        
//        Thread.sleep(2000);
//        driver.quit();
	   start.CloseApp();
        //throw new PendingException();
}}