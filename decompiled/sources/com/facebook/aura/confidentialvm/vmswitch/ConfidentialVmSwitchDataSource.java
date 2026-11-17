package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.C06H;
import X.C10650I0u;
import X.C20Q;
import X.C3rb;
import X.C7384Etj;
import X.GDB;
import X.InterfaceC7549F2g;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;

/* loaded from: classes.dex */
public final class ConfidentialVmSwitchDataSource implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final C20Q<ConfidentialVmSwitchDestination> destination;
    public final ConfidentialSessionGate sessionGate;
    public final AuraSubscriptionRepository subscriptionRepository;
    public final AuraViewerDataProvider viewerDataProvider;
    public final ConfidentialVmWaitlistRepository waitlistRepository;

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSwitchOffered(boolean z, AuraUserData auraUserData) {
        return z && auraUserData != null && AnonymousClass002.A1b(auraUserData.isVmTypeSelectionRequired, true);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    public final ConfidentialVmSwitchDestination getCurrentDestination() {
        return ConfidentialVmSwitchDataSourceKt.resolveConfidentialVmSwitchDestination(this.subscriptionRepository.subscriptionDetailsState.getValue(), this.waitlistRepository.state.getValue(), this.sessionGate.isConfidentialVm(), isSwitchOffered(this.sessionGate.isStandardVm(), this.viewerDataProvider.userData.getValue()));
    }

    public final C20Q<ConfidentialVmSwitchDestination> getDestination() {
        return this.destination;
    }

    public final void refresh() {
        this.subscriptionRepository.m2262refreshIfStaleLRDsOJo(AuraSubscriptionRepositoryKt.DEFAULT_SUBSCRIPTION_FRESHNESS);
        this.waitlistRepository.refresh();
    }

    public final class Companion {
        public final ConfidentialVmSwitchDataSource getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConfidentialVmSwitchDataSource) abstractC3358CGz.A03(ConfidentialVmSwitchDataSource.class, new ConfidentialVmSwitchDataSource$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ ConfidentialVmSwitchDataSource(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public ConfidentialVmSwitchDataSource(AbstractC3358CGz abstractC3358CGz) {
        AuraSubscriptionRepository companion = AuraSubscriptionRepository.Companion.getInstance(abstractC3358CGz);
        this.subscriptionRepository = companion;
        ConfidentialVmWaitlistRepository companion2 = ConfidentialVmWaitlistRepository.Companion.getInstance(abstractC3358CGz);
        this.waitlistRepository = companion2;
        ConfidentialSessionGate companion3 = ConfidentialSessionGate.Companion.getInstance(abstractC3358CGz);
        this.sessionGate = companion3;
        AuraViewerDataProvider companion4 = AuraViewerDataProvider.Companion.getInstance(abstractC3358CGz);
        this.viewerDataProvider = companion4;
        this.destination = GDB.A01(new C10650I0u(new ConfidentialVmSwitchDataSource$destination$2(this, null), C3rb.A02(new ConfidentialVmSwitchDataSource$destination$1(this, null), companion.subscriptionDetailsState, companion2.state, companion3.isConfidentialVmFlow, companion3.isStandardVmFlow, companion4.userData), 1));
    }
}
