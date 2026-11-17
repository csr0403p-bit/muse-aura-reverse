package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$9$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAssistOverlayViewModel $overlayViewModel;
    public final /* synthetic */ String $threadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$9$1(HatchAssistOverlayViewModel hatchAssistOverlayViewModel, String str) {
        super(0);
        this.$overlayViewModel = hatchAssistOverlayViewModel;
        this.$threadId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$overlayViewModel.submitKeyboardTurn(this.$threadId);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
