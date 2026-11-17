package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$6$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ EmbodimentClip $clip;
    public final /* synthetic */ VoiceEmbodimentMediaController $controller;
    public final /* synthetic */ int $renderedGeneration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$6$3$1(VoiceEmbodimentMediaController voiceEmbodimentMediaController, EmbodimentClip embodimentClip, int i) {
        super(0);
        this.$controller = voiceEmbodimentMediaController;
        this.$clip = embodimentClip;
        this.$renderedGeneration = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$controller.onActivityFailed(this.$clip, this.$renderedGeneration);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
