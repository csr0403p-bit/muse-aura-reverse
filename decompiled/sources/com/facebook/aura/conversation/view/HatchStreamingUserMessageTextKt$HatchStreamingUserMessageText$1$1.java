package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStreamingUserMessageTextKt$HatchStreamingUserMessageText$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceTranscriptReveal $reveal;
    public final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStreamingUserMessageTextKt$HatchStreamingUserMessageText$1$1(VoiceTranscriptReveal voiceTranscriptReveal, String str) {
        super(0);
        this.$reveal = voiceTranscriptReveal;
        this.$text = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$reveal.update(this.$text);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
