package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0U;
import X.G0W;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$HatchWidget$13$1 extends AbstractC7559F3s implements G0W<String, String, String, Unit> {
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationWidgetsKt$HatchWidget$13$1(G0U<? super HatchSendMessage, Unit> g0u, String str) {
        super(3);
        this.$onWidgetSendMessage = g0u;
        this.$hostMessageId = str;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        G0U<HatchSendMessage, Unit> g0u = this.$onWidgetSendMessage;
        if (g0u != null) {
            g0u.invoke(HatchWidgetPresentationKt.imageOptionsReplyMessage(str, this.$hostMessageId, HatchWidgetPresentationKt.imageSelectionReplyTarget(str2, str3)));
        }
    }
}
