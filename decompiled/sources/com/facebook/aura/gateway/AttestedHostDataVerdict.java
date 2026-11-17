package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AttestedHostDataVerdict {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AttestedHostDataVerdict[] $VALUES;
    public static final AttestedHostDataVerdict MATCHED;
    public static final AttestedHostDataVerdict REJECTED;

    static {
        AttestedHostDataVerdict attestedHostDataVerdict = new AttestedHostDataVerdict("MATCHED", 0);
        MATCHED = attestedHostDataVerdict;
        AttestedHostDataVerdict attestedHostDataVerdict2 = new AttestedHostDataVerdict("REJECTED", 1);
        REJECTED = attestedHostDataVerdict2;
        AttestedHostDataVerdict[] attestedHostDataVerdictArr = {attestedHostDataVerdict, attestedHostDataVerdict2};
        $VALUES = attestedHostDataVerdictArr;
        $ENTRIES = C3cG.A0w(attestedHostDataVerdictArr);
    }

    public static Ey9<AttestedHostDataVerdict> getEntries() {
        return $ENTRIES;
    }

    public static AttestedHostDataVerdict valueOf(String str) {
        return (AttestedHostDataVerdict) Enum.valueOf(AttestedHostDataVerdict.class, str);
    }

    public static AttestedHostDataVerdict[] values() {
        return (AttestedHostDataVerdict[]) $VALUES.clone();
    }

    public AttestedHostDataVerdict(String str, int i) {
    }
}
