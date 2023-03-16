package org.tmb.driver.web.local;

import org.openqa.selenium.WebDriver;
import org.tmb.driver.manager.web.local.ChromeManager;
import org.tmb.driver.manager.web.local.FirefoxManager;
import org.tmb.enums.BrowserType;

public final class LocalDriverFactory {
    private LocalDriverFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        WebDriver driver;
        return (isBrowserChrome(browserType))
                ? ChromeManager.getDriver()
                : FirefoxManager.getDriver();

    }

    private static boolean isBrowserChrome(BrowserType browserType) {
        return browserType == BrowserType.CHROME;
    }
}



