package com.facebook.aura.installsource;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AuraInstallSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraInstallSource[] $VALUES;
    public static final AuraInstallSource MOBILE_HOME;
    public static final AuraInstallSource OTHER;
    public static final AuraInstallSource OXYGEN;
    public static final AuraInstallSource OXYGEN_DEBUG;
    public static final AuraInstallSource PLAY_STORE;

    static {
        AuraInstallSource auraInstallSource = new AuraInstallSource("PLAY_STORE", 0);
        PLAY_STORE = auraInstallSource;
        AuraInstallSource auraInstallSource2 = new AuraInstallSource("OXYGEN", 1);
        OXYGEN = auraInstallSource2;
        AuraInstallSource auraInstallSource3 = new AuraInstallSource("OXYGEN_DEBUG", 2);
        OXYGEN_DEBUG = auraInstallSource3;
        AuraInstallSource auraInstallSource4 = new AuraInstallSource("MOBILE_HOME", 3);
        MOBILE_HOME = auraInstallSource4;
        AuraInstallSource auraInstallSource5 = new AuraInstallSource("OTHER", 4);
        OTHER = auraInstallSource5;
        AuraInstallSource[] auraInstallSourceArr = {auraInstallSource, auraInstallSource2, auraInstallSource3, auraInstallSource4, auraInstallSource5};
        $VALUES = auraInstallSourceArr;
        $ENTRIES = C3cG.A0w(auraInstallSourceArr);
    }

    public static Ey9<AuraInstallSource> getEntries() {
        return $ENTRIES;
    }

    public static AuraInstallSource valueOf(String str) {
        return (AuraInstallSource) Enum.valueOf(AuraInstallSource.class, str);
    }

    public static AuraInstallSource[] values() {
        return (AuraInstallSource[]) $VALUES.clone();
    }

    public AuraInstallSource(String str, int i) {
    }
}
