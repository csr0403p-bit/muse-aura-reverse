package com.facebook.aura.nodes.core;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NodeCommandAvailability {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NodeCommandAvailability[] $VALUES;
    public static final NodeCommandAvailability ALWAYS;
    public static final NodeCommandAvailability DEFAULT_ASSISTANT_ONLY;
    public static final NodeCommandAvailability NON_DEFAULT_ASSISTANT_ONLY;

    static {
        NodeCommandAvailability nodeCommandAvailability = new NodeCommandAvailability("ALWAYS", 0);
        ALWAYS = nodeCommandAvailability;
        NodeCommandAvailability nodeCommandAvailability2 = new NodeCommandAvailability("DEFAULT_ASSISTANT_ONLY", 1);
        DEFAULT_ASSISTANT_ONLY = nodeCommandAvailability2;
        NodeCommandAvailability nodeCommandAvailability3 = new NodeCommandAvailability("NON_DEFAULT_ASSISTANT_ONLY", 2);
        NON_DEFAULT_ASSISTANT_ONLY = nodeCommandAvailability3;
        NodeCommandAvailability[] nodeCommandAvailabilityArr = {nodeCommandAvailability, nodeCommandAvailability2, nodeCommandAvailability3};
        $VALUES = nodeCommandAvailabilityArr;
        $ENTRIES = C3cG.A0w(nodeCommandAvailabilityArr);
    }

    public static Ey9<NodeCommandAvailability> getEntries() {
        return $ENTRIES;
    }

    public static NodeCommandAvailability valueOf(String str) {
        return (NodeCommandAvailability) Enum.valueOf(NodeCommandAvailability.class, str);
    }

    public static NodeCommandAvailability[] values() {
        return (NodeCommandAvailability[]) $VALUES.clone();
    }

    public NodeCommandAvailability(String str, int i) {
    }
}
