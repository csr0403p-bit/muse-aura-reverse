package com.facebook.aura.marketplacemap;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.model.MarketplaceMapListing;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchMarketplaceMapCardKt$MarketplaceMapListingList$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MarketplaceMapListing $listing;
    public final /* synthetic */ G0U<MarketplaceMapListing, Unit> $onRowTapped;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMarketplaceMapCardKt$MarketplaceMapListingList$1$1$1$1(G0U<? super MarketplaceMapListing, Unit> g0u, MarketplaceMapListing marketplaceMapListing) {
        super(0);
        this.$onRowTapped = g0u;
        this.$listing = marketplaceMapListing;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onRowTapped.invoke(this.$listing);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
