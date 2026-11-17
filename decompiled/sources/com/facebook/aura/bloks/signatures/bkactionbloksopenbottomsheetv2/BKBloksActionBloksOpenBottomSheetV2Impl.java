package com.facebook.aura.bloks.signatures.bkactionbloksopenbottomsheetv2;

import X.AnonymousClass003;
import X.BV4;
import X.F6D;
import X.FBB;
import X.Hj6;
import com.facebook.aura.bloks.extensions.navigation.AuraNavigationExtensions;

/* loaded from: classes6.dex */
public final class BKBloksActionBloksOpenBottomSheetV2Impl {
    public static final BKBloksActionBloksOpenBottomSheetV2Impl INSTANCE = new BKBloksActionBloksOpenBottomSheetV2Impl();

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        AnonymousClass003.A0u(hj6, f6d);
        AuraNavigationExtensions auraNavigationExtensions = AuraNavigationExtensions.INSTANCE;
        FBB fbb = f6d.A02;
        if (fbb != null) {
            return auraNavigationExtensions.openBottomSheetV2(fbb.A02, f6d, hj6);
        }
        throw BV4.A0U();
    }
}
