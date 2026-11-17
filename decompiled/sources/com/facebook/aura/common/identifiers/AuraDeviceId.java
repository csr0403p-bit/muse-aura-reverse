package com.facebook.aura.common.identifiers;

import X.AnonymousClass001;
import X.BV5;
import X.BzK;
import X.C3cG;
import X.C4JM;
import X.C4oT;
import android.app.Application;
import android.provider.Settings;

/* loaded from: classes5.dex */
public final class AuraDeviceId {
    public static final String DEVICE_ID_KEY = "device_id";
    public static final AuraDeviceId INSTANCE = new AuraDeviceId();
    public static final String NODE_DEVICE_ID_KEY = "node_device_id";

    public final synchronized String get() {
        String strA00;
        C4oT c4oTA0H = BV5.A0H();
        strA00 = C4oT.A00(c4oTA0H, "device_id");
        if (strA00 == null) {
            strA00 = AnonymousClass001.A0u(BV5.A0j());
            BzK bzKA02 = BzK.A02(c4oTA0H);
            bzKA02.AYr("device_id", strA00);
            bzKA02.apply();
        }
        return AnonymousClass001.A0u(strA00);
    }

    public final synchronized String getNodeId() {
        String string;
        C4oT c4oTA0H = BV5.A0H();
        String string2 = null;
        string = c4oTA0H.getString(NODE_DEVICE_ID_KEY, null);
        if (string == null) {
            Application application = C4JM.A00;
            if (application == null) {
                throw C3cG.A0Q("AppContext not initialized");
            }
            try {
                string2 = Settings.Secure.getString(application.getContentResolver(), "android_id");
            } catch (RuntimeException unused) {
            }
            string = string2 == null ? AnonymousClass001.A0u(BV5.A0j()) : string2;
            BzK bzKA02 = BzK.A02(c4oTA0H);
            bzKA02.AYr(NODE_DEVICE_ID_KEY, string);
            bzKA02.apply();
        }
        return AnonymousClass001.A0u(string);
    }
}
