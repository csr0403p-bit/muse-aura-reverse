package com.facebook.aura.network.acs;

import X.BzK;
import X.C06H;
import X.C4oT;
import X.C7384Etj;
import com.facebook.aura.common.prefs.HatchPrefsStore;

/* loaded from: classes4.dex */
public final class OhaiAcsConfigStore {
    public static final Companion Companion = new Companion();
    public static final String KEY_FETCH_TIME_MS = "fetch_time_ms";
    public static final String KEY_RAW_ENVELOPE = "raw_envelope";

    public final void save(String str, long j) {
        C7384Etj.A0Y(str, 0);
        BzK bzKA9q = HatchPrefsStore.INSTANCE.acsConfigPrefs().A9q();
        bzKA9q.AYr(KEY_RAW_ENVELOPE, str);
        bzKA9q.AYp(KEY_FETCH_TIME_MS, j);
        bzKA9q.apply();
    }

    public final void clear() {
        BzK bzKA9q = HatchPrefsStore.INSTANCE.acsConfigPrefs().A9q();
        bzKA9q.A08();
        bzKA9q.apply();
    }

    public final StoredOhaiAcsConfig load() {
        C4oT c4oTAcsConfigPrefs = HatchPrefsStore.INSTANCE.acsConfigPrefs();
        String string = c4oTAcsConfigPrefs.getString(KEY_RAW_ENVELOPE, null);
        if (string != null) {
            OhaiAcsConfig ohaiAcsConfigVerifyAndParse = OhaiAcsConfigVerifier.INSTANCE.verifyAndParse(string);
            if (ohaiAcsConfigVerifyAndParse != null) {
                return new StoredOhaiAcsConfig(ohaiAcsConfigVerifyAndParse, c4oTAcsConfigPrefs.getLong(KEY_FETCH_TIME_MS, 0L));
            }
            clear();
        }
        return null;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
