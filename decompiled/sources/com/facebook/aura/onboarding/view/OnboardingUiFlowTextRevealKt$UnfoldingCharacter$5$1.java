package com.facebook.aura.onboarding.view;

import X.ATD;
import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C15k;
import X.C2HU;
import X.C2av;
import X.C2b1;
import X.C7384Etj;
import X.G0U;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class OnboardingUiFlowTextRevealKt$UnfoldingCharacter$5$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ AaC $bounds;
    public final /* synthetic */ Function0<Float> $clockMs;
    public final /* synthetic */ float $startMs;
    public final /* synthetic */ float $unfoldMs;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        float fA03 = ATD.A03((AnonymousClass003.A04(this.$clockMs) - this.$startMs) / this.$unfoldMs, 0.0f, 1.0f);
        float fTransform = C2HU.A01.transform(fA03);
        long jA0J = AnonymousClass005.A0J(0.5f, 1.0f);
        long j = C15k.A01;
        c2av.Af4(jA0J);
        float f = 1.0f - fTransform;
        c2av.AeV((-75.0f) * f);
        AaC aaC = this.$bounds;
        c2av.Af6((aaC.A00 - aaC.A03) * 0.3f * f);
        c2av.Acj(ATD.A03(fA03 * 4.0f, 0.0f, 1.0f));
        if (Build.VERSION.SDK_INT >= 31) {
            float fAh4 = c2av.Ah4(5.0f) * f;
            c2av.AeM(fAh4 > 0.01f ? new C2b1(fAh4, fAh4, 3) : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowTextRevealKt$UnfoldingCharacter$5$1(Function0<Float> function0, float f, float f2, AaC aaC) {
        super(1);
        this.$clockMs = function0;
        this.$startMs = f;
        this.$unfoldMs = f2;
        this.$bounds = aaC;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
