package io.github.justthieenj.arrakeenwithcucumber.page;

import io.github.justthieenj.arrakeenselenium.utils.ReflectUtils;

public class PageFactory {
    private static HomePage homePage;
    private static LoginPage loginPage;

    public static HomePage homePage() {
        return homePage = ReflectUtils.initObject(homePage, HomePage.class);
    }

    public static LoginPage loginPage() {
        return loginPage = ReflectUtils.initObject(loginPage, LoginPage.class);
    }
}
