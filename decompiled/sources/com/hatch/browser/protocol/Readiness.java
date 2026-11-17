package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Readiness {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ Readiness[] $VALUES;
    public static final Readiness BOUNDED;
    public static final Companion Companion;
    public static final Readiness NOT_CHECKED;
    public static final Readiness READY;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        Readiness readiness = new Readiness("READY", 0);
        READY = readiness;
        Readiness readiness2 = new Readiness("BOUNDED", 1);
        BOUNDED = readiness2;
        Readiness readiness3 = new Readiness("NOT_CHECKED", 2);
        NOT_CHECKED = readiness3;
        Readiness[] readinessArr = {readiness, readiness2, readiness3};
        $VALUES = readinessArr;
        $ENTRIES = C3cG.A0w(readinessArr);
        Companion = new Companion();
    }

    public static Ey9<Readiness> getEntries() {
        return $ENTRIES;
    }

    public static Readiness valueOf(String str) {
        return (Readiness) Enum.valueOf(Readiness.class, str);
    }

    public static Readiness[] values() {
        return (Readiness[]) $VALUES.clone();
    }

    public Readiness(String str, int i) {
    }
}
