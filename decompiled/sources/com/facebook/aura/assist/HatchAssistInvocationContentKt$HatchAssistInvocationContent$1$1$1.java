package com.facebook.aura.assist;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.model.HatchSendMessage;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$1$1 extends C7438Evz implements G0U<HatchSendMessage, Unit> {
    public HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$1$1(Object obj) {
        super(1, obj, HatchAssistOverlayViewModel.class, "submitWidgetMessage", "submitWidgetMessage(Lcom/facebook/aura/model/HatchSendMessage;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSendMessage hatchSendMessage) {
        ((HatchAssistOverlayViewModel) AnonymousClass006.A0o(hatchSendMessage, this)).submitWidgetMessage(hatchSendMessage);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSendMessage hatchSendMessage) {
        invoke2(hatchSendMessage);
        return Unit.INSTANCE;
    }
}
