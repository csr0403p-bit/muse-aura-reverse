package com.facebook.aura.ageverification.intf;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AgeCheckVia {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgeCheckVia[] $VALUES;
    public static final AgeCheckVia BACK;
    public static final AgeCheckVia ENTRY;
    public static final AgeCheckVia LINKING_RETURN;
    public static final AgeCheckVia PICK;
    public static final AgeCheckVia RETRY;
    public static final AgeCheckVia SERVER_REFRESH;
    public static final AgeCheckVia TRY_ANOTHER_METHOD;

    static {
        AgeCheckVia ageCheckVia = new AgeCheckVia("ENTRY", 0);
        ENTRY = ageCheckVia;
        AgeCheckVia ageCheckVia2 = new AgeCheckVia("TRY_ANOTHER_METHOD", 1);
        TRY_ANOTHER_METHOD = ageCheckVia2;
        AgeCheckVia ageCheckVia3 = new AgeCheckVia("PICK", 2);
        PICK = ageCheckVia3;
        AgeCheckVia ageCheckVia4 = new AgeCheckVia("BACK", 3);
        BACK = ageCheckVia4;
        AgeCheckVia ageCheckVia5 = new AgeCheckVia("RETRY", 4);
        RETRY = ageCheckVia5;
        AgeCheckVia ageCheckVia6 = new AgeCheckVia("LINKING_RETURN", 5);
        LINKING_RETURN = ageCheckVia6;
        AgeCheckVia ageCheckVia7 = new AgeCheckVia("SERVER_REFRESH", 6);
        SERVER_REFRESH = ageCheckVia7;
        AgeCheckVia[] ageCheckViaArr = {ageCheckVia, ageCheckVia2, ageCheckVia3, ageCheckVia4, ageCheckVia5, ageCheckVia6, ageCheckVia7};
        $VALUES = ageCheckViaArr;
        $ENTRIES = C3cG.A0w(ageCheckViaArr);
    }

    public static Ey9<AgeCheckVia> getEntries() {
        return $ENTRIES;
    }

    public static AgeCheckVia valueOf(String str) {
        return (AgeCheckVia) Enum.valueOf(AgeCheckVia.class, str);
    }

    public static AgeCheckVia[] values() {
        return (AgeCheckVia[]) $VALUES.clone();
    }

    public AgeCheckVia(String str, int i) {
    }
}
