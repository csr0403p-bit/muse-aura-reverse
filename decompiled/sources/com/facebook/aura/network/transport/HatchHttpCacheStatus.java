package com.facebook.aura.network.transport;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchHttpCacheStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchHttpCacheStatus[] $VALUES;
    public static final HatchHttpCacheStatus HIT_FRESH;
    public static final HatchHttpCacheStatus HIT_STALE;
    public static final HatchHttpCacheStatus MISS;
    public static final HatchHttpCacheStatus NETWORK;

    static {
        HatchHttpCacheStatus hatchHttpCacheStatus = new HatchHttpCacheStatus("NETWORK", 0);
        NETWORK = hatchHttpCacheStatus;
        HatchHttpCacheStatus hatchHttpCacheStatus2 = new HatchHttpCacheStatus("MISS", 1);
        MISS = hatchHttpCacheStatus2;
        HatchHttpCacheStatus hatchHttpCacheStatus3 = new HatchHttpCacheStatus("HIT_FRESH", 2);
        HIT_FRESH = hatchHttpCacheStatus3;
        HatchHttpCacheStatus hatchHttpCacheStatus4 = new HatchHttpCacheStatus("HIT_STALE", 3);
        HIT_STALE = hatchHttpCacheStatus4;
        HatchHttpCacheStatus[] hatchHttpCacheStatusArr = {hatchHttpCacheStatus, hatchHttpCacheStatus2, hatchHttpCacheStatus3, hatchHttpCacheStatus4};
        $VALUES = hatchHttpCacheStatusArr;
        $ENTRIES = C3cG.A0w(hatchHttpCacheStatusArr);
    }

    public static Ey9<HatchHttpCacheStatus> getEntries() {
        return $ENTRIES;
    }

    public static HatchHttpCacheStatus valueOf(String str) {
        return (HatchHttpCacheStatus) Enum.valueOf(HatchHttpCacheStatus.class, str);
    }

    public static HatchHttpCacheStatus[] values() {
        return (HatchHttpCacheStatus[]) $VALUES.clone();
    }

    public HatchHttpCacheStatus(String str, int i) {
    }
}
