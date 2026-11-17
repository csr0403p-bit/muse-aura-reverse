package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$VoiceFloatingCallControls$surfaceLeft$1$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ boolean $ltr;
    public final /* synthetic */ HatchCallControlsMotion $motion;
    public final /* synthetic */ Function0<Float> $turnInset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$VoiceFloatingCallControls$surfaceLeft$1$1(boolean z, HatchCallControlsMotion hatchCallControlsMotion, Function0<Float> function0) {
        super(0);
        this.$ltr = z;
        this.$motion = hatchCallControlsMotion;
        this.$turnInset = function0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        boolean z = this.$ltr;
        float fA00 = AnonymousClass001.A00(this.$motion.m1703getPositionF1C5BW0());
        if (z) {
            fA00 -= AnonymousClass003.A04(this.$turnInset);
        }
        return Float.valueOf(fA00);
    }
}
