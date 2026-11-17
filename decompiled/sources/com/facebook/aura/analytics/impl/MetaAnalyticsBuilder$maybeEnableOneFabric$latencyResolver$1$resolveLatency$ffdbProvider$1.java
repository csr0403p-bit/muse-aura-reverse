package com.facebook.aura.analytics.impl;

import X.AbstractC7559F3s;
import X.InterfaceC4071ClJ;
import com.facebook.aura.analytics.ffdb.AuraFFDBProvider;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class MetaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1$resolveLatency$ffdbProvider$1 extends AbstractC7559F3s implements Function0<InterfaceC4071ClJ> {
    public static final MetaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1$resolveLatency$ffdbProvider$1 INSTANCE = new MetaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1$resolveLatency$ffdbProvider$1();

    public MetaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1$resolveLatency$ffdbProvider$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC4071ClJ invoke() {
        return new AuraFFDBProvider();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ InterfaceC4071ClJ invoke() {
        return new AuraFFDBProvider();
    }
}
