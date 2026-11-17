package com.facebook.aura.partners.voice.screen;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceCallCurrentCaptionKt$CaptionHandover$leaving$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ AT5<Float, AOW> $entryAnimation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCurrentCaptionKt$CaptionHandover$leaving$2$1(AT5<Float, AOW> at5) {
        super(0);
        this.$entryAnimation = at5;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(MutableState.A00(this.$entryAnimation) < 0.6f);
    }
}
