package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C3VB;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchVoiceNuxSheetKt$VoiceNuxHero$1$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ C3VB $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceNuxSheetKt$VoiceNuxHero$1$1(C3VB c3vb) {
        super(0);
        this.$progress = c3vb;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$progress.getProgress());
    }
}
