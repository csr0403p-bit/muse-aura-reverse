package com.facebook.aura.onboarding.view;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class OnboardingUiFlowNameKt$OnboardingUiFlowHeader$3$3$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ AT5<Float, AOW> $clock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowNameKt$OnboardingUiFlowHeader$3$3$1(AT5<Float, AOW> at5) {
        super(0);
        this.$clock = at5;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return (Float) this.$clock.A04.getValue();
    }
}
