package com.facebook.aura.vmbrowser.runtime;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BrowserDevicePasteResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BrowserDevicePasteResult[] $VALUES;
    public static final BrowserDevicePasteResult BLOCKED;
    public static final BrowserDevicePasteResult DELIVERED;
    public static final BrowserDevicePasteResult OUTCOME_UNKNOWN;
    public static final BrowserDevicePasteResult TRY_AGAIN;
    public static final BrowserDevicePasteResult UNAVAILABLE;

    static {
        BrowserDevicePasteResult browserDevicePasteResult = new BrowserDevicePasteResult("DELIVERED", 0);
        DELIVERED = browserDevicePasteResult;
        BrowserDevicePasteResult browserDevicePasteResult2 = new BrowserDevicePasteResult("TRY_AGAIN", 1);
        TRY_AGAIN = browserDevicePasteResult2;
        BrowserDevicePasteResult browserDevicePasteResult3 = new BrowserDevicePasteResult("BLOCKED", 2);
        BLOCKED = browserDevicePasteResult3;
        BrowserDevicePasteResult browserDevicePasteResult4 = new BrowserDevicePasteResult("UNAVAILABLE", 3);
        UNAVAILABLE = browserDevicePasteResult4;
        BrowserDevicePasteResult browserDevicePasteResult5 = new BrowserDevicePasteResult("OUTCOME_UNKNOWN", 4);
        OUTCOME_UNKNOWN = browserDevicePasteResult5;
        BrowserDevicePasteResult[] browserDevicePasteResultArr = {browserDevicePasteResult, browserDevicePasteResult2, browserDevicePasteResult3, browserDevicePasteResult4, browserDevicePasteResult5};
        $VALUES = browserDevicePasteResultArr;
        $ENTRIES = C3cG.A0w(browserDevicePasteResultArr);
    }

    public static Ey9<BrowserDevicePasteResult> getEntries() {
        return $ENTRIES;
    }

    public static BrowserDevicePasteResult valueOf(String str) {
        return (BrowserDevicePasteResult) Enum.valueOf(BrowserDevicePasteResult.class, str);
    }

    public static BrowserDevicePasteResult[] values() {
        return (BrowserDevicePasteResult[]) $VALUES.clone();
    }

    public BrowserDevicePasteResult(String str, int i) {
    }
}
