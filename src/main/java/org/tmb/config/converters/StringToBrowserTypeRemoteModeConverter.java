package org.tmb.config.converters;

import org.aeonbits.owner.Converter;
import org.tmb.enums.BrowserRemoteModeType;
import org.tmb.enums.BrowserTypeRunMode;

import java.lang.reflect.Method;

public class StringToBrowserTypeRemoteModeConverter implements Converter<BrowserRemoteModeType> {
    @Override
    public BrowserRemoteModeType convert(Method method, String remoteMode) {
        return BrowserRemoteModeType.valueOf(remoteMode.toUpperCase());
    }
}
