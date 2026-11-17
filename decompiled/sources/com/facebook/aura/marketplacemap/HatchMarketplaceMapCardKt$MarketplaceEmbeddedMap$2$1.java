package com.facebook.aura.marketplacemap;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.model.MarketplaceMapListing;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMarketplaceMapCardKt$MarketplaceEmbeddedMap$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ G0U<String, Unit> $onSelectedListingChanged;
    public final /* synthetic */ MarketplaceMapPins $pins;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMarketplaceMapCardKt$MarketplaceEmbeddedMap$2$1(G0U<? super String, Unit> g0u, MarketplaceMapPins marketplaceMapPins) {
        super(1);
        this.$onSelectedListingChanged = g0u;
        this.$pins = marketplaceMapPins;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        MarketplaceMapListing marketplaceMapListingListing;
        this.$onSelectedListingChanged.invoke((str == null || (marketplaceMapListingListing = this.$pins.listing(str)) == null) ? null : marketplaceMapListingListing.id);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
