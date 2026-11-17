package com.facebook.aura.localbrowser;

import X.BQG;
import X.C7384Etj;

/* loaded from: classes2.dex */
public abstract class LocalBrowserTakeoverJournalJsonKt {
    public static final int TAKEOVER_TEXT_LIMIT = 500;

    public static final TakeoverActivityJson takeoverActivityNavigated(String str) {
        C7384Etj.A0Y(str, 0);
        return new TakeoverActivityJson("navigated", BQG.A17(str, 500), null, null, null, null);
    }

    public static final TakeoverActivityJson takeoverActivityTab(boolean z, String str) {
        C7384Etj.A0Y(str, 1);
        return new TakeoverActivityJson(z ? "tab_opened" : "tab_closed", BQG.A17(str, 500), null, null, null, null);
    }

    public static final String clipped(String str) {
        return BQG.A17(str, 500);
    }
}
