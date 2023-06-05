package pages.PageObjectManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.DocsAndSeriesPage.DocsAndSeriesPage;


public class PageObjectManager {

    public static WebDriver driver;


    public DocsAndSeriesPage docsAndSeriesPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public DocsAndSeriesPage getDocsAndSeriesPage() {
        docsAndSeriesPage = new DocsAndSeriesPage(driver);
        return docsAndSeriesPage;
    }

    public static void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public static WebElement hoverToElement(WebElement element) {
        Actions action = new Actions(driver);
        WebElement we = element;
        action.moveToElement(we).perform();
        return we;
    }
}
