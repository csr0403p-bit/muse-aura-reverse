package com.facebook.aura.agentpermission;

import X.AEs;
import X.AEu;
import X.AbstractC3358CGz;
import X.AnonymousClass441;
import X.C0881AGi;
import X.C1BN;
import X.C3Ek;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.conversation.repo.HatchPrimarySessionRepository;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;

/* loaded from: classes.dex */
public final class AgentPermissionBannerViewModel extends AEs {
    public static final int $stable = 8;
    public final HatchPrimarySessionRepository primarySessionRepository;
    public final HatchAgentPermissionsRepository repository;
    public final String screenSessionId;
    public final C1BN<AgentPermissionBannerUiState> uiState;

    public final class Factory extends AuraViewModelFactory<AgentPermissionBannerViewModel> {
        public static final int $stable = 8;
        public final String sessionId;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
            this.sessionId = str;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AgentPermissionBannerViewModel create() {
            return new AgentPermissionBannerViewModel(this.userSession, this.sessionId);
        }
    }

    public AgentPermissionBannerViewModel(AbstractC3358CGz abstractC3358CGz, String str) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        HatchAgentPermissionsRepository companion = HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz);
        this.repository = companion;
        HatchPrimarySessionRepository companion2 = HatchPrimarySessionRepository.Companion.getInstance(abstractC3358CGz);
        this.primarySessionRepository = companion2;
        this.screenSessionId = str;
        C60I c60iA03 = C3rb.A03(new AgentPermissionBannerViewModel$uiState$1(this, null), companion.pendingApprovals, companion2.primarySessionId);
        this.uiState = AnonymousClass441.A00(new AgentPermissionBannerUiState(C0881AGi.A00), AEu.A00(this), c60iA03, C3Ek.A00);
    }

    public final C1BN<AgentPermissionBannerUiState> getUiState() {
        return this.uiState;
    }
}
