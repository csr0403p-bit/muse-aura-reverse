package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConnectionsActivityKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectionsActivityKind[] $VALUES;
    public static final ConnectionsActivityKind CONFIRM_NEEDED;
    public static final ConnectionsActivityKind CONNECTED;
    public static final ConnectionsActivityKind FILE_SHARED;
    public static final ConnectionsActivityKind GOAL_UPDATED;
    public static final ConnectionsActivityKind ITEM_SHARED;
    public static final ConnectionsActivityKind LINK_SHARED;
    public static final ConnectionsActivityKind REQUEST_ACCEPTED;
    public static final ConnectionsActivityKind REQUEST_RECEIVED;
    public static final ConnectionsActivityKind SPACE_SHARED;
    public final String wire;

    static {
        ConnectionsActivityKind connectionsActivityKind = new ConnectionsActivityKind("REQUEST_RECEIVED", 0, ConnectionsActivityKt.KIND_REQUEST_RECEIVED);
        REQUEST_RECEIVED = connectionsActivityKind;
        ConnectionsActivityKind connectionsActivityKind2 = new ConnectionsActivityKind("REQUEST_ACCEPTED", 1, ConnectionsActivityKt.KIND_REQUEST_ACCEPTED);
        REQUEST_ACCEPTED = connectionsActivityKind2;
        ConnectionsActivityKind connectionsActivityKind3 = new ConnectionsActivityKind("CONNECTED", 2, "connected");
        CONNECTED = connectionsActivityKind3;
        ConnectionsActivityKind connectionsActivityKind4 = new ConnectionsActivityKind("CONFIRM_NEEDED", 3, ConnectionsActivityKt.KIND_CONFIRM_NEEDED);
        CONFIRM_NEEDED = connectionsActivityKind4;
        ConnectionsActivityKind connectionsActivityKind5 = new ConnectionsActivityKind("FILE_SHARED", 4, ConnectionsActivityKt.KIND_FILE_SHARED);
        FILE_SHARED = connectionsActivityKind5;
        ConnectionsActivityKind connectionsActivityKind6 = new ConnectionsActivityKind("SPACE_SHARED", 5, ConnectionsActivityKt.KIND_SPACE_SHARED);
        SPACE_SHARED = connectionsActivityKind6;
        ConnectionsActivityKind connectionsActivityKind7 = new ConnectionsActivityKind("ITEM_SHARED", 6, null);
        ITEM_SHARED = connectionsActivityKind7;
        ConnectionsActivityKind connectionsActivityKind8 = new ConnectionsActivityKind("GOAL_UPDATED", 7, ConnectionsActivityKt.KIND_GOAL_UPDATED);
        GOAL_UPDATED = connectionsActivityKind8;
        ConnectionsActivityKind connectionsActivityKind9 = new ConnectionsActivityKind("LINK_SHARED", 8, ConnectionsActivityKt.KIND_LINK_SHARED);
        LINK_SHARED = connectionsActivityKind9;
        ConnectionsActivityKind[] connectionsActivityKindArr = {connectionsActivityKind, connectionsActivityKind2, connectionsActivityKind3, connectionsActivityKind4, connectionsActivityKind5, connectionsActivityKind6, connectionsActivityKind7, connectionsActivityKind8, connectionsActivityKind9};
        $VALUES = connectionsActivityKindArr;
        $ENTRIES = C3cG.A0w(connectionsActivityKindArr);
    }

    public static Ey9<ConnectionsActivityKind> getEntries() {
        return $ENTRIES;
    }

    public static ConnectionsActivityKind valueOf(String str) {
        return (ConnectionsActivityKind) Enum.valueOf(ConnectionsActivityKind.class, str);
    }

    public static ConnectionsActivityKind[] values() {
        return (ConnectionsActivityKind[]) $VALUES.clone();
    }

    public final String getWire() {
        return this.wire;
    }

    public ConnectionsActivityKind(String str, int i, String str2) {
        this.wire = str2;
    }
}
