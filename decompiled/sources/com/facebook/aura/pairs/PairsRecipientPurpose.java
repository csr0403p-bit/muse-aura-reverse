package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PairsRecipientPurpose {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PairsRecipientPurpose[] $VALUES;
    public static final PairsRecipientPurpose ADD_CONNECTION;
    public static final PairsRecipientPurpose SHARE;
    public final String wireValue;

    static {
        PairsRecipientPurpose pairsRecipientPurpose = new PairsRecipientPurpose("ADD_CONNECTION", 0, "add_connection");
        ADD_CONNECTION = pairsRecipientPurpose;
        PairsRecipientPurpose pairsRecipientPurpose2 = new PairsRecipientPurpose("SHARE", 1, "share");
        SHARE = pairsRecipientPurpose2;
        PairsRecipientPurpose[] pairsRecipientPurposeArr = {pairsRecipientPurpose, pairsRecipientPurpose2};
        $VALUES = pairsRecipientPurposeArr;
        $ENTRIES = C3cG.A0w(pairsRecipientPurposeArr);
    }

    public static Ey9<PairsRecipientPurpose> getEntries() {
        return $ENTRIES;
    }

    public static PairsRecipientPurpose valueOf(String str) {
        return (PairsRecipientPurpose) Enum.valueOf(PairsRecipientPurpose.class, str);
    }

    public static PairsRecipientPurpose[] values() {
        return (PairsRecipientPurpose[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public PairsRecipientPurpose(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
