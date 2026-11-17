package com.facebook.aura.audio.view;

import X.C78g;
import com.facebook.aura.audio.viewmodel.ChatAudioPlaybackViewModel;

/* loaded from: classes.dex */
public final class ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$1$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ ChatAudioPlaybackViewModel $viewModel$inlined;

    public ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$1$1$invoke$$inlined$onDispose$1(ChatAudioPlaybackViewModel chatAudioPlaybackViewModel) {
        this.$viewModel$inlined = chatAudioPlaybackViewModel;
    }

    @Override // X.C78g
    public void dispose() {
        this.$viewModel$inlined.onCancelEndCall();
    }
}
