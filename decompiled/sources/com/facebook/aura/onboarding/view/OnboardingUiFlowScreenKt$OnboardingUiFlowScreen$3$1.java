package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC1497Ak4;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$3$1 extends AbstractC7559F3s implements G0U<InterfaceC1497Ak4, Unit> {
    public final /* synthetic */ MutableState<InterfaceC1497Ak4> $rootCoordinates$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC1497Ak4 interfaceC1497Ak4) {
        C7384Etj.A0Y(interfaceC1497Ak4, 0);
        this.$rootCoordinates$delegate.Af8(interfaceC1497Ak4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$3$1(MutableState<InterfaceC1497Ak4> mutableState) {
        super(1);
        this.$rootCoordinates$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1497Ak4 interfaceC1497Ak4) {
        invoke2(interfaceC1497Ak4);
        return Unit.INSTANCE;
    }
}
