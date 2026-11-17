package com.facebook.aura.main;

import X.AXN;
import X.Ab3;
import X.AbstractC7559F3s;
import X.C2ae;
import X.G0U;
import com.facebook.aura.navigation.HatchSidePanelController;

/* loaded from: classes.dex */
public final class HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$8$4$2$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ int $parkedOffsetPx;
    public final /* synthetic */ boolean $pillVisible;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$8$4$2$1(boolean z, HatchSidePanelController hatchSidePanelController, int i) {
        super(1);
        this.$pillVisible = z;
        this.$sidePanelController = hatchSidePanelController;
        this.$parkedOffsetPx = i;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m1345invokeBjo55l4(axn));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m1345invokeBjo55l4(AXN axn) {
        long jA01;
        long j;
        if (this.$pillVisible) {
            jA01 = Ab3.A01(this.$sidePanelController.getScreenRevealOffsetPx()) << 32;
            j = 0;
        } else {
            int i = -this.$parkedOffsetPx;
            jA01 = 0 << 32;
            j = 4294967295L & i;
        }
        return j | jA01;
    }
}
