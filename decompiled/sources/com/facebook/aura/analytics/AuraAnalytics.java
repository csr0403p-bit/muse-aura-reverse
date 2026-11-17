package com.facebook.aura.analytics;

import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.BV4;
import X.C60O;
import X.CGw;
import X.DFX;
import X.F0C;
import com.facebook.aura.analytics.plugins.interfaces.auraanalyticsprovider.AuraAnalyticsProviderInterface;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class AuraAnalytics {
    public static DFX singletonInstanceBackingField;
    public static final AuraAnalytics INSTANCE = new AuraAnalytics();
    public static final F0C analyticsProvider$delegate = AbstractC5321DgF.A03(AuraAnalytics$analyticsProvider$2.INSTANCE);
    public static final AtomicBoolean ranOnce = C60O.A1E();
    public static final F0C deviceInstance$delegate = AbstractC5321DgF.A03(AuraAnalytics$deviceInstance$2.INSTANCE);

    public static final /* synthetic */ AuraAnalyticsProviderInterface access$getAnalyticsProvider(AuraAnalytics auraAnalytics) {
        return (AuraAnalyticsProviderInterface) analyticsProvider$delegate.getValue();
    }

    private final AuraAnalyticsProviderInterface getAnalyticsProvider() {
        return (AuraAnalyticsProviderInterface) analyticsProvider$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DFX getAppAnalyticsLogger() {
        DFX appAnalyticsLogger = ((AuraAnalyticsProviderInterface) analyticsProvider$delegate.getValue()).mDelegate.getAppAnalyticsLogger();
        if (appAnalyticsLogger != null) {
            return appAnalyticsLogger;
        }
        throw BV4.A0U();
    }

    public final DFX getDeviceInstance() {
        return (DFX) deviceInstance$delegate.getValue();
    }

    public final DFX getInstance() {
        DFX appAnalyticsLogger;
        AuraAnalyticsHolder auraAnalyticsHolder;
        AbstractC3358CGz abstractC3358CGzA00 = ((CGw) AuraUserSessionStore.instance$delegate.getValue()).A00();
        if ((abstractC3358CGzA00 == null || (auraAnalyticsHolder = (AuraAnalyticsHolder) abstractC3358CGzA00.A03(AuraAnalyticsHolder.class, AuraAnalytics$instance$analyticsInstance$1.INSTANCE)) == null || (appAnalyticsLogger = auraAnalyticsHolder.instance) == null) && (appAnalyticsLogger = singletonInstanceBackingField) == null) {
            appAnalyticsLogger = getAppAnalyticsLogger();
            singletonInstanceBackingField = appAnalyticsLogger;
        }
        if (!ranOnce.getAndSet(true)) {
            AuraEarlyAnalytics.INSTANCE.onInitialized$fbandroid_express_aura_java_com_facebook_aura_analytics_analytics(appAnalyticsLogger);
        }
        return appAnalyticsLogger;
    }

    public final void notifyUserConsentChanged() {
        ((AuraAnalyticsProviderInterface) analyticsProvider$delegate.getValue()).notifyUserConsentChanged();
    }
}
