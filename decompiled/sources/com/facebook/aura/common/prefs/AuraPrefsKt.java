package com.facebook.aura.common.prefs;

import X.BzK;
import X.C4oT;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class AuraPrefsKt {
    public static final String DEVICE_SCOPE = "device";
    public static final String PERMANENT_SCOPE = "permanent";

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractMap, java.util.HashMap] */
    public static final Set<String> getScopedIds(AuraDevicePrefStore auraDevicePrefStore) {
        return AuraDevicePrefs.INSTANCE.get(auraDevicePrefStore).ACL().keySet();
    }

    public static final void rememberScopedId(AuraDevicePrefStore auraDevicePrefStore, String str) {
        C4oT c4oT = AuraDevicePrefs.INSTANCE.get(auraDevicePrefStore);
        if (c4oT.contains(str)) {
            return;
        }
        BzK bzKA9q = c4oT.A9q();
        bzKA9q.A0A(str, true);
        bzKA9q.apply();
    }
}
