package com.facebook.aura.common.prefs;

import X.BzK;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.C7cU;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class AuraDevicePrefs {
    public static final AuraDevicePrefs INSTANCE = new AuraDevicePrefs();

    public final C4oT get(AuraDevicePrefStore auraDevicePrefStore) {
        C7384Etj.A0Y(auraDevicePrefStore, 0);
        return AuraPrefsStorage.INSTANCE.get("device", auraDevicePrefStore.getKey$fbandroid_express_aura_java_com_facebook_aura_common_prefs_prefs());
    }

    public final void clearAll() {
        Iterator<AuraDevicePrefStore> it = AuraDevicePrefStore.getEntries().iterator();
        while (it.hasNext()) {
            BzK bzKA9q = AuraPrefsStorage.INSTANCE.get("device", it.next().getKey$fbandroid_express_aura_java_com_facebook_aura_common_prefs_prefs()).A9q();
            bzKA9q.A08();
            bzKA9q.apply();
        }
    }

    public final C7cU getFactory() {
        return C60O.A0E();
    }
}
