package com.facebook.aura.localbrowser;

/* loaded from: classes3.dex */
public interface LocalBrowserActivitySink {
    void framesDropped();

    boolean isRecording();

    void record(TakeoverActivityJson takeoverActivityJson);
}
