package com.facebook.aura.auth.strategies;

import X.BzK;
import X.C4oT;
import X.C7384Etj;
import android.os.StrictMode;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class AuraLoginSessionId {
    public static final AuraLoginSessionId INSTANCE = new AuraLoginSessionId();
    public static final String NUX_SESSION_ID = "nux_session_id";

    public static /* synthetic */ String getSessionId$default(AuraLoginSessionId auraLoginSessionId, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return auraLoginSessionId.getSessionId(z);
    }

    public final String getSessionId(boolean z) {
        C4oT c4oT = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.LOGIN_ANALYTICS);
        String string = c4oT.getString(NUX_SESSION_ID, null);
        if (string != null && !z) {
            return string;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID uuidRandomUUID = UUID.randomUUID();
            C7384Etj.A0X(uuidRandomUUID);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            String string2 = uuidRandomUUID.toString();
            BzK bzKA02 = BzK.A02(c4oT);
            bzKA02.AYr(NUX_SESSION_ID, string2);
            bzKA02.apply();
            return string2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }
}
