package com.facebook.aura.productactions.api;

import X.AnonymousClass005;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchScreen;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ProductMediaActionContext {
    public static final int $stable = 0;
    public final Map<String, String> analyticsMetadata;
    public final HatchScreen analyticsScreen;
    public final String productId;
    public final G0U<String, Unit> sendReply;
    public final ProductMediaActionSize size;

    public final Map<String, String> getAnalyticsMetadata() {
        return this.analyticsMetadata;
    }

    public final HatchScreen getAnalyticsScreen() {
        return this.analyticsScreen;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final G0U<String, Unit> getSendReply() {
        return this.sendReply;
    }

    public final ProductMediaActionSize getSize() {
        return this.size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductMediaActionContext(String str, ProductMediaActionSize productMediaActionSize, HatchScreen hatchScreen, Map<String, String> map, G0U<? super String, Unit> g0u) {
        AnonymousClass005.A17(str, productMediaActionSize, hatchScreen, map, g0u);
        this.productId = str;
        this.size = productMediaActionSize;
        this.analyticsScreen = hatchScreen;
        this.analyticsMetadata = map;
        this.sendReply = g0u;
    }
}
