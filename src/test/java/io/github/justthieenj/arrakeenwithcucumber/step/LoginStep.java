package io.github.justthieenj.arrakeenwithcucumber.step;

import io.cucumber.java.en.When;

import static io.github.justthieenj.arrakeenwithcucumber.page.PageFactory.loginPage;

public class LoginStep {
    @When("I login with valid credentials")
    public void login() {
        loginPage().txtUsername.type("John Doe");
        loginPage().txtPassword.type("ThisIsNotAPassword");
        loginPage().btnLogin.click();
    }
}
