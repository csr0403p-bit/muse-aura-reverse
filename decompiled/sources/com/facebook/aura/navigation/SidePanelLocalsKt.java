package com.facebook.aura.navigation;

import X.AGO;
import X.AKH;
import X.AnonymousClass002;

/* loaded from: classes.dex */
public abstract class SidePanelLocalsKt {
    public static final float HATCH_SIDE_PANEL_DOCK_WIDTH = 336.0f;
    public static final float HATCH_SIDE_PANEL_RAIL_WIDTH = 80.0f;
    public static final AKH<HatchSidePanelDock> LocalHatchSidePanelDock = AnonymousClass002.A0L(SidePanelLocalsKt$LocalHatchSidePanelDock$1.INSTANCE);
    public static final AKH<HatchSidePanelController> LocalSidePanelController = new AGO(SidePanelLocalsKt$LocalSidePanelController$1.INSTANCE);

    public static final float getHATCH_SIDE_PANEL_DOCK_WIDTH() {
        return HATCH_SIDE_PANEL_DOCK_WIDTH;
    }

    public static final float getHATCH_SIDE_PANEL_RAIL_WIDTH() {
        return HATCH_SIDE_PANEL_RAIL_WIDTH;
    }

    public static final AKH<HatchSidePanelDock> getLocalHatchSidePanelDock() {
        return LocalHatchSidePanelDock;
    }

    public static final AKH<HatchSidePanelController> getLocalSidePanelController() {
        return LocalSidePanelController;
    }
}
