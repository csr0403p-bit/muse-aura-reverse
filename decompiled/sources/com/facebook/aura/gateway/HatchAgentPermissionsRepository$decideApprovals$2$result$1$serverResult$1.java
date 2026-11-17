package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository$decideApprovals$2$result$1$serverResult$1", f = "HatchAgentPermissionsRepository.kt", l = {240}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAgentPermissionsRepository$decideApprovals$2$result$1$serverResult$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchAgentPermissionsRepository.DecideResult>, Object> {
    public final /* synthetic */ List<HatchAgentPermissionsRepository.AgentPermissionApprovalDecision> $serverDecisions;
    public int label;
    public final /* synthetic */ HatchAgentPermissionsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAgentPermissionsRepository$decideApprovals$2$result$1$serverResult$1(HatchAgentPermissionsRepository hatchAgentPermissionsRepository, List<HatchAgentPermissionsRepository.AgentPermissionApprovalDecision> list, HtJ<? super HatchAgentPermissionsRepository$decideApprovals$2$result$1$serverResult$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchAgentPermissionsRepository;
        this.$serverDecisions = list;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAgentPermissionsRepository$decideApprovals$2$result$1$serverResult$1(this.this$0, this.$serverDecisions, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchAgentPermissionsRepository hatchAgentPermissionsRepository = this.this$0;
            List<HatchAgentPermissionsRepository.AgentPermissionApprovalDecision> list = this.$serverDecisions;
            this.label = 1;
            obj = hatchAgentPermissionsRepository.decideServerApprovals(list, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchAgentPermissionsRepository.DecideResult> htJ) {
        return ((HatchAgentPermissionsRepository$decideApprovals$2$result$1$serverResult$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
