package com.facebook.aura.microphone.api;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class MicrophonePriority {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ MicrophonePriority[] $VALUES;
    public static final MicrophonePriority SESSION;
    public static final MicrophonePriority TRANSIENT;

    static {
        MicrophonePriority microphonePriority = new MicrophonePriority("TRANSIENT", 0);
        TRANSIENT = microphonePriority;
        MicrophonePriority microphonePriority2 = new MicrophonePriority("SESSION", 1);
        SESSION = microphonePriority2;
        MicrophonePriority[] microphonePriorityArr = {microphonePriority, microphonePriority2};
        $VALUES = microphonePriorityArr;
        $ENTRIES = C3cG.A0w(microphonePriorityArr);
    }

    public static Ey9<MicrophonePriority> getEntries() {
        return $ENTRIES;
    }

    public static MicrophonePriority valueOf(String str) {
        return (MicrophonePriority) Enum.valueOf(MicrophonePriority.class, str);
    }

    public static MicrophonePriority[] values() {
        return (MicrophonePriority[]) $VALUES.clone();
    }

    public MicrophonePriority(String str, int i) {
    }
}
