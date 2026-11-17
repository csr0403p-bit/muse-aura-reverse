package com.facebook.aura.onboarding.view;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$4$3$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ AT5<Float, AOW> $exitProgress;
    public final /* synthetic */ C1BO<Float> $skipAlpha$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Acj(C1BO.A01(this.$skipAlpha$delegate) * (1.0f - AnonymousClass001.A02(this.$exitProgress.A04.getValue())));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$4$3$1(AT5<Float, AOW> at5, C1BO<Float> c1bo) {
        super(1);
        this.$exitProgress = at5;
        this.$skipAlpha$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
