package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.navigation.HatchSidePanelController;

/* loaded from: classes.dex */
public final class HatchRootSidePanelButtonKt$SuppressRootSidePanelButton$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchSidePanelController $controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRootSidePanelButtonKt$SuppressRootSidePanelButton$1$1(HatchSidePanelController hatchSidePanelController) {
        super(1);
        this.$controller = hatchSidePanelController;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final Object objSuppressButton = this.$controller.suppressButton();
        final HatchSidePanelController hatchSidePanelController = this.$controller;
        return new C78g() { // from class: com.facebook.aura.header.view.HatchRootSidePanelButtonKt$SuppressRootSidePanelButton$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchSidePanelController.releaseButtonSuppression(objSuppressButton);
            }
        };
    }
}
