package com.facebook.aura.user.provider;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AgeCheckLayout {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgeCheckLayout[] $VALUES;
    public static final AgeCheckLayout LEAD_METHOD;
    public static final AgeCheckLayout METHOD_SELECTOR;

    static {
        AgeCheckLayout ageCheckLayout = new AgeCheckLayout("LEAD_METHOD", 0);
        LEAD_METHOD = ageCheckLayout;
        AgeCheckLayout ageCheckLayout2 = new AgeCheckLayout("METHOD_SELECTOR", 1);
        METHOD_SELECTOR = ageCheckLayout2;
        AgeCheckLayout[] ageCheckLayoutArr = {ageCheckLayout, ageCheckLayout2};
        $VALUES = ageCheckLayoutArr;
        $ENTRIES = C3cG.A0w(ageCheckLayoutArr);
    }

    public static Ey9<AgeCheckLayout> getEntries() {
        return $ENTRIES;
    }

    public static AgeCheckLayout valueOf(String str) {
        return (AgeCheckLayout) Enum.valueOf(AgeCheckLayout.class, str);
    }

    public static AgeCheckLayout[] values() {
        return (AgeCheckLayout[]) $VALUES.clone();
    }

    public AgeCheckLayout(String str, int i) {
    }
}
