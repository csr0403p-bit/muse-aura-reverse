package com.facebook.aura.partners.voice.chrome;

import X.C78g;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$VoiceFloatingCallControls$3$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ HatchCallControlsMotion $motion$inlined;

    public VoiceFloatingCallControlsKt$VoiceFloatingCallControls$3$1$invoke$$inlined$onDispose$1(HatchCallControlsMotion hatchCallControlsMotion) {
        this.$motion$inlined = hatchCallControlsMotion;
    }

    @Override // X.C78g
    public void dispose() {
        this.$motion$inlined.cancel();
    }
}
