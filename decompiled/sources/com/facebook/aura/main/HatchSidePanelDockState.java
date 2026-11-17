package com.facebook.aura.main;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C1DG;
import X.C7384Etj;
import com.facebook.aura.navigation.HatchSidePanelDock;
import com.facebook.aura.navigation.SidePanelLocalsKt;

/* loaded from: classes.dex */
public final class HatchSidePanelDockState extends C06G {
    public static final int $stable = 0;
    public final HatchSidePanelDock dock;
    public final boolean showsPanel;
    public final boolean showsRail;

    public HatchSidePanelDockState(HatchSidePanelDock hatchSidePanelDock, boolean z, boolean z2) {
        C7384Etj.A0Y(hatchSidePanelDock, 0);
        this.dock = hatchSidePanelDock;
        this.showsRail = z;
        this.showsPanel = z2;
    }

    public final HatchSidePanelDockState copy(HatchSidePanelDock hatchSidePanelDock, boolean z, boolean z2) {
        C7384Etj.A0Y(hatchSidePanelDock, 0);
        return new HatchSidePanelDockState(hatchSidePanelDock, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSidePanelDockState) {
                HatchSidePanelDockState hatchSidePanelDockState = (HatchSidePanelDockState) obj;
                if (!C7384Etj.areEqual(this.dock, hatchSidePanelDockState.dock) || this.showsRail != hatchSidePanelDockState.showsRail || this.showsPanel != hatchSidePanelDockState.showsPanel) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSidePanelDockState copy$default(HatchSidePanelDockState hatchSidePanelDockState, HatchSidePanelDock hatchSidePanelDock, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSidePanelDock = hatchSidePanelDockState.dock;
        }
        if ((i & 2) != 0) {
            z = hatchSidePanelDockState.showsRail;
        }
        if ((i & 4) != 0) {
            z2 = hatchSidePanelDockState.showsPanel;
        }
        return hatchSidePanelDockState.copy(hatchSidePanelDock, z, z2);
    }

    public final HatchSidePanelDock component1() {
        return this.dock;
    }

    public final boolean component2() {
        return this.showsRail;
    }

    public final boolean component3() {
        return this.showsPanel;
    }

    /* renamed from: getContentStartInset-D9Ej5fM, reason: not valid java name */
    public final float m1338getContentStartInsetD9Ej5fM() {
        boolean z = this.showsRail;
        if (z && this.showsPanel) {
            return this.dock.width;
        }
        if (this.showsPanel) {
            float f = SidePanelLocalsKt.HATCH_SIDE_PANEL_DOCK_WIDTH;
            HatchSidePanelDock hatchSidePanelDock = this.dock;
            return f * hatchSidePanelDock.m1466panelProgressAt0680j_4(hatchSidePanelDock.width);
        }
        if (z) {
            return this.dock.railWidth;
        }
        return 0.0f;
    }

    public final HatchSidePanelDock getDock() {
        return this.dock;
    }

    public final boolean getShowsPanel() {
        return this.showsPanel;
    }

    public final boolean getShowsRail() {
        return this.showsRail;
    }

    public final float getVisiblePanelProgress() {
        if (!this.showsPanel) {
            return 0.0f;
        }
        HatchSidePanelDock hatchSidePanelDock = this.dock;
        return hatchSidePanelDock.m1466panelProgressAt0680j_4(hatchSidePanelDock.width);
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0E(this.dock), this.showsRail), this.showsPanel);
    }

    public final boolean isAnimating() {
        HatchSidePanelDock hatchSidePanelDock = this.dock;
        return !C1DG.A08(hatchSidePanelDock.width, hatchSidePanelDock.targetWidth);
    }

    public final boolean isRailVisible() {
        if (!this.showsRail) {
            return false;
        }
        if (!this.showsPanel) {
            return true;
        }
        HatchSidePanelDock hatchSidePanelDock = this.dock;
        return hatchSidePanelDock.m1466panelProgressAt0680j_4(hatchSidePanelDock.width) < 1.0f;
    }

    public String toString() {
        return super.toString();
    }
}
