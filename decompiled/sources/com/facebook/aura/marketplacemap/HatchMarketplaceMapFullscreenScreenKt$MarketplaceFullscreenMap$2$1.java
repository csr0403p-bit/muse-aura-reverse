package com.facebook.aura.marketplacemap;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.model.MarketplaceMapListing;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMarketplaceMapFullscreenScreenKt$MarketplaceFullscreenMap$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MarketplaceMapPins $pins;
    public final /* synthetic */ MutableState<String> $selectedListingId$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMarketplaceMapFullscreenScreenKt$MarketplaceFullscreenMap$2$1(MarketplaceMapPins marketplaceMapPins, MutableState<String> mutableState) {
        super(1);
        this.$pins = marketplaceMapPins;
        this.$selectedListingId$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        MarketplaceMapListing marketplaceMapListingListing;
        this.$selectedListingId$delegate.Af8((str == null || (marketplaceMapListingListing = this.$pins.listing(str)) == null) ? null : marketplaceMapListingListing.id);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
