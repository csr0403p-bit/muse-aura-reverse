package com.facebook.aura.conversation.repo;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class StreamingState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ StreamingState[] $VALUES;
    public static final StreamingState Done;
    public static final StreamingState PendingResponse;
    public static final StreamingState Streaming;

    static {
        StreamingState streamingState = new StreamingState("Done", 0);
        Done = streamingState;
        StreamingState streamingState2 = new StreamingState("PendingResponse", 1);
        PendingResponse = streamingState2;
        StreamingState streamingState3 = new StreamingState("Streaming", 2);
        Streaming = streamingState3;
        StreamingState[] streamingStateArr = {streamingState, streamingState2, streamingState3};
        $VALUES = streamingStateArr;
        $ENTRIES = C3cG.A0w(streamingStateArr);
    }

    public static Ey9<StreamingState> getEntries() {
        return $ENTRIES;
    }

    public static StreamingState valueOf(String str) {
        return (StreamingState) Enum.valueOf(StreamingState.class, str);
    }

    public static StreamingState[] values() {
        return (StreamingState[]) $VALUES.clone();
    }

    public StreamingState(String str, int i) {
    }
}
