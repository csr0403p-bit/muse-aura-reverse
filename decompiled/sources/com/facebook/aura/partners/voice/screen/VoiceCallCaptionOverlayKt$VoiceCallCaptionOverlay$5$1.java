package com.facebook.aura.partners.voice.screen;

import X.AXN;
import X.Ab3;
import X.AbstractC7559F3s;
import X.C2ae;
import X.G0U;
import com.facebook.aura.navigation.HatchSidePanelController;

/* loaded from: classes.dex */
public final class VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$5$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ HatchSidePanelController $sidePanel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$5$1(HatchSidePanelController hatchSidePanelController) {
        super(1);
        this.$sidePanel = hatchSidePanelController;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m1757invokeBjo55l4(axn));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m1757invokeBjo55l4(AXN axn) {
        return Ab3.A01(this.$sidePanel.getScreenRevealOffsetPx()) << 32;
    }
}
