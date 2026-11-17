package com.facebook.aura.utils;

import X.BzK;
import X.C3cG;
import X.C3cH;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchPermissionRequestStore {
    public static final int $stable = 0;
    public static final HatchPermissionRequestStore INSTANCE = new HatchPermissionRequestStore();

    public final boolean isPermissionAlreadyRequested(String str) {
        C7384Etj.A0Y(str, 0);
        return getPrefs().getBoolean(FGI.A0M(str, "_requested_once"), false);
    }

    public final void markPermissionRequested(String str) {
        C7384Etj.A0Y(str, 0);
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.A0A(FGI.A0M(str, "_requested_once"), true);
        bzKA9q.apply();
    }

    private final String getPermissionKey(String str) {
        return FGI.A0M(str, "_requested_once");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.AbstractMap, java.util.HashMap] */
    private final C4oT getPrefs() {
        C4oT c4oT = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.PERMISSION_REQUESTS);
        if (!c4oT.getBoolean("migrated", false)) {
            BzK bzKA9q = c4oT.A9q();
            Iterator itA0i = C3cG.A0i(AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.PERMISSION_REQUESTS).ACL());
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                String strA0t = C60O.A0t(entryA0l);
                if (C3cG.A1P(entryA0l.getValue(), true)) {
                    bzKA9q.A0A(strA0t, true);
                }
            }
            bzKA9q.A0A("migrated", true);
            bzKA9q.apply();
        }
        return c4oT;
    }
}
