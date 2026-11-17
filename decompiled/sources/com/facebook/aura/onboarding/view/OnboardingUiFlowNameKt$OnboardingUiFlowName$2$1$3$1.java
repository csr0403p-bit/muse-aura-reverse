package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class OnboardingUiFlowNameKt$OnboardingUiFlowName$2$1$3$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ OnboardingNameReveal $reveal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowNameKt$OnboardingUiFlowName$2$1$3$1(OnboardingNameReveal onboardingNameReveal) {
        super(0);
        this.$reveal = onboardingNameReveal;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return (Float) this.$reveal.clock.A04.getValue();
    }
}
