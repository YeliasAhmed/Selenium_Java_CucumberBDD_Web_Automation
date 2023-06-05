package pages.DocsAndSeriesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DocsAndSeriesPage {

    By tvoTodayPage = By.xpath("//a[@aria-label='TVO Today Home']");
    By docsAndSeries = By.xpath("//div[contains(text(),'Docs & Series')]");
    By allButton = By.xpath("//span[normalize-space()='All']");
    By allButtonColor = By.xpath("//button[@aria-current='page']");
    By remindLater = By.xpath("//span[normalize-space()='Remind me later']");

    By focusOnPhotography = By.xpath("//h2[normalize-space()='Focus on Photography']");
    By aboutMentalHealth = By.xpath("//h2[normalize-space()='About Mental Health']");
    By mentalHealthPhoto = By.xpath("(//p[normalize-space()='Drunk On Too Much Life'])[1]");
    By photographyPhoto = By.xpath("//p[normalize-space()='Capturing Lee Miller']");
    By searchButton = By.xpath("(//span[@class='MuiTypography-root MuiListItemText-primary MuiTypography-body1 MuiTypography-displayBlock'])[7]");
    By searchField = By.xpath("//input[@id='search-field']");
    By searchItem = By.xpath("//p[normalize-space()='Showing 3070 results']");
    By seriesButton = By.xpath("//span[normalize-space()='Series']");
    By anySeries = By.xpath("//p[normalize-space()='A Stitch in Time']");
    By seriesDetail = By.xpath("//h1[normalize-space()='A Stitch in Time']");
    By seriesDetailEp = By.xpath("//span[normalize-space()='6 Episodes']");
    By docsAndSeriesExpanded = By.xpath("//p[normalize-space()='All Docs & Series']");
    By nextBtn = By.xpath("//div[contains(@class,'series-docs-nav__nav-button series-docs-nav__next-button')]");
    By previousBtn = By.xpath("//div[@class='series-docs-nav__nav-button series-docs-nav__prev-button']");
    By crossBtn = By.xpath("//button[@aria-label='Close submenu']//*[name()='svg']");
    By azBtn = By.xpath("//span[normalize-space()='A-Z']");
    By history = By.xpath("//p[normalize-space()='History']");
    By loadMoreBtn = By.xpath("//span[normalize-space()='Load More']");
    By beforeLoadStart = By.xpath("//p[normalize-space()='Princess Anne at 70']");
    By beforeLoadMoreEnd = By.xpath("//p[normalize-space()='The Nile: 5000 Years of History']");
    By afterLoadMoreStart = By.xpath("//p[normalize-space()='Genius of the Modern World']");
    By afterLoadMoreEnd = By.xpath("//p[normalize-space()='Lost Kingdoms of Africa']");




    public WebDriver driver;

    public DocsAndSeriesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDocsAndSeries(){
        return driver.findElement(docsAndSeries);
    }
    public WebElement getTvoToday(){
        return driver.findElement(tvoTodayPage);
    }
    public WebElement getAllButton(){
        return driver.findElement(allButton);
    }
    public WebElement getAllButtonColor(){
        return driver.findElement(allButtonColor);
    }
    public WebElement getRemindLater(){
        return driver.findElement(remindLater);
    }
    public WebElement getFocusOnPhotography(){
        return driver.findElement(focusOnPhotography);
    }
    public WebElement getAboutMentalHealth(){
        return driver.findElement(aboutMentalHealth);
    }
    public WebElement getMentalHealthPhoto(){
        return driver.findElement(mentalHealthPhoto);
    }
    public WebElement getPhotographyPhoto(){
        return driver.findElement(photographyPhoto);
    }
    public WebElement getSearchButton(){
        return driver.findElement(searchButton);
    }
    public WebElement getSearchField(){
        return driver.findElement(searchField);
    }
    public WebElement getSearchItem(){
        return driver.findElement(searchItem);
    }

    public WebElement getSeriesButton(){
        return driver.findElement(seriesButton);
    }
    public WebElement getAnySeries(){
        return driver.findElement(anySeries);
    }
    public WebElement getSeriesDetail(){
        return driver.findElement(seriesDetail);
    }
    public WebElement getSeriesDetailEp(){
        return driver.findElement(seriesDetailEp);
    }
    public WebElement getDocsAndSeriesExpanded(){
        return driver.findElement(docsAndSeriesExpanded);
    }
    public WebElement getNextBtn(){
        return driver.findElement(nextBtn);
    }
    public WebElement getPreviousBtn(){
        return driver.findElement(previousBtn);
    }
    public WebElement getCrossBtn(){
        return driver.findElement(crossBtn);
    }
    public WebElement getAzBtn(){
        return driver.findElement(azBtn);
    }
    public WebElement getHistory(){
        return driver.findElement(history);
    }
    public WebElement getLoadMoreBtn(){
        return driver.findElement(loadMoreBtn);
    }
    public WebElement getBeforeLoadStart(){
        return driver.findElement(beforeLoadStart);
    }
    public WebElement getBeforeLoadMoreEnd(){
        return driver.findElement(beforeLoadMoreEnd);
    }
    public WebElement getAfterLoadMoreStart(){
        return driver.findElement(afterLoadMoreStart);
    }
    public WebElement getAfterLoadMoreEnd(){
        return driver.findElement(afterLoadMoreEnd);
    }

}
