package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$VoiceFloatingCallControls$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchCallControlsMotion $motion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$VoiceFloatingCallControls$3$1(HatchCallControlsMotion hatchCallControlsMotion) {
        super(1);
        this.$motion = hatchCallControlsMotion;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final C78g invoke2(C0Yr c0Yr) {
        return new VoiceFloatingCallControlsKt$VoiceFloatingCallControls$3$1$invoke$$inlined$onDispose$1(this.$motion);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C78g invoke(C0Yr c0Yr) {
        return new VoiceFloatingCallControlsKt$VoiceFloatingCallControls$3$1$invoke$$inlined$onDispose$1(this.$motion);
    }
}
