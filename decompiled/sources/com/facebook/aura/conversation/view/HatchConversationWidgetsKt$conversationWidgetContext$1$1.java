package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.model.HatchSendMessage;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$conversationWidgetContext$1$1 extends AbstractC7559F3s implements G0U<HatchSendMessage, Unit> {
    public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSendMessage hatchSendMessage) {
        C7384Etj.A0Y(hatchSendMessage, 0);
        G0U<HatchSendMessage, Unit> g0u = this.$onWidgetSendMessage;
        if (g0u != null) {
            g0u.invoke(hatchSendMessage);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationWidgetsKt$conversationWidgetContext$1$1(G0U<? super HatchSendMessage, Unit> g0u) {
        super(1);
        this.$onWidgetSendMessage = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSendMessage hatchSendMessage) {
        invoke2(hatchSendMessage);
        return Unit.INSTANCE;
    }
}
