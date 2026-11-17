package com.facebook.aura.onboarding;

import X.AbstractC07127nr;
import X.AbstractC0885AGm;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingUiFlowViewModel$complete$2$submit$1", f = "OnboardingUiFlowViewModel.kt", l = {290}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class OnboardingUiFlowViewModel$complete$2$submit$1 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
    public final /* synthetic */ OnboardingTask $idea;
    public final /* synthetic */ OnboardingUiFlowUiState $state;
    public int label;
    public final /* synthetic */ OnboardingUiFlowViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowViewModel$complete$2$submit$1(OnboardingUiFlowViewModel onboardingUiFlowViewModel, OnboardingTask onboardingTask, OnboardingUiFlowUiState onboardingUiFlowUiState, HtJ<? super OnboardingUiFlowViewModel$complete$2$submit$1> htJ) {
        super(1, htJ);
        this.this$0 = onboardingUiFlowViewModel;
        this.$idea = onboardingTask;
        this.$state = onboardingUiFlowUiState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new OnboardingUiFlowViewModel$complete$2$submit$1(this.this$0, this.$idea, this.$state, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            OnboardingUiFlowViewModel onboardingUiFlowViewModel = this.this$0;
            OnboardingCompletionRepository onboardingCompletionRepository = onboardingUiFlowViewModel.completionRepository;
            AbstractC3358CGz abstractC3358CGz = onboardingUiFlowViewModel.userSession;
            List<OnboardingTask> listA0z = AbstractC0885AGm.A0z(this.$idea);
            String strA0l = AnonymousClass002.A0l(this.$state.agentName);
            OnboardingAvatarOption onboardingAvatarOption = this.$state.avatar;
            this.label = 1;
            obj = onboardingCompletionRepository.complete(abstractC3358CGz, listA0z, strA0l, null, onboardingAvatarOption, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Boolean> htJ) {
        return ((OnboardingUiFlowViewModel$complete$2$submit$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
