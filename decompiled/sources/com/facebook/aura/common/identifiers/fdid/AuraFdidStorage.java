package com.facebook.aura.common.identifiers.fdid;

import X.BV5;
import X.BzK;
import X.C4oT;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class AuraFdidStorage {
    public static final AuraFdidStorage INSTANCE = new AuraFdidStorage();
    public static final String KEY_ID = "family_device_id";
    public static final String KEY_ORIGIN = "family_device_id_origin";
    public static final String KEY_SYNCED = "family_device_id_synced";
    public static final String KEY_TIMESTAMP = "family_device_id_timestamp";

    public void setPhoneId(String str, long j, String str2) {
        C7384Etj.A0Y(str, 0);
        BzK bzKA02 = BzK.A02(BV5.A0H());
        bzKA02.AYr(KEY_ID, str);
        bzKA02.AYp(KEY_TIMESTAMP, j);
        if (str2 != null) {
            bzKA02.AYr(KEY_ORIGIN, str2);
        } else {
            bzKA02.Aae(KEY_ORIGIN);
        }
        bzKA02.A0B(0);
    }

    private final C4oT getPrefs() {
        return BV5.A0H();
    }

    public String getPhoneId() {
        return C4oT.A00(BV5.A0H(), KEY_ID);
    }

    public String getPhoneIdOrigin() {
        return C4oT.A00(BV5.A0H(), KEY_ORIGIN);
    }

    public long getPhoneIdTimestamp() {
        return BV5.A08(BV5.A0H(), KEY_TIMESTAMP);
    }

    public boolean isPhoneIdSynced() {
        return BV5.A0H().getBoolean(KEY_SYNCED, false);
    }

    public void setPhoneIdSynced(boolean z) {
        BzK bzKA02 = BzK.A02(BV5.A0H());
        bzKA02.A0A(KEY_SYNCED, z);
        bzKA02.A0B(0);
    }
}
