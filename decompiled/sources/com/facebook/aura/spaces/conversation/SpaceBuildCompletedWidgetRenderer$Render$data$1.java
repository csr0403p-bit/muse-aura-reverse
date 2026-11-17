package com.facebook.aura.spaces.conversation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.conversation.widget.api.ConversationWidgetContext;
import com.facebook.aura.model.HatchWidget;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SpaceBuildCompletedWidgetRenderer$Render$data$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ ConversationWidgetContext $context;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ SpaceBuildCompletedWidgetRenderer $tmp0_rcvr;
    public final /* synthetic */ HatchWidget $widget;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceBuildCompletedWidgetRenderer$Render$data$1(SpaceBuildCompletedWidgetRenderer spaceBuildCompletedWidgetRenderer, HatchWidget hatchWidget, ConversationWidgetContext conversationWidgetContext, BRg bRg, int i) {
        super(2);
        this.$tmp0_rcvr = spaceBuildCompletedWidgetRenderer;
        this.$widget = hatchWidget;
        this.$context = conversationWidgetContext;
        this.$modifier = bRg;
        this.$$changed = i;
    }

    public final void invoke(BFM bfm, int i) {
        this.$tmp0_rcvr.Render(this.$widget, this.$context, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
