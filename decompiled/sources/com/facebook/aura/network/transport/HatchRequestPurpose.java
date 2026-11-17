package com.facebook.aura.network.transport;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchRequestPurpose {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchRequestPurpose[] $VALUES;
    public static final HatchRequestPurpose FETCH;
    public static final HatchRequestPurpose PREFETCH;

    static {
        HatchRequestPurpose hatchRequestPurpose = new HatchRequestPurpose("FETCH", 0);
        FETCH = hatchRequestPurpose;
        HatchRequestPurpose hatchRequestPurpose2 = new HatchRequestPurpose("PREFETCH", 1);
        PREFETCH = hatchRequestPurpose2;
        HatchRequestPurpose[] hatchRequestPurposeArr = {hatchRequestPurpose, hatchRequestPurpose2};
        $VALUES = hatchRequestPurposeArr;
        $ENTRIES = C3cG.A0w(hatchRequestPurposeArr);
    }

    public static Ey9<HatchRequestPurpose> getEntries() {
        return $ENTRIES;
    }

    public static HatchRequestPurpose valueOf(String str) {
        return (HatchRequestPurpose) Enum.valueOf(HatchRequestPurpose.class, str);
    }

    public static HatchRequestPurpose[] values() {
        return (HatchRequestPurpose[]) $VALUES.clone();
    }

    public HatchRequestPurpose(String str, int i) {
    }
}
