package com.facebook.aura.gateway.connection;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ConnectAttemptCancellation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectAttemptCancellation[] $VALUES;
    public static final ConnectAttemptCancellation NETWORK_UNAVAILABLE;
    public static final ConnectAttemptCancellation SUPERSEDED;

    static {
        ConnectAttemptCancellation connectAttemptCancellation = new ConnectAttemptCancellation("SUPERSEDED", 0);
        SUPERSEDED = connectAttemptCancellation;
        ConnectAttemptCancellation connectAttemptCancellation2 = new ConnectAttemptCancellation("NETWORK_UNAVAILABLE", 1);
        NETWORK_UNAVAILABLE = connectAttemptCancellation2;
        ConnectAttemptCancellation[] connectAttemptCancellationArr = {connectAttemptCancellation, connectAttemptCancellation2};
        $VALUES = connectAttemptCancellationArr;
        $ENTRIES = C3cG.A0w(connectAttemptCancellationArr);
    }

    public static Ey9<ConnectAttemptCancellation> getEntries() {
        return $ENTRIES;
    }

    public static ConnectAttemptCancellation valueOf(String str) {
        return (ConnectAttemptCancellation) Enum.valueOf(ConnectAttemptCancellation.class, str);
    }

    public static ConnectAttemptCancellation[] values() {
        return (ConnectAttemptCancellation[]) $VALUES.clone();
    }

    public ConnectAttemptCancellation(String str, int i) {
    }
}
