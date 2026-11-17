package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.C0881AGi;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.ApprovalConversationIdentity;
import com.facebook.aura.gateway.ApprovalPresentation;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.HatchAgentPermissionsRepositoryKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionBannerViewModel$uiState$1", f = "AgentPermissionBannerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AgentPermissionBannerViewModel$uiState$1 extends AbstractC07127nr implements G0W<List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval>, String, HtJ<? super AgentPermissionBannerUiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ AgentPermissionBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionBannerViewModel$uiState$1(AgentPermissionBannerViewModel agentPermissionBannerViewModel, HtJ<? super AgentPermissionBannerViewModel$uiState$1> htJ) {
        super(3, htJ);
        this.this$0 = agentPermissionBannerViewModel;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval> list, String str, HtJ<? super AgentPermissionBannerUiState> htJ) {
        return invoke2((List<HatchAgentPermissionsRepository.AgentPermissionApproval>) list, str, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2 = (List) this.L$0;
        String str = (String) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        String strResolveThreadId = ApprovalConversationIdentity.INSTANCE.resolveThreadId(this.this$0.screenSessionId, str);
        boolean z = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (HatchAgentPermissionsRepositoryKt.classifyApprovalPresentation((HatchAgentPermissionsRepository.AgentPermissionApproval) it.next(), strResolveThreadId) == ApprovalPresentation.BLOCKING) {
                    z = true;
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (HatchAgentPermissionsRepositoryKt.classifyApprovalPresentation((HatchAgentPermissionsRepository.AgentPermissionApproval) obj2, strResolveThreadId) == ApprovalPresentation.NONBLOCKING) {
                arrayList.add(obj2);
            }
        }
        List listA0c = AbstractC0878AGe.A0c(arrayList, new Comparator() { // from class: com.facebook.aura.agentpermission.AgentPermissionBannerViewModel$uiState$1$invokeSuspend$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Long.valueOf(((HatchAgentPermissionsRepository.AgentPermissionApproval) t).requestedAtMs).compareTo(Long.valueOf(((HatchAgentPermissionsRepository.AgentPermissionApproval) t2).requestedAtMs));
            }
        });
        if (z || (list = (List) AbstractC0878AGe.A0G(AgentPermissionPendingCardKt.partitionExclusiveApprovals(listA0c))) == null) {
            list = C0881AGi.A00;
        }
        return new AgentPermissionBannerUiState(list);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, String str, HtJ<? super AgentPermissionBannerUiState> htJ) {
        AgentPermissionBannerViewModel$uiState$1 agentPermissionBannerViewModel$uiState$1 = new AgentPermissionBannerViewModel$uiState$1(this.this$0, htJ);
        agentPermissionBannerViewModel$uiState$1.L$0 = list;
        agentPermissionBannerViewModel$uiState$1.L$1 = str;
        return agentPermissionBannerViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
    }
}
