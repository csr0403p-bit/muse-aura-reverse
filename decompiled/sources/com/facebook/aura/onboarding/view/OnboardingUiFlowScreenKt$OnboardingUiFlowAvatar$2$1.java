package com.facebook.aura.onboarding.view;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.C2av;
import X.C2b1;
import X.C7384Etj;
import X.G0U;
import android.os.Build;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowAvatar$2$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ AT5<Float, AOW> $reveal;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        float fA00 = MutableState.A00(this.$reveal);
        float f = 1.0f - fA00;
        float f2 = (f * 0.45f) + (fA00 * 1.0f);
        c2av.AeX(f2);
        c2av.AeY(f2);
        c2av.Acj(fA00);
        if (Build.VERSION.SDK_INT >= 31) {
            float fAh4 = f * c2av.Ah4(OnboardingUiFlowScreenKt.AvatarRevealBlur);
            c2av.AeM(fAh4 > 0.0f ? new C2b1(fAh4, fAh4, 3) : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowAvatar$2$1(AT5<Float, AOW> at5) {
        super(1);
        this.$reveal = at5;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
