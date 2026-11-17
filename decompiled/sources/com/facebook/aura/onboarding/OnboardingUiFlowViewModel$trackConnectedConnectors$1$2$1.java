package com.facebook.aura.onboarding;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1$2$1", f = "OnboardingUiFlowViewModel.kt", l = {186}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class OnboardingUiFlowViewModel$trackConnectedConnectors$1$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $it;
    public int label;
    public final /* synthetic */ OnboardingUiFlowViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowViewModel$trackConnectedConnectors$1$2$1(OnboardingUiFlowViewModel onboardingUiFlowViewModel, String str, HtJ<? super OnboardingUiFlowViewModel$trackConnectedConnectors$1$2$1> htJ) {
        super(2, htJ);
        this.this$0 = onboardingUiFlowViewModel;
        this.$it = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new OnboardingUiFlowViewModel$trackConnectedConnectors$1$2$1(this.this$0, this.$it, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchConnectorCatalogRepository hatchConnectorCatalogRepository = this.this$0.connectorCatalog;
            String str = this.$it;
            this.label = 1;
            if (hatchConnectorCatalogRepository.m2119fetchConnectorgIAlus(str, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((OnboardingUiFlowViewModel$trackConnectedConnectors$1$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
