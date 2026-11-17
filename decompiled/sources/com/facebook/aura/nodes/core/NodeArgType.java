package com.facebook.aura.nodes.core;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NodeArgType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NodeArgType[] $VALUES;
    public static final NodeArgType ARRAY;
    public static final NodeArgType BOOLEAN;
    public static final Companion Companion;
    public static final NodeArgType INTEGER;
    public static final NodeArgType NUMBER;
    public static final NodeArgType STRING;
    public final String jsonValue;

    static {
        NodeArgType nodeArgType = new NodeArgType("STRING", 0, "string");
        STRING = nodeArgType;
        NodeArgType nodeArgType2 = new NodeArgType("INTEGER", 1, "integer");
        INTEGER = nodeArgType2;
        NodeArgType nodeArgType3 = new NodeArgType("NUMBER", 2, "number");
        NUMBER = nodeArgType3;
        NodeArgType nodeArgType4 = new NodeArgType("BOOLEAN", 3, "boolean");
        BOOLEAN = nodeArgType4;
        NodeArgType nodeArgType5 = new NodeArgType("ARRAY", 4, "array");
        ARRAY = nodeArgType5;
        NodeArgType[] nodeArgTypeArr = {nodeArgType, nodeArgType2, nodeArgType3, nodeArgType4, nodeArgType5};
        $VALUES = nodeArgTypeArr;
        $ENTRIES = C3cG.A0w(nodeArgTypeArr);
        Companion = new Companion();
    }

    public static Ey9<NodeArgType> getEntries() {
        return $ENTRIES;
    }

    public static NodeArgType valueOf(String str) {
        return (NodeArgType) Enum.valueOf(NodeArgType.class, str);
    }

    public static NodeArgType[] values() {
        return (NodeArgType[]) $VALUES.clone();
    }

    public final String getJsonValue() {
        return this.jsonValue;
    }

    public final class Companion {
        public final NodeArgType fromJson(String str) {
            NodeArgType next;
            C7384Etj.A0Y(str, 0);
            Iterator<NodeArgType> it = NodeArgType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getJsonValue())) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public NodeArgType(String str, int i, String str2) {
        this.jsonValue = str2;
    }
}
