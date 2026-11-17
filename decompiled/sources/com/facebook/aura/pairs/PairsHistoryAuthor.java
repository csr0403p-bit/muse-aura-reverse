package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PairsHistoryAuthor {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PairsHistoryAuthor[] $VALUES;
    public static final PairsHistoryAuthor OWN_AGENT;
    public static final PairsHistoryAuthor PEER_AGENT;
    public static final PairsHistoryAuthor PEER_HUMAN;
    public final String wireValue;

    static {
        PairsHistoryAuthor pairsHistoryAuthor = new PairsHistoryAuthor("OWN_AGENT", 0, "own_agent");
        OWN_AGENT = pairsHistoryAuthor;
        PairsHistoryAuthor pairsHistoryAuthor2 = new PairsHistoryAuthor("PEER_AGENT", 1, "peer_agent");
        PEER_AGENT = pairsHistoryAuthor2;
        PairsHistoryAuthor pairsHistoryAuthor3 = new PairsHistoryAuthor("PEER_HUMAN", 2, "peer_human");
        PEER_HUMAN = pairsHistoryAuthor3;
        PairsHistoryAuthor[] pairsHistoryAuthorArr = {pairsHistoryAuthor, pairsHistoryAuthor2, pairsHistoryAuthor3};
        $VALUES = pairsHistoryAuthorArr;
        $ENTRIES = C3cG.A0w(pairsHistoryAuthorArr);
    }

    public static Ey9<PairsHistoryAuthor> getEntries() {
        return $ENTRIES;
    }

    public static PairsHistoryAuthor valueOf(String str) {
        return (PairsHistoryAuthor) Enum.valueOf(PairsHistoryAuthor.class, str);
    }

    public static PairsHistoryAuthor[] values() {
        return (PairsHistoryAuthor[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public PairsHistoryAuthor(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
