package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class RefResolution {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ RefResolution[] $VALUES;
    public static final Companion Companion;
    public static final RefResolution HEALED;
    public static final RefResolution UNCHANGED;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        RefResolution refResolution = new RefResolution("UNCHANGED", 0);
        UNCHANGED = refResolution;
        RefResolution refResolution2 = new RefResolution("HEALED", 1);
        HEALED = refResolution2;
        RefResolution[] refResolutionArr = {refResolution, refResolution2};
        $VALUES = refResolutionArr;
        $ENTRIES = C3cG.A0w(refResolutionArr);
        Companion = new Companion();
    }

    public static Ey9<RefResolution> getEntries() {
        return $ENTRIES;
    }

    public static RefResolution valueOf(String str) {
        return (RefResolution) Enum.valueOf(RefResolution.class, str);
    }

    public static RefResolution[] values() {
        return (RefResolution[]) $VALUES.clone();
    }

    public RefResolution(String str, int i) {
    }
}
