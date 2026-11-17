package com.facebook.aura.marketplacemap;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.G0U;
import X.G0V;
import com.facebook.aura.model.MarketplaceMapListing;
import com.facebook.aura.model.MarketplaceMapWidgetData;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMarketplaceMapCardKt$HatchMarketplaceMapCard$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $containerColor;
    public final /* synthetic */ C1DM $containerShape;
    public final /* synthetic */ MarketplaceMapWidgetData $data;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onExpand;
    public final /* synthetic */ G0V<MarketplaceMapListing, MarketplaceMapTapSource, Unit> $onListingTapped;
    public final /* synthetic */ String $presentationId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMarketplaceMapCardKt$HatchMarketplaceMapCard$2(MarketplaceMapWidgetData marketplaceMapWidgetData, String str, String str2, long j, C1DM c1dm, G0V<? super MarketplaceMapListing, ? super MarketplaceMapTapSource, Unit> g0v, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
        super(2);
        this.$data = marketplaceMapWidgetData;
        this.$hostMessageId = str;
        this.$presentationId = str2;
        this.$containerColor = j;
        this.$containerShape = c1dm;
        this.$onListingTapped = g0v;
        this.$onExpand = g0u;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        HatchMarketplaceMapCardKt.m1440HatchMarketplaceMapCard8r3B23s(this.$data, this.$hostMessageId, this.$presentationId, this.$containerColor, this.$containerShape, this.$onListingTapped, this.$onExpand, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
