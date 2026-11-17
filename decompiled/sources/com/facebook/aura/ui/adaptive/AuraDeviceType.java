package com.facebook.aura.ui.adaptive;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AuraDeviceType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraDeviceType[] $VALUES;
    public static final AuraDeviceType Automotive;
    public static final AuraDeviceType Foldable;
    public static final AuraDeviceType Phone;
    public static final AuraDeviceType Tablet;
    public static final AuraDeviceType Watch;

    static {
        AuraDeviceType auraDeviceType = new AuraDeviceType("Phone", 0);
        Phone = auraDeviceType;
        AuraDeviceType auraDeviceType2 = new AuraDeviceType("Foldable", 1);
        Foldable = auraDeviceType2;
        AuraDeviceType auraDeviceType3 = new AuraDeviceType("Tablet", 2);
        Tablet = auraDeviceType3;
        AuraDeviceType auraDeviceType4 = new AuraDeviceType("Watch", 3);
        Watch = auraDeviceType4;
        AuraDeviceType auraDeviceType5 = new AuraDeviceType("Automotive", 4);
        Automotive = auraDeviceType5;
        AuraDeviceType[] auraDeviceTypeArr = {auraDeviceType, auraDeviceType2, auraDeviceType3, auraDeviceType4, auraDeviceType5};
        $VALUES = auraDeviceTypeArr;
        $ENTRIES = C3cG.A0w(auraDeviceTypeArr);
    }

    public static Ey9<AuraDeviceType> getEntries() {
        return $ENTRIES;
    }

    public static AuraDeviceType valueOf(String str) {
        return (AuraDeviceType) Enum.valueOf(AuraDeviceType.class, str);
    }

    public static AuraDeviceType[] values() {
        return (AuraDeviceType[]) $VALUES.clone();
    }

    public AuraDeviceType(String str, int i) {
    }
}
