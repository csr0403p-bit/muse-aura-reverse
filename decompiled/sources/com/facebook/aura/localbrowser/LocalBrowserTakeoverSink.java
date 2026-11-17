package com.facebook.aura.localbrowser;

/* loaded from: classes6.dex */
public interface LocalBrowserTakeoverSink {
    boolean isRecording();

    void markIncomplete();

    void record(Integer num, TakeoverActivityJson takeoverActivityJson);
}
