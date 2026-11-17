package com.facebook.aura.partners.voice.ui;

import X.C1BO;
import X.C78g;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentVisibleMedia;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$25$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ C1BO $currentOnVisibleMediaChanged$delegate$inlined;

    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$25$1$invoke$$inlined$onDispose$1(C1BO c1bo) {
        this.$currentOnVisibleMediaChanged$delegate$inlined = c1bo;
    }

    @Override // X.C78g
    public void dispose() {
        C1BO.A0B(this.$currentOnVisibleMediaChanged$delegate$inlined).invoke(VoiceEmbodimentVisibleMedia.NONE);
    }
}
