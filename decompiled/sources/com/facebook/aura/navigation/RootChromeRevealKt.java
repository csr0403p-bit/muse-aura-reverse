package com.facebook.aura.navigation;

import X.AT5;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.C1BO;
import X.C3UX;
import X.C78N;

/* loaded from: classes.dex */
public abstract class RootChromeRevealKt {
    public static final int ROOT_CHROME_REVEAL_DURATION_MS = 250;

    public static final C1BO<Float> rememberRootChromeRevealAlpha(BFM bfm, int i) {
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = AnonymousClass002.A0I(bfm, 1.0f);
        }
        AT5 at5 = (AT5) objAaT;
        C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, bfm.AaT(), obj);
        boolean zA1S = AnonymousClass005.A1S(bfm, auraNavigatorA0b, c3ux, at5);
        Object objAaT2 = bfm.AaT();
        if (zA1S || objAaT2 == obj) {
            objAaT2 = new RootChromeRevealKt$rememberRootChromeRevealAlpha$1$1(auraNavigatorA0b, c3ux, at5);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A19(bfm, objAaT2, auraNavigatorA0b, c3ux);
        return at5.A04;
    }
}
