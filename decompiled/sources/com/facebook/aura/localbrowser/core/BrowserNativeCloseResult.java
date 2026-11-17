package com.facebook.aura.localbrowser.core;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BrowserNativeCloseResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BrowserNativeCloseResult[] $VALUES;
    public static final BrowserNativeCloseResult CLOSED;
    public static final BrowserNativeCloseResult REFUSED;
    public static final BrowserNativeCloseResult UNKNOWN;

    static {
        BrowserNativeCloseResult browserNativeCloseResult = new BrowserNativeCloseResult("CLOSED", 0);
        CLOSED = browserNativeCloseResult;
        BrowserNativeCloseResult browserNativeCloseResult2 = new BrowserNativeCloseResult("REFUSED", 1);
        REFUSED = browserNativeCloseResult2;
        BrowserNativeCloseResult browserNativeCloseResult3 = new BrowserNativeCloseResult("UNKNOWN", 2);
        UNKNOWN = browserNativeCloseResult3;
        BrowserNativeCloseResult[] browserNativeCloseResultArr = {browserNativeCloseResult, browserNativeCloseResult2, browserNativeCloseResult3};
        $VALUES = browserNativeCloseResultArr;
        $ENTRIES = C3cG.A0w(browserNativeCloseResultArr);
    }

    public static Ey9<BrowserNativeCloseResult> getEntries() {
        return $ENTRIES;
    }

    public static BrowserNativeCloseResult valueOf(String str) {
        return (BrowserNativeCloseResult) Enum.valueOf(BrowserNativeCloseResult.class, str);
    }

    public static BrowserNativeCloseResult[] values() {
        return (BrowserNativeCloseResult[]) $VALUES.clone();
    }

    public BrowserNativeCloseResult(String str, int i) {
    }
}
