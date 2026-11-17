package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.C1D8;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowAvatarImage$1$imageModifier$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ float $size;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        float f = this.$size / OnboardingUiFlowScreenKt.AvatarRenderSize;
        c2av.AeX(f);
        c2av.AeY(f);
        c2av.Aeg(C1D8.A00);
        c2av.Ad2(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowAvatarImage$1$imageModifier$1$1(float f) {
        super(1);
        this.$size = f;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
