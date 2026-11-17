package com.facebook.aura.marketplacemap;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.model.MarketplaceMapListing;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMarketplaceMapCardKt$HatchMarketplaceMapCard$1$4$1 extends AbstractC7559F3s implements G0U<MarketplaceMapListing, Unit> {
    public final /* synthetic */ G0V<MarketplaceMapListing, MarketplaceMapTapSource, Unit> $onListingTapped;
    public final /* synthetic */ MarketplaceMapPins $pins;
    public final /* synthetic */ MutableState<String> $selectedListingId$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MarketplaceMapListing marketplaceMapListing) {
        C7384Etj.A0Y(marketplaceMapListing, 0);
        MutableState<String> mutableState = this.$selectedListingId$delegate;
        String str = marketplaceMapListing.id;
        if (!this.$pins.isPinned(str)) {
            str = null;
        }
        mutableState.Af8(str);
        this.$onListingTapped.invoke(marketplaceMapListing, MarketplaceMapTapSource.ROW);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMarketplaceMapCardKt$HatchMarketplaceMapCard$1$4$1(MarketplaceMapPins marketplaceMapPins, G0V<? super MarketplaceMapListing, ? super MarketplaceMapTapSource, Unit> g0v, MutableState<String> mutableState) {
        super(1);
        this.$pins = marketplaceMapPins;
        this.$onListingTapped = g0v;
        this.$selectedListingId$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(MarketplaceMapListing marketplaceMapListing) {
        invoke2(marketplaceMapListing);
        return Unit.INSTANCE;
    }
}
