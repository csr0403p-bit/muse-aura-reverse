package com.facebook.aura.model;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06827l3;
import X.C7384Etj;
import X.C7BY;

/* loaded from: classes2.dex */
public abstract class BrowserTaskIdKt {
    public static final String BROWSER_TASK_ID_PREFIX = "browser-task:";
    public static final C06827l3 REGISTRATION_SUFFIX = new C06827l3(":r[1-9][0-9]*$");

    public static final String canonicalBrowserTaskId(String str) {
        C7384Etj.A0Y(str, 0);
        String strLogicalBrowserTaskId = logicalBrowserTaskId(AnonymousClass002.A0l(str));
        while (AnonymousClass005.A1a(strLogicalBrowserTaskId, BROWSER_TASK_ID_PREFIX)) {
            strLogicalBrowserTaskId = AnonymousClass002.A0l(C7BY.A0K(BROWSER_TASK_ID_PREFIX, strLogicalBrowserTaskId));
        }
        return strLogicalBrowserTaskId;
    }

    public static final String logicalBrowserTaskId(String str) {
        C7384Etj.A0Y(str, 0);
        return REGISTRATION_SUFFIX.A03(str, "");
    }
}
