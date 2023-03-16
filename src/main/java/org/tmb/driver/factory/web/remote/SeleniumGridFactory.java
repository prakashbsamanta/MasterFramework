package org.tmb.driver.factory.web.remote;

import org.openqa.selenium.WebDriver;
import org.tmb.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import org.tmb.driver.manager.web.remote.selenium.SeleniumGridFirefoxManager;
import org.tmb.enums.BrowserType;

public final class SeleniumGridFactory {

    private SeleniumGridFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME
                ? SeleniumGridChromeManager.getDriver()
                : SeleniumGridFirefoxManager.getDriver();
    }
}
