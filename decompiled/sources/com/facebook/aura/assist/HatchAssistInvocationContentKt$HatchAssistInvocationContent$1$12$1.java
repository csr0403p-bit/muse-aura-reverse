package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$12$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ HatchAssistOverlayViewModel $overlayViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistInvocationContentKt$HatchAssistInvocationContent$1$12$1(HatchAssistOverlayViewModel hatchAssistOverlayViewModel) {
        super(1);
        this.$overlayViewModel = hatchAssistOverlayViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        this.$overlayViewModel.conversationViewModel.removePendingImageUri(i);
    }
}
