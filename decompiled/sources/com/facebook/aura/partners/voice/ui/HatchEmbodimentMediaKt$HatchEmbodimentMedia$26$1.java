package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentPaintedMedia;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$26$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<G0U<VoiceEmbodimentPaintedMedia, Unit>> $currentOnPaintedMediaChanged$delegate;
    public final /* synthetic */ VoiceEmbodimentPaintedMedia $paintedMedia;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$26$1(VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia, C1BO<? extends G0U<? super VoiceEmbodimentPaintedMedia, Unit>> c1bo) {
        super(1);
        this.$paintedMedia = voiceEmbodimentPaintedMedia;
        this.$currentOnPaintedMediaChanged$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        C1BO.A0B(this.$currentOnPaintedMediaChanged$delegate).invoke(this.$paintedMedia);
        return new C78g() { // from class: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$HatchEmbodimentMedia$26$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
