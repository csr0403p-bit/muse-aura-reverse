package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.C1DG;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.onboarding.OnboardingUiFlowStep;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowAvatar$top$2$1 extends AbstractC7559F3s implements G0U<C1DG, Unit> {
    public final /* synthetic */ MutableState<OnboardingUiFlowStep> $settledStep$delegate;
    public final /* synthetic */ OnboardingUiFlowStep $step;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowAvatar$top$2$1(OnboardingUiFlowStep onboardingUiFlowStep, MutableState<OnboardingUiFlowStep> mutableState) {
        super(1);
        this.$step = onboardingUiFlowStep;
        this.$settledStep$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg) {
        m1628invoke0680j_4(c1dg.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-0680j_4, reason: not valid java name */
    public final void m1628invoke0680j_4(float f) {
        this.$settledStep$delegate.Af8(this.$step);
    }
}
