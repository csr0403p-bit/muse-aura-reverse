package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class NativeControlKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NativeControlKind[] $VALUES;
    public static final NativeControlKind COLOR;
    public static final Companion Companion;
    public static final NativeControlKind DATE;
    public static final NativeControlKind DATE_TIME_LOCAL;
    public static final NativeControlKind MONTH;
    public static final NativeControlKind SELECT;
    public static final NativeControlKind TIME;
    public static final NativeControlKind UNKNOWN;
    public static final NativeControlKind WEEK;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        NativeControlKind nativeControlKind = new NativeControlKind("SELECT", 0);
        SELECT = nativeControlKind;
        NativeControlKind nativeControlKind2 = new NativeControlKind("DATE", 1);
        DATE = nativeControlKind2;
        NativeControlKind nativeControlKind3 = new NativeControlKind("DATE_TIME_LOCAL", 2);
        DATE_TIME_LOCAL = nativeControlKind3;
        NativeControlKind nativeControlKind4 = new NativeControlKind("TIME", 3);
        TIME = nativeControlKind4;
        NativeControlKind nativeControlKind5 = new NativeControlKind("MONTH", 4);
        MONTH = nativeControlKind5;
        NativeControlKind nativeControlKind6 = new NativeControlKind("WEEK", 5);
        WEEK = nativeControlKind6;
        NativeControlKind nativeControlKind7 = new NativeControlKind("COLOR", 6);
        COLOR = nativeControlKind7;
        NativeControlKind nativeControlKind8 = new NativeControlKind("UNKNOWN", 7);
        UNKNOWN = nativeControlKind8;
        NativeControlKind[] nativeControlKindArr = {nativeControlKind, nativeControlKind2, nativeControlKind3, nativeControlKind4, nativeControlKind5, nativeControlKind6, nativeControlKind7, nativeControlKind8};
        $VALUES = nativeControlKindArr;
        $ENTRIES = C3cG.A0w(nativeControlKindArr);
        Companion = new Companion();
    }

    public static Ey9<NativeControlKind> getEntries() {
        return $ENTRIES;
    }

    public static NativeControlKind valueOf(String str) {
        return (NativeControlKind) Enum.valueOf(NativeControlKind.class, str);
    }

    public static NativeControlKind[] values() {
        return (NativeControlKind[]) $VALUES.clone();
    }

    public NativeControlKind(String str, int i) {
    }
}
