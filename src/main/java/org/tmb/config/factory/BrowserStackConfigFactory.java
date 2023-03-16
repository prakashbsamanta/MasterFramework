package org.tmb.config.factory;

import org.aeonbits.owner.ConfigCache;
import org.tmb.config.BrowserStackConfig;

public class BrowserStackConfigFactory {


    private BrowserStackConfigFactory() {
    }

    public static BrowserStackConfig getConfig() {
        return ConfigCache.getOrCreate(BrowserStackConfig.class);
    }
}
