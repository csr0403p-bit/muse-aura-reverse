package com.facebook.aura.common.prefs;

import X.BzK;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.C7cU;
import java.io.File;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class AuraDevicePermanentPrefs {
    public static final AuraDevicePermanentPrefs INSTANCE = new AuraDevicePermanentPrefs();

    public final C4oT get(AuraDevicePermanentPrefStore auraDevicePermanentPrefStore) {
        C7384Etj.A0Y(auraDevicePermanentPrefStore, 0);
        return AuraPrefsStorage.INSTANCE.get(AuraPrefsKt.PERMANENT_SCOPE, auraDevicePermanentPrefStore.getKey$fbandroid_express_aura_java_com_facebook_aura_common_prefs_prefs());
    }

    public final File retiredStoreFile(String str) {
        C7384Etj.A0Y(str, 0);
        return AuraPrefsStorage.INSTANCE.file(AuraPrefsKt.PERMANENT_SCOPE, str);
    }

    public final void clearAll() {
        Iterator<AuraDevicePermanentPrefStore> it = AuraDevicePermanentPrefStore.getEntries().iterator();
        while (it.hasNext()) {
            BzK bzKA9q = AuraPrefsStorage.INSTANCE.get(AuraPrefsKt.PERMANENT_SCOPE, it.next().getKey$fbandroid_express_aura_java_com_facebook_aura_common_prefs_prefs()).A9q();
            bzKA9q.A08();
            bzKA9q.apply();
        }
    }

    public final C7cU getFactory() {
        return C60O.A0E();
    }
}
