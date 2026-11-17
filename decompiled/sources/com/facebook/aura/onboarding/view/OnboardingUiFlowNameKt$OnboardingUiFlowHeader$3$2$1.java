package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C00r;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class OnboardingUiFlowNameKt$OnboardingUiFlowHeader$3$2$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ C00r $titleLines$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowNameKt$OnboardingUiFlowHeader$3$2$1(C00r c00r) {
        super(1);
        this.$titleLines$delegate = c00r;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        this.$titleLines$delegate.AdX(i);
    }
}
