package com.facebook.aura.localbrowser;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LocalBrowserPageFailure {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LocalBrowserPageFailure[] $VALUES;
    public static final LocalBrowserPageFailure HTTP_ERROR;
    public static final LocalBrowserPageFailure LOAD_FAILED;
    public static final LocalBrowserPageFailure TLS_ERROR;
    public static final LocalBrowserPageFailure UNSUPPORTED_NATIVE_INTERACTION;
    public static final LocalBrowserPageFailure URL_UNSUPPORTED;

    static {
        LocalBrowserPageFailure localBrowserPageFailure = new LocalBrowserPageFailure("URL_UNSUPPORTED", 0);
        URL_UNSUPPORTED = localBrowserPageFailure;
        LocalBrowserPageFailure localBrowserPageFailure2 = new LocalBrowserPageFailure("LOAD_FAILED", 1);
        LOAD_FAILED = localBrowserPageFailure2;
        LocalBrowserPageFailure localBrowserPageFailure3 = new LocalBrowserPageFailure("HTTP_ERROR", 2);
        HTTP_ERROR = localBrowserPageFailure3;
        LocalBrowserPageFailure localBrowserPageFailure4 = new LocalBrowserPageFailure("TLS_ERROR", 3);
        TLS_ERROR = localBrowserPageFailure4;
        LocalBrowserPageFailure localBrowserPageFailure5 = new LocalBrowserPageFailure("UNSUPPORTED_NATIVE_INTERACTION", 4);
        UNSUPPORTED_NATIVE_INTERACTION = localBrowserPageFailure5;
        LocalBrowserPageFailure[] localBrowserPageFailureArr = {localBrowserPageFailure, localBrowserPageFailure2, localBrowserPageFailure3, localBrowserPageFailure4, localBrowserPageFailure5};
        $VALUES = localBrowserPageFailureArr;
        $ENTRIES = C3cG.A0w(localBrowserPageFailureArr);
    }

    public static Ey9<LocalBrowserPageFailure> getEntries() {
        return $ENTRIES;
    }

    public static LocalBrowserPageFailure valueOf(String str) {
        return (LocalBrowserPageFailure) Enum.valueOf(LocalBrowserPageFailure.class, str);
    }

    public static LocalBrowserPageFailure[] values() {
        return (LocalBrowserPageFailure[]) $VALUES.clone();
    }

    public LocalBrowserPageFailure(String str, int i) {
    }
}
