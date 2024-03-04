package io.github.justthieenj.arrakeenwithcucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        glue = {"io.github.justthieenj.arrakeenwithcucumber.step"},
        features = {"src/test/resources/features"},
        plugin = {"io.github.justthieenj.arrakeenwithcucumber.utils.CucumberListener"}
)
public class CucumberTest extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
