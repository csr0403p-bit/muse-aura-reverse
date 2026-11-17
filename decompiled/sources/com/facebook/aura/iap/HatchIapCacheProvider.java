package com.facebook.aura.iap;

import X.BzK;
import X.C4oT;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class HatchIapCacheProvider {
    public final C4oT prefs;

    /* renamed from: com.facebook.aura.iap.HatchIapCacheProvider$get$1, reason: invalid class name */
    public final class AnonymousClass1 {
        public AnonymousClass1() {
        }

        public boolean isPurchaseSyncRequired() {
            return HatchIapCacheProvider.this.prefs.getBoolean("is_purchase_sync_required", true);
        }

        public void setPurchaseSyncRequired(boolean z) {
            BzK bzKA02 = BzK.A02(HatchIapCacheProvider.this.prefs);
            bzKA02.A0A("is_purchase_sync_required", z);
            bzKA02.apply();
        }
    }

    public HatchIapCacheProvider(C4oT c4oT) {
        C7384Etj.A0Y(c4oT, 0);
        this.prefs = c4oT;
    }

    public AnonymousClass1 get() {
        return new AnonymousClass1();
    }
}
