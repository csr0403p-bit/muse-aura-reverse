package com.facebook.mobileconfig;

import java.util.Set;

/* loaded from: classes5.dex */
public interface MobileConfigExposureHandler {
    void logAccessWithoutExposure(String str);

    boolean logExposure(String str);

    Set<String> logExposures(Set<String> set);

    void reset();

    void updateLoggingIdsOnFetch(Set<String> set);
}
