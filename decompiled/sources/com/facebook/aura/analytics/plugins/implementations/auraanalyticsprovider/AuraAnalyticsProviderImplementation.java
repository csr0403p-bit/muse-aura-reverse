package com.facebook.aura.analytics.plugins.implementations.auraanalyticsprovider;

import X.BV5;
import X.DFX;
import com.facebook.aura.analytics.impl.MetaAnalyticsInstance;
import com.facebook.aura.analytics.impl.MetaAnalyticsSessionManager;

/* loaded from: classes5.dex */
public final class AuraAnalyticsProviderImplementation {
    public final void notifyUserConsentChanged() {
        MetaAnalyticsSessionManager.instance.notifyUserConsentChanged();
    }

    public final DFX getAppAnalyticsLogger() {
        return ((MetaAnalyticsInstance) BV5.A0Z(65550)).getAppInstance();
    }

    public final DFX getDeviceAnalyticsLogger() {
        return ((MetaAnalyticsInstance) BV5.A0Z(65550)).getDeviceInstance();
    }
}
