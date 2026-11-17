package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$agentPermissionApprovalImpressions$1$1", f = "AgentPermissionPendingCard.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AgentPermissionPendingCardKt$agentPermissionApprovalImpressions$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ List<HatchAgentPermissionsRepository.AgentPermissionApproval> $approvals;
    public final /* synthetic */ MutableState<Boolean> $isVisible$delegate;
    public final /* synthetic */ Set<String> $loggedApprovalIds;
    public final /* synthetic */ HatchScreen $screen;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionPendingCardKt$agentPermissionApprovalImpressions$1$1(List<HatchAgentPermissionsRepository.AgentPermissionApproval> list, MutableState<Boolean> mutableState, Set<String> set, HatchScreen hatchScreen, HtJ<? super AgentPermissionPendingCardKt$agentPermissionApprovalImpressions$1$1> htJ) {
        super(2, htJ);
        this.$approvals = list;
        this.$isVisible$delegate = mutableState;
        this.$loggedApprovalIds = set;
        this.$screen = hatchScreen;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AgentPermissionPendingCardKt$agentPermissionApprovalImpressions$1$1(this.$approvals, this.$isVisible$delegate, this.$loggedApprovalIds, this.$screen, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (MutableState.A0A((MutableState) this.$isVisible$delegate)) {
            List<HatchAgentPermissionsRepository.AgentPermissionApproval> list = this.$approvals;
            Set<String> set = this.$loggedApprovalIds;
            HatchScreen hatchScreen = this.$screen;
            for (HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval : list) {
                if (set.add(agentPermissionApproval.approvalId)) {
                    AgentPermissionTelemetryKt.logAgentPermissionApprovalImpression(agentPermissionApproval, list.size(), hatchScreen);
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AgentPermissionPendingCardKt$agentPermissionApprovalImpressions$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
