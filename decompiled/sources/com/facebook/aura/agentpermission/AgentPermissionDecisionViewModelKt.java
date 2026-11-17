package com.facebook.aura.agentpermission;

import X.AbstractC0878AGe;
import X.AnonymousClass006;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.ApprovalCardOnlyKt;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class AgentPermissionDecisionViewModelKt {
    public static final long SNAPSHOT_WAIT_TIMEOUT_MS = 10000;

    public static final List<AgentPermissionDecisionOption> commonPermissionDecisionOptions(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list) {
        C7384Etj.A0Y(list, 0);
        HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = (HatchAgentPermissionsRepository.AgentPermissionApproval) AbstractC0878AGe.A0G(list);
        if (agentPermissionApproval == null) {
            return C0881AGi.A00;
        }
        List<AgentPermissionDecisionOption> listQuickDecisionOptions = ApprovalCardOnlyKt.quickDecisionOptions(agentPermissionApproval);
        ArrayList arrayListA0h = C3cG.A0h();
        for (AgentPermissionDecisionOption agentPermissionDecisionOption : listQuickDecisionOptions) {
            AgentPermissionDecisionOption agentPermissionDecisionOption2 = agentPermissionDecisionOption;
            List listA0Z = AbstractC0878AGe.A0Z(list, 1);
            if (!(listA0Z instanceof Collection) || !listA0Z.isEmpty()) {
                Iterator it = listA0Z.iterator();
                while (it.hasNext()) {
                    List<AgentPermissionDecisionOption> listQuickDecisionOptions2 = ApprovalCardOnlyKt.quickDecisionOptions((HatchAgentPermissionsRepository.AgentPermissionApproval) it.next());
                    if (!(listQuickDecisionOptions2 instanceof Collection) || !listQuickDecisionOptions2.isEmpty()) {
                        Iterator<AgentPermissionDecisionOption> it2 = listQuickDecisionOptions2.iterator();
                        while (it2.hasNext()) {
                            if (C7384Etj.areEqual(it2.next().kind, agentPermissionDecisionOption2.kind)) {
                                break;
                            }
                        }
                    }
                }
            }
            arrayListA0h.add(agentPermissionDecisionOption);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj : arrayListA0h) {
            AnonymousClass006.A1P(((AgentPermissionDecisionOption) obj).kind, obj, hashSet, arrayListA0h2);
        }
        return arrayListA0h2;
    }
}
