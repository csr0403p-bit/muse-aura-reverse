package com.facebook.aura.gateway.connection;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ConnectionDemandOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectionDemandOutcome[] $VALUES;
    public static final ConnectionDemandOutcome BACKGROUND;
    public static final ConnectionDemandOutcome CONNECTED;
    public static final ConnectionDemandOutcome OFFLINE;
    public static final ConnectionDemandOutcome PAUSED;
    public static final ConnectionDemandOutcome RETRY_EXHAUSTED;
    public static final ConnectionDemandOutcome UNAVAILABLE;

    static {
        ConnectionDemandOutcome connectionDemandOutcome = new ConnectionDemandOutcome("CONNECTED", 0);
        CONNECTED = connectionDemandOutcome;
        ConnectionDemandOutcome connectionDemandOutcome2 = new ConnectionDemandOutcome("BACKGROUND", 1);
        BACKGROUND = connectionDemandOutcome2;
        ConnectionDemandOutcome connectionDemandOutcome3 = new ConnectionDemandOutcome("OFFLINE", 2);
        OFFLINE = connectionDemandOutcome3;
        ConnectionDemandOutcome connectionDemandOutcome4 = new ConnectionDemandOutcome("PAUSED", 3);
        PAUSED = connectionDemandOutcome4;
        ConnectionDemandOutcome connectionDemandOutcome5 = new ConnectionDemandOutcome("RETRY_EXHAUSTED", 4);
        RETRY_EXHAUSTED = connectionDemandOutcome5;
        ConnectionDemandOutcome connectionDemandOutcome6 = new ConnectionDemandOutcome("UNAVAILABLE", 5);
        UNAVAILABLE = connectionDemandOutcome6;
        ConnectionDemandOutcome[] connectionDemandOutcomeArr = {connectionDemandOutcome, connectionDemandOutcome2, connectionDemandOutcome3, connectionDemandOutcome4, connectionDemandOutcome5, connectionDemandOutcome6};
        $VALUES = connectionDemandOutcomeArr;
        $ENTRIES = C3cG.A0w(connectionDemandOutcomeArr);
    }

    public static Ey9<ConnectionDemandOutcome> getEntries() {
        return $ENTRIES;
    }

    public static ConnectionDemandOutcome valueOf(String str) {
        return (ConnectionDemandOutcome) Enum.valueOf(ConnectionDemandOutcome.class, str);
    }

    public static ConnectionDemandOutcome[] values() {
        return (ConnectionDemandOutcome[]) $VALUES.clone();
    }

    public ConnectionDemandOutcome(String str, int i) {
    }
}
