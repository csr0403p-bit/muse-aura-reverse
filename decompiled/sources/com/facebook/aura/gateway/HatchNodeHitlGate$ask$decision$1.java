package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchNodeHitlGate$ask$decision$1", f = "HatchNodeHitlGate.kt", l = {177}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchNodeHitlGate$ask$decision$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AgentPermissionDecision>, Object> {
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $enrichedApproval;
    public int label;
    public final /* synthetic */ HatchNodeHitlGate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeHitlGate$ask$decision$1(HatchNodeHitlGate hatchNodeHitlGate, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HtJ<? super HatchNodeHitlGate$ask$decision$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchNodeHitlGate;
        this.$enrichedApproval = agentPermissionApproval;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchNodeHitlGate$ask$decision$1(this.this$0, this.$enrichedApproval, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchAgentPermissionsRepository hatchAgentPermissionsRepository = this.this$0.approvalsRepository;
            HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = this.$enrichedApproval;
            this.label = 1;
            obj = hatchAgentPermissionsRepository.requestLocalApproval(agentPermissionApproval, this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super AgentPermissionDecision> htJ) {
        return ((HatchNodeHitlGate$ask$decision$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
