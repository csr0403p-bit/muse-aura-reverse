package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.ApprovalConversationIdentity;
import com.facebook.aura.gateway.ApprovalPresentation;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.HatchAgentPermissionsRepositoryKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionPendingCardViewModel$approvals$1", f = "AgentPermissionPendingCardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AgentPermissionPendingCardViewModel$approvals$1 extends AbstractC07127nr implements G0W<List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval>, String, HtJ<? super List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval>>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ AgentPermissionPendingCardViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionPendingCardViewModel$approvals$1(AgentPermissionPendingCardViewModel agentPermissionPendingCardViewModel, HtJ<? super AgentPermissionPendingCardViewModel$approvals$1> htJ) {
        super(3, htJ);
        this.this$0 = agentPermissionPendingCardViewModel;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval> list, String str, HtJ<? super List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval>> htJ) {
        return invoke2((List<HatchAgentPermissionsRepository.AgentPermissionApproval>) list, str, (HtJ<? super List<HatchAgentPermissionsRepository.AgentPermissionApproval>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        String str = (String) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        String strResolveThreadId = ApprovalConversationIdentity.INSTANCE.resolveThreadId(this.this$0.screenSessionId, str);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (HatchAgentPermissionsRepositoryKt.classifyApprovalPresentation((HatchAgentPermissionsRepository.AgentPermissionApproval) obj2, strResolveThreadId) == ApprovalPresentation.BLOCKING) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, String str, HtJ<? super List<HatchAgentPermissionsRepository.AgentPermissionApproval>> htJ) {
        AgentPermissionPendingCardViewModel$approvals$1 agentPermissionPendingCardViewModel$approvals$1 = new AgentPermissionPendingCardViewModel$approvals$1(this.this$0, htJ);
        agentPermissionPendingCardViewModel$approvals$1.L$0 = list;
        agentPermissionPendingCardViewModel$approvals$1.L$1 = str;
        return agentPermissionPendingCardViewModel$approvals$1.invokeSuspend(Unit.INSTANCE);
    }
}
