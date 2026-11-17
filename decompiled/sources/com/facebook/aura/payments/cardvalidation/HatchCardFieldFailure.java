package com.facebook.aura.payments.cardvalidation;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchCardFieldFailure {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCardFieldFailure[] $VALUES;
    public static final HatchCardFieldFailure EXPIRATION_MALFORMED;
    public static final HatchCardFieldFailure EXPIRATION_MONTH_INVALID;
    public static final HatchCardFieldFailure EXPIRATION_PAST;
    public static final HatchCardFieldFailure NUMBER_LUHN_FAILED;
    public static final HatchCardFieldFailure NUMBER_NETWORK_NOT_ACCEPTED;
    public static final HatchCardFieldFailure NUMBER_TOO_LONG;
    public static final HatchCardFieldFailure POSTAL_CODE_INVALID;
    public static final HatchCardFieldFailure SECURITY_CODE_WRONG_LENGTH;

    static {
        HatchCardFieldFailure hatchCardFieldFailure = new HatchCardFieldFailure("NUMBER_TOO_LONG", 0);
        NUMBER_TOO_LONG = hatchCardFieldFailure;
        HatchCardFieldFailure hatchCardFieldFailure2 = new HatchCardFieldFailure("NUMBER_LUHN_FAILED", 1);
        NUMBER_LUHN_FAILED = hatchCardFieldFailure2;
        HatchCardFieldFailure hatchCardFieldFailure3 = new HatchCardFieldFailure("NUMBER_NETWORK_NOT_ACCEPTED", 2);
        NUMBER_NETWORK_NOT_ACCEPTED = hatchCardFieldFailure3;
        HatchCardFieldFailure hatchCardFieldFailure4 = new HatchCardFieldFailure("EXPIRATION_MALFORMED", 3);
        EXPIRATION_MALFORMED = hatchCardFieldFailure4;
        HatchCardFieldFailure hatchCardFieldFailure5 = new HatchCardFieldFailure("EXPIRATION_MONTH_INVALID", 4);
        EXPIRATION_MONTH_INVALID = hatchCardFieldFailure5;
        HatchCardFieldFailure hatchCardFieldFailure6 = new HatchCardFieldFailure("EXPIRATION_PAST", 5);
        EXPIRATION_PAST = hatchCardFieldFailure6;
        HatchCardFieldFailure hatchCardFieldFailure7 = new HatchCardFieldFailure("SECURITY_CODE_WRONG_LENGTH", 6);
        SECURITY_CODE_WRONG_LENGTH = hatchCardFieldFailure7;
        HatchCardFieldFailure hatchCardFieldFailure8 = new HatchCardFieldFailure("POSTAL_CODE_INVALID", 7);
        POSTAL_CODE_INVALID = hatchCardFieldFailure8;
        HatchCardFieldFailure[] hatchCardFieldFailureArr = {hatchCardFieldFailure, hatchCardFieldFailure2, hatchCardFieldFailure3, hatchCardFieldFailure4, hatchCardFieldFailure5, hatchCardFieldFailure6, hatchCardFieldFailure7, hatchCardFieldFailure8};
        $VALUES = hatchCardFieldFailureArr;
        $ENTRIES = C3cG.A0w(hatchCardFieldFailureArr);
    }

    public static Ey9<HatchCardFieldFailure> getEntries() {
        return $ENTRIES;
    }

    public static HatchCardFieldFailure valueOf(String str) {
        return (HatchCardFieldFailure) Enum.valueOf(HatchCardFieldFailure.class, str);
    }

    public static HatchCardFieldFailure[] values() {
        return (HatchCardFieldFailure[]) $VALUES.clone();
    }

    public HatchCardFieldFailure(String str, int i) {
    }
}
