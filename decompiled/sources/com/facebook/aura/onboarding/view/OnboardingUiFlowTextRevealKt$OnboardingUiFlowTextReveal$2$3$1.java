package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.C1958Aux;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class OnboardingUiFlowTextRevealKt$OnboardingUiFlowTextReveal$2$3$1 extends AbstractC7559F3s implements G0U<C1958Aux, Unit> {
    public final /* synthetic */ MutableState<C1958Aux> $layout$delegate;
    public final /* synthetic */ G0U<Integer, Unit> $onLineCount;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1958Aux c1958Aux) {
        C7384Etj.A0Y(c1958Aux, 0);
        this.$layout$delegate.Af8(c1958Aux);
        this.$onLineCount.invoke(Integer.valueOf(c1958Aux.A03.A02));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingUiFlowTextRevealKt$OnboardingUiFlowTextReveal$2$3$1(G0U<? super Integer, Unit> g0u, MutableState<C1958Aux> mutableState) {
        super(1);
        this.$onLineCount = g0u;
        this.$layout$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1958Aux c1958Aux) {
        invoke2(c1958Aux);
        return Unit.INSTANCE;
    }
}
