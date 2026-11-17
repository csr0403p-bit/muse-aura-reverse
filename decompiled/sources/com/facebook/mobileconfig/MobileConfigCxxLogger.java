package com.facebook.mobileconfig;

import java.util.Map;

/* loaded from: classes5.dex */
public interface MobileConfigCxxLogger {
    void logCounter(String str, int i);

    void logEvent(String str, Map<String, String> map);

    void logEventImmediately(String str, Map<String, String> map);

    void logGeneralCasesEvent(String str, Map<String, String> map, Map<String, Long> map2);
}
