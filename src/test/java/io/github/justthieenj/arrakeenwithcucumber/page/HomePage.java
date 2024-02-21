package io.github.justthieenj.arrakeenwithcucumber.page;

import io.github.justthieenj.arrakeenselenium.element.ArrakeenElement;

import static io.github.justthieenj.arrakeenselenium.driver.Arrakeen.find;
import static io.github.justthieenj.arrakeenselenium.driver.Arrakeen.findByText;

public class HomePage {
    public final ArrakeenElement btnHamburgerMenu = find("#menu-toggle");
    public final ArrakeenElement btnLogin = findByText("Login");
}
