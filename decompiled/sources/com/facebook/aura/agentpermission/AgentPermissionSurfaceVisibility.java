package com.facebook.aura.agentpermission;

import X.A3q;
import X.AnonymousClass007;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.HnJ;
import java.util.Set;

/* loaded from: classes2.dex */
public final class AgentPermissionSurfaceVisibility {
    public static final int $stable = 0;
    public static final AgentPermissionSurfaceVisibility INSTANCE = new AgentPermissionSurfaceVisibility();
    public static final BLG<Set<String>> _openApprovalIds;
    public static final C1BN<Set<String>> openApprovalIds;

    public final void closed(String str) {
        C7384Etj.A0Y(str, 0);
        while (!AnonymousClass007.A1N(str, _openApprovalIds)) {
        }
    }

    public final void opened(String str) {
        C7384Etj.A0Y(str, 0);
        while (!AnonymousClass007.A1O(str, _openApprovalIds)) {
        }
    }

    static {
        C9286GCn c9286GCnA01 = HnJ.A01(A3q.A00);
        _openApprovalIds = c9286GCnA01;
        openApprovalIds = C3Pi.A00(c9286GCnA01);
    }

    public final C1BN<Set<String>> getOpenApprovalIds() {
        return openApprovalIds;
    }
}
