package com.facebook.aura.agentpermission;

import X.AnonymousClass002;
import X.C06H;
import X.C3cH;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class RichApprovalSurface {
    public static final int $stable = 0;
    public final boolean actionsEnabled;
    public final boolean actionsInFooter;
    public final boolean confirming;
    public final G0U<AgentPermissionDecisionOption, Unit> onDecision;
    public final HatchScreen screen;
    public final boolean showCardBackground;
    public final boolean submitting;

    public final boolean getActionsEnabled() {
        return this.actionsEnabled;
    }

    public final boolean getActionsInFooter() {
        return this.actionsInFooter;
    }

    public final boolean getConfirming() {
        return this.confirming;
    }

    public final G0U<AgentPermissionDecisionOption, Unit> getOnDecision() {
        return this.onDecision;
    }

    public final HatchScreen getScreen() {
        return this.screen;
    }

    public final boolean getShowCardBackground() {
        return this.showCardBackground;
    }

    public final boolean getSubmitting() {
        return this.submitting;
    }

    public /* synthetic */ RichApprovalSurface(HatchScreen hatchScreen, boolean z, boolean z2, boolean z3, boolean z4, G0U g0u, boolean z5, int i, C06H c06h) {
        this(hatchScreen, z, z2, z3, z4, g0u, C3cH.A1M(i, z5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RichApprovalSurface(HatchScreen hatchScreen, boolean z, boolean z2, boolean z3, boolean z4, G0U<? super AgentPermissionDecisionOption, Unit> g0u, boolean z5) {
        AnonymousClass002.A1D(hatchScreen, 0, g0u);
        this.screen = hatchScreen;
        this.submitting = z;
        this.actionsEnabled = z2;
        this.showCardBackground = z3;
        this.actionsInFooter = z4;
        this.onDecision = g0u;
        this.confirming = z5;
    }
}
