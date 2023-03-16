package org.tmb.driver;

import org.openqa.selenium.WebDriver;
import org.tmb.config.factory.ConfigFactory;
import org.tmb.driver.factory.web.local.LocalDriverFactory;

public final class Driver {
    private Driver() {

    }

    public static void initDriver() {
        WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
    }

    public static void quitDriver() {
//        driver.quit();
    }
}
