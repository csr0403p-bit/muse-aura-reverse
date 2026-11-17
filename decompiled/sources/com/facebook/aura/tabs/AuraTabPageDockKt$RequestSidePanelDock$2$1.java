package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.navigation.HatchSidePanelController;

/* loaded from: classes.dex */
public final class AuraTabPageDockKt$RequestSidePanelDock$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $requestsPanel;
    public final /* synthetic */ boolean $requestsRail;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraTabPageDockKt$RequestSidePanelDock$2$1(boolean z, HatchSidePanelController hatchSidePanelController, boolean z2) {
        super(1);
        this.$requestsPanel = z;
        this.$sidePanelController = hatchSidePanelController;
        this.$requestsRail = z2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final Object objRequestDock = this.$requestsPanel ? this.$sidePanelController.requestDock() : null;
        final Object objRequestRail = this.$requestsRail ? this.$sidePanelController.requestRail() : null;
        final HatchSidePanelController hatchSidePanelController = this.$sidePanelController;
        return new C78g() { // from class: com.facebook.aura.tabs.AuraTabPageDockKt$RequestSidePanelDock$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Object obj = objRequestDock;
                if (obj != null) {
                    hatchSidePanelController.releaseDockRequest(obj);
                }
                Object obj2 = objRequestRail;
                if (obj2 != null) {
                    hatchSidePanelController.releaseRailRequest(obj2);
                }
            }
        };
    }
}
