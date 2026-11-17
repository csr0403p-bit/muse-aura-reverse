package com.facebook.aura.analytics.plugins.interfaces.auraanalyticsprovider;

import X.DFX;

/* loaded from: classes5.dex */
public interface AuraAnalyticsProviderInterfaceSpec {
    DFX getAppAnalyticsLogger();

    DFX getDeviceAnalyticsLogger();

    void notifyUserConsentChanged();
}
