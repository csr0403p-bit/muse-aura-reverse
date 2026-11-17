package com.facebook.aura.model;

import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes2.dex */
public abstract class BrowserTaskExecutionJsonKt {
    public static final boolean isValidBrowserExecutionIdentity(String str) {
        C7384Etj.A0Y(str, 0);
        int length = str.length();
        if (length <= 0 || C3cG.A1S(str).length > 256 || !str.equals(AnonymousClass002.A0l(str))) {
            return false;
        }
        int i = 0;
        while (!Character.isISOControl(str.charAt(i))) {
            i++;
            if (i >= length) {
                return true;
            }
        }
        return false;
    }
}
