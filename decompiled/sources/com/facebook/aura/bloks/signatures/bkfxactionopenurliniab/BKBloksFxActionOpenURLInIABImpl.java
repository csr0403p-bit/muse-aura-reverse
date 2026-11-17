package com.facebook.aura.bloks.signatures.bkfxactionopenurliniab;

import X.AnonymousClass003;
import X.C3cG;
import X.F6D;
import X.Hj6;
import com.facebook.aura.bloks.extensions.navigation.AuraNavigationExtensions;

/* loaded from: classes6.dex */
public final class BKBloksFxActionOpenURLInIABImpl {
    public static final BKBloksFxActionOpenURLInIABImpl INSTANCE = new BKBloksFxActionOpenURLInIABImpl();

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        AnonymousClass003.A0u(hj6, f6d);
        Object objOpenUrlInIAB = AuraNavigationExtensions.INSTANCE.openUrlInIAB(f6d, hj6);
        return objOpenUrlInIAB == null ? C3cG.A0T() : objOpenUrlInIAB;
    }
}
