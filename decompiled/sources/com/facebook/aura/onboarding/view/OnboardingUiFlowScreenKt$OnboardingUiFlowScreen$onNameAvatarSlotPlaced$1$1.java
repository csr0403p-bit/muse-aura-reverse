package com.facebook.aura.onboarding.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass004;
import X.C1DG;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC1497Ak4;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$onNameAvatarSlotPlaced$1$1 extends AbstractC7559F3s implements G0U<InterfaceC1497Ak4, Unit> {
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ MutableState<C1DG> $nameAvatarTop$delegate;
    public final /* synthetic */ MutableState<InterfaceC1497Ak4> $rootCoordinates$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC1497Ak4 interfaceC1497Ak4) {
        C7384Etj.A0Y(interfaceC1497Ak4, 0);
        InterfaceC1497Ak4 value = this.$rootCoordinates$delegate.getValue();
        if (value != null && value.isAttached() && interfaceC1497Ak4.isAttached()) {
            C1DG.A06(this.$density.Agx(AnonymousClass004.A00(value.APm(interfaceC1497Ak4, 0L))), this.$nameAvatarTop$delegate);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$onNameAvatarSlotPlaced$1$1(AXN axn, MutableState<InterfaceC1497Ak4> mutableState, MutableState<C1DG> mutableState2) {
        super(1);
        this.$density = axn;
        this.$rootCoordinates$delegate = mutableState;
        this.$nameAvatarTop$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1497Ak4 interfaceC1497Ak4) {
        invoke2(interfaceC1497Ak4);
        return Unit.INSTANCE;
    }
}
