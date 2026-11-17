package com.facebook.aura.conversation.repo;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class CleanupReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CleanupReason[] $VALUES;
    public static final CleanupReason CANCEL_RACE;
    public static final CleanupReason CHAT_ABORTED;
    public static final CleanupReason FALLBACK_TIMEOUT;
    public static final CleanupReason PRE_STREAM;
    public static final CleanupReason STATIC_OVERRIDE_INVALID;
    public static final CleanupReason STREAM_IDLE_TIMEOUT;
    public static final CleanupReason TRANSPORT_FAILURE;
    public static final CleanupReason USER_STOP;

    static {
        CleanupReason cleanupReason = new CleanupReason("USER_STOP", 0);
        USER_STOP = cleanupReason;
        CleanupReason cleanupReason2 = new CleanupReason("PRE_STREAM", 1);
        PRE_STREAM = cleanupReason2;
        CleanupReason cleanupReason3 = new CleanupReason("CANCEL_RACE", 2);
        CANCEL_RACE = cleanupReason3;
        CleanupReason cleanupReason4 = new CleanupReason("FALLBACK_TIMEOUT", 3);
        FALLBACK_TIMEOUT = cleanupReason4;
        CleanupReason cleanupReason5 = new CleanupReason("TRANSPORT_FAILURE", 4);
        TRANSPORT_FAILURE = cleanupReason5;
        CleanupReason cleanupReason6 = new CleanupReason("CHAT_ABORTED", 5);
        CHAT_ABORTED = cleanupReason6;
        CleanupReason cleanupReason7 = new CleanupReason("STATIC_OVERRIDE_INVALID", 6);
        STATIC_OVERRIDE_INVALID = cleanupReason7;
        CleanupReason cleanupReason8 = new CleanupReason("STREAM_IDLE_TIMEOUT", 7);
        STREAM_IDLE_TIMEOUT = cleanupReason8;
        CleanupReason[] cleanupReasonArr = {cleanupReason, cleanupReason2, cleanupReason3, cleanupReason4, cleanupReason5, cleanupReason6, cleanupReason7, cleanupReason8};
        $VALUES = cleanupReasonArr;
        $ENTRIES = C3cG.A0w(cleanupReasonArr);
    }

    public static Ey9<CleanupReason> getEntries() {
        return $ENTRIES;
    }

    public static CleanupReason valueOf(String str) {
        return (CleanupReason) Enum.valueOf(CleanupReason.class, str);
    }

    public static CleanupReason[] values() {
        return (CleanupReason[]) $VALUES.clone();
    }

    public CleanupReason(String str, int i) {
    }
}
