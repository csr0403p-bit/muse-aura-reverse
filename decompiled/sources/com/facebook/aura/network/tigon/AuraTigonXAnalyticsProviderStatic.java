package com.facebook.aura.network.tigon;

import com.facebook.aura.analytics.impl.AuraTigonXAnalyticsProviderImpl;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: classes5.dex */
public class AuraTigonXAnalyticsProviderStatic {
    public static XAnalyticsHolder provide() {
        return AuraTigonXAnalyticsProviderImpl.INSTANCE.provide();
    }
}
