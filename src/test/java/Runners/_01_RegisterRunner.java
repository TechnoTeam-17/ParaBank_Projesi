package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@SmokeTest ,@Regression",
        features = {"src/test/java/featureFiles/_01_Register.feature"},
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _01_RegisterRunner extends AbstractTestNGCucumberTests{
}
