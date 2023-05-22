package stepDefinitions.DocsAndSeries;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.DocsAndSeries.DocsAndSeriesPage;
import utils.TestContextSetup;

public class DocsAndSeriesSteps {
    WebDriver driver;

    TestContextSetup testContextSetup;
    DocsAndSeriesPage docsAndSeriesPage;

    public DocsAndSeriesSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.docsAndSeriesPage = testContextSetup.pageObjectManager.getDocsAndSeriesPage();
        this.driver = docsAndSeriesPage.driver;
    }

    @Given("Docs & Series option is available")
    public void docsSeriesOptionIsAvailable() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getDocsAndSeries().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(docsAndSeriesPage.getDocsAndSeries().getText(),"Current Affairs");
        Thread.sleep(1000);
    }

    @When("Click on the Docs & Series option")
    public void clickOnTheDocsSeriesOption() throws InterruptedException {
        docsAndSeriesPage.getDocsAndSeries().click();
        Thread.sleep(1000);
    }
}
