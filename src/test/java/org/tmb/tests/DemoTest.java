package org.tmb.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.aeonbits.owner.ConfigCache;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.tmb.config.ConfigFactory;
import org.tmb.config.FrameworkConfig;

public class DemoTest {

    @Test
    public void testLogin() {
        
        System.out.println(ConfigFactory.getConfig().browser());
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");
//        driver.quit();
    }
}
