package com.facebook.aura.agentpermission;

import X.AbK;
import X.AbstractC0878AGe;
import X.C2273BRq;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.ApprovalCardOnlyKt;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class AgentPermissionApprovalsViewModelKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<C2273BRq<AgentPermissionDecisionOption>> rowDecisionOptions(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        AbK abKA0h = AbstractC0878AGe.A0h(agentPermissionApproval.decisionOptions);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = abKA0h.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (ApprovalCardOnlyKt.isQuickDecisionAllowed(agentPermissionApproval, (AgentPermissionDecisionOption) ((C2273BRq) next).A01)) {
                arrayListA0h.add(next);
            }
        }
        return arrayListA0h;
    }
}
