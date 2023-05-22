package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(features="src/test/java/features",glue ="stepDefinitions",monochrome=true,
        tags ="@Credentialing",
        plugin= {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
// "html:target/cucumber.html", "json:target/cucumber.json",
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//"rerun:target/failed_scenarios.txt"}

)

public class TestNG2 extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel=true)
    public Object[][] scenarios()
    {
        return super.scenarios();
    }
}
