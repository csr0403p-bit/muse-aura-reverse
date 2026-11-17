package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$shown$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ HatchStatusPillMetrics $metrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$shown$2$1(HatchStatusPillMetrics hatchStatusPillMetrics, VoiceAvatarFullScreenState voiceAvatarFullScreenState) {
        super(0);
        this.$metrics = hatchStatusPillMetrics;
        this.$fullScreen = voiceAvatarFullScreenState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r1 = this;
            com.facebook.aura.header.view.HatchStatusPillMetrics r0 = r1.$metrics
            boolean r0 = r0.getAvatarExpanded()
            if (r0 != 0) goto L1c
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r0 = r1.$fullScreen
            boolean r0 = r0.getActive()
            if (r0 != 0) goto L1c
            com.facebook.aura.header.view.HatchStatusPillMetrics r0 = r1.$metrics
            float r1 = r0.getAvatarPanelProgress()
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L1d
        L1c:
            r0 = 1
        L1d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$shown$2$1.invoke():java.lang.Boolean");
    }
}
