package com.facebook.aura.agentpermission;

import X.AEs;
import X.AEu;
import X.AbstractC3358CGz;
import X.AnonymousClass441;
import X.C1BN;
import X.C3Ek;
import X.C7384Etj;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;

/* loaded from: classes2.dex */
public final class AgentComputerApprovalBannerViewModel extends AEs {
    public static final int $stable = 8;
    public final C1BN<HatchAgentPermissionsRepository.AgentPermissionApproval> approval;
    public final HatchAgentPermissionsRepository repository;

    public final class Factory extends AuraViewModelFactory<AgentComputerApprovalBannerViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new AgentComputerApprovalBannerViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AgentComputerApprovalBannerViewModel create() {
            return new AgentComputerApprovalBannerViewModel(this.userSession);
        }
    }

    public AgentComputerApprovalBannerViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        HatchAgentPermissionsRepository companion = HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz);
        this.repository = companion;
        this.approval = AnonymousClass441.A00(null, AEu.A00(this), new AgentComputerApprovalBannerViewModel$special$$inlined$map$1(companion.pendingApprovals), C3Ek.A00);
    }

    public final C1BN<HatchAgentPermissionsRepository.AgentPermissionApproval> getApproval() {
        return this.approval;
    }
}
