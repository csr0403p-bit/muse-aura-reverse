package com.facebook.aura.analytics.impl;

import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: classes5.dex */
public final class AuraXAnalyticsHolderProvider {
    public static final AuraXAnalyticsHolderProvider INSTANCE = new AuraXAnalyticsHolderProvider();
    public static final XAnalyticsHolder holder = new AuraXNativeHolderProvider(AuraXAnalyticsHolderProvider$holder$1.INSTANCE).xAnalyticsAdapter;

    public final XAnalyticsHolder getHolder() {
        return holder;
    }
}
