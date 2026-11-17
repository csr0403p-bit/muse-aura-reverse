package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceFloatingCallControlsKt$VoiceFloatingCallControls$sidePanelRevealed$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ HatchSidePanelController $sidePanelController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$VoiceFloatingCallControls$sidePanelRevealed$1$1(HatchSidePanelController hatchSidePanelController) {
        super(0);
        this.$sidePanelController = hatchSidePanelController;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AnonymousClass002.A1N((this.$sidePanelController.revealOffsetPx$delegate.AFn() > 0.0f ? 1 : (this.$sidePanelController.revealOffsetPx$delegate.AFn() == 0.0f ? 0 : -1))));
    }
}
