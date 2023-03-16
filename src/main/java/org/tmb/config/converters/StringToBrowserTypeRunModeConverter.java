package org.tmb.config.converters;

import org.aeonbits.owner.Converter;
import org.tmb.enums.BrowserType;
import org.tmb.enums.BrowserTypeRunMode;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserTypeRunModeConverter implements Converter<BrowserTypeRunMode> {
    @Override
    public BrowserTypeRunMode convert(Method method, String runMode) {
        return BrowserTypeRunMode.valueOf(runMode.toUpperCase());
    }
}
