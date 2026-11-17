package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AgentPermissionPendingCardKt$AgentPermissionPendingCard$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ float $bottomSpacing;
    public final /* synthetic */ boolean $includeAllApprovals;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ boolean $retainContentOnDismiss;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionPendingCardKt$AgentPermissionPendingCard$1(BRg bRg, String str, boolean z, float f, boolean z2) {
        super(2);
        this.$modifier = bRg;
        this.$sessionId = str;
        this.$includeAllApprovals = z;
        this.$bottomSpacing = f;
        this.$retainContentOnDismiss = z2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AgentPermissionPendingCardKt.m171AgentPermissionPendingCardContainerhGBTI10(this.$modifier, this.$sessionId, this.$includeAllApprovals, this.$bottomSpacing, this.$retainContentOnDismiss, bfm, 0, 0);
        } else {
            bfm.Afo();
        }
    }
}
