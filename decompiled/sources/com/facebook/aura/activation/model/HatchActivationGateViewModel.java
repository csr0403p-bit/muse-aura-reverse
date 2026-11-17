package com.facebook.aura.activation.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass441;
import X.C1BN;
import X.C20Q;
import X.C3Ek;
import X.C3rb;
import X.C7384Etj;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.activation.data.ActivationState;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.ConfidentialVmSetupGate;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchActivationGateViewModel extends AEs {
    public final C1BN<Boolean> isGateRequired;

    public final class Factory extends AuraViewModelFactory<HatchActivationGateViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchActivationGateViewModel create() {
            return new HatchActivationGateViewModel(AuraViewerDataProvider.Companion.getInstance(this.userSession), ConfidentialVmSetupGate.Companion.getInstance(this.userSession));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.HatchActivationGateViewModel$isGateRequired$1", f = "HatchActivationGateViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.HatchActivationGateViewModel$isGateRequired$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0W<AuraUserData, Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(3, htJ);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(AuraUserData auraUserData, Boolean bool, HtJ<? super Boolean> htJ) {
            return invoke(auraUserData, AnonymousClass001.A1X(bool), htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ActivationState currentActivationState;
            AuraUserData auraUserData = (AuraUserData) this.L$0;
            boolean z = this.Z$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            boolean z2 = false;
            if (auraUserData != null && (currentActivationState = auraUserData.getCurrentActivationState(false, z, false)) != null && currentActivationState != ActivationState.FULLY_ACTIVATED && currentActivationState != ActivationState.LOADING) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }

        public final Object invoke(AuraUserData auraUserData, boolean z, HtJ<? super Boolean> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = auraUserData;
            anonymousClass1.Z$0 = z;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final C1BN<Boolean> isGateRequired() {
        return this.isGateRequired;
    }

    public final void onGateNavigated() {
        AgeCheckFunnelLogging.INSTANCE.onInAppRegate();
    }

    public HatchActivationGateViewModel(AuraViewerDataProvider auraViewerDataProvider, ConfidentialVmSetupGate confidentialVmSetupGate) {
        boolean zA1b = AnonymousClass004.A1b(auraViewerDataProvider, confidentialVmSetupGate);
        C20Q c20qA04 = C3rb.A04(new AnonymousClass1(null), auraViewerDataProvider.userData, confidentialVmSetupGate.isSetupRequired);
        this.isGateRequired = AnonymousClass441.A00(Boolean.valueOf(zA1b), AEu.A00(this), c20qA04, C3Ek.A00);
    }
}
