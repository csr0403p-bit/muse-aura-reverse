package com.facebook.aura.analytics.hatch;

import X.BzK;
import X.C3cG;
import X.C3cH;
import X.C4oT;
import X.C7384Etj;
import X.F2V;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;

/* loaded from: classes5.dex */
public final class HatchDeferredUtmStore {
    public static final int $stable = 0;
    public static final HatchDeferredUtmStore INSTANCE = new HatchDeferredUtmStore();
    public static final String KEY_CAPTURED_AT_MS = "hatch_deferred_utm_captured_at_ms";
    public static final String KEY_REFERRER = "hatch_deferred_utm_referrer";
    public static final int MAX_REFERRER_BYTES = 4096;
    public static final long REFERRER_LIFETIME_MS = 604800000;

    public final synchronized void capture(F2V f2v, long j) {
        C7384Etj.A0Y(f2v, 0);
        String strA0e = C3cH.A0e("&", HatchInstallReferrerParams.INSTANCE.utmParams(f2v));
        if (strA0e.length() == 0 || C3cG.A1S(strA0e).length > 4096) {
            clear();
        } else {
            BzK bzKA02 = BzK.A02(AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.INSTALL_REFERRER));
            bzKA02.AYr(KEY_REFERRER, strA0e);
            bzKA02.AYp(KEY_CAPTURED_AT_MS, j);
            bzKA02.A0B(0);
        }
    }

    public final synchronized void clear() {
        BzK bzKA02 = BzK.A02(AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.INSTALL_REFERRER));
        bzKA02.Aae(KEY_REFERRER);
        bzKA02.Aae(KEY_CAPTURED_AT_MS);
        bzKA02.A0B(0);
    }

    public final synchronized String getPendingReferrer(long j) {
        C4oT c4oT = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.INSTALL_REFERRER);
        String string = c4oT.getString(KEY_REFERRER, null);
        if (string != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                long j2 = c4oT.getLong(KEY_CAPTURED_AT_MS, 0L);
                if (j2 > 0 && j >= j2 && j - j2 <= 604800000) {
                    return string;
                }
                clear();
                return null;
            }
        }
        return null;
    }

    public static /* synthetic */ void capture$default(HatchDeferredUtmStore hatchDeferredUtmStore, F2V f2v, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        hatchDeferredUtmStore.capture(f2v, j);
    }

    public static /* synthetic */ String getPendingReferrer$default(HatchDeferredUtmStore hatchDeferredUtmStore, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return hatchDeferredUtmStore.getPendingReferrer(j);
    }

    private final C4oT getPrefs() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.INSTALL_REFERRER);
    }
}
