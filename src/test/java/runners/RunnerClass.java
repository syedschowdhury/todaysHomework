package runners;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import java.io.File;

@CucumberOptions(features = { "src/test/resources/FeatureFiles" }, glue = { "C://Users//mahin//ideaProjects//JCP//src//test//java//jcpenny//stepDefs", "src/test/java/utilities" }, tags = {
        "@regression"}, plugin = { "pretty", "html:target/cucumber-htmlreport", "json:target/cucumber-report.json",
        "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports.html" }, monochrome = true)

public class RunnerClass extends AbstractTestNGCucumberTests {

    public static void writeExtentReport(){
        Reporter.loadXMLConfig(new File("config/config.xml"));
    }
}
