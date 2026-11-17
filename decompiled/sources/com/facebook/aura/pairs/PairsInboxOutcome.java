package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PairsInboxOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PairsInboxOutcome[] $VALUES;
    public static final PairsInboxOutcome CONTRACT_MISMATCH;
    public static final PairsInboxOutcome DECLINE;
    public static final PairsInboxOutcome DELIVERED;
    public static final PairsInboxOutcome RETRY;

    static {
        PairsInboxOutcome pairsInboxOutcome = new PairsInboxOutcome("DELIVERED", 0);
        DELIVERED = pairsInboxOutcome;
        PairsInboxOutcome pairsInboxOutcome2 = new PairsInboxOutcome("DECLINE", 1);
        DECLINE = pairsInboxOutcome2;
        PairsInboxOutcome pairsInboxOutcome3 = new PairsInboxOutcome("RETRY", 2);
        RETRY = pairsInboxOutcome3;
        PairsInboxOutcome pairsInboxOutcome4 = new PairsInboxOutcome("CONTRACT_MISMATCH", 3);
        CONTRACT_MISMATCH = pairsInboxOutcome4;
        PairsInboxOutcome[] pairsInboxOutcomeArr = {pairsInboxOutcome, pairsInboxOutcome2, pairsInboxOutcome3, pairsInboxOutcome4};
        $VALUES = pairsInboxOutcomeArr;
        $ENTRIES = C3cG.A0w(pairsInboxOutcomeArr);
    }

    public static Ey9<PairsInboxOutcome> getEntries() {
        return $ENTRIES;
    }

    public static PairsInboxOutcome valueOf(String str) {
        return (PairsInboxOutcome) Enum.valueOf(PairsInboxOutcome.class, str);
    }

    public static PairsInboxOutcome[] values() {
        return (PairsInboxOutcome[]) $VALUES.clone();
    }

    public PairsInboxOutcome(String str, int i) {
    }
}
