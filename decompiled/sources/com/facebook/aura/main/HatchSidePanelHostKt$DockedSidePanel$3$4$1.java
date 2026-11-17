package com.facebook.aura.main;

import X.AXN;
import X.Ab3;
import X.AbstractC7559F3s;
import X.C2ae;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.SidePanelLocalsKt;

/* loaded from: classes.dex */
public final class HatchSidePanelHostKt$DockedSidePanel$3$4$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ float $panelProgress;

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m1341invokeBjo55l4(AXN axn) {
        C7384Etj.A0Y(axn, 0);
        return Ab3.A01((this.$panelProgress - 1.0f) * axn.Ah4(SidePanelLocalsKt.HATCH_SIDE_PANEL_DOCK_WIDTH)) << 32;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSidePanelHostKt$DockedSidePanel$3$4$1(float f) {
        super(1);
        this.$panelProgress = f;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m1341invokeBjo55l4(axn));
    }
}
