package com.facebook.aura.devices.link.ordering;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchLinkOrderField {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchLinkOrderField[] $VALUES;
    public static final HatchLinkOrderField CITY;
    public static final HatchLinkOrderField EMAIL;
    public static final HatchLinkOrderField FIRST_NAME;
    public static final HatchLinkOrderField LAST_NAME;
    public static final HatchLinkOrderField PHONE;
    public static final HatchLinkOrderField POSTAL_CODE;
    public static final HatchLinkOrderField STATE;
    public static final HatchLinkOrderField STREET1;
    public static final HatchLinkOrderField STREET2;

    static {
        HatchLinkOrderField hatchLinkOrderField = new HatchLinkOrderField("FIRST_NAME", 0);
        FIRST_NAME = hatchLinkOrderField;
        HatchLinkOrderField hatchLinkOrderField2 = new HatchLinkOrderField("LAST_NAME", 1);
        LAST_NAME = hatchLinkOrderField2;
        HatchLinkOrderField hatchLinkOrderField3 = new HatchLinkOrderField("STREET1", 2);
        STREET1 = hatchLinkOrderField3;
        HatchLinkOrderField hatchLinkOrderField4 = new HatchLinkOrderField("STREET2", 3);
        STREET2 = hatchLinkOrderField4;
        HatchLinkOrderField hatchLinkOrderField5 = new HatchLinkOrderField("CITY", 4);
        CITY = hatchLinkOrderField5;
        HatchLinkOrderField hatchLinkOrderField6 = new HatchLinkOrderField("STATE", 5);
        STATE = hatchLinkOrderField6;
        HatchLinkOrderField hatchLinkOrderField7 = new HatchLinkOrderField("POSTAL_CODE", 6);
        POSTAL_CODE = hatchLinkOrderField7;
        HatchLinkOrderField hatchLinkOrderField8 = new HatchLinkOrderField("EMAIL", 7);
        EMAIL = hatchLinkOrderField8;
        HatchLinkOrderField hatchLinkOrderField9 = new HatchLinkOrderField("PHONE", 8);
        PHONE = hatchLinkOrderField9;
        HatchLinkOrderField[] hatchLinkOrderFieldArr = {hatchLinkOrderField, hatchLinkOrderField2, hatchLinkOrderField3, hatchLinkOrderField4, hatchLinkOrderField5, hatchLinkOrderField6, hatchLinkOrderField7, hatchLinkOrderField8, hatchLinkOrderField9};
        $VALUES = hatchLinkOrderFieldArr;
        $ENTRIES = C3cG.A0w(hatchLinkOrderFieldArr);
    }

    public static Ey9<HatchLinkOrderField> getEntries() {
        return $ENTRIES;
    }

    public static HatchLinkOrderField valueOf(String str) {
        return (HatchLinkOrderField) Enum.valueOf(HatchLinkOrderField.class, str);
    }

    public static HatchLinkOrderField[] values() {
        return (HatchLinkOrderField[]) $VALUES.clone();
    }

    public HatchLinkOrderField(String str, int i) {
    }
}
