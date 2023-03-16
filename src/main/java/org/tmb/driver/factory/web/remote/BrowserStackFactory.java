package org.tmb.driver.factory.web.remote;

import org.openqa.selenium.WebDriver;
import org.tmb.driver.manager.web.remote.browserStack.BrowserStackChromeManager;
import org.tmb.driver.manager.web.remote.browserStack.BrowserStackFirefoxManager;
import org.tmb.enums.BrowserType;

public final class BrowserStackFactory {
    private BrowserStackFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME
                ? BrowserStackChromeManager.getDriver()
                : BrowserStackFirefoxManager.getDriver();
    }
}
