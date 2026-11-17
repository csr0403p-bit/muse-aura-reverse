package com.facebook.aura.rentalcars;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class RentalCarPaymentType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ RentalCarPaymentType[] $VALUES;
    public static final RentalCarPaymentType GUARANTEE;
    public static final RentalCarPaymentType POSTPAID;
    public static final RentalCarPaymentType PREPAID;
    public static final RentalCarPaymentType UNKNOWN;

    static {
        RentalCarPaymentType rentalCarPaymentType = new RentalCarPaymentType("POSTPAID", 0);
        POSTPAID = rentalCarPaymentType;
        RentalCarPaymentType rentalCarPaymentType2 = new RentalCarPaymentType("GUARANTEE", 1);
        GUARANTEE = rentalCarPaymentType2;
        RentalCarPaymentType rentalCarPaymentType3 = new RentalCarPaymentType("PREPAID", 2);
        PREPAID = rentalCarPaymentType3;
        RentalCarPaymentType rentalCarPaymentType4 = new RentalCarPaymentType("UNKNOWN", 3);
        UNKNOWN = rentalCarPaymentType4;
        RentalCarPaymentType[] rentalCarPaymentTypeArr = {rentalCarPaymentType, rentalCarPaymentType2, rentalCarPaymentType3, rentalCarPaymentType4};
        $VALUES = rentalCarPaymentTypeArr;
        $ENTRIES = C3cG.A0w(rentalCarPaymentTypeArr);
    }

    public static Ey9<RentalCarPaymentType> getEntries() {
        return $ENTRIES;
    }

    public static RentalCarPaymentType valueOf(String str) {
        return (RentalCarPaymentType) Enum.valueOf(RentalCarPaymentType.class, str);
    }

    public static RentalCarPaymentType[] values() {
        return (RentalCarPaymentType[]) $VALUES.clone();
    }

    public RentalCarPaymentType(String str, int i) {
    }
}
