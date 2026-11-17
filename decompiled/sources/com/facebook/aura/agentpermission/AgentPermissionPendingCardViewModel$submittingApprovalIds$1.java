package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BGK;
import X.G0W;
import X.HtJ;
import X.Hwg;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionPendingCardViewModel$submittingApprovalIds$1", f = "AgentPermissionPendingCardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AgentPermissionPendingCardViewModel$submittingApprovalIds$1 extends AbstractC07127nr implements G0W<Set<? extends String>, Set<? extends String>, HtJ<? super Set<? extends String>>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public AgentPermissionPendingCardViewModel$submittingApprovalIds$1(HtJ<? super AgentPermissionPendingCardViewModel$submittingApprovalIds$1> htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(Set<? extends String> set, Set<? extends String> set2, HtJ<? super Set<? extends String>> htJ) {
        return invoke2((Set<String>) set, (Set<String>) set2, (HtJ<? super Set<String>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Set set = (Set) this.L$0;
        Iterable iterable = (Iterable) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return BGK.A01(iterable, set);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Set<String> set, Set<String> set2, HtJ<? super Set<String>> htJ) {
        AgentPermissionPendingCardViewModel$submittingApprovalIds$1 agentPermissionPendingCardViewModel$submittingApprovalIds$1 = new AgentPermissionPendingCardViewModel$submittingApprovalIds$1(htJ);
        agentPermissionPendingCardViewModel$submittingApprovalIds$1.L$0 = set;
        agentPermissionPendingCardViewModel$submittingApprovalIds$1.L$1 = set2;
        return agentPermissionPendingCardViewModel$submittingApprovalIds$1.invokeSuspend(Unit.INSTANCE);
    }
}
