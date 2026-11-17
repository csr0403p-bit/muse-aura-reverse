package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C3TQ;
import X.G0U;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AgentPermissionPendingCardKt$AgentPermissionApprovalContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
    public final /* synthetic */ C3TQ $buttonPadding;
    public final /* synthetic */ float $buttonSpacing;
    public final /* synthetic */ boolean $confirming;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ float $horizontalPadding;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<AgentPermissionDecisionOption, Unit> $onDecisionClick;
    public final /* synthetic */ HatchScreen $screen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AgentPermissionPendingCardKt$AgentPermissionApprovalContent$2(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, float f, boolean z, G0U<? super AgentPermissionDecisionOption, Unit> g0u, BRg bRg, float f2, C3TQ c3tq, boolean z2, int i, int i2) {
        super(2);
        this.$approval = agentPermissionApproval;
        this.$screen = hatchScreen;
        this.$horizontalPadding = f;
        this.$enabled = z;
        this.$onDecisionClick = g0u;
        this.$modifier = bRg;
        this.$buttonSpacing = f2;
        this.$buttonPadding = c3tq;
        this.$confirming = z2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AgentPermissionPendingCardKt.m168AgentPermissionApprovalContent7UH0Qls(this.$approval, this.$screen, this.$horizontalPadding, this.$enabled, this.$onDecisionClick, this.$modifier, this.$buttonSpacing, this.$buttonPadding, this.$confirming, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
