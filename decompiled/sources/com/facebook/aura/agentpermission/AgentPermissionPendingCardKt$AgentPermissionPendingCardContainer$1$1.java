package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C3cG;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AgentPermissionPendingCardKt$AgentPermissionPendingCardContainer$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<List<HatchAgentPermissionsRepository.AgentPermissionApproval>> $lastContent;
    public final /* synthetic */ C1BO<List<HatchAgentPermissionsRepository.AgentPermissionApproval>> $liveApprovals$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AgentPermissionPendingCardKt$AgentPermissionPendingCardContainer$1$1(MutableState<List<HatchAgentPermissionsRepository.AgentPermissionApproval>> mutableState, C1BO<? extends List<HatchAgentPermissionsRepository.AgentPermissionApproval>> c1bo) {
        super(0);
        this.$lastContent = mutableState;
        this.$liveApprovals$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (C3cG.A0l(this.$liveApprovals$delegate).isEmpty()) {
            return;
        }
        this.$lastContent.Af8(this.$liveApprovals$delegate.getValue());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
