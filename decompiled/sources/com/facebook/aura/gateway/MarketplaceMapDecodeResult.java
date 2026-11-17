package com.facebook.aura.gateway;

import X.C7384Etj;
import com.facebook.aura.model.MarketplaceMapWidgetData;

/* loaded from: classes3.dex */
public final class MarketplaceMapDecodeResult {
    public static final int $stable = MarketplaceMapWidgetData.$stable;
    public final MarketplaceMapWidgetData data;
    public final int elementCount;
    public final int skippedCount;

    public MarketplaceMapDecodeResult(MarketplaceMapWidgetData marketplaceMapWidgetData, int i, int i2) {
        C7384Etj.A0Y(marketplaceMapWidgetData, 0);
        this.data = marketplaceMapWidgetData;
        this.skippedCount = i;
        this.elementCount = i2;
    }

    public final MarketplaceMapWidgetData getData() {
        return this.data;
    }

    public final int getElementCount() {
        return this.elementCount;
    }

    public final int getSkippedCount() {
        return this.skippedCount;
    }
}
