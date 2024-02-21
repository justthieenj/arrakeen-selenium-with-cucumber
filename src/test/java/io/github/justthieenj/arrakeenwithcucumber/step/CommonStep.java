package io.github.justthieenj.arrakeenwithcucumber.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static io.github.justthieenj.arrakeenselenium.driver.Arrakeen.findByText;
import static io.github.justthieenj.arrakeenselenium.driver.Arrakeen.open;
import static io.github.justthieenj.arrakeenselenium.enums.ElementState.visible;

public class CommonStep {
    @Given("I am on the home page")
    public void openHomePage() {
        open("https://katalon-demo-cura.herokuapp.com/");
    }

    @Then("Text {} should be displayed")
    public void verifyTextDisplayed(String text) {
        var displayed = findByText(text).is(visible);
        Assert.assertTrue(displayed, "Text %s is not displayed".formatted(text));
    }
}
