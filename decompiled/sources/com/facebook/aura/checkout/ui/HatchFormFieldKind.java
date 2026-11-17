package com.facebook.aura.checkout.ui;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchFormFieldKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchFormFieldKind[] $VALUES;
    public static final HatchFormFieldKind ADDRESS_LINE;
    public static final HatchFormFieldKind CITY;
    public static final HatchFormFieldKind COUNTRY;
    public static final HatchFormFieldKind CREDIT_CARD_EXPIRATION;
    public static final HatchFormFieldKind CREDIT_CARD_NUMBER;
    public static final HatchFormFieldKind CREDIT_CARD_SECURITY_CODE;
    public static final HatchFormFieldKind EMAIL;
    public static final HatchFormFieldKind FAMILY_NAME;
    public static final HatchFormFieldKind FULL_NAME;
    public static final HatchFormFieldKind GIVEN_NAME;
    public static final HatchFormFieldKind NUMBER;
    public static final HatchFormFieldKind PHONE;
    public static final HatchFormFieldKind POSTAL_CODE;
    public static final HatchFormFieldKind STATE;
    public static final HatchFormFieldKind STREET_ADDRESS;
    public static final HatchFormFieldKind TEXT;

    static {
        HatchFormFieldKind hatchFormFieldKind = new HatchFormFieldKind("TEXT", 0);
        TEXT = hatchFormFieldKind;
        HatchFormFieldKind hatchFormFieldKind2 = new HatchFormFieldKind("FULL_NAME", 1);
        FULL_NAME = hatchFormFieldKind2;
        HatchFormFieldKind hatchFormFieldKind3 = new HatchFormFieldKind("GIVEN_NAME", 2);
        GIVEN_NAME = hatchFormFieldKind3;
        HatchFormFieldKind hatchFormFieldKind4 = new HatchFormFieldKind("FAMILY_NAME", 3);
        FAMILY_NAME = hatchFormFieldKind4;
        HatchFormFieldKind hatchFormFieldKind5 = new HatchFormFieldKind("EMAIL", 4);
        EMAIL = hatchFormFieldKind5;
        HatchFormFieldKind hatchFormFieldKind6 = new HatchFormFieldKind("PHONE", 5);
        PHONE = hatchFormFieldKind6;
        HatchFormFieldKind hatchFormFieldKind7 = new HatchFormFieldKind("STREET_ADDRESS", 6);
        STREET_ADDRESS = hatchFormFieldKind7;
        HatchFormFieldKind hatchFormFieldKind8 = new HatchFormFieldKind("ADDRESS_LINE", 7);
        ADDRESS_LINE = hatchFormFieldKind8;
        HatchFormFieldKind hatchFormFieldKind9 = new HatchFormFieldKind("CITY", 8);
        CITY = hatchFormFieldKind9;
        HatchFormFieldKind hatchFormFieldKind10 = new HatchFormFieldKind("STATE", 9);
        STATE = hatchFormFieldKind10;
        HatchFormFieldKind hatchFormFieldKind11 = new HatchFormFieldKind("POSTAL_CODE", 10);
        POSTAL_CODE = hatchFormFieldKind11;
        HatchFormFieldKind hatchFormFieldKind12 = new HatchFormFieldKind("COUNTRY", 11);
        COUNTRY = hatchFormFieldKind12;
        HatchFormFieldKind hatchFormFieldKind13 = new HatchFormFieldKind("NUMBER", 12);
        NUMBER = hatchFormFieldKind13;
        HatchFormFieldKind hatchFormFieldKind14 = new HatchFormFieldKind("CREDIT_CARD_NUMBER", 13);
        CREDIT_CARD_NUMBER = hatchFormFieldKind14;
        HatchFormFieldKind hatchFormFieldKind15 = new HatchFormFieldKind("CREDIT_CARD_EXPIRATION", 14);
        CREDIT_CARD_EXPIRATION = hatchFormFieldKind15;
        HatchFormFieldKind hatchFormFieldKind16 = new HatchFormFieldKind("CREDIT_CARD_SECURITY_CODE", 15);
        CREDIT_CARD_SECURITY_CODE = hatchFormFieldKind16;
        HatchFormFieldKind[] hatchFormFieldKindArr = {hatchFormFieldKind, hatchFormFieldKind2, hatchFormFieldKind3, hatchFormFieldKind4, hatchFormFieldKind5, hatchFormFieldKind6, hatchFormFieldKind7, hatchFormFieldKind8, hatchFormFieldKind9, hatchFormFieldKind10, hatchFormFieldKind11, hatchFormFieldKind12, hatchFormFieldKind13, hatchFormFieldKind14, hatchFormFieldKind15, hatchFormFieldKind16};
        $VALUES = hatchFormFieldKindArr;
        $ENTRIES = C3cG.A0w(hatchFormFieldKindArr);
    }

    public static Ey9<HatchFormFieldKind> getEntries() {
        return $ENTRIES;
    }

    public static HatchFormFieldKind valueOf(String str) {
        return (HatchFormFieldKind) Enum.valueOf(HatchFormFieldKind.class, str);
    }

    public static HatchFormFieldKind[] values() {
        return (HatchFormFieldKind[]) $VALUES.clone();
    }

    public HatchFormFieldKind(String str, int i) {
    }
}
