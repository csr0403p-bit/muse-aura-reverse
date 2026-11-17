package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConnectionsSharePhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectionsSharePhase[] $VALUES;
    public static final ConnectionsSharePhase EMPTY;
    public static final ConnectionsSharePhase FAILED;
    public static final ConnectionsSharePhase LOADING;
    public static final ConnectionsSharePhase READY;
    public static final ConnectionsSharePhase UNAVAILABLE;

    static {
        ConnectionsSharePhase connectionsSharePhase = new ConnectionsSharePhase("LOADING", 0);
        LOADING = connectionsSharePhase;
        ConnectionsSharePhase connectionsSharePhase2 = new ConnectionsSharePhase("READY", 1);
        READY = connectionsSharePhase2;
        ConnectionsSharePhase connectionsSharePhase3 = new ConnectionsSharePhase("EMPTY", 2);
        EMPTY = connectionsSharePhase3;
        ConnectionsSharePhase connectionsSharePhase4 = new ConnectionsSharePhase("UNAVAILABLE", 3);
        UNAVAILABLE = connectionsSharePhase4;
        ConnectionsSharePhase connectionsSharePhase5 = new ConnectionsSharePhase(CvmMigrationStatusJson.STAGE_FAILED, 4);
        FAILED = connectionsSharePhase5;
        ConnectionsSharePhase[] connectionsSharePhaseArr = {connectionsSharePhase, connectionsSharePhase2, connectionsSharePhase3, connectionsSharePhase4, connectionsSharePhase5};
        $VALUES = connectionsSharePhaseArr;
        $ENTRIES = C3cG.A0w(connectionsSharePhaseArr);
    }

    public static Ey9<ConnectionsSharePhase> getEntries() {
        return $ENTRIES;
    }

    public static ConnectionsSharePhase valueOf(String str) {
        return (ConnectionsSharePhase) Enum.valueOf(ConnectionsSharePhase.class, str);
    }

    public static ConnectionsSharePhase[] values() {
        return (ConnectionsSharePhase[]) $VALUES.clone();
    }

    public ConnectionsSharePhase(String str, int i) {
    }
}
