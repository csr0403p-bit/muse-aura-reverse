package com.meta.maps.core;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class QualityLevel {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ QualityLevel[] $VALUES;
    public static final QualityLevel HIGH;
    public static final QualityLevel LOW;
    public static final QualityLevel MEDIUM;
    public static final QualityLevel UNKNOWN;
    public final int value;

    static {
        QualityLevel qualityLevel = new QualityLevel("UNKNOWN", 0, 0);
        UNKNOWN = qualityLevel;
        QualityLevel qualityLevel2 = new QualityLevel("HIGH", 1, 1);
        HIGH = qualityLevel2;
        QualityLevel qualityLevel3 = new QualityLevel("MEDIUM", 2, 2);
        MEDIUM = qualityLevel3;
        QualityLevel qualityLevel4 = new QualityLevel("LOW", 3, 3);
        LOW = qualityLevel4;
        QualityLevel[] qualityLevelArr = {qualityLevel, qualityLevel2, qualityLevel3, qualityLevel4};
        $VALUES = qualityLevelArr;
        $ENTRIES = new F3w(qualityLevelArr);
    }

    public static Ey9<QualityLevel> getEntries() {
        return $ENTRIES;
    }

    public static QualityLevel valueOf(String str) {
        return (QualityLevel) Enum.valueOf(QualityLevel.class, str);
    }

    public static QualityLevel[] values() {
        return (QualityLevel[]) $VALUES.clone();
    }

    public QualityLevel(String str, int i, int i2) {
        this.value = i2;
    }
}
