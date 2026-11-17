package com.facebook.aura.audio.view;

import X.C7438Evz;
import com.facebook.aura.audio.viewmodel.ChatAudioPlaybackViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$3$1 extends C7438Evz implements Function0<Unit> {
    public ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$3$1(Object obj) {
        super(0, obj, ChatAudioPlaybackViewModel.class, "onCancelEndCall", "onCancelEndCall()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ChatAudioPlaybackViewModel) this.receiver).onCancelEndCall();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
