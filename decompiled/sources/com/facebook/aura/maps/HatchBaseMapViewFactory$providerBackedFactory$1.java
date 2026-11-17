package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.impl.AuraXAnalyticsHolderProvider;
import com.meta.maps.core.MapsSdkProvider;
import com.meta.maps.core.ProductSurface;
import com.meta.maps.providers.analytics.AnalyticsProviderExtensionKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchBaseMapViewFactory$providerBackedFactory$1 extends AbstractC7559F3s implements Function0<MapsSdkProvider> {
    public static final HatchBaseMapViewFactory$providerBackedFactory$1 INSTANCE = new HatchBaseMapViewFactory$providerBackedFactory$1();

    public HatchBaseMapViewFactory$providerBackedFactory$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MapsSdkProvider invoke() {
        MapsSdkProvider mapsSdkProvider = new MapsSdkProvider();
        AnalyticsProviderExtensionKt.initAnalytics(mapsSdkProvider, ProductSurface.HATCH, AuraXAnalyticsHolderProvider.holder);
        return mapsSdkProvider;
    }
}
