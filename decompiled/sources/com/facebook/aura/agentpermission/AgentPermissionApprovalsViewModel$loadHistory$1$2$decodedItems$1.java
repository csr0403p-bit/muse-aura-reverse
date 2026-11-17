package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.HatchAgentPermissionsRepositoryJsonKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;

@DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionApprovalsViewModel$loadHistory$1$2$decodedItems$1", f = "AgentPermissionApprovalsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AgentPermissionApprovalsViewModel$loadHistory$1$2$decodedItems$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval>>, Object> {
    public final /* synthetic */ ApprovalHistoryPage $page;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionApprovalsViewModel$loadHistory$1$2$decodedItems$1(ApprovalHistoryPage approvalHistoryPage, HtJ<? super AgentPermissionApprovalsViewModel$loadHistory$1$2$decodedItems$1> htJ) {
        super(2, htJ);
        this.$page = approvalHistoryPage;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AgentPermissionApprovalsViewModel$loadHistory$1$2$decodedItems$1(this.$page, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval>> htJ) {
        return invoke2(c3ux, (HtJ<? super List<HatchAgentPermissionsRepository.AgentPermissionApproval>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        List<JsonElement> list = this.$page.items;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<JsonElement> it = list.iterator();
        while (it.hasNext()) {
            HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApprovalDecodeApprovalSnapshotRecord = HatchAgentPermissionsRepositoryJsonKt.decodeApprovalSnapshotRecord(it.next());
            if (agentPermissionApprovalDecodeApprovalSnapshotRecord != null) {
                arrayListA0h.add(agentPermissionApprovalDecodeApprovalSnapshotRecord);
            }
        }
        return arrayListA0h;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super List<HatchAgentPermissionsRepository.AgentPermissionApproval>> htJ) {
        return new AgentPermissionApprovalsViewModel$loadHistory$1$2$decodedItems$1(this.$page, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
