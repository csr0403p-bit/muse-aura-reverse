package com.facebook.aura.vds.compose.text.richtext;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AuraSourceType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraSourceType[] $VALUES;
    public static final AuraSourceType FACEBOOK_POST;
    public static final AuraSourceType INSTAGRAM_POST;
    public static final AuraSourceType THIRD_PARTY;
    public static final AuraSourceType THREADS_POST;
    public static final AuraSourceType WEARABLES_ACS_JOURNAL;

    static {
        AuraSourceType auraSourceType = new AuraSourceType("FACEBOOK_POST", 0);
        FACEBOOK_POST = auraSourceType;
        AuraSourceType auraSourceType2 = new AuraSourceType("INSTAGRAM_POST", 1);
        INSTAGRAM_POST = auraSourceType2;
        AuraSourceType auraSourceType3 = new AuraSourceType("THREADS_POST", 2);
        THREADS_POST = auraSourceType3;
        AuraSourceType auraSourceType4 = new AuraSourceType("THIRD_PARTY", 3);
        THIRD_PARTY = auraSourceType4;
        AuraSourceType auraSourceType5 = new AuraSourceType("WEARABLES_ACS_JOURNAL", 4);
        WEARABLES_ACS_JOURNAL = auraSourceType5;
        AuraSourceType[] auraSourceTypeArr = {auraSourceType, auraSourceType2, auraSourceType3, auraSourceType4, auraSourceType5};
        $VALUES = auraSourceTypeArr;
        $ENTRIES = C3cG.A0w(auraSourceTypeArr);
    }

    public static Ey9<AuraSourceType> getEntries() {
        return $ENTRIES;
    }

    public static AuraSourceType valueOf(String str) {
        return (AuraSourceType) Enum.valueOf(AuraSourceType.class, str);
    }

    public static AuraSourceType[] values() {
        return (AuraSourceType[]) $VALUES.clone();
    }

    public AuraSourceType(String str, int i) {
    }
}
