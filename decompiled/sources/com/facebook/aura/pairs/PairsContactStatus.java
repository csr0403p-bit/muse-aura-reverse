package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PairsContactStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PairsContactStatus[] $VALUES;
    public static final PairsContactStatus EXPIRED;
    public static final PairsContactStatus IDENTITY_CHANGED;
    public static final PairsContactStatus IN_PROGRESS;
    public static final PairsContactStatus VERIFIED;

    static {
        PairsContactStatus pairsContactStatus = new PairsContactStatus("IN_PROGRESS", 0);
        IN_PROGRESS = pairsContactStatus;
        PairsContactStatus pairsContactStatus2 = new PairsContactStatus("VERIFIED", 1);
        VERIFIED = pairsContactStatus2;
        PairsContactStatus pairsContactStatus3 = new PairsContactStatus("EXPIRED", 2);
        EXPIRED = pairsContactStatus3;
        PairsContactStatus pairsContactStatus4 = new PairsContactStatus("IDENTITY_CHANGED", 3);
        IDENTITY_CHANGED = pairsContactStatus4;
        PairsContactStatus[] pairsContactStatusArr = {pairsContactStatus, pairsContactStatus2, pairsContactStatus3, pairsContactStatus4};
        $VALUES = pairsContactStatusArr;
        $ENTRIES = C3cG.A0w(pairsContactStatusArr);
    }

    public static Ey9<PairsContactStatus> getEntries() {
        return $ENTRIES;
    }

    public static PairsContactStatus valueOf(String str) {
        return (PairsContactStatus) Enum.valueOf(PairsContactStatus.class, str);
    }

    public static PairsContactStatus[] values() {
        return (PairsContactStatus[]) $VALUES.clone();
    }

    public PairsContactStatus(String str, int i) {
    }
}
