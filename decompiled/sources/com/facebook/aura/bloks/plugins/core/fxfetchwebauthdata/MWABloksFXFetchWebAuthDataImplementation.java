package com.facebook.aura.bloks.plugins.core.fxfetchwebauthdata;

import X.AnonymousClass003;
import X.BV4;
import X.C3cG;
import X.F6D;
import X.FBB;
import X.Hj6;
import com.facebook.aura.bloks.extensions.navigation.AuraNavigationExtensions;

/* loaded from: classes6.dex */
public final class MWABloksFXFetchWebAuthDataImplementation {
    public static final MWABloksFXFetchWebAuthDataImplementation INSTANCE = new MWABloksFXFetchWebAuthDataImplementation();

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        AnonymousClass003.A0u(hj6, f6d);
        AuraNavigationExtensions auraNavigationExtensions = AuraNavigationExtensions.INSTANCE;
        FBB fbb = f6d.A02;
        if (fbb == null) {
            throw BV4.A0U();
        }
        Object objOpenUrlWebAuthData = auraNavigationExtensions.openUrlWebAuthData(fbb.A02, f6d, hj6);
        return objOpenUrlWebAuthData == null ? C3cG.A0T() : objOpenUrlWebAuthData;
    }
}
