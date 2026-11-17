package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$6$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $activeClipPainted;
    public final /* synthetic */ EmbodimentClip $clip;
    public final /* synthetic */ VoiceEmbodimentMediaController $controller;
    public final /* synthetic */ int $renderedGeneration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$6$2$1(MutableState<Boolean> mutableState, VoiceEmbodimentMediaController voiceEmbodimentMediaController, EmbodimentClip embodimentClip, int i) {
        super(0);
        this.$activeClipPainted = mutableState;
        this.$controller = voiceEmbodimentMediaController;
        this.$clip = embodimentClip;
        this.$renderedGeneration = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(true, this.$activeClipPainted);
        this.$controller.onActivityFramePainted(this.$clip, this.$renderedGeneration);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
