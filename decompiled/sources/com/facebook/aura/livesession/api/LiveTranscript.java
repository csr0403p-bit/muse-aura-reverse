package com.facebook.aura.livesession.api;

/* loaded from: classes3.dex */
public interface LiveTranscript {
    boolean claimServerUserMessage(String str);

    void onConversationCleared();

    void onServerTranscriptDelta(String str, String str2);

    void onServerTranscriptDone(String str);

    void onServerTranscriptStart(String str, Long l);

    void onStreamReset();
}
