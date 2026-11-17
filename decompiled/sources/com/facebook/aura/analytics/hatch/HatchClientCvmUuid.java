package com.facebook.aura.analytics.hatch;

import X.BV5;
import X.BzK;
import X.C4oT;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;

/* loaded from: classes5.dex */
public final class HatchClientCvmUuid {
    public static final int $stable = 0;
    public static final HatchClientCvmUuid INSTANCE = new HatchClientCvmUuid();
    public static final String KEY_UUID = "client_cvm_uuid";

    public final synchronized void clear() {
        BzK bzKA02 = BzK.A02(AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.CLIENT_CVM_ANALYTICS));
        bzKA02.Aae(KEY_UUID);
        bzKA02.apply();
    }

    public final synchronized String getOrCreate() {
        String strA00;
        C4oT c4oT = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.CLIENT_CVM_ANALYTICS);
        strA00 = C4oT.A00(c4oT, KEY_UUID);
        if (strA00 == null) {
            strA00 = BV5.A0j();
            BzK bzKA02 = BzK.A02(c4oT);
            bzKA02.AYr(KEY_UUID, strA00);
            bzKA02.apply();
        }
        return strA00;
    }

    private final C4oT prefs() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.CLIENT_CVM_ANALYTICS);
    }
}
