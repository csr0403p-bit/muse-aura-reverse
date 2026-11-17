package com.facebook.aura.agentpermission;

import X.AEs;
import X.AEu;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass441;
import X.BLL;
import X.C1BN;
import X.C3Ej;
import X.C3Ek;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class AgentPermissionTaskDetailsViewModel extends AEs {
    public static final int $stable = 8;
    public final C1BN<HatchAgentPermissionsRepository.AgentPermissionApproval> approval;
    public final String approvalId;
    public final HatchAgentPermissionsRepository repository;

    public final class Factory extends AuraViewModelFactory<AgentPermissionTaskDetailsViewModel> {
        public static final int $stable = 8;
        public final String approvalId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AgentPermissionTaskDetailsViewModel create() {
            return new AgentPermissionTaskDetailsViewModel(this.userSession, this.approvalId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.approvalId = str;
        }
    }

    public final C1BN<HatchAgentPermissionsRepository.AgentPermissionApproval> getApproval() {
        return this.approval;
    }

    public AgentPermissionTaskDetailsViewModel(AbstractC3358CGz abstractC3358CGz, String str) {
        Object next;
        AnonymousClass003.A0u(abstractC3358CGz, str);
        this.approvalId = str;
        HatchAgentPermissionsRepository companion = HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz);
        this.repository = companion;
        AgentPermissionTaskDetailsViewModel$special$$inlined$map$1 agentPermissionTaskDetailsViewModel$special$$inlined$map$1 = new AgentPermissionTaskDetailsViewModel$special$$inlined$map$1(companion.pendingApprovals, this);
        BLL bllA00 = AEu.A00(this);
        C3Ej c3Ej = C3Ek.A00;
        Iterator itA0z = C3cI.A0z(companion.pendingApprovals);
        while (true) {
            if (!itA0z.hasNext()) {
                next = null;
                break;
            } else {
                next = itA0z.next();
                if (C7384Etj.areEqual(((HatchAgentPermissionsRepository.AgentPermissionApproval) next).approvalId, this.approvalId)) {
                    break;
                }
            }
        }
        this.approval = AnonymousClass441.A00(next, bllA00, agentPermissionTaskDetailsViewModel$special$$inlined$map$1, c3Ej);
    }
}
