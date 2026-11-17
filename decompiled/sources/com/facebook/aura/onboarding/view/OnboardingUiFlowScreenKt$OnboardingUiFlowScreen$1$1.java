package com.facebook.aura.onboarding.view;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C2HU;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.onboarding.OnboardingUiFlowViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$1$1", f = "OnboardingUiFlowScreen.kt", l = {150}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$1$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ AT5<Float, AOW> $exitProgress;
    public final /* synthetic */ OnboardingUiFlowViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$1$1(OnboardingUiFlowViewModel onboardingUiFlowViewModel, AT5<Float, AOW> at5, HtJ<? super OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$1$1> htJ) {
        super(1, htJ);
        this.$viewModel = onboardingUiFlowViewModel;
        this.$exitProgress = at5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$1$1(this.$viewModel, this.$exitProgress, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$viewModel.uiState.getValue().sentMessageId != null) {
                AT5<Float, AOW> at5 = this.$exitProgress;
                Float f = new Float(1.0f);
                ASj aSj = new ASj(C2HU.A01, 350, 0);
                this.label = 1;
                if (AT5.A00(at5, aSj, f, at5.A03(), this, null) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Unit> htJ) {
        return ((OnboardingUiFlowScreenKt$OnboardingUiFlowScreen$1$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
