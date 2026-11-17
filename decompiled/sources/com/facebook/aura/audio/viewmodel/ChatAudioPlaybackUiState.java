package com.facebook.aura.audio.viewmodel;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;

/* loaded from: classes.dex */
public final class ChatAudioPlaybackUiState extends C06G {
    public final boolean isConfirmingEndCall;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ChatAudioPlaybackUiState) && this.isConfirmingEndCall == ((ChatAudioPlaybackUiState) obj).isConfirmingEndCall);
    }

    public static /* synthetic */ ChatAudioPlaybackUiState copy$default(ChatAudioPlaybackUiState chatAudioPlaybackUiState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatAudioPlaybackUiState.isConfirmingEndCall;
        }
        return new ChatAudioPlaybackUiState(z);
    }

    public final boolean component1() {
        return this.isConfirmingEndCall;
    }

    public final ChatAudioPlaybackUiState copy(boolean z) {
        return new ChatAudioPlaybackUiState(z);
    }

    public int hashCode() {
        return this.isConfirmingEndCall ? 1231 : 1237;
    }

    public final boolean isConfirmingEndCall() {
        return this.isConfirmingEndCall;
    }

    public /* synthetic */ ChatAudioPlaybackUiState(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public String toString() {
        return super.toString();
    }

    public ChatAudioPlaybackUiState(boolean z) {
        this.isConfirmingEndCall = z;
    }

    public ChatAudioPlaybackUiState() {
        this(false);
    }
}
