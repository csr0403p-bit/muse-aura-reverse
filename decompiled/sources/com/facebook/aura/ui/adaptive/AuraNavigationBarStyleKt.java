package com.facebook.aura.ui.adaptive;

import X.BFM;
import X.C06G;

/* loaded from: classes.dex */
public abstract class AuraNavigationBarStyleKt {
    public static final AuraNavigationBarStyle auraNavigationBarStyle(BFM bfm, int i) {
        return C06G.A0p(bfm) ? AuraNavigationBarStyle.Docked : AuraNavigationBarStyle.Floating;
    }
}
