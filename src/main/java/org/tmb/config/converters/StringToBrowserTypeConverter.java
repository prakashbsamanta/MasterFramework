package org.tmb.config.converters;

import org.aeonbits.owner.Converter;
import org.tmb.enums.BrowserType;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {
    @Override
    public BrowserType convert(Method method, String browserName) {
        Map<String, BrowserType> stringBrowserTypeMap = Map.of("CHROME", BrowserType.CHROME, "FIREFOX", BrowserType.FIREFOX);
        return stringBrowserTypeMap.getOrDefault(browserName.toUpperCase(), BrowserType.CHROME);
    }
}
