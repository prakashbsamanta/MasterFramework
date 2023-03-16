package org.tmb.driver.web.remote;

import org.openqa.selenium.WebDriver;
import org.tmb.enums.BrowserRemoteModeType;
import org.tmb.enums.BrowserType;

public final class RemoteDriverFactory {
    private RemoteDriverFactory() {
    }

    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteMode, BrowserType browserType) {
        if (browserRemoteMode == BrowserRemoteModeType.SELENIUM) {
            return SeleniumGridFactory.getDriver(browserType);
        } else if (browserRemoteMode == BrowserRemoteModeType.SELENOID) {
            return SelenoidFactory.getDriver(browserType);
        } else {
            return BrowserStackFactory.getDriver(browserType);
        }
    }
}
