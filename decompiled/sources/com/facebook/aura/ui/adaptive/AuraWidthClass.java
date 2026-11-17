package com.facebook.aura.ui.adaptive;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AuraWidthClass {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraWidthClass[] $VALUES;
    public static final AuraWidthClass Compact;
    public static final AuraWidthClass Expanded;
    public static final AuraWidthClass ExtraLarge;
    public static final AuraWidthClass Large;
    public static final AuraWidthClass Medium;

    static {
        AuraWidthClass auraWidthClass = new AuraWidthClass("Compact", 0);
        Compact = auraWidthClass;
        AuraWidthClass auraWidthClass2 = new AuraWidthClass("Medium", 1);
        Medium = auraWidthClass2;
        AuraWidthClass auraWidthClass3 = new AuraWidthClass("Expanded", 2);
        Expanded = auraWidthClass3;
        AuraWidthClass auraWidthClass4 = new AuraWidthClass("Large", 3);
        Large = auraWidthClass4;
        AuraWidthClass auraWidthClass5 = new AuraWidthClass("ExtraLarge", 4);
        ExtraLarge = auraWidthClass5;
        AuraWidthClass[] auraWidthClassArr = {auraWidthClass, auraWidthClass2, auraWidthClass3, auraWidthClass4, auraWidthClass5};
        $VALUES = auraWidthClassArr;
        $ENTRIES = C3cG.A0w(auraWidthClassArr);
    }

    public static Ey9<AuraWidthClass> getEntries() {
        return $ENTRIES;
    }

    public static AuraWidthClass valueOf(String str) {
        return (AuraWidthClass) Enum.valueOf(AuraWidthClass.class, str);
    }

    public static AuraWidthClass[] values() {
        return (AuraWidthClass[]) $VALUES.clone();
    }

    public AuraWidthClass(String str, int i) {
    }
}
