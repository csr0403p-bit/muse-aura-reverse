package com.facebook.aura.marketplacemap;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationWidgetContext;
import com.facebook.aura.model.HatchWidget;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMarketplaceMapWidgetRenderer$Render$data$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ ConversationWidgetContext $context;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ HatchMarketplaceMapWidgetRenderer $tmp6_rcvr;
    public final /* synthetic */ HatchWidget $widget;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMarketplaceMapWidgetRenderer$Render$data$1(HatchMarketplaceMapWidgetRenderer hatchMarketplaceMapWidgetRenderer, HatchWidget hatchWidget, ConversationWidgetContext conversationWidgetContext, BRg bRg, int i) {
        super(2);
        this.$tmp6_rcvr = hatchMarketplaceMapWidgetRenderer;
        this.$widget = hatchWidget;
        this.$context = conversationWidgetContext;
        this.$modifier = bRg;
        this.$$changed = i;
    }

    public final void invoke(BFM bfm, int i) {
        this.$tmp6_rcvr.Render(this.$widget, this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
