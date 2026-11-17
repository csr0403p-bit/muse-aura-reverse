package com.facebook.aura.marketplacemap;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.model.MarketplaceMapListing;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMarketplaceMapFullscreenScreenKt$MarketplaceFullscreenMap$3$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MarketplaceMapFullscreenScreenKey $key;
    public final /* synthetic */ MarketplaceMapLogContext $logContext;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ MarketplaceMapPins $pins;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        MarketplaceMapListing marketplaceMapListingListing = this.$pins.listing(str);
        if (marketplaceMapListingListing != null) {
            MarketplaceMapLogContext marketplaceMapLogContext = this.$logContext;
            AuraNavigator auraNavigator = this.$navigator;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey = this.$key;
            Context context = this.$context;
            marketplaceMapLogContext.logListingTap(MarketplaceMapTapSource.FULLSCREEN_PIN);
            marketplaceMapLogContext.logListingDetails();
            MarketplaceListingNavigationKt.openMarketplaceListing(marketplaceMapListingListing, auraNavigator, abstractC3358CGz, marketplaceMapFullscreenScreenKey.sessionId, marketplaceMapFullscreenScreenKey.hostMessageId, new HatchMarketplaceMapFullscreenScreenKt$MarketplaceFullscreenMap$3$1$1$1(context));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMarketplaceMapFullscreenScreenKt$MarketplaceFullscreenMap$3$1(MarketplaceMapPins marketplaceMapPins, MarketplaceMapLogContext marketplaceMapLogContext, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey, Context context) {
        super(1);
        this.$pins = marketplaceMapPins;
        this.$logContext = marketplaceMapLogContext;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$key = marketplaceMapFullscreenScreenKey;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
