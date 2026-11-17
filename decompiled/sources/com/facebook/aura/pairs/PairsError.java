package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PairsError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PairsError[] $VALUES;
    public static final PairsError ALREADY_CONFIRMED;
    public static final PairsError CONFLICT;
    public static final PairsError EXPIRED;
    public static final PairsError FAILED;
    public static final PairsError GONE;
    public static final PairsError INVALID_LINK;
    public static final PairsError LEVEL_UNAVAILABLE;
    public static final PairsError NOT_FOUND;
    public static final PairsError NOT_VERIFIED;
    public static final PairsError OPEN_INVITE_LIMIT;
    public static final PairsError RELATIONSHIP_LIMIT;
    public static final PairsError REQUEST_CHANGED;
    public static final PairsError SAFETY_CODE_NOT_READY;
    public static final PairsError UNAVAILABLE;
    public static final PairsError UNSUPPORTED_LINK;

    static {
        PairsError pairsError = new PairsError("UNAVAILABLE", 0);
        UNAVAILABLE = pairsError;
        PairsError pairsError2 = new PairsError("NOT_FOUND", 1);
        NOT_FOUND = pairsError2;
        PairsError pairsError3 = new PairsError("NOT_VERIFIED", 2);
        NOT_VERIFIED = pairsError3;
        PairsError pairsError4 = new PairsError("CONFLICT", 3);
        CONFLICT = pairsError4;
        PairsError pairsError5 = new PairsError("OPEN_INVITE_LIMIT", 4);
        OPEN_INVITE_LIMIT = pairsError5;
        PairsError pairsError6 = new PairsError("LEVEL_UNAVAILABLE", 5);
        LEVEL_UNAVAILABLE = pairsError6;
        PairsError pairsError7 = new PairsError("REQUEST_CHANGED", 6);
        REQUEST_CHANGED = pairsError7;
        PairsError pairsError8 = new PairsError("SAFETY_CODE_NOT_READY", 7);
        SAFETY_CODE_NOT_READY = pairsError8;
        PairsError pairsError9 = new PairsError("ALREADY_CONFIRMED", 8);
        ALREADY_CONFIRMED = pairsError9;
        PairsError pairsError10 = new PairsError("GONE", 9);
        GONE = pairsError10;
        PairsError pairsError11 = new PairsError("EXPIRED", 10);
        EXPIRED = pairsError11;
        PairsError pairsError12 = new PairsError("INVALID_LINK", 11);
        INVALID_LINK = pairsError12;
        PairsError pairsError13 = new PairsError("UNSUPPORTED_LINK", 12);
        UNSUPPORTED_LINK = pairsError13;
        PairsError pairsError14 = new PairsError("RELATIONSHIP_LIMIT", 13);
        RELATIONSHIP_LIMIT = pairsError14;
        PairsError pairsError15 = new PairsError(CvmMigrationStatusJson.STAGE_FAILED, 14);
        FAILED = pairsError15;
        PairsError[] pairsErrorArr = {pairsError, pairsError2, pairsError3, pairsError4, pairsError5, pairsError6, pairsError7, pairsError8, pairsError9, pairsError10, pairsError11, pairsError12, pairsError13, pairsError14, pairsError15};
        $VALUES = pairsErrorArr;
        $ENTRIES = C3cG.A0w(pairsErrorArr);
    }

    public static Ey9<PairsError> getEntries() {
        return $ENTRIES;
    }

    public static PairsError valueOf(String str) {
        return (PairsError) Enum.valueOf(PairsError.class, str);
    }

    public static PairsError[] values() {
        return (PairsError[]) $VALUES.clone();
    }

    public PairsError(String str, int i) {
    }
}
