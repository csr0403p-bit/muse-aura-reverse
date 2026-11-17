package com.facebook.aura.onboarding.view;

import X.AT3;
import X.AW9;
import X.AaC;
import X.AaI;
import X.AbstractC1826Arq;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C1958Aux;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC1279AgP;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class OnboardingUiFlowTextRevealKt$UnfoldingCharacter$6$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ AaC $bounds;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C1958Aux $layout;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        C1958Aux c1958Aux = this.$layout;
        long j = this.$color;
        AaC aaC = this.$bounds;
        long jAKb = at3.AKb();
        float fA00 = AnonymousClass001.A00(jAKb);
        float fA01 = AnonymousClass001.A01(jAKb, 4294967295L);
        InterfaceC1279AgP interfaceC1279AgPAEq = at3.AEq();
        AaI aaI = (AaI) interfaceC1279AgPAEq;
        AW9 aw9 = aaI.A02.A02;
        long jA00 = AW9.A00(aw9);
        try {
            aaI.A01.A6N(0.0f, 0.0f, fA00, fA01, 1);
            AbstractC1826Arq.A00(at3, c1958Aux, Float.NaN, j, AnonymousClass005.A0L(-aaC.A01, -aaC.A03));
        } finally {
            AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowTextRevealKt$UnfoldingCharacter$6$1(C1958Aux c1958Aux, long j, AaC aaC) {
        super(1);
        this.$layout = c1958Aux;
        this.$color = j;
        this.$bounds = aaC;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
