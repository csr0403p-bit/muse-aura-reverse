package com.facebook.aura.uicontrol;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BackNavigationResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BackNavigationResult[] $VALUES;
    public static final BackNavigationResult CLOSED;
    public static final BackNavigationResult COVERED;
    public static final BackNavigationResult NOTHING_TO_CLOSE;
    public static final BackNavigationResult NOT_ON_SCREEN;

    static {
        BackNavigationResult backNavigationResult = new BackNavigationResult("CLOSED", 0);
        CLOSED = backNavigationResult;
        BackNavigationResult backNavigationResult2 = new BackNavigationResult("NOTHING_TO_CLOSE", 1);
        NOTHING_TO_CLOSE = backNavigationResult2;
        BackNavigationResult backNavigationResult3 = new BackNavigationResult("COVERED", 2);
        COVERED = backNavigationResult3;
        BackNavigationResult backNavigationResult4 = new BackNavigationResult("NOT_ON_SCREEN", 3);
        NOT_ON_SCREEN = backNavigationResult4;
        BackNavigationResult[] backNavigationResultArr = {backNavigationResult, backNavigationResult2, backNavigationResult3, backNavigationResult4};
        $VALUES = backNavigationResultArr;
        $ENTRIES = C3cG.A0w(backNavigationResultArr);
    }

    public static Ey9<BackNavigationResult> getEntries() {
        return $ENTRIES;
    }

    public static BackNavigationResult valueOf(String str) {
        return (BackNavigationResult) Enum.valueOf(BackNavigationResult.class, str);
    }

    public static BackNavigationResult[] values() {
        return (BackNavigationResult[]) $VALUES.clone();
    }

    public BackNavigationResult(String str, int i) {
    }
}
