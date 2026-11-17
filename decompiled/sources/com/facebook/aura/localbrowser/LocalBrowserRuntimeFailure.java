package com.facebook.aura.localbrowser;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class LocalBrowserRuntimeFailure {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LocalBrowserRuntimeFailure[] $VALUES;
    public static final LocalBrowserRuntimeFailure ACCESS_UNAVAILABLE;
    public static final LocalBrowserRuntimeFailure BLOCKED_POLICY_UNINSTALLED;
    public static final LocalBrowserRuntimeFailure CONNECTION_FAILED;
    public static final LocalBrowserRuntimeFailure DISABLED;
    public static final LocalBrowserRuntimeFailure ENGINE_PREPARATION_TIMED_OUT;
    public static final LocalBrowserRuntimeFailure ENGINE_UNAVAILABLE;
    public static final LocalBrowserRuntimeFailure PROFILE_UNAVAILABLE;
    public static final LocalBrowserRuntimeFailure PROFILE_UNSUPPORTED;
    public static final LocalBrowserRuntimeFailure SESSION_LIMIT;
    public static final LocalBrowserRuntimeFailure WEBVIEW_INITIALIZATION_FAILED;

    static {
        LocalBrowserRuntimeFailure localBrowserRuntimeFailure = new LocalBrowserRuntimeFailure("DISABLED", 0);
        DISABLED = localBrowserRuntimeFailure;
        LocalBrowserRuntimeFailure localBrowserRuntimeFailure2 = new LocalBrowserRuntimeFailure("ACCESS_UNAVAILABLE", 1);
        ACCESS_UNAVAILABLE = localBrowserRuntimeFailure2;
        LocalBrowserRuntimeFailure localBrowserRuntimeFailure3 = new LocalBrowserRuntimeFailure("SESSION_LIMIT", 2);
        SESSION_LIMIT = localBrowserRuntimeFailure3;
        LocalBrowserRuntimeFailure localBrowserRuntimeFailure4 = new LocalBrowserRuntimeFailure("PROFILE_UNSUPPORTED", 3);
        PROFILE_UNSUPPORTED = localBrowserRuntimeFailure4;
        LocalBrowserRuntimeFailure localBrowserRuntimeFailure5 = new LocalBrowserRuntimeFailure("PROFILE_UNAVAILABLE", 4);
        PROFILE_UNAVAILABLE = localBrowserRuntimeFailure5;
        LocalBrowserRuntimeFailure localBrowserRuntimeFailure6 = new LocalBrowserRuntimeFailure("WEBVIEW_INITIALIZATION_FAILED", 5);
        WEBVIEW_INITIALIZATION_FAILED = localBrowserRuntimeFailure6;
        LocalBrowserRuntimeFailure localBrowserRuntimeFailure7 = new LocalBrowserRuntimeFailure("ENGINE_UNAVAILABLE", 6);
        ENGINE_UNAVAILABLE = localBrowserRuntimeFailure7;
        LocalBrowserRuntimeFailure localBrowserRuntimeFailure8 = new LocalBrowserRuntimeFailure("ENGINE_PREPARATION_TIMED_OUT", 7);
        ENGINE_PREPARATION_TIMED_OUT = localBrowserRuntimeFailure8;
        LocalBrowserRuntimeFailure localBrowserRuntimeFailure9 = new LocalBrowserRuntimeFailure("BLOCKED_POLICY_UNINSTALLED", 8);
        BLOCKED_POLICY_UNINSTALLED = localBrowserRuntimeFailure9;
        LocalBrowserRuntimeFailure localBrowserRuntimeFailure10 = new LocalBrowserRuntimeFailure("CONNECTION_FAILED", 9);
        CONNECTION_FAILED = localBrowserRuntimeFailure10;
        LocalBrowserRuntimeFailure[] localBrowserRuntimeFailureArr = {localBrowserRuntimeFailure, localBrowserRuntimeFailure2, localBrowserRuntimeFailure3, localBrowserRuntimeFailure4, localBrowserRuntimeFailure5, localBrowserRuntimeFailure6, localBrowserRuntimeFailure7, localBrowserRuntimeFailure8, localBrowserRuntimeFailure9, localBrowserRuntimeFailure10};
        $VALUES = localBrowserRuntimeFailureArr;
        $ENTRIES = C3cG.A0w(localBrowserRuntimeFailureArr);
    }

    public static Ey9<LocalBrowserRuntimeFailure> getEntries() {
        return $ENTRIES;
    }

    public static LocalBrowserRuntimeFailure valueOf(String str) {
        return (LocalBrowserRuntimeFailure) Enum.valueOf(LocalBrowserRuntimeFailure.class, str);
    }

    public static LocalBrowserRuntimeFailure[] values() {
        return (LocalBrowserRuntimeFailure[]) $VALUES.clone();
    }

    public LocalBrowserRuntimeFailure(String str, int i) {
    }
}
