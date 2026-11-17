package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$VoiceFloatingCallControls$turnInset$1$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ HatchCallControlsMotion $motion;
    public final /* synthetic */ PillTurn $turn;
    public final /* synthetic */ VoiceCallSlotAnimation $turnAnimation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$VoiceFloatingCallControls$turnInset$1$1(PillTurn pillTurn, VoiceCallSlotAnimation voiceCallSlotAnimation, HatchCallControlsMotion hatchCallControlsMotion) {
        super(0);
        this.$turn = pillTurn;
        this.$turnAnimation = voiceCallSlotAnimation;
        this.$motion = hatchCallControlsMotion;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        float fA03;
        PillTurn pillTurn = this.$turn;
        if (pillTurn == null || this.$turnAnimation == null) {
            fA03 = 0.0f;
        } else {
            fA03 = pillTurn.towardsEnd * (AnonymousClass003.A03(this.$motion.m1703getPositionF1C5BW0()) - pillTurn.callLeft) * (1.0f - this.$turnAnimation.getWidthProgress());
        }
        return Float.valueOf(fA03);
    }
}
