package com.facebook.aura.nodes.cards;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NodeCardAppKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NodeCardAppKind[] $VALUES;
    public static final NodeCardAppKind CLOCK;
    public static final NodeCardAppKind CONTACTS;
    public static final NodeCardAppKind DIALER;

    static {
        NodeCardAppKind nodeCardAppKind = new NodeCardAppKind("DIALER", 0);
        DIALER = nodeCardAppKind;
        NodeCardAppKind nodeCardAppKind2 = new NodeCardAppKind("CLOCK", 1);
        CLOCK = nodeCardAppKind2;
        NodeCardAppKind nodeCardAppKind3 = new NodeCardAppKind("CONTACTS", 2);
        CONTACTS = nodeCardAppKind3;
        NodeCardAppKind[] nodeCardAppKindArr = {nodeCardAppKind, nodeCardAppKind2, nodeCardAppKind3};
        $VALUES = nodeCardAppKindArr;
        $ENTRIES = C3cG.A0w(nodeCardAppKindArr);
    }

    public static Ey9<NodeCardAppKind> getEntries() {
        return $ENTRIES;
    }

    public static NodeCardAppKind valueOf(String str) {
        return (NodeCardAppKind) Enum.valueOf(NodeCardAppKind.class, str);
    }

    public static NodeCardAppKind[] values() {
        return (NodeCardAppKind[]) $VALUES.clone();
    }

    public NodeCardAppKind(String str, int i) {
    }
}
