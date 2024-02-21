package io.github.justthieenj.arrakeenwithcucumber.page;

import io.github.justthieenj.arrakeenselenium.element.ArrakeenElement;

import static io.github.justthieenj.arrakeenselenium.driver.Arrakeen.find;

public class LoginPage {
    public final ArrakeenElement txtUsername = find("#txt-username");
    public final ArrakeenElement txtPassword = find("#txt-password");
    public final ArrakeenElement btnLogin = find("#btn-login");
}
