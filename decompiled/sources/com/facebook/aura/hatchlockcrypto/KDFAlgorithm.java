package com.facebook.aura.hatchlockcrypto;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class KDFAlgorithm {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ KDFAlgorithm[] $VALUES;
    public static final KDFAlgorithm ARGON2ID;
    public static final KDFAlgorithm PBKDF2;

    static {
        KDFAlgorithm kDFAlgorithm = new KDFAlgorithm("PBKDF2", 0);
        PBKDF2 = kDFAlgorithm;
        KDFAlgorithm kDFAlgorithm2 = new KDFAlgorithm("ARGON2ID", 1);
        ARGON2ID = kDFAlgorithm2;
        KDFAlgorithm[] kDFAlgorithmArr = {kDFAlgorithm, kDFAlgorithm2};
        $VALUES = kDFAlgorithmArr;
        $ENTRIES = C3cG.A0w(kDFAlgorithmArr);
    }

    public static Ey9<KDFAlgorithm> getEntries() {
        return $ENTRIES;
    }

    public static KDFAlgorithm valueOf(String str) {
        return (KDFAlgorithm) Enum.valueOf(KDFAlgorithm.class, str);
    }

    public static KDFAlgorithm[] values() {
        return (KDFAlgorithm[]) $VALUES.clone();
    }

    public KDFAlgorithm(String str, int i) {
    }
}
