package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.model.ReplyAttributionSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConnectionsSharedItemKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectionsSharedItemKind[] $VALUES;
    public static final ConnectionsSharedItemKind FEED;
    public static final ConnectionsSharedItemKind FILE;
    public static final ConnectionsSharedItemKind GOAL;
    public static final ConnectionsSharedItemKind IDEA;
    public static final ConnectionsSharedItemKind SPACE;
    public final String wire;

    static {
        ConnectionsSharedItemKind connectionsSharedItemKind = new ConnectionsSharedItemKind("FEED", 0, "feed");
        FEED = connectionsSharedItemKind;
        ConnectionsSharedItemKind connectionsSharedItemKind2 = new ConnectionsSharedItemKind("IDEA", 1, "idea");
        IDEA = connectionsSharedItemKind2;
        ConnectionsSharedItemKind connectionsSharedItemKind3 = new ConnectionsSharedItemKind("GOAL", 2, ReplyAttributionSerializer.TYPE_GOAL);
        GOAL = connectionsSharedItemKind3;
        ConnectionsSharedItemKind connectionsSharedItemKind4 = new ConnectionsSharedItemKind("SPACE", 3, "space");
        SPACE = connectionsSharedItemKind4;
        ConnectionsSharedItemKind connectionsSharedItemKind5 = new ConnectionsSharedItemKind("FILE", 4, "file");
        FILE = connectionsSharedItemKind5;
        ConnectionsSharedItemKind[] connectionsSharedItemKindArr = {connectionsSharedItemKind, connectionsSharedItemKind2, connectionsSharedItemKind3, connectionsSharedItemKind4, connectionsSharedItemKind5};
        $VALUES = connectionsSharedItemKindArr;
        $ENTRIES = C3cG.A0w(connectionsSharedItemKindArr);
    }

    public static Ey9<ConnectionsSharedItemKind> getEntries() {
        return $ENTRIES;
    }

    public static ConnectionsSharedItemKind valueOf(String str) {
        return (ConnectionsSharedItemKind) Enum.valueOf(ConnectionsSharedItemKind.class, str);
    }

    public static ConnectionsSharedItemKind[] values() {
        return (ConnectionsSharedItemKind[]) $VALUES.clone();
    }

    public final String getWire() {
        return this.wire;
    }

    public ConnectionsSharedItemKind(String str, int i, String str2) {
        this.wire = str2;
    }
}
