package stepDefinitions;

import io.cucumber.java.After;
import utils.TestContextSetup;

import java.io.IOException;

public class Hooks {

    TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
	}
	@After
	public void AfterScenario() throws IOException, InterruptedException {
		testContextSetup.testBase.WebDriverManager().quit();
	}
//
//	@AfterStep
//	public void AddScreenshot(Scenario scenario) throws IOException
//	{
//		WebDriver driver =testContextSetup.testBase.WebDriverManager();
//		if(scenario.isFailed())
//		{
//		//screenshot
//		File sourcePath= 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
//		scenario.attach(fileContent, "image/png", "image");
//
//		}
//
//	}
	
}
