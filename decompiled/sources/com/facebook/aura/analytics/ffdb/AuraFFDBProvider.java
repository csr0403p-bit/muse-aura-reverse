package com.facebook.aura.analytics.ffdb;

import X.BzK;
import X.C06H;
import X.C4oT;
import X.C7384Etj;
import X.InterfaceC4071ClJ;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import com.facebook.crudolib.prefs.LightSharedPreferencesImpl;
import com.facebook.falco.fabric.FFSingletonJNILogger;

/* loaded from: classes5.dex */
public final class AuraFFDBProvider implements InterfaceC4071ClJ {
    public static final Companion Companion = new Companion();
    public static final String FFDB_TOKEN_PREF_KEY = "ffdb_token";
    public String ffdbToken;
    public final C4oT prefs;

    public void setFFDBToken(String str) {
        C7384Etj.A0Y(str, 0);
        this.ffdbToken = str;
        BzK bzKA02 = BzK.A02(this.prefs);
        bzKA02.AYr(FFDB_TOKEN_PREF_KEY, str);
        bzKA02.apply();
        FFSingletonJNILogger.setFFDBToken(str);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public String getDebugUserId() {
        return "";
    }

    public boolean getShouldRequestDebugConfig() {
        return false;
    }

    public AuraFFDBProvider() {
        C4oT c4oT = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.FFDB);
        this.prefs = c4oT;
        this.ffdbToken = "";
        String string = c4oT.getString(FFDB_TOKEN_PREF_KEY, "");
        String str = string != null ? string : "";
        this.ffdbToken = str;
        FFSingletonJNILogger.setFFDBToken(str);
    }

    @Override // X.InterfaceC4071ClJ
    public String getFFDBToken() {
        String fFDBToken = FFSingletonJNILogger.getFFDBToken();
        String str = this.ffdbToken;
        if (str.length() > 0 && !str.equals(fFDBToken)) {
            C7384Etj.A0X(fFDBToken);
            this.ffdbToken = fFDBToken;
            LightSharedPreferencesImpl lightSharedPreferencesImpl = (LightSharedPreferencesImpl) this.prefs;
            LightSharedPreferencesImpl.A02(lightSharedPreferencesImpl);
            BzK bzK = new BzK(lightSharedPreferencesImpl);
            bzK.AYr(FFDB_TOKEN_PREF_KEY, fFDBToken);
            bzK.apply();
        }
        C7384Etj.A0X(fFDBToken);
        return fFDBToken;
    }

    public void setDebugUserId(String str) {
    }

    public void setShouldRequestDebugConfig(boolean z) {
    }
}
