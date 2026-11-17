package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$6$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$6$1(VoiceAvatarTakeoverState voiceAvatarTakeoverState) {
        super(1);
        this.$takeoverState = voiceAvatarTakeoverState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        this.$takeoverState.setBackdropColor(Integer.valueOf(i));
    }
}
