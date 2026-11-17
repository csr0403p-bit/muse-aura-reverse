package com.facebook.aura.audio.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.audio.viewmodel.ChatAudioPlaybackViewModel;

/* loaded from: classes.dex */
public final class ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ ChatAudioPlaybackViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$1$1(ChatAudioPlaybackViewModel chatAudioPlaybackViewModel) {
        super(1);
        this.$viewModel = chatAudioPlaybackViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final C78g invoke2(C0Yr c0Yr) {
        return new ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$1$1$invoke$$inlined$onDispose$1(this.$viewModel);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C78g invoke(C0Yr c0Yr) {
        return new ChatAudioCallTakeoverKt$ChatAudioCallTakeoverDialog$1$1$invoke$$inlined$onDispose$1(this.$viewModel);
    }
}
