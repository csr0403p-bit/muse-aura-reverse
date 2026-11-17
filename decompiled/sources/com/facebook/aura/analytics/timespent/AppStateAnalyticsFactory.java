package com.facebook.aura.analytics.timespent;

import X.BV5;
import com.facebook.aura.analytics.timespent.config.TimeSpentMC;

/* loaded from: classes5.dex */
public final class AppStateAnalyticsFactory {
    public static final AppStateAnalyticsFactory INSTANCE = new AppStateAnalyticsFactory();
    public static final String TAG = "AppStateAnalytics";
    public static final AppStateAnalytics instance;

    static {
        instance = ((TimeSpentMC) BV5.A0Z(65557)).getAppStateLoggingEnabled() ? new AppStateAnalyticsImpl() : new AppStateAnalyticsNoOp();
    }

    public final AppStateAnalytics getInstance() {
        return instance;
    }
}
