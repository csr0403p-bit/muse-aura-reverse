package com.facebook.aura.marketplacemap;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationWidgetContext;
import com.facebook.aura.model.MarketplaceMapListing;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMarketplaceMapWidgetRenderer$Render$2$1 extends AbstractC7559F3s implements G0V<MarketplaceMapListing, MarketplaceMapTapSource, Unit> {
    public final /* synthetic */ ConversationWidgetContext $context;
    public final /* synthetic */ MarketplaceMapLogContext $logContext;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MarketplaceMapListing marketplaceMapListing, MarketplaceMapTapSource marketplaceMapTapSource) {
        AnonymousClass003.A0u(marketplaceMapListing, marketplaceMapTapSource);
        this.$logContext.logListingTap(marketplaceMapTapSource);
        this.$logContext.logListingDetails();
        AuraNavigator auraNavigator = this.$navigator;
        AbstractC3358CGz abstractC3358CGz = this.$userSession;
        ConversationWidgetContext conversationWidgetContext = this.$context;
        MarketplaceListingNavigationKt.openMarketplaceListing(marketplaceMapListing, auraNavigator, abstractC3358CGz, conversationWidgetContext.sessionId, conversationWidgetContext.hostMessageId, conversationWidgetContext.openUrl);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMarketplaceMapWidgetRenderer$Render$2$1(MarketplaceMapLogContext marketplaceMapLogContext, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, ConversationWidgetContext conversationWidgetContext) {
        super(2);
        this.$logContext = marketplaceMapLogContext;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$context = conversationWidgetContext;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(MarketplaceMapListing marketplaceMapListing, MarketplaceMapTapSource marketplaceMapTapSource) {
        invoke2(marketplaceMapListing, marketplaceMapTapSource);
        return Unit.INSTANCE;
    }
}
