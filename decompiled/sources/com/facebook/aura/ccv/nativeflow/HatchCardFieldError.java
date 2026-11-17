package com.facebook.aura.ccv.nativeflow;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchCardFieldError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCardFieldError[] $VALUES;
    public static final HatchCardFieldError CSC_EMPTY;
    public static final HatchCardFieldError CSC_WRONG_LENGTH;
    public static final HatchCardFieldError EXPIRY_EMPTY;
    public static final HatchCardFieldError EXPIRY_MALFORMED;
    public static final HatchCardFieldError EXPIRY_MONTH_INVALID;
    public static final HatchCardFieldError EXPIRY_PAST;
    public static final HatchCardFieldError PAN_EMPTY;
    public static final HatchCardFieldError PAN_INCOMPLETE;
    public static final HatchCardFieldError PAN_INVALID;
    public static final HatchCardFieldError PAN_UNSUPPORTED_BRAND;
    public static final HatchCardFieldError ZIP_EMPTY;

    static {
        HatchCardFieldError hatchCardFieldError = new HatchCardFieldError("PAN_EMPTY", 0);
        PAN_EMPTY = hatchCardFieldError;
        HatchCardFieldError hatchCardFieldError2 = new HatchCardFieldError("PAN_INCOMPLETE", 1);
        PAN_INCOMPLETE = hatchCardFieldError2;
        HatchCardFieldError hatchCardFieldError3 = new HatchCardFieldError("PAN_INVALID", 2);
        PAN_INVALID = hatchCardFieldError3;
        HatchCardFieldError hatchCardFieldError4 = new HatchCardFieldError("PAN_UNSUPPORTED_BRAND", 3);
        PAN_UNSUPPORTED_BRAND = hatchCardFieldError4;
        HatchCardFieldError hatchCardFieldError5 = new HatchCardFieldError("EXPIRY_EMPTY", 4);
        EXPIRY_EMPTY = hatchCardFieldError5;
        HatchCardFieldError hatchCardFieldError6 = new HatchCardFieldError("EXPIRY_MALFORMED", 5);
        EXPIRY_MALFORMED = hatchCardFieldError6;
        HatchCardFieldError hatchCardFieldError7 = new HatchCardFieldError("EXPIRY_MONTH_INVALID", 6);
        EXPIRY_MONTH_INVALID = hatchCardFieldError7;
        HatchCardFieldError hatchCardFieldError8 = new HatchCardFieldError("EXPIRY_PAST", 7);
        EXPIRY_PAST = hatchCardFieldError8;
        HatchCardFieldError hatchCardFieldError9 = new HatchCardFieldError("CSC_EMPTY", 8);
        CSC_EMPTY = hatchCardFieldError9;
        HatchCardFieldError hatchCardFieldError10 = new HatchCardFieldError("CSC_WRONG_LENGTH", 9);
        CSC_WRONG_LENGTH = hatchCardFieldError10;
        HatchCardFieldError hatchCardFieldError11 = new HatchCardFieldError("ZIP_EMPTY", 10);
        ZIP_EMPTY = hatchCardFieldError11;
        HatchCardFieldError[] hatchCardFieldErrorArr = {hatchCardFieldError, hatchCardFieldError2, hatchCardFieldError3, hatchCardFieldError4, hatchCardFieldError5, hatchCardFieldError6, hatchCardFieldError7, hatchCardFieldError8, hatchCardFieldError9, hatchCardFieldError10, hatchCardFieldError11};
        $VALUES = hatchCardFieldErrorArr;
        $ENTRIES = C3cG.A0w(hatchCardFieldErrorArr);
    }

    public static Ey9<HatchCardFieldError> getEntries() {
        return $ENTRIES;
    }

    public static HatchCardFieldError valueOf(String str) {
        return (HatchCardFieldError) Enum.valueOf(HatchCardFieldError.class, str);
    }

    public static HatchCardFieldError[] values() {
        return (HatchCardFieldError[]) $VALUES.clone();
    }

    public HatchCardFieldError(String str, int i) {
    }
}
