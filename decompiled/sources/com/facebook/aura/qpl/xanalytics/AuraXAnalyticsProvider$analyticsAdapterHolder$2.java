package com.facebook.aura.qpl.xanalytics;

import X.AbstractC7559F3s;
import X.C5065DTb;
import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraXAnalyticsProvider$analyticsAdapterHolder$2 extends AbstractC7559F3s implements Function0<XAnalyticsAdapterHolder> {
    public static final AuraXAnalyticsProvider$analyticsAdapterHolder$2 INSTANCE = new AuraXAnalyticsProvider$analyticsAdapterHolder$2();

    public AuraXAnalyticsProvider$analyticsAdapterHolder$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final XAnalyticsAdapterHolder invoke() {
        C5065DTb c5065DTb = XAnalyticsAdapterHolder.Companion;
        return new XAnalyticsAdapterHolder(new AuraXAnalyticsAdapter());
    }
}
