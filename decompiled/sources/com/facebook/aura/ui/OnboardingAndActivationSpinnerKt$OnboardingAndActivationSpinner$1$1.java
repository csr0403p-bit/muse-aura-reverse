package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class OnboardingAndActivationSpinnerKt$OnboardingAndActivationSpinner$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public static final OnboardingAndActivationSpinnerKt$OnboardingAndActivationSpinner$1$1 INSTANCE = new OnboardingAndActivationSpinnerKt$OnboardingAndActivationSpinner$1$1();

    public OnboardingAndActivationSpinnerKt$OnboardingAndActivationSpinner$1$1() {
        super(1);
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final Object objAcquire = HatchSetupAnimationState.INSTANCE.acquire();
        return new C78g() { // from class: com.facebook.aura.ui.OnboardingAndActivationSpinnerKt$OnboardingAndActivationSpinner$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                HatchSetupAnimationState.INSTANCE.release(objAcquire);
            }
        };
    }
}
