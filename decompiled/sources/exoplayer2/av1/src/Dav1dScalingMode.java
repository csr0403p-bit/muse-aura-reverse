package exoplayer2.av1.src;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Dav1dScalingMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ Dav1dScalingMode[] $VALUES;
    public static final Dav1dScalingMode ASPECT_FILL;
    public static final Dav1dScalingMode ASPECT_FIT;
    public static final Dav1dScalingMode SCALE_FILL;
    public final int value;

    static {
        Dav1dScalingMode dav1dScalingMode = new Dav1dScalingMode("ASPECT_FILL", 0, 0);
        ASPECT_FILL = dav1dScalingMode;
        Dav1dScalingMode dav1dScalingMode2 = new Dav1dScalingMode("ASPECT_FIT", 1, 1);
        ASPECT_FIT = dav1dScalingMode2;
        Dav1dScalingMode dav1dScalingMode3 = new Dav1dScalingMode("SCALE_FILL", 2, 2);
        SCALE_FILL = dav1dScalingMode3;
        Dav1dScalingMode[] dav1dScalingModeArr = {dav1dScalingMode, dav1dScalingMode2, dav1dScalingMode3};
        $VALUES = dav1dScalingModeArr;
        $ENTRIES = new F3w(dav1dScalingModeArr);
    }

    public static Ey9<Dav1dScalingMode> getEntries() {
        return $ENTRIES;
    }

    public static Dav1dScalingMode valueOf(String str) {
        return (Dav1dScalingMode) Enum.valueOf(Dav1dScalingMode.class, str);
    }

    public static Dav1dScalingMode[] values() {
        return (Dav1dScalingMode[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public Dav1dScalingMode(String str, int i, int i2) {
        this.value = i2;
    }
}
