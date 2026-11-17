package com.facebook.aura.ui.adaptive;

import X.AnonymousClass002;
import X.BFM;
import X.C06G;

/* loaded from: classes.dex */
public abstract class AuraGridKt {
    /* renamed from: auraGridColumns-WMci_g0, reason: not valid java name */
    public static final int m2362auraGridColumnsWMci_g0(int i, float f, float f2, BFM bfm, int i2, int i3) {
        bfm.AgE(2005989161);
        if ((i3 & 4) != 0) {
            f2 = AuraLayoutSizeKt.auraLayoutWidth(bfm, 0);
        }
        if (!C06G.A0p(bfm)) {
            i = Math.max(i, (int) (f2 / f));
        }
        AnonymousClass002.A19(bfm);
        return i;
    }
}
