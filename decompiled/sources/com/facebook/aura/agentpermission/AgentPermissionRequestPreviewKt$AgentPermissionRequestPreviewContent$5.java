package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AgentPermissionRequestPreviewKt$AgentPermissionRequestPreviewContent$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
    public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument $document;
    public final /* synthetic */ String $fallbackText;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ long $textColor;
    public final /* synthetic */ C1822Arm $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionRequestPreviewKt$AgentPermissionRequestPreviewContent$5(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument, String str, C1822Arm c1822Arm, long j, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchScreen hatchScreen, BRg bRg, int i, int i2) {
        super(2);
        this.$document = agentPermissionRequestPreviewDocument;
        this.$fallbackText = str;
        this.$textStyle = c1822Arm;
        this.$textColor = j;
        this.$approval = agentPermissionApproval;
        this.$screen = hatchScreen;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AgentPermissionRequestPreviewKt.m177AgentPermissionRequestPreviewContenthYmLsZ8(this.$document, this.$fallbackText, this.$textStyle, this.$textColor, this.$approval, this.$screen, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
