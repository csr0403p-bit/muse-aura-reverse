package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceAvatarTakeoverKt$rememberCallAvatarIdleMedia$collapsing$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ HatchStatusPillMetrics $metrics;
    public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAvatarTakeoverKt$rememberCallAvatarIdleMedia$collapsing$2$1(HatchStatusPillMetrics hatchStatusPillMetrics, VoiceAvatarTakeoverState voiceAvatarTakeoverState) {
        super(0);
        this.$metrics = hatchStatusPillMetrics;
        this.$takeoverState = voiceAvatarTakeoverState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r2 = this;
            com.facebook.aura.header.view.HatchStatusPillMetrics r0 = r2.$metrics
            float r1 = r0.getAvatarPanelProgress()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L16
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverState r0 = r2.$takeoverState
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r0 = r0.fullScreen
            boolean r1 = r0.getActive()
            r0 = 0
            if (r1 == 0) goto L17
        L16:
            r0 = 1
        L17:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$rememberCallAvatarIdleMedia$collapsing$2$1.invoke():java.lang.Boolean");
    }
}
