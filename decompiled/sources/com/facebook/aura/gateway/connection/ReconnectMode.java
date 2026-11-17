package com.facebook.aura.gateway.connection;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ReconnectMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ReconnectMode[] $VALUES;
    public static final ReconnectMode REGULAR;
    public static final ReconnectMode REGULAR_FALLBACK;
    public static final ReconnectMode SERVICE;
    public static final ReconnectMode VM_STARTING;
    public static final ReconnectMode VM_SUSPENDED;

    static {
        ReconnectMode reconnectMode = new ReconnectMode("REGULAR", 0);
        REGULAR = reconnectMode;
        ReconnectMode reconnectMode2 = new ReconnectMode("SERVICE", 1);
        SERVICE = reconnectMode2;
        ReconnectMode reconnectMode3 = new ReconnectMode("VM_SUSPENDED", 2);
        VM_SUSPENDED = reconnectMode3;
        ReconnectMode reconnectMode4 = new ReconnectMode("VM_STARTING", 3);
        VM_STARTING = reconnectMode4;
        ReconnectMode reconnectMode5 = new ReconnectMode("REGULAR_FALLBACK", 4);
        REGULAR_FALLBACK = reconnectMode5;
        ReconnectMode[] reconnectModeArr = {reconnectMode, reconnectMode2, reconnectMode3, reconnectMode4, reconnectMode5};
        $VALUES = reconnectModeArr;
        $ENTRIES = C3cG.A0w(reconnectModeArr);
    }

    public static Ey9<ReconnectMode> getEntries() {
        return $ENTRIES;
    }

    public static ReconnectMode valueOf(String str) {
        return (ReconnectMode) Enum.valueOf(ReconnectMode.class, str);
    }

    public static ReconnectMode[] values() {
        return (ReconnectMode[]) $VALUES.clone();
    }

    public ReconnectMode(String str, int i) {
    }
}
