package com.facebook.aura.nodes.core;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NodeCommandDeviceRequirement {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NodeCommandDeviceRequirement[] $VALUES;
    public static final NodeCommandDeviceRequirement NONE;
    public static final NodeCommandDeviceRequirement TELEPHONY_CALLING;
    public static final NodeCommandDeviceRequirement TELEPHONY_MESSAGING;

    static {
        NodeCommandDeviceRequirement nodeCommandDeviceRequirement = new NodeCommandDeviceRequirement(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        NONE = nodeCommandDeviceRequirement;
        NodeCommandDeviceRequirement nodeCommandDeviceRequirement2 = new NodeCommandDeviceRequirement("TELEPHONY_MESSAGING", 1);
        TELEPHONY_MESSAGING = nodeCommandDeviceRequirement2;
        NodeCommandDeviceRequirement nodeCommandDeviceRequirement3 = new NodeCommandDeviceRequirement("TELEPHONY_CALLING", 2);
        TELEPHONY_CALLING = nodeCommandDeviceRequirement3;
        NodeCommandDeviceRequirement[] nodeCommandDeviceRequirementArr = {nodeCommandDeviceRequirement, nodeCommandDeviceRequirement2, nodeCommandDeviceRequirement3};
        $VALUES = nodeCommandDeviceRequirementArr;
        $ENTRIES = C3cG.A0w(nodeCommandDeviceRequirementArr);
    }

    public static Ey9<NodeCommandDeviceRequirement> getEntries() {
        return $ENTRIES;
    }

    public static NodeCommandDeviceRequirement valueOf(String str) {
        return (NodeCommandDeviceRequirement) Enum.valueOf(NodeCommandDeviceRequirement.class, str);
    }

    public static NodeCommandDeviceRequirement[] values() {
        return (NodeCommandDeviceRequirement[]) $VALUES.clone();
    }

    public NodeCommandDeviceRequirement(String str, int i) {
    }
}
