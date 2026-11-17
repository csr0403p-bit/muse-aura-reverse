package com.facebook.aura.localbrowser;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LocalBrowserDialogKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LocalBrowserDialogKind[] $VALUES;
    public static final LocalBrowserDialogKind ALERT;
    public static final LocalBrowserDialogKind BEFORE_UNLOAD;
    public static final LocalBrowserDialogKind CONFIRM;
    public static final LocalBrowserDialogKind PROMPT;

    static {
        LocalBrowserDialogKind localBrowserDialogKind = new LocalBrowserDialogKind("ALERT", 0);
        ALERT = localBrowserDialogKind;
        LocalBrowserDialogKind localBrowserDialogKind2 = new LocalBrowserDialogKind("CONFIRM", 1);
        CONFIRM = localBrowserDialogKind2;
        LocalBrowserDialogKind localBrowserDialogKind3 = new LocalBrowserDialogKind("PROMPT", 2);
        PROMPT = localBrowserDialogKind3;
        LocalBrowserDialogKind localBrowserDialogKind4 = new LocalBrowserDialogKind("BEFORE_UNLOAD", 3);
        BEFORE_UNLOAD = localBrowserDialogKind4;
        LocalBrowserDialogKind[] localBrowserDialogKindArr = {localBrowserDialogKind, localBrowserDialogKind2, localBrowserDialogKind3, localBrowserDialogKind4};
        $VALUES = localBrowserDialogKindArr;
        $ENTRIES = C3cG.A0w(localBrowserDialogKindArr);
    }

    public static Ey9<LocalBrowserDialogKind> getEntries() {
        return $ENTRIES;
    }

    public static LocalBrowserDialogKind valueOf(String str) {
        return (LocalBrowserDialogKind) Enum.valueOf(LocalBrowserDialogKind.class, str);
    }

    public static LocalBrowserDialogKind[] values() {
        return (LocalBrowserDialogKind[]) $VALUES.clone();
    }

    public LocalBrowserDialogKind(String str, int i) {
    }
}
