package com.facebook.aura.vds.compose.card;

import X.AnonymousClass001;
import X.BFM;
import X.C1AC;

/* loaded from: classes.dex */
public abstract class SettingsKt {
    public static final AuraCardStyle cardStyleForSettings(C1AC c1ac, BFM bfm, int i, int i2) {
        if ((i2 & 1) != 0) {
            c1ac = null;
        }
        bfm.AgE(-1293489471);
        AuraCardStyle auraCardStyleListSettings = AuraCardStyles.INSTANCE.listSettings(c1ac, bfm, i & 14, 0);
        AnonymousClass001.A1D(bfm);
        return auraCardStyleListSettings;
    }
}
