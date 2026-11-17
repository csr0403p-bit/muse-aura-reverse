package com.facebook.aura.localbrowser;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class LocalBrowserCloseReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LocalBrowserCloseReason[] $VALUES;
    public static final LocalBrowserCloseReason AGENT;
    public static final LocalBrowserCloseReason CONNECTION_FAILED;
    public static final LocalBrowserCloseReason DEVTOOLS_LOST;
    public static final LocalBrowserCloseReason DISABLED;
    public static final LocalBrowserCloseReason IDLE;
    public static final LocalBrowserCloseReason INITIALIZATION_FAILED;
    public static final LocalBrowserCloseReason RENDERER_GONE;
    public static final LocalBrowserCloseReason SIGNED_OUT;
    public static final LocalBrowserCloseReason USER;

    static {
        LocalBrowserCloseReason localBrowserCloseReason = new LocalBrowserCloseReason("USER", 0);
        USER = localBrowserCloseReason;
        LocalBrowserCloseReason localBrowserCloseReason2 = new LocalBrowserCloseReason("AGENT", 1);
        AGENT = localBrowserCloseReason2;
        LocalBrowserCloseReason localBrowserCloseReason3 = new LocalBrowserCloseReason("IDLE", 2);
        IDLE = localBrowserCloseReason3;
        LocalBrowserCloseReason localBrowserCloseReason4 = new LocalBrowserCloseReason("RENDERER_GONE", 3);
        RENDERER_GONE = localBrowserCloseReason4;
        LocalBrowserCloseReason localBrowserCloseReason5 = new LocalBrowserCloseReason("DISABLED", 4);
        DISABLED = localBrowserCloseReason5;
        LocalBrowserCloseReason localBrowserCloseReason6 = new LocalBrowserCloseReason("DEVTOOLS_LOST", 5);
        DEVTOOLS_LOST = localBrowserCloseReason6;
        LocalBrowserCloseReason localBrowserCloseReason7 = new LocalBrowserCloseReason("INITIALIZATION_FAILED", 6);
        INITIALIZATION_FAILED = localBrowserCloseReason7;
        LocalBrowserCloseReason localBrowserCloseReason8 = new LocalBrowserCloseReason("CONNECTION_FAILED", 7);
        CONNECTION_FAILED = localBrowserCloseReason8;
        LocalBrowserCloseReason localBrowserCloseReason9 = new LocalBrowserCloseReason("SIGNED_OUT", 8);
        SIGNED_OUT = localBrowserCloseReason9;
        LocalBrowserCloseReason[] localBrowserCloseReasonArr = {localBrowserCloseReason, localBrowserCloseReason2, localBrowserCloseReason3, localBrowserCloseReason4, localBrowserCloseReason5, localBrowserCloseReason6, localBrowserCloseReason7, localBrowserCloseReason8, localBrowserCloseReason9};
        $VALUES = localBrowserCloseReasonArr;
        $ENTRIES = C3cG.A0w(localBrowserCloseReasonArr);
    }

    public static Ey9<LocalBrowserCloseReason> getEntries() {
        return $ENTRIES;
    }

    public static LocalBrowserCloseReason valueOf(String str) {
        return (LocalBrowserCloseReason) Enum.valueOf(LocalBrowserCloseReason.class, str);
    }

    public static LocalBrowserCloseReason[] values() {
        return (LocalBrowserCloseReason[]) $VALUES.clone();
    }

    public LocalBrowserCloseReason(String str, int i) {
    }
}
