package com.facebook.aura.marketplacemap;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.conversation.widget.api.ConversationWidgetContext;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.MarketplaceMapWidgetData;

/* loaded from: classes4.dex */
public final class HatchMarketplaceMapWidgetRenderer$Render$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ ConversationWidgetContext $context;
    public final /* synthetic */ MarketplaceMapWidgetData $data;
    public final /* synthetic */ MarketplaceMapRegistry $registry;
    public final /* synthetic */ HatchWidget $widget;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMarketplaceMapWidgetRenderer$Render$1$1(MarketplaceMapRegistry marketplaceMapRegistry, ConversationWidgetContext conversationWidgetContext, HatchWidget hatchWidget, MarketplaceMapWidgetData marketplaceMapWidgetData) {
        super(1);
        this.$registry = marketplaceMapRegistry;
        this.$context = conversationWidgetContext;
        this.$widget = hatchWidget;
        this.$data = marketplaceMapWidgetData;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$registry.publish(this.$context.hostMessageId, this.$widget.widgetId, this.$data);
        return new C78g() { // from class: com.facebook.aura.marketplacemap.HatchMarketplaceMapWidgetRenderer$Render$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
