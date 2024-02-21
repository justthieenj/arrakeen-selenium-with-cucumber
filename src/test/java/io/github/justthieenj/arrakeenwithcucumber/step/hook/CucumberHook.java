package io.github.justthieenj.arrakeenwithcucumber.step.hook;

import io.cucumber.java.*;
import io.github.justthieenj.arrakeenselenium.core.Arrakeen;

public class CucumberHook {
    @Before
    public void beforeScenario(Scenario scenario) {
        Arrakeen.initDriver();
        System.out.println("Before scenario: " + scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {
        Arrakeen.quitDriver();
        System.out.println("After scenario: " + scenario.getName());
    }
}
