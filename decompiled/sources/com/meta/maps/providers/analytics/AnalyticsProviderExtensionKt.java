package com.meta.maps.providers.analytics;

import X.AbstractC7559F3s;
import X.C60P;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.meta.maps.core.MapsSdkProvider;
import com.meta.maps.core.ProductSurface;
import com.meta.maps.core.Providing;
import com.meta.maps.core.ServiceType;
import com.meta.maps.providers.analytics.AnalyticsProvider;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AnalyticsProviderExtensionKt {

    /* renamed from: com.meta.maps.providers.analytics.AnalyticsProviderExtensionKt$initAnalytics$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Providing> {
        public final /* synthetic */ XAnalyticsHolder $analyticsHolder;
        public final /* synthetic */ ProductSurface $productSurface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(XAnalyticsHolder xAnalyticsHolder, ProductSurface productSurface) {
            super(0);
            this.$analyticsHolder = xAnalyticsHolder;
            this.$productSurface = productSurface;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Providing invoke() {
            AnalyticsHolder analyticsHolder = new AnalyticsHolder(this.$analyticsHolder);
            analyticsHolder.analytics.setProductSurface(this.$productSurface);
            return analyticsHolder.analytics;
        }
    }

    public static final AnalyticsHolder create(AnalyticsProvider.Companion companion, XAnalyticsHolder xAnalyticsHolder) {
        return new AnalyticsHolder(xAnalyticsHolder);
    }

    public static final void initAnalytics(MapsSdkProvider mapsSdkProvider, ProductSurface productSurface, XAnalyticsHolder xAnalyticsHolder) {
        boolean zA1Y = C60P.A1Y(mapsSdkProvider, productSurface);
        SdkModule.INSTANCE.ensureLoaded();
        mapsSdkProvider.putIfAbsent(ServiceType.ANALYTICS, new AnonymousClass1(xAnalyticsHolder, productSurface), zA1Y);
    }
}
