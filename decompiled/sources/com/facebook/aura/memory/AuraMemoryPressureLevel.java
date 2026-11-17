package com.facebook.aura.memory;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AuraMemoryPressureLevel {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraMemoryPressureLevel[] $VALUES;
    public static final AuraMemoryPressureLevel BACKGROUNDED;
    public static final AuraMemoryPressureLevel CRITICAL;
    public static final AuraMemoryPressureLevel LOW;
    public static final AuraMemoryPressureLevel MODERATE;

    static {
        AuraMemoryPressureLevel auraMemoryPressureLevel = new AuraMemoryPressureLevel("MODERATE", 0);
        MODERATE = auraMemoryPressureLevel;
        AuraMemoryPressureLevel auraMemoryPressureLevel2 = new AuraMemoryPressureLevel("BACKGROUNDED", 1);
        BACKGROUNDED = auraMemoryPressureLevel2;
        AuraMemoryPressureLevel auraMemoryPressureLevel3 = new AuraMemoryPressureLevel("LOW", 2);
        LOW = auraMemoryPressureLevel3;
        AuraMemoryPressureLevel auraMemoryPressureLevel4 = new AuraMemoryPressureLevel("CRITICAL", 3);
        CRITICAL = auraMemoryPressureLevel4;
        AuraMemoryPressureLevel[] auraMemoryPressureLevelArr = {auraMemoryPressureLevel, auraMemoryPressureLevel2, auraMemoryPressureLevel3, auraMemoryPressureLevel4};
        $VALUES = auraMemoryPressureLevelArr;
        $ENTRIES = C3cG.A0w(auraMemoryPressureLevelArr);
    }

    public static Ey9<AuraMemoryPressureLevel> getEntries() {
        return $ENTRIES;
    }

    public static AuraMemoryPressureLevel valueOf(String str) {
        return (AuraMemoryPressureLevel) Enum.valueOf(AuraMemoryPressureLevel.class, str);
    }

    public static AuraMemoryPressureLevel[] values() {
        return (AuraMemoryPressureLevel[]) $VALUES.clone();
    }

    public AuraMemoryPressureLevel(String str, int i) {
    }
}
