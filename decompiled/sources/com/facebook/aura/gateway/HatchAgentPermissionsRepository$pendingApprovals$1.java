package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository$pendingApprovals$1", f = "HatchAgentPermissionsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchAgentPermissionsRepository$pendingApprovals$1 extends AbstractC07127nr implements G0W<List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval>, List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval>, HtJ<? super List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval>>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public HatchAgentPermissionsRepository$pendingApprovals$1(HtJ<? super HatchAgentPermissionsRepository$pendingApprovals$1> htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval> list, List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval> list2, HtJ<? super List<? extends HatchAgentPermissionsRepository.AgentPermissionApproval>> htJ) {
        return invoke2((List<HatchAgentPermissionsRepository.AgentPermissionApproval>) list, (List<HatchAgentPermissionsRepository.AgentPermissionApproval>) list2, (HtJ<? super List<HatchAgentPermissionsRepository.AgentPermissionApproval>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Collection collection = (Collection) this.L$0;
        Iterable iterable = (Iterable) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return AbstractC0878AGe.A0P(iterable, collection);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, List<HatchAgentPermissionsRepository.AgentPermissionApproval> list2, HtJ<? super List<HatchAgentPermissionsRepository.AgentPermissionApproval>> htJ) {
        HatchAgentPermissionsRepository$pendingApprovals$1 hatchAgentPermissionsRepository$pendingApprovals$1 = new HatchAgentPermissionsRepository$pendingApprovals$1(htJ);
        hatchAgentPermissionsRepository$pendingApprovals$1.L$0 = list;
        hatchAgentPermissionsRepository$pendingApprovals$1.L$1 = list2;
        return hatchAgentPermissionsRepository$pendingApprovals$1.invokeSuspend(Unit.INSTANCE);
    }
}
