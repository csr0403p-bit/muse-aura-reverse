package com.facebook.aura.partners.voice.impl;

import X.AGH;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0881AGi;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.conversation.widget.api.ConversationWidgetContext;
import com.facebook.aura.model.HatchSendMessage;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchVoiceOptionsWidgetRenderer$Render$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ ConversationWidgetContext $context;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        G0U<HatchSendMessage, Unit> g0u = this.$context.sendMessage;
        String strA0k = AnonymousClass002.A0k();
        C0881AGi c0881AGi = C0881AGi.A00;
        g0u.invoke(new HatchSendMessage(str, strA0k, null, c0881AGi, c0881AGi, null, null, null, null, true, null, AGH.A0E(), null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceOptionsWidgetRenderer$Render$2$1(ConversationWidgetContext conversationWidgetContext) {
        super(1);
        this.$context = conversationWidgetContext;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
