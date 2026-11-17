package com.facebook.aura.onboarding.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BL4;
import X.C1DG;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$4$6$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ MutableState<C1DG> $primaryButtonHeight$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$4$6$1(AXN axn, MutableState<C1DG> mutableState) {
        super(1);
        this.$density = axn;
        this.$primaryButtonHeight$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m1629invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1629invokeozmzZPI(long j) {
        OnboardingUiFlowScreenKt.OnboardingUiFlowScreen$lambda$14(this.$primaryButtonHeight$delegate, this.$density.Agy(AnonymousClass002.A09(j)));
    }
}
