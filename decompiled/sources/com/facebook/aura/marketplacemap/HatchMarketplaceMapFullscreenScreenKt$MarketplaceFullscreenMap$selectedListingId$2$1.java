package com.facebook.aura.marketplacemap;

import X.AbstractC1798ArH;
import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchMarketplaceMapFullscreenScreenKt$MarketplaceFullscreenMap$selectedListingId$2$1 extends AbstractC7559F3s implements Function0<MutableState<String>> {
    public final /* synthetic */ MarketplaceMapFullscreenScreenKey $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMarketplaceMapFullscreenScreenKt$MarketplaceFullscreenMap$selectedListingId$2$1(MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey) {
        super(0);
        this.$key = marketplaceMapFullscreenScreenKey;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MutableState<String> invoke() {
        return AbstractC1798ArH.A06(this.$key.selectedListingId);
    }
}
