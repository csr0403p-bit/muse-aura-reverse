package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PairsStatusKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PairsStatusKind[] $VALUES;
    public static final PairsStatusKind EXPIRED;
    public static final PairsStatusKind GONE;
    public static final PairsStatusKind IDENTITY_CHANGED;
    public static final PairsStatusKind PROMPT;
    public static final PairsStatusKind UNAVAILABLE;
    public static final PairsStatusKind UNREACHABLE;
    public static final PairsStatusKind VERIFIED;
    public static final PairsStatusKind WAITING;

    static {
        PairsStatusKind pairsStatusKind = new PairsStatusKind("WAITING", 0);
        WAITING = pairsStatusKind;
        PairsStatusKind pairsStatusKind2 = new PairsStatusKind("PROMPT", 1);
        PROMPT = pairsStatusKind2;
        PairsStatusKind pairsStatusKind3 = new PairsStatusKind("VERIFIED", 2);
        VERIFIED = pairsStatusKind3;
        PairsStatusKind pairsStatusKind4 = new PairsStatusKind("UNREACHABLE", 3);
        UNREACHABLE = pairsStatusKind4;
        PairsStatusKind pairsStatusKind5 = new PairsStatusKind("EXPIRED", 4);
        EXPIRED = pairsStatusKind5;
        PairsStatusKind pairsStatusKind6 = new PairsStatusKind("IDENTITY_CHANGED", 5);
        IDENTITY_CHANGED = pairsStatusKind6;
        PairsStatusKind pairsStatusKind7 = new PairsStatusKind("UNAVAILABLE", 6);
        UNAVAILABLE = pairsStatusKind7;
        PairsStatusKind pairsStatusKind8 = new PairsStatusKind("GONE", 7);
        GONE = pairsStatusKind8;
        PairsStatusKind[] pairsStatusKindArr = {pairsStatusKind, pairsStatusKind2, pairsStatusKind3, pairsStatusKind4, pairsStatusKind5, pairsStatusKind6, pairsStatusKind7, pairsStatusKind8};
        $VALUES = pairsStatusKindArr;
        $ENTRIES = C3cG.A0w(pairsStatusKindArr);
    }

    public static Ey9<PairsStatusKind> getEntries() {
        return $ENTRIES;
    }

    public static PairsStatusKind valueOf(String str) {
        return (PairsStatusKind) Enum.valueOf(PairsStatusKind.class, str);
    }

    public static PairsStatusKind[] values() {
        return (PairsStatusKind[]) $VALUES.clone();
    }

    public final boolean isTerminal() {
        return this == VERIFIED || this == EXPIRED || this == IDENTITY_CHANGED || this == GONE;
    }

    public PairsStatusKind(String str, int i) {
    }
}
