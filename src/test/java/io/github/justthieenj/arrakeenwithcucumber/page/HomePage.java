package io.github.justthieenj.arrakeenwithcucumber.page;

import io.github.justthieenj.arrakeenselenium.core.ArrakeenElement;

import static io.github.justthieenj.arrakeenselenium.core.Arrakeen.find;
import static io.github.justthieenj.arrakeenselenium.core.Arrakeen.findByText;

public class HomePage {
    public final ArrakeenElement btnHamburgerMenu = find("#menu-toggle");
    public final ArrakeenElement btnLogin = findByText("Login");
}
