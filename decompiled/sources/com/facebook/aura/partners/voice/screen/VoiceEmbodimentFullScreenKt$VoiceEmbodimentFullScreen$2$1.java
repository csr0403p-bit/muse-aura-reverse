package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreen$2$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Acj(this.$fullScreen.getProgress());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreen$2$1(VoiceAvatarFullScreenState voiceAvatarFullScreenState) {
        super(1);
        this.$fullScreen = voiceAvatarFullScreenState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
