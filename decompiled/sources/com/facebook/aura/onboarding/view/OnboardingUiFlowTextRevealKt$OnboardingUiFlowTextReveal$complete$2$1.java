package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C1958Aux;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class OnboardingUiFlowTextRevealKt$OnboardingUiFlowTextReveal$complete$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ Function0<Float> $clockMs;
    public final /* synthetic */ MutableState<C1958Aux> $layout$delegate;
    public final /* synthetic */ TextRevealTiming $timing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowTextRevealKt$OnboardingUiFlowTextReveal$complete$2$1(MutableState<C1958Aux> mutableState, Function0<Float> function0, TextRevealTiming textRevealTiming) {
        super(0);
        this.$layout$delegate = mutableState;
        this.$clockMs = function0;
        this.$timing = textRevealTiming;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C1958Aux value = this.$layout$delegate.getValue();
        boolean z = false;
        if (value != null) {
            if (AnonymousClass003.A04(this.$clockMs) >= this.$timing.endMs(value.A03.A02)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
