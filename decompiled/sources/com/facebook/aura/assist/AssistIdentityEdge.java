package com.facebook.aura.assist;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AssistIdentityEdge {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AssistIdentityEdge[] $VALUES;
    public static final AssistIdentityEdge BOTTOM;
    public static final AssistIdentityEdge LEFT;
    public static final AssistIdentityEdge RIGHT;
    public static final AssistIdentityEdge TOP;

    static {
        AssistIdentityEdge assistIdentityEdge = new AssistIdentityEdge("LEFT", 0);
        LEFT = assistIdentityEdge;
        AssistIdentityEdge assistIdentityEdge2 = new AssistIdentityEdge("TOP", 1);
        TOP = assistIdentityEdge2;
        AssistIdentityEdge assistIdentityEdge3 = new AssistIdentityEdge("RIGHT", 2);
        RIGHT = assistIdentityEdge3;
        AssistIdentityEdge assistIdentityEdge4 = new AssistIdentityEdge("BOTTOM", 3);
        BOTTOM = assistIdentityEdge4;
        AssistIdentityEdge[] assistIdentityEdgeArr = {assistIdentityEdge, assistIdentityEdge2, assistIdentityEdge3, assistIdentityEdge4};
        $VALUES = assistIdentityEdgeArr;
        $ENTRIES = C3cG.A0w(assistIdentityEdgeArr);
    }

    public static Ey9<AssistIdentityEdge> getEntries() {
        return $ENTRIES;
    }

    public static AssistIdentityEdge valueOf(String str) {
        return (AssistIdentityEdge) Enum.valueOf(AssistIdentityEdge.class, str);
    }

    public static AssistIdentityEdge[] values() {
        return (AssistIdentityEdge[]) $VALUES.clone();
    }

    public AssistIdentityEdge(String str, int i) {
    }
}
