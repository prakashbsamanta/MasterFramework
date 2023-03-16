package org.tmb.tests;

import org.testng.annotations.Test;
import org.tmb.config.factory.BrowserStackConfigFactory;
import org.tmb.config.factory.ConfigFactory;

public class DemoTest {

    @Test
    public void testLogin() {

        System.out.println(ConfigFactory.getConfig().browser());

        System.out.println(BrowserStackConfigFactory.getConfig().browserStackURL());

    }
}
