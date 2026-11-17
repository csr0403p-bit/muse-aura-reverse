package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FillVerification {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FillVerification[] $VALUES;
    public static final Companion Companion;
    public static final FillVerification EXACT;
    public static final FillVerification MISMATCH;
    public static final FillVerification NOT_CHECKED;
    public static final FillVerification TRANSFORMED;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        FillVerification fillVerification = new FillVerification("EXACT", 0);
        EXACT = fillVerification;
        FillVerification fillVerification2 = new FillVerification("TRANSFORMED", 1);
        TRANSFORMED = fillVerification2;
        FillVerification fillVerification3 = new FillVerification("MISMATCH", 2);
        MISMATCH = fillVerification3;
        FillVerification fillVerification4 = new FillVerification("NOT_CHECKED", 3);
        NOT_CHECKED = fillVerification4;
        FillVerification[] fillVerificationArr = {fillVerification, fillVerification2, fillVerification3, fillVerification4};
        $VALUES = fillVerificationArr;
        $ENTRIES = C3cG.A0w(fillVerificationArr);
        Companion = new Companion();
    }

    public static Ey9<FillVerification> getEntries() {
        return $ENTRIES;
    }

    public static FillVerification valueOf(String str) {
        return (FillVerification) Enum.valueOf(FillVerification.class, str);
    }

    public static FillVerification[] values() {
        return (FillVerification[]) $VALUES.clone();
    }

    public FillVerification(String str, int i) {
    }
}
