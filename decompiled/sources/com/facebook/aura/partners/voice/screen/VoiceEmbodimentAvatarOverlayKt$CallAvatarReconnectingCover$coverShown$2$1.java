package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$CallAvatarReconnectingCover$coverShown$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ C1BO<Float> $cover;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$CallAvatarReconnectingCover$coverShown$2$1(C1BO<Float> c1bo) {
        super(0);
        this.$cover = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AnonymousClass002.A1N((C1BO.A01(this.$cover) > 0.0f ? 1 : (C1BO.A01(this.$cover) == 0.0f ? 0 : -1))));
    }
}
