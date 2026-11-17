package com.facebook.aura.marketplacemap;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.model.MarketplaceMapListing;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMarketplaceMapCardKt$MarketplaceEmbeddedMap$3$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ G0U<MarketplaceMapListing, Unit> $onPinTapped;
    public final /* synthetic */ MarketplaceMapPins $pins;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        MarketplaceMapListing marketplaceMapListingListing = this.$pins.listing(str);
        if (marketplaceMapListingListing != null) {
            this.$onPinTapped.invoke(marketplaceMapListingListing);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMarketplaceMapCardKt$MarketplaceEmbeddedMap$3$1(MarketplaceMapPins marketplaceMapPins, G0U<? super MarketplaceMapListing, Unit> g0u) {
        super(1);
        this.$pins = marketplaceMapPins;
        this.$onPinTapped = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
