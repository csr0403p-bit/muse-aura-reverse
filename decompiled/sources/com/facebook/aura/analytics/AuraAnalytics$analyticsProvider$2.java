package com.facebook.aura.analytics;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.plugins.interfaces.auraanalyticsprovider.AuraAnalyticsProviderInterface;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraAnalytics$analyticsProvider$2 extends AbstractC7559F3s implements Function0<AuraAnalyticsProviderInterface> {
    public static final AuraAnalytics$analyticsProvider$2 INSTANCE = new AuraAnalytics$analyticsProvider$2();

    public AuraAnalytics$analyticsProvider$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraAnalyticsProviderInterface invoke() {
        return AuraAnalyticsProviderInterface.create("All", null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ AuraAnalyticsProviderInterface invoke() {
        return AuraAnalyticsProviderInterface.create("All", null);
    }
}
