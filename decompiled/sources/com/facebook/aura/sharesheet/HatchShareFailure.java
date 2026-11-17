package com.facebook.aura.sharesheet;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchShareFailure {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchShareFailure[] $VALUES;
    public static final HatchShareFailure MEDIA_PROCESSING;
    public static final HatchShareFailure SEND;

    static {
        HatchShareFailure hatchShareFailure = new HatchShareFailure("SEND", 0);
        SEND = hatchShareFailure;
        HatchShareFailure hatchShareFailure2 = new HatchShareFailure("MEDIA_PROCESSING", 1);
        MEDIA_PROCESSING = hatchShareFailure2;
        HatchShareFailure[] hatchShareFailureArr = {hatchShareFailure, hatchShareFailure2};
        $VALUES = hatchShareFailureArr;
        $ENTRIES = new F3w(hatchShareFailureArr);
    }

    public static Ey9<HatchShareFailure> getEntries() {
        return $ENTRIES;
    }

    public static HatchShareFailure valueOf(String str) {
        return (HatchShareFailure) Enum.valueOf(HatchShareFailure.class, str);
    }

    public static HatchShareFailure[] values() {
        return (HatchShareFailure[]) $VALUES.clone();
    }

    public HatchShareFailure(String str, int i) {
    }
}
