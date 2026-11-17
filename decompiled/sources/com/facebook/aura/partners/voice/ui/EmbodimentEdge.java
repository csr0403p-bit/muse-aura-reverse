package com.facebook.aura.partners.voice.ui;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class EmbodimentEdge {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmbodimentEdge[] $VALUES;
    public static final EmbodimentEdge BOTTOM;
    public static final EmbodimentEdge TOP;

    static {
        EmbodimentEdge embodimentEdge = new EmbodimentEdge("TOP", 0);
        TOP = embodimentEdge;
        EmbodimentEdge embodimentEdge2 = new EmbodimentEdge("BOTTOM", 1);
        BOTTOM = embodimentEdge2;
        EmbodimentEdge[] embodimentEdgeArr = {embodimentEdge, embodimentEdge2};
        $VALUES = embodimentEdgeArr;
        $ENTRIES = C3cG.A0w(embodimentEdgeArr);
    }

    public static Ey9<EmbodimentEdge> getEntries() {
        return $ENTRIES;
    }

    public static EmbodimentEdge valueOf(String str) {
        return (EmbodimentEdge) Enum.valueOf(EmbodimentEdge.class, str);
    }

    public static EmbodimentEdge[] values() {
        return (EmbodimentEdge[]) $VALUES.clone();
    }

    public EmbodimentEdge(String str, int i) {
    }
}
