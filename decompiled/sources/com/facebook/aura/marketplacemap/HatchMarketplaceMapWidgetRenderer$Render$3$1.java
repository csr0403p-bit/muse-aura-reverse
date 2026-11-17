package com.facebook.aura.marketplacemap;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.conversation.widget.api.ConversationWidgetContext;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMarketplaceMapWidgetRenderer$Render$3$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ ConversationWidgetContext $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchWidget $widget;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMarketplaceMapWidgetRenderer$Render$3$1(AuraNavigator auraNavigator, ConversationWidgetContext conversationWidgetContext, HatchWidget hatchWidget) {
        super(1);
        this.$navigator = auraNavigator;
        this.$context = conversationWidgetContext;
        this.$widget = hatchWidget;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        AuraNavigator auraNavigator = this.$navigator;
        ConversationWidgetContext conversationWidgetContext = this.$context;
        auraNavigator.navigate((AuraNavKey) new MarketplaceMapFullscreenScreenKey(conversationWidgetContext.hostMessageId, this.$widget.widgetId, conversationWidgetContext.sessionId, str), false);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
