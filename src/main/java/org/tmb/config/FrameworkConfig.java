package org.tmb.config;

import org.aeonbits.owner.Config;
import org.tmb.config.converters.StringToBrowserTypeConverter;
import org.tmb.config.converters.StringToURLConverter;
import org.tmb.enums.BrowserRemoteModeType;
import org.tmb.enums.BrowserType;
import org.tmb.enums.BrowserTypeRunMode;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {
    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("browserRunMode")
    BrowserTypeRunMode browserTypeForRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteModeType BrowserTypeForRemoteMode();

    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();

    @ConverterClass(StringToURLConverter.class)
    URL selenoidURL();

}
