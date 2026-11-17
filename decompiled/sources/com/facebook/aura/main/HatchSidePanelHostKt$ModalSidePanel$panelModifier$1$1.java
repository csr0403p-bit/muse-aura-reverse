package com.facebook.aura.main;

import X.AOW;
import X.AT5;
import X.AXN;
import X.Ab3;
import X.AbstractC7559F3s;
import X.C2ae;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.HatchSidePanelController;

/* loaded from: classes.dex */
public final class HatchSidePanelHostKt$ModalSidePanel$panelModifier$1$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ float $panelWidthPx;
    public final /* synthetic */ AT5<Float, AOW> $revealPx;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSidePanelHostKt$ModalSidePanel$panelModifier$1$1(HatchSidePanelController hatchSidePanelController, AT5<Float, AOW> at5, float f) {
        super(1);
        this.$sidePanelController = hatchSidePanelController;
        this.$revealPx = at5;
        this.$panelWidthPx = f;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m1342invokeBjo55l4(axn));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m1342invokeBjo55l4(AXN axn) {
        return Ab3.A01(HatchSidePanelHostKt.currentRevealPx(this.$sidePanelController, MutableState.A00(this.$revealPx)) - this.$panelWidthPx) << 32;
    }
}
