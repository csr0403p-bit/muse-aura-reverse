package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$20$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceEmbodimentMediaController $controller;
    public final /* synthetic */ MutableState<Boolean> $lifecycleResumed$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$20$1(VoiceEmbodimentMediaController voiceEmbodimentMediaController, MutableState<Boolean> mutableState) {
        super(0);
        this.$controller = voiceEmbodimentMediaController;
        this.$lifecycleResumed$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$lifecycleResumed$delegate);
        this.$controller.setLifecycleResumed(false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
