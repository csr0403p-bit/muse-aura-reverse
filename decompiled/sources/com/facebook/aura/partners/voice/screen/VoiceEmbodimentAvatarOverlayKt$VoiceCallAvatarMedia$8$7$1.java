package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$7$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ MutableState<Boolean> $videoCovering$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$7$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$videoCovering$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        MutableState.A09(z, this.$videoCovering$delegate);
    }
}
