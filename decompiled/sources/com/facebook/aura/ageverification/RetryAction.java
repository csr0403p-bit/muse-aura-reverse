package com.facebook.aura.ageverification;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class RetryAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ RetryAction[] $VALUES;
    public static final RetryAction RECAPTURE;
    public static final RetryAction RECHECK;
    public static final RetryAction REDOWNLOAD;
    public static final RetryAction REFRESH;
    public static final RetryAction RESEND;

    static {
        RetryAction retryAction = new RetryAction("RECAPTURE", 0);
        RECAPTURE = retryAction;
        RetryAction retryAction2 = new RetryAction("RESEND", 1);
        RESEND = retryAction2;
        RetryAction retryAction3 = new RetryAction("RECHECK", 2);
        RECHECK = retryAction3;
        RetryAction retryAction4 = new RetryAction("REDOWNLOAD", 3);
        REDOWNLOAD = retryAction4;
        RetryAction retryAction5 = new RetryAction("REFRESH", 4);
        REFRESH = retryAction5;
        RetryAction[] retryActionArr = {retryAction, retryAction2, retryAction3, retryAction4, retryAction5};
        $VALUES = retryActionArr;
        $ENTRIES = C3cG.A0w(retryActionArr);
    }

    public static Ey9<RetryAction> getEntries() {
        return $ENTRIES;
    }

    public static RetryAction valueOf(String str) {
        return (RetryAction) Enum.valueOf(RetryAction.class, str);
    }

    public static RetryAction[] values() {
        return (RetryAction[]) $VALUES.clone();
    }

    public RetryAction(String str, int i) {
    }
}
