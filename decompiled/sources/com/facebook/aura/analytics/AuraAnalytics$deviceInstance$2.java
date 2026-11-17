package com.facebook.aura.analytics;

import X.AbstractC7559F3s;
import X.BV4;
import X.DFX;
import com.facebook.aura.analytics.plugins.interfaces.auraanalyticsprovider.AuraAnalyticsProviderInterface;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraAnalytics$deviceInstance$2 extends AbstractC7559F3s implements Function0<DFX> {
    public static final AuraAnalytics$deviceInstance$2 INSTANCE = new AuraAnalytics$deviceInstance$2();

    public AuraAnalytics$deviceInstance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final DFX invoke() {
        DFX deviceAnalyticsLogger = ((AuraAnalyticsProviderInterface) AuraAnalytics.analyticsProvider$delegate.getValue()).mDelegate.getDeviceAnalyticsLogger();
        if (deviceAnalyticsLogger != null) {
            return deviceAnalyticsLogger;
        }
        throw BV4.A0U();
    }
}
