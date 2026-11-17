package com.facebook.aura.analytics;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraAnalytics$instance$analyticsInstance$1 extends AbstractC7559F3s implements Function0<AuraAnalyticsHolder> {
    public static final AuraAnalytics$instance$analyticsInstance$1 INSTANCE = new AuraAnalytics$instance$analyticsInstance$1();

    public AuraAnalytics$instance$analyticsInstance$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraAnalyticsHolder invoke() {
        return new AuraAnalyticsHolder(AuraAnalytics.INSTANCE.getAppAnalyticsLogger());
    }
}
