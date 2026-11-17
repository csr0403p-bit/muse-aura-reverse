package com.facebook.aura.ui.adaptive;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AuraHeightClass {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraHeightClass[] $VALUES;
    public static final AuraHeightClass Compact;
    public static final AuraHeightClass Expanded;
    public static final AuraHeightClass Medium;

    static {
        AuraHeightClass auraHeightClass = new AuraHeightClass("Compact", 0);
        Compact = auraHeightClass;
        AuraHeightClass auraHeightClass2 = new AuraHeightClass("Medium", 1);
        Medium = auraHeightClass2;
        AuraHeightClass auraHeightClass3 = new AuraHeightClass("Expanded", 2);
        Expanded = auraHeightClass3;
        AuraHeightClass[] auraHeightClassArr = {auraHeightClass, auraHeightClass2, auraHeightClass3};
        $VALUES = auraHeightClassArr;
        $ENTRIES = C3cG.A0w(auraHeightClassArr);
    }

    public static Ey9<AuraHeightClass> getEntries() {
        return $ENTRIES;
    }

    public static AuraHeightClass valueOf(String str) {
        return (AuraHeightClass) Enum.valueOf(AuraHeightClass.class, str);
    }

    public static AuraHeightClass[] values() {
        return (AuraHeightClass[]) $VALUES.clone();
    }

    public AuraHeightClass(String str, int i) {
    }
}
