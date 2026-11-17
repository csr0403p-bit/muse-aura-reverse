package com.facebook.aura.agentpermission;

import X.AEs;
import X.AbstractC3358CGz;
import X.C1BN;
import X.C7384Etj;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;

/* loaded from: classes2.dex */
public final class AgentPermissionDecisionConfirmationViewModel extends AEs {
    public static final int $stable = 8;
    public final HatchAgentPermissionsRepository repository;
    public final C1BN<Boolean> stalled;

    public final class Factory extends AuraViewModelFactory<AgentPermissionDecisionConfirmationViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new AgentPermissionDecisionConfirmationViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AgentPermissionDecisionConfirmationViewModel create() {
            return new AgentPermissionDecisionConfirmationViewModel(this.userSession);
        }
    }

    public AgentPermissionDecisionConfirmationViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        HatchAgentPermissionsRepository companion = HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz);
        this.repository = companion;
        this.stalled = companion.decisionConfirmationStalled;
    }

    public final void checkAgain() {
        this.repository.requestDecisionConfirmation();
    }

    public final C1BN<Boolean> getStalled() {
        return this.stalled;
    }
}
