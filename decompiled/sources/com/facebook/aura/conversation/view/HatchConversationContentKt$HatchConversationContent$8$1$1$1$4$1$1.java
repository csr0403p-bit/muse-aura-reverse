package com.facebook.aura.conversation.view;

import X.F2X;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$1$1 extends F2X implements Function0<Unit> {
    public HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$1$1(Object obj) {
        super(0, obj, HatchConversationViewModel.class, "sendFromSendButton", "sendFromSendButton()Z", 8);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchConversationViewModel) this.receiver).sendFromSendButton();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
