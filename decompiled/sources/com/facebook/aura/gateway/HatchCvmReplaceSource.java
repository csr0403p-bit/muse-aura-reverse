package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCvmReplaceSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCvmReplaceSource[] $VALUES;
    public static final HatchCvmReplaceSource CONNECT;
    public static final HatchCvmReplaceSource FETCH_VMS;
    public static final HatchCvmReplaceSource POLL;
    public static final HatchCvmReplaceSource PUSH;

    static {
        HatchCvmReplaceSource hatchCvmReplaceSource = new HatchCvmReplaceSource("PUSH", 0);
        PUSH = hatchCvmReplaceSource;
        HatchCvmReplaceSource hatchCvmReplaceSource2 = new HatchCvmReplaceSource("POLL", 1);
        POLL = hatchCvmReplaceSource2;
        HatchCvmReplaceSource hatchCvmReplaceSource3 = new HatchCvmReplaceSource("CONNECT", 2);
        CONNECT = hatchCvmReplaceSource3;
        HatchCvmReplaceSource hatchCvmReplaceSource4 = new HatchCvmReplaceSource("FETCH_VMS", 3);
        FETCH_VMS = hatchCvmReplaceSource4;
        HatchCvmReplaceSource[] hatchCvmReplaceSourceArr = {hatchCvmReplaceSource, hatchCvmReplaceSource2, hatchCvmReplaceSource3, hatchCvmReplaceSource4};
        $VALUES = hatchCvmReplaceSourceArr;
        $ENTRIES = C3cG.A0w(hatchCvmReplaceSourceArr);
    }

    public static Ey9<HatchCvmReplaceSource> getEntries() {
        return $ENTRIES;
    }

    public static HatchCvmReplaceSource valueOf(String str) {
        return (HatchCvmReplaceSource) Enum.valueOf(HatchCvmReplaceSource.class, str);
    }

    public static HatchCvmReplaceSource[] values() {
        return (HatchCvmReplaceSource[]) $VALUES.clone();
    }

    public HatchCvmReplaceSource(String str, int i) {
    }
}
