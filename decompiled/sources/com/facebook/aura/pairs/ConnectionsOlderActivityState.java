package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConnectionsOlderActivityState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectionsOlderActivityState[] $VALUES;
    public static final ConnectionsOlderActivityState FAILED;
    public static final ConnectionsOlderActivityState IDLE;
    public static final ConnectionsOlderActivityState LOADING;

    static {
        ConnectionsOlderActivityState connectionsOlderActivityState = new ConnectionsOlderActivityState("IDLE", 0);
        IDLE = connectionsOlderActivityState;
        ConnectionsOlderActivityState connectionsOlderActivityState2 = new ConnectionsOlderActivityState("LOADING", 1);
        LOADING = connectionsOlderActivityState2;
        ConnectionsOlderActivityState connectionsOlderActivityState3 = new ConnectionsOlderActivityState(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = connectionsOlderActivityState3;
        ConnectionsOlderActivityState[] connectionsOlderActivityStateArr = {connectionsOlderActivityState, connectionsOlderActivityState2, connectionsOlderActivityState3};
        $VALUES = connectionsOlderActivityStateArr;
        $ENTRIES = C3cG.A0w(connectionsOlderActivityStateArr);
    }

    public static Ey9<ConnectionsOlderActivityState> getEntries() {
        return $ENTRIES;
    }

    public static ConnectionsOlderActivityState valueOf(String str) {
        return (ConnectionsOlderActivityState) Enum.valueOf(ConnectionsOlderActivityState.class, str);
    }

    public static ConnectionsOlderActivityState[] values() {
        return (ConnectionsOlderActivityState[]) $VALUES.clone();
    }

    public ConnectionsOlderActivityState(String str, int i) {
    }
}
