package com.facebook.aura.partners.voice.screen;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallCurrentCaptionKt$VoiceCallCurrentCaption$entryProgress$1$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ AT5<Float, AOW> $entryAnimation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCurrentCaptionKt$VoiceCallCurrentCaption$entryProgress$1$1(AT5<Float, AOW> at5) {
        super(0);
        this.$entryAnimation = at5;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return (Float) this.$entryAnimation.A04.getValue();
    }
}
