package com.facebook.aura.localbrowser;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class LocalBrowserHostKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LocalBrowserHostKind[] $VALUES;
    public static final LocalBrowserHostKind APP;
    public static final LocalBrowserHostKind PRESENTATION;

    static {
        LocalBrowserHostKind localBrowserHostKind = new LocalBrowserHostKind("APP", 0);
        APP = localBrowserHostKind;
        LocalBrowserHostKind localBrowserHostKind2 = new LocalBrowserHostKind("PRESENTATION", 1);
        PRESENTATION = localBrowserHostKind2;
        LocalBrowserHostKind[] localBrowserHostKindArr = {localBrowserHostKind, localBrowserHostKind2};
        $VALUES = localBrowserHostKindArr;
        $ENTRIES = C3cG.A0w(localBrowserHostKindArr);
    }

    public static Ey9<LocalBrowserHostKind> getEntries() {
        return $ENTRIES;
    }

    public static LocalBrowserHostKind valueOf(String str) {
        return (LocalBrowserHostKind) Enum.valueOf(LocalBrowserHostKind.class, str);
    }

    public static LocalBrowserHostKind[] values() {
        return (LocalBrowserHostKind[]) $VALUES.clone();
    }

    public LocalBrowserHostKind(String str, int i) {
    }
}
