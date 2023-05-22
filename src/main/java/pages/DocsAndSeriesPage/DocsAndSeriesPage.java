package pages.DocsAndSeries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DocsAndSeriesPage {

    By docsAndSeries = By.xpath("//a[contains(@class,'active-page MuiListItem-gutters MuiListItem-button')]");

    public WebDriver driver;

    public DocsAndSeriesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDocsAndSeries(){
        return driver.findElement(docsAndSeries);
    }

}
