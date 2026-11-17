package com.facebook.aura.agentpermission;

import X.A3W;
import X.A6B;
import X.AGI;
import X.AHH;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.B3i;
import X.BGK;
import X.C3cG;
import X.C7384Etj;
import X.G2k;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.ApprovalCardOnlyKt;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionApprovalsViewModel$uiState$1", f = "AgentPermissionApprovalsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AgentPermissionApprovalsViewModel$uiState$1 extends AbstractC07127nr implements G2k<List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval>, ApprovalHistoryState, Set<? extends String>, Set<? extends String>, HtJ<? super AgentPermissionApprovalsUiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public /* synthetic */ Object L$3;
    public int label;

    public AgentPermissionApprovalsViewModel$uiState$1(HtJ<? super AgentPermissionApprovalsViewModel$uiState$1> htJ) {
        super(5, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, ApprovalHistoryState approvalHistoryState, Set<String> set, Set<String> set2, HtJ<? super AgentPermissionApprovalsUiState> htJ) {
        AgentPermissionApprovalsViewModel$uiState$1 agentPermissionApprovalsViewModel$uiState$1 = new AgentPermissionApprovalsViewModel$uiState$1(htJ);
        agentPermissionApprovalsViewModel$uiState$1.L$0 = list;
        agentPermissionApprovalsViewModel$uiState$1.L$1 = approvalHistoryState;
        agentPermissionApprovalsViewModel$uiState$1.L$2 = set;
        agentPermissionApprovalsViewModel$uiState$1.L$3 = set2;
        return agentPermissionApprovalsViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Iterable iterable = (Iterable) this.L$0;
        ApprovalHistoryState approvalHistoryState = (ApprovalHistoryState) this.L$1;
        Set set = (Set) this.L$2;
        Set set2 = (Set) this.L$3;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        List<HatchAgentPermissionsRepository.AgentPermissionApproval> listA0c = AbstractC0878AGe.A0c(iterable, new Comparator() { // from class: com.facebook.aura.agentpermission.AgentPermissionApprovalsViewModel$uiState$1$invokeSuspend$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Long.valueOf(((HatchAgentPermissionsRepository.AgentPermissionApproval) t2).requestedAtMs).compareTo(Long.valueOf(((HatchAgentPermissionsRepository.AgentPermissionApproval) t).requestedAtMs));
            }
        });
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator it = listA0c.iterator();
        while (it.hasNext()) {
            linkedHashSetA0k.add(((HatchAgentPermissionsRepository.AgentPermissionApproval) it.next()).approvalId);
        }
        B3i b3iA03 = A6B.A03(AgentPermissionApprovalsViewModel$uiState$1$actionedHistory$2.INSTANCE, new B3i(new AgentPermissionApprovalsViewModel$uiState$1$actionedHistory$1(linkedHashSetA0k), AbstractC0878AGe.A06(approvalHistoryState.items), false));
        AgentPermissionApprovalsViewModel$uiState$1$actionedHistory$3 agentPermissionApprovalsViewModel$uiState$1$actionedHistory$3 = AgentPermissionApprovalsViewModel$uiState$1$actionedHistory$3.INSTANCE;
        C7384Etj.A0Y(agentPermissionApprovalsViewModel$uiState$1$actionedHistory$3, 1);
        List listA02 = A6B.A02(new A3W(agentPermissionApprovalsViewModel$uiState$1$actionedHistory$3, b3iA03));
        AHH ahhA0C = AGI.A0C(listA0c);
        AHH ahhA0C2 = AGI.A0C(listA02);
        ApprovalHistoryLoadingState approvalHistoryLoadingState = approvalHistoryState.loadingState;
        boolean z = approvalHistoryState.canLoadMore;
        boolean z2 = approvalHistoryState.isLoadingMore;
        String str = approvalHistoryState.nextCursor;
        LinkedHashSet linkedHashSetA01 = BGK.A01(set2, set);
        Set setA03 = BGK.A03(set, set2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(listA0c));
        for (HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval : listA0c) {
            linkedHashMap.put(agentPermissionApproval.approvalId, new ApprovalRowDecisions(ApprovalCardOnlyKt.approvesOnCard(agentPermissionApproval), AGI.A0C(AgentPermissionApprovalsViewModelKt.rowDecisionOptions(agentPermissionApproval))));
        }
        return new AgentPermissionApprovalsUiState(ahhA0C, ahhA0C2, approvalHistoryLoadingState, z, z2, str, linkedHashSetA01, setA03, AGI.A0F(linkedHashMap));
    }

    @Override // X.G2k
    public /* bridge */ /* synthetic */ Object invoke(List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval> list, ApprovalHistoryState approvalHistoryState, Set<? extends String> set, Set<? extends String> set2, HtJ<? super AgentPermissionApprovalsUiState> htJ) {
        return invoke2((List<HatchAgentPermissionsRepository.AgentPermissionApproval>) list, approvalHistoryState, (Set<String>) set, (Set<String>) set2, htJ);
    }
}
