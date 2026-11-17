package com.facebook.aura.vds.compose.typegroup;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IconOrientation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ IconOrientation[] $VALUES;
    public static final IconOrientation MIDDLE;
    public static final IconOrientation TOP;

    static {
        IconOrientation iconOrientation = new IconOrientation("TOP", 0);
        TOP = iconOrientation;
        IconOrientation iconOrientation2 = new IconOrientation("MIDDLE", 1);
        MIDDLE = iconOrientation2;
        IconOrientation[] iconOrientationArr = {iconOrientation, iconOrientation2};
        $VALUES = iconOrientationArr;
        $ENTRIES = new F3w(iconOrientationArr);
    }

    public static Ey9<IconOrientation> getEntries() {
        return $ENTRIES;
    }

    public static IconOrientation valueOf(String str) {
        return (IconOrientation) Enum.valueOf(IconOrientation.class, str);
    }

    public static IconOrientation[] values() {
        return (IconOrientation[]) $VALUES.clone();
    }

    public IconOrientation(String str, int i) {
    }
}
