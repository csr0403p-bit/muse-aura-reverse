package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.C1DG;
import X.G0U;
import com.facebook.aura.navigation.HatchSidePanelDock;
import com.facebook.aura.navigation.SidePanelLocalsKt;

/* loaded from: classes.dex */
public final class AuraTabPageDockKt$auraTabPageDock$insetAt$1$1 extends AbstractC7559F3s implements G0U<C1DG, C1DG> {
    public final /* synthetic */ HatchSidePanelDock $dock;
    public final /* synthetic */ boolean $docksPanel;
    public final /* synthetic */ boolean $showsRail;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraTabPageDockKt$auraTabPageDock$insetAt$1$1(boolean z, boolean z2, HatchSidePanelDock hatchSidePanelDock) {
        super(1);
        this.$docksPanel = z;
        this.$showsRail = z2;
        this.$dock = hatchSidePanelDock;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C1DG invoke(C1DG c1dg) {
        return new C1DG(m2300invoke5rwHm24(c1dg.A00));
    }

    /* renamed from: invoke-5rwHm24, reason: not valid java name */
    public final float m2300invoke5rwHm24(float f) {
        boolean z = this.$docksPanel;
        boolean z2 = this.$showsRail;
        if (z) {
            return !z2 ? SidePanelLocalsKt.HATCH_SIDE_PANEL_DOCK_WIDTH * this.$dock.m1466panelProgressAt0680j_4(f) : f;
        }
        if (z2) {
            return this.$dock.railWidth;
        }
        return 0.0f;
    }
}
