package com.facebook.aura.browsertask.navigation;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BrowserTaskAgentOpenFailure {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BrowserTaskAgentOpenFailure[] $VALUES;
    public static final BrowserTaskAgentOpenFailure BROWSER_GONE;
    public static final BrowserTaskAgentOpenFailure COVERED;
    public static final BrowserTaskAgentOpenFailure FINISHED;
    public static final BrowserTaskAgentOpenFailure NOT_FOUND;
    public static final BrowserTaskAgentOpenFailure NOT_OPENABLE;
    public static final BrowserTaskAgentOpenFailure NOT_STARTED;
    public static final BrowserTaskAgentOpenFailure PREVIEW_REVOKED;
    public static final BrowserTaskAgentOpenFailure VIEWER_UNAVAILABLE;

    static {
        BrowserTaskAgentOpenFailure browserTaskAgentOpenFailure = new BrowserTaskAgentOpenFailure("NOT_FOUND", 0);
        NOT_FOUND = browserTaskAgentOpenFailure;
        BrowserTaskAgentOpenFailure browserTaskAgentOpenFailure2 = new BrowserTaskAgentOpenFailure("FINISHED", 1);
        FINISHED = browserTaskAgentOpenFailure2;
        BrowserTaskAgentOpenFailure browserTaskAgentOpenFailure3 = new BrowserTaskAgentOpenFailure("NOT_STARTED", 2);
        NOT_STARTED = browserTaskAgentOpenFailure3;
        BrowserTaskAgentOpenFailure browserTaskAgentOpenFailure4 = new BrowserTaskAgentOpenFailure("PREVIEW_REVOKED", 3);
        PREVIEW_REVOKED = browserTaskAgentOpenFailure4;
        BrowserTaskAgentOpenFailure browserTaskAgentOpenFailure5 = new BrowserTaskAgentOpenFailure("NOT_OPENABLE", 4);
        NOT_OPENABLE = browserTaskAgentOpenFailure5;
        BrowserTaskAgentOpenFailure browserTaskAgentOpenFailure6 = new BrowserTaskAgentOpenFailure("BROWSER_GONE", 5);
        BROWSER_GONE = browserTaskAgentOpenFailure6;
        BrowserTaskAgentOpenFailure browserTaskAgentOpenFailure7 = new BrowserTaskAgentOpenFailure("COVERED", 6);
        COVERED = browserTaskAgentOpenFailure7;
        BrowserTaskAgentOpenFailure browserTaskAgentOpenFailure8 = new BrowserTaskAgentOpenFailure("VIEWER_UNAVAILABLE", 7);
        VIEWER_UNAVAILABLE = browserTaskAgentOpenFailure8;
        BrowserTaskAgentOpenFailure[] browserTaskAgentOpenFailureArr = {browserTaskAgentOpenFailure, browserTaskAgentOpenFailure2, browserTaskAgentOpenFailure3, browserTaskAgentOpenFailure4, browserTaskAgentOpenFailure5, browserTaskAgentOpenFailure6, browserTaskAgentOpenFailure7, browserTaskAgentOpenFailure8};
        $VALUES = browserTaskAgentOpenFailureArr;
        $ENTRIES = C3cG.A0w(browserTaskAgentOpenFailureArr);
    }

    public static Ey9<BrowserTaskAgentOpenFailure> getEntries() {
        return $ENTRIES;
    }

    public static BrowserTaskAgentOpenFailure valueOf(String str) {
        return (BrowserTaskAgentOpenFailure) Enum.valueOf(BrowserTaskAgentOpenFailure.class, str);
    }

    public static BrowserTaskAgentOpenFailure[] values() {
        return (BrowserTaskAgentOpenFailure[]) $VALUES.clone();
    }

    public BrowserTaskAgentOpenFailure(String str, int i) {
    }
}
