package com.facebook.aura.vds.compose.swipeable;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AnchoredDragOrientation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AnchoredDragOrientation[] $VALUES;
    public static final AnchoredDragOrientation EndToStart;
    public static final AnchoredDragOrientation StartToEnd;

    static {
        AnchoredDragOrientation anchoredDragOrientation = new AnchoredDragOrientation("EndToStart", 0);
        EndToStart = anchoredDragOrientation;
        AnchoredDragOrientation anchoredDragOrientation2 = new AnchoredDragOrientation("StartToEnd", 1);
        StartToEnd = anchoredDragOrientation2;
        AnchoredDragOrientation[] anchoredDragOrientationArr = {anchoredDragOrientation, anchoredDragOrientation2};
        $VALUES = anchoredDragOrientationArr;
        $ENTRIES = C3cG.A0w(anchoredDragOrientationArr);
    }

    public static Ey9<AnchoredDragOrientation> getEntries() {
        return $ENTRIES;
    }

    public static AnchoredDragOrientation valueOf(String str) {
        return (AnchoredDragOrientation) Enum.valueOf(AnchoredDragOrientation.class, str);
    }

    public static AnchoredDragOrientation[] values() {
        return (AnchoredDragOrientation[]) $VALUES.clone();
    }

    public AnchoredDragOrientation(String str, int i) {
    }
}
