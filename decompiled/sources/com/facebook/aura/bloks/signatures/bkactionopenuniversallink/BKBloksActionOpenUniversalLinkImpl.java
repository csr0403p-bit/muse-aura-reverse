package com.facebook.aura.bloks.signatures.bkactionopenuniversallink;

import X.AnonymousClass003;
import X.C3cG;
import X.F6D;
import X.Hj6;
import com.facebook.aura.bloks.extensions.navigation.AuraNavigationExtensions;

/* loaded from: classes6.dex */
public final class BKBloksActionOpenUniversalLinkImpl {
    public static final BKBloksActionOpenUniversalLinkImpl INSTANCE = new BKBloksActionOpenUniversalLinkImpl();

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        AnonymousClass003.A0u(hj6, f6d);
        Object objOpenInBrowser = AuraNavigationExtensions.INSTANCE.openInBrowser(f6d, hj6);
        return objOpenInBrowser == null ? C3cG.A0T() : objOpenInBrowser;
    }
}
