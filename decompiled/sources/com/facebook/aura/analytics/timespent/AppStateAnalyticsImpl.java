package com.facebook.aura.analytics.timespent;

import X.BV4;
import X.C06H;
import X.C7384Etj;
import X.C79;
import X.DFW;
import X.DFX;
import com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator.AuraAnalyticsDecoratorInterface;
import com.facebook.aura.analytics.timespent.navigation.AuraNavigationLogger;

/* loaded from: classes5.dex */
public final class AppStateAnalyticsImpl implements AppStateAnalytics {
    public static final Companion Companion = new Companion();
    public static final String EVENT_NAME = "app_state";
    public static final String KEY_MODULE_INFO = "module_info";
    public static final String KEY_STATE = "state";
    public static final String MODULE_NAME = "aura";
    public static final String VALUE_BACKGROUND = "background";
    public static final String VALUE_BACKGROUND_IMMEDIATE = "background_immediate";
    public static final String VALUE_FOREGROUND = "foreground";
    public final AuraAnalyticsDecoratorInterface analyticsDecorator;
    public boolean freshUIAppStart;

    @Override // com.facebook.aura.analytics.timespent.AppStateAnalytics
    public void markFreshUIAppStart() {
        this.freshUIAppStart = true;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void recordAppState(String str, boolean z) {
        boolean zEquals = "foreground".equals(str);
        DFW dfwA01 = DFX.A01(BV4.A0C(), C79.A00, "aura", "app_state", z);
        C7384Etj.A0U(dfwA01);
        if (dfwA01.A0A()) {
            if (zEquals && !this.freshUIAppStart) {
                dfwA01.A09(KEY_MODULE_INFO, AuraNavigationLogger.instance.getModuleInfo());
            }
            dfwA01.A09("state", str);
            this.analyticsDecorator.decorateTimeSpentAppStateEvent(dfwA01);
            dfwA01.A05();
        }
        if (zEquals) {
            this.freshUIAppStart = false;
        }
    }

    public static /* synthetic */ void recordAppState$default(AppStateAnalyticsImpl appStateAnalyticsImpl, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        appStateAnalyticsImpl.recordAppState(str, z);
    }

    private final boolean shouldLogEvent() {
        return true;
    }

    @Override // com.facebook.aura.analytics.timespent.AppStateAnalytics
    public void recordAppBackgrounded() {
        recordAppState("background", false);
        this.analyticsDecorator.onTimeSpentAppBackgrounded();
    }

    @Override // com.facebook.aura.analytics.timespent.AppStateAnalytics
    public void recordAppBackgroundedImmediate() {
        recordAppState(VALUE_BACKGROUND_IMMEDIATE, true);
    }

    @Override // com.facebook.aura.analytics.timespent.AppStateAnalytics
    public void recordAppForegrounded() {
        recordAppState("foreground", false);
        this.analyticsDecorator.onTimeSpentAppForegrounded();
    }

    public AppStateAnalyticsImpl() {
        AuraAnalyticsDecoratorInterface auraAnalyticsDecoratorInterfaceBuild = new AuraAnalyticsDecoratorInterface.BuilderImpl("AuraAnalyticsDecorator").build();
        C7384Etj.A0U(auraAnalyticsDecoratorInterfaceBuild);
        this.analyticsDecorator = auraAnalyticsDecoratorInterfaceBuild;
        this.freshUIAppStart = true;
    }
}
