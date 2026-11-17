package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentVisibleMedia;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$24$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<G0U<VoiceEmbodimentVisibleMedia, Unit>> $currentOnVisibleMediaChanged$delegate;
    public final /* synthetic */ VoiceEmbodimentVisibleMedia $visibleMedia;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$24$1(VoiceEmbodimentVisibleMedia voiceEmbodimentVisibleMedia, C1BO<? extends G0U<? super VoiceEmbodimentVisibleMedia, Unit>> c1bo) {
        super(1);
        this.$visibleMedia = voiceEmbodimentVisibleMedia;
        this.$currentOnVisibleMediaChanged$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        C1BO.A0B(this.$currentOnVisibleMediaChanged$delegate).invoke(this.$visibleMedia);
        return new C78g() { // from class: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$HatchEmbodimentMedia$24$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
