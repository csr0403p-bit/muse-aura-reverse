package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$11$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ HatchAssistOverlayViewModel $overlayViewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$overlayViewModel.conversationViewModel.addPendingImageUri(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$11$1(HatchAssistOverlayViewModel hatchAssistOverlayViewModel) {
        super(1);
        this.$overlayViewModel = hatchAssistOverlayViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
