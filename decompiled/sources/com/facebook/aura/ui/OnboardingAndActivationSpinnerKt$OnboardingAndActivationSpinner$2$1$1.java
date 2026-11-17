package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C2LD;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class OnboardingAndActivationSpinnerKt$OnboardingAndActivationSpinner$2$1$1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
    public static final OnboardingAndActivationSpinnerKt$OnboardingAndActivationSpinner$2$1$1 INSTANCE = new OnboardingAndActivationSpinnerKt$OnboardingAndActivationSpinner$2$1$1();

    public OnboardingAndActivationSpinnerKt$OnboardingAndActivationSpinner$2$1$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2LD c2ld) {
        C7384Etj.A0Y(c2ld, 0);
        HatchSetupAnimationState.INSTANCE.setLogoTopPx((int) c2ld.A01);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
        invoke2(c2ld);
        return Unit.INSTANCE;
    }
}
