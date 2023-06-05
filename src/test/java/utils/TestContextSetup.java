package utils;

import org.openqa.selenium.WebDriver;
import pages.PageObjectManager.PageObjectManager;


import java.io.IOException;

public class TestContextSetup {

	public WebDriver driver;

	public PageObjectManager pageObjectManager;
	public TestBase testBase;


	
	public TestContextSetup() throws IOException, InterruptedException {
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
//		genericUtils = new GenericUtils(testBase.WebDriverManager());
		
		
		

	}
	
}
