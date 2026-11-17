package com.facebook.aura.analytics.timespent.navigation;

import X.BV5;
import com.facebook.aura.analytics.timespent.config.TimeSpentMC;

/* loaded from: classes5.dex */
public final class AuraNavigationLogger {
    public static final AuraNavigationLogger INSTANCE = new AuraNavigationLogger();
    public static final String TAG = "AuraNavigationLogger";
    public static final NavigationLogger instance;

    static {
        instance = ((TimeSpentMC) BV5.A0Z(65557)).getNavigationLoggingEnabled() ? new NavigationLoggerImpl() : new NavigationLoggerNoOp();
    }

    public final NavigationLogger getInstance() {
        return instance;
    }
}
