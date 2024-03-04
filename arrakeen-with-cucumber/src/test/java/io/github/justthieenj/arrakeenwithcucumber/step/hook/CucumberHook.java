package io.github.justthieenj.arrakeenwithcucumber.step.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.justthieenj.arrakeenselenium.core.Arrakeen;
import io.github.justthieenj.arrakeenselenium.utils.Log;

public class CucumberHook {
    @Before
    public void beforeScenario(Scenario scenario) {
        Arrakeen.initDriver();
        Log.info("Running scenario: %s".formatted(scenario.getName()));
    }

    @After
    public void afterScenario(Scenario scenario) {
        Arrakeen.quitDriver();
        Log.info("Scenario: %s is %s".formatted(scenario.getName(), scenario.getStatus()));
    }
}
