package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10550Hrx;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository$decideApprovals$2$result$1", f = "HatchAgentPermissionsRepository.kt", l = {242}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAgentPermissionsRepository$decideApprovals$2$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchAgentPermissionsRepository.DecideResult>, Object> {
    public final /* synthetic */ List<HatchAgentPermissionsRepository.AgentPermissionApprovalDecision> $localDecisions;
    public final /* synthetic */ List<HatchAgentPermissionsRepository.AgentPermissionApprovalDecision> $serverDecisions;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ HatchAgentPermissionsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAgentPermissionsRepository$decideApprovals$2$result$1(HatchAgentPermissionsRepository hatchAgentPermissionsRepository, List<HatchAgentPermissionsRepository.AgentPermissionApprovalDecision> list, List<HatchAgentPermissionsRepository.AgentPermissionApprovalDecision> list2, HtJ<? super HatchAgentPermissionsRepository$decideApprovals$2$result$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchAgentPermissionsRepository;
        this.$localDecisions = list;
        this.$serverDecisions = list2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchAgentPermissionsRepository$decideApprovals$2$result$1 hatchAgentPermissionsRepository$decideApprovals$2$result$1 = new HatchAgentPermissionsRepository$decideApprovals$2$result$1(this.this$0, this.$localDecisions, this.$serverDecisions, htJ);
        hatchAgentPermissionsRepository$decideApprovals$2$result$1.L$0 = obj;
        return hatchAgentPermissionsRepository$decideApprovals$2$result$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HatchAgentPermissionsRepository.DecideResult decideResultDecideLocalApprovals;
        HatchAgentPermissionsRepository hatchAgentPermissionsRepository;
        C3UX c3ux = (C3UX) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C10550Hrx c10550HrxA10 = AnonymousClass001.A10(new HatchAgentPermissionsRepository$decideApprovals$2$result$1$serverResult$1(this.this$0, this.$serverDecisions, null), c3ux);
            decideResultDecideLocalApprovals = this.this$0.decideLocalApprovals(this.$localDecisions);
            hatchAgentPermissionsRepository = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = hatchAgentPermissionsRepository;
            this.L$4 = decideResultDecideLocalApprovals;
            this.label = 1;
            obj = c10550HrxA10.A0E(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            decideResultDecideLocalApprovals = (HatchAgentPermissionsRepository.DecideResult) this.L$4;
            hatchAgentPermissionsRepository = (HatchAgentPermissionsRepository) this.L$3;
            Hwg.A00(obj);
        }
        return hatchAgentPermissionsRepository.mergeDecisionResults(decideResultDecideLocalApprovals, (HatchAgentPermissionsRepository.DecideResult) obj);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchAgentPermissionsRepository.DecideResult> htJ) {
        return ((HatchAgentPermissionsRepository$decideApprovals$2$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
