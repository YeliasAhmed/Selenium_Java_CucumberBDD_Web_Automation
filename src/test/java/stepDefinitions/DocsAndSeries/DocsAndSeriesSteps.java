package stepDefinitions.DocsAndSeries;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.DocsAndSeriesPage.DocsAndSeriesPage;
import pages.PageObjectManager.PageObjectManager;
import utils.TestContextSetup;

public class DocsAndSeriesSteps {
    public WebDriver driver;

    TestContextSetup testContextSetup;
    DocsAndSeriesPage docsAndSeriesPage;

    public DocsAndSeriesSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.docsAndSeriesPage = testContextSetup.pageObjectManager.getDocsAndSeriesPage();
        this.driver = docsAndSeriesPage.driver;
    }

    @Given("Home page is displayed")
    public void HomePage() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getTvoToday().isDisplayed());
        Thread.sleep(2000);


    }

    @Then("Check that the TVO today page is displayed")
    public void TVOTodayPageDisplayed() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getTvoToday().isDisplayed());
        Thread.sleep(1000);

        docsAndSeriesPage.getRemindLater().click();
        Thread.sleep(1000);


    }

    @And("Check that the {string} dropdown title is displayed")
    public void DropdownTitleDisplayed(String text) throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getDocsAndSeries().isDisplayed());
        Thread.sleep(2000);
        Assert.assertEquals(docsAndSeriesPage.getDocsAndSeries().getText(),text);
        Thread.sleep(2000);
    }


    @When("Click on the Docs & Series Dropdown option")
    public void clickOnTheDropdownOption() throws InterruptedException {
        docsAndSeriesPage.getDocsAndSeries().click();
        Thread.sleep(2000);

    }

    @Then("Check that the {string} label button is available")
    public void LabelButtonAvailable(String text) throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getAllButton().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(docsAndSeriesPage.getAllButton().getText(),text);
        Thread.sleep(1000);

    }
    
    @Then("Check that the  button is selected")
    public void ButtonIsSelected() throws InterruptedException {


    }

    @And("Check that the All label button is selected")
    public void LabelButtonSelected() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getAllButtonColor().isDisplayed());
        Thread.sleep(1000);

        Assert.assertEquals(docsAndSeriesPage.getAllButtonColor().getText(),"All");
        Thread.sleep(1000);

        Assert.assertEquals(docsAndSeriesPage.getAllButtonColor().getCssValue("background-color"), "rgba(231, 19, 26, 1)");
        Thread.sleep(1000);
    }

    @Then("Check that the Focus on Photography section is displayed")
    public void SectionDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);",docsAndSeriesPage.getFocusOnPhotography());
        Thread.sleep(2000);

        Assert.assertEquals(docsAndSeriesPage.getFocusOnPhotography().getText(),"FOCUS ON PHOTOGRAPHY");
        Thread.sleep(2000);

        
    }

    @And("Check that the photography photos are displayed in this section")
    public void PhotographyPhotosDisplayedSection() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getPhotographyPhoto().isDisplayed());
        Thread.sleep(2000);

        Assert.assertEquals(docsAndSeriesPage.getPhotographyPhoto().getText(),"Capturing Lee Miller");
        Thread.sleep(1000);

    }
    @And("Check that the ABOUT MENTAL HEALTH section is displayed")
    public void ABOUTMENTALHEALTHSection() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);",docsAndSeriesPage.getAboutMentalHealth());
        Thread.sleep(2000);

        Assert.assertEquals(docsAndSeriesPage.getAboutMentalHealth().getText(),"ABOUT MENTAL HEALTH");
        Thread.sleep(1000);

    }

    @And("Check that the mental health related photos are displayed in this section")
    public void MentalHealthRelatedPhotos() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getMentalHealthPhoto().isDisplayed());
        Thread.sleep(2000);
        Assert.assertEquals(docsAndSeriesPage.getMentalHealthPhoto().getText(),"Drunk On Too Much Life");
        Thread.sleep(1000);

    }

    @Then("Check that the search button is available")
    public void ButtonIsAvailable() throws InterruptedException {

        Assert.assertTrue(docsAndSeriesPage.getSearchButton().isDisplayed());
        Thread.sleep(2000);
        
    }

    @When("Click on the search option")
    public void SearchOption() throws InterruptedException {

        docsAndSeriesPage.getSearchButton().click();
        Thread.sleep(2000);
        
    }

    @And("Check that the search field is displayed")
    public void SearchFieldIsDisplayed() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getSearchField().isDisplayed());
        Thread.sleep(2000);
    }

    @When("Click on the search field and insert {string} valid text")
    public void SearchFieldAndInsertValidText(String text) throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getSearchField().isDisplayed());
        Thread.sleep(2000);

        docsAndSeriesPage.getSearchField().sendKeys(text);
        Thread.sleep(2000);

        docsAndSeriesPage.getSearchField().sendKeys(Keys.ENTER);
        Thread.sleep(1000);

    }

    @Then("Check that the Docs & Series is displayed")
    public void StringDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(docsAndSeriesPage.getSearchItem().isDisplayed());

    }
    @Then("Check that the Series option is available")
    public void OptionIsAvailable() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getSeriesButton().isDisplayed());
        Thread.sleep(2000);
    }
    @When("Click on the Series option")
    public void clickOnTheOption() throws InterruptedException {

        docsAndSeriesPage.getSeriesButton().click();
        Thread.sleep(2000);
    }

    @Then("Check that the Series are displayed in the series section")
    public void SeriesDisplayedSeriesSection() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getSeriesButton().isDisplayed());
        Thread.sleep(2000);
    }

    @When("Click on any series")
    public void clickOnAnySeries() throws InterruptedException {
        docsAndSeriesPage.getAnySeries().click();
        Thread.sleep(2000);
    }

    @Then("Check that the series details are displayed")
    public void SeriesDetailsAreDisplayed() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getSeriesDetail().isDisplayed());
        Thread.sleep(2000);

        Assert.assertTrue(docsAndSeriesPage.getSeriesDetailEp().isDisplayed());
        Thread.sleep(2000);

    }

    @And("Click on the All button")
    public void clickOnTheButton() throws InterruptedException {
        docsAndSeriesPage.getAllButton().click();
        Thread.sleep(2000);

    }

    @Then("Hover on Docs & Series option")
    public void hoverOnOption() throws InterruptedException {

        PageObjectManager.hoverToElement(docsAndSeriesPage.getDocsAndSeries());
        Thread.sleep(1000);

    }

    @And("Check that the Docs & Series option is expanded")
    public void OptionIsExpanded() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getDocsAndSeriesExpanded().isDisplayed());
        Thread.sleep(1000);

        Assert.assertTrue(docsAndSeriesPage.getHistory().isDisplayed());
        Thread.sleep(1000);

    }

    @Then("Check that the next arrow is available")
    public void NextArrowIsAvailable() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getNextBtn().isDisplayed());
        Thread.sleep(1000);

    }

    @When("Click on the next arrow")
    public void clickOnTheNextArrow() throws InterruptedException {


        docsAndSeriesPage.getNextBtn().click();
        Thread.sleep(2000);
        docsAndSeriesPage.getNextBtn().click();
        Thread.sleep(2000);
    }

    @Then("Check that the Previous arrow is available")
    public void PreviousArrowIsAvailable() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getPreviousBtn().isDisplayed());
        Thread.sleep(1000);

    }

    @When("Click on the Previous arrow")
    public void clickOnThePreviousArrow() throws InterruptedException {

        Assert.assertTrue(docsAndSeriesPage.getPreviousBtn().isDisplayed());
        Thread.sleep(1000);
        docsAndSeriesPage.getPreviousBtn().click();
        Thread.sleep(2000);
    }

    @Then("Check that next arrow is available")
    public void NextArrowAvailable() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getNextBtn().isDisplayed());
        Thread.sleep(1000);
    }

    @And("Check that the cross button is available top of the right corner")
    public void CrossButton() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getCrossBtn().isDisplayed());
        Thread.sleep(1000);

    }

    @When("Click on the cross button")
    public void clickCrossButton() throws InterruptedException {

        Thread.sleep(3000);
        docsAndSeriesPage.getCrossBtn().click();
        Thread.sleep(1000);
    }

    @Then("Check that the expanded page is closed")
    public void ExpandedPageIsClosed() throws InterruptedException {

        Assert.assertTrue(docsAndSeriesPage.getAllButton().isDisplayed());
        Thread.sleep(2000);
    }

    @Then("Scroll down and check that Load more option is available")
    public void scrollDown() throws InterruptedException {

        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);",docsAndSeriesPage.getLoadMoreBtn());
        Thread.sleep(2000);
    }

    @And("Check that the last history item")
    public void LastHistoryItem() throws InterruptedException {

        Assert.assertTrue(docsAndSeriesPage.getBeforeLoadStart().isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(docsAndSeriesPage.getBeforeLoadMoreEnd().isDisplayed());
        Thread.sleep(2000);
    }

    @Then("Again check that last history item")
    public void AgainLastHistoryItem() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);",docsAndSeriesPage.getAfterLoadMoreEnd());
        Thread.sleep(2000);
        Assert.assertTrue(docsAndSeriesPage.getAfterLoadMoreStart().isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(docsAndSeriesPage.getAfterLoadMoreEnd().isDisplayed());
        Thread.sleep(2000);
    }


    @And("Check that the A-Z button is available")
    public void AZButtonIsAvailable() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getAzBtn().isDisplayed());
        Thread.sleep(2000);
    }

    @When("Click on the A-Z button")
    public void AZButton() throws InterruptedException {
        docsAndSeriesPage.getAzBtn().click();
        Thread.sleep(2000);
    }
    @Then("Check that the A-Z button is selected")
    public void checkThatTheAZButtonIsSelected() throws InterruptedException {
        Assert.assertEquals(docsAndSeriesPage.getAllButtonColor().getCssValue("background-color"), "rgba(231, 19, 26, 1)");
        Thread.sleep(1000);
    }

    @And("Check that the History option is available")
    public void HistoryOptionIsAvailable() throws InterruptedException {
        Assert.assertTrue(docsAndSeriesPage.getHistory().isDisplayed());
        Thread.sleep(2000);
    }

    @When("Click on the History button")
    public void clickOnTheHistoryButton() throws InterruptedException {
        docsAndSeriesPage.getHistory().click();
        Thread.sleep(2000);
    }

    @When("Click on the Load More option")
    public void clickOnTheLoadMoreOption() throws InterruptedException {
        docsAndSeriesPage.getLoadMoreBtn().click();
        Thread.sleep(2000);
    }
}
