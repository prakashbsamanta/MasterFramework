package org.tmb.driver.factory.web.remote;

import org.openqa.selenium.WebDriver;
import org.tmb.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import org.tmb.driver.manager.web.remote.selenoid.SelenoidFirefoxManager;
import org.tmb.enums.BrowserType;

public final class SelenoidFactory {

    private SelenoidFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME
                ? SelenoidChromeManager.getDriver()
                : SelenoidFirefoxManager.getDriver();
    }
}
