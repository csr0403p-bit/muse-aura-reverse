package com.facebook.aura.analytics.impl;

import X.BV5;

/* loaded from: classes5.dex */
public final class MetaAnalyticsHooks {
    public final void onBackground() {
        MetaAnalyticsSessionManager.instance.notifyOnBackground();
        ((MetaAnalyticsInstance) BV5.A0Z(65550)).triggerUploadNow();
    }

    public final void onForeground() {
        MetaAnalyticsSessionManager.instance.notifyOnForeground();
        ((MetaAnalyticsInstance) BV5.A0Z(65550)).triggerUploadNow();
    }
}
