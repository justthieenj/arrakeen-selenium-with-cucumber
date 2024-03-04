package io.github.justthieenj.arrakeenwithcucumber.step;

import io.cucumber.java.en.When;

import static io.github.justthieenj.arrakeenwithcucumber.page.PageFactory.homePage;

public class HomeStep {
    @When("I click on the login button")
    public void clickLoginButton() {
        homePage().btnHamburgerMenu.click();
        homePage().btnLogin.click();
    }
}
