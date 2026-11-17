package com.facebook.aura.login.credentials;

import X.AnonymousClass005;
import X.BzK;
import X.C4oT;
import X.C7384Etj;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;

/* loaded from: classes2.dex */
public final class AuraSavedCredentialsStore {
    public static final AuraSavedCredentialsStore INSTANCE = new AuraSavedCredentialsStore();
    public static final String KEY_EMAIL = "email";
    public static final String KEY_ID_FOR_AYMH = "id_for_aymh";
    public static final String KEY_ID_FOR_DBL_DATA = "dbl_data";
    public static final String KEY_NAME = "profile_name";
    public static final String KEY_PROFILE_PICTURE_URL = "profile_picture_url";

    public final void saveAYMHInfo(String str) {
        C7384Etj.A0Y(str, 0);
        BzK bzKA9q = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.SAVED_AYMH).A9q();
        bzKA9q.AYr(KEY_ID_FOR_AYMH, str);
        bzKA9q.apply();
    }

    public final void saveDBLInfo(String str) {
        C7384Etj.A0Y(str, 0);
        BzK bzKA9q = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.SAVED_DBL).A9q();
        bzKA9q.AYr(KEY_ID_FOR_DBL_DATA, str);
        bzKA9q.apply();
    }

    public final SavedAYMHData getSavedAYMHInfo() {
        return new SavedAYMHData(C4oT.A00(AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.SAVED_AYMH), KEY_ID_FOR_AYMH));
    }

    public final SavedCredentialData getSavedAccountInformation() {
        C4oT c4oT = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.SAVED_ACCOUNT);
        return new SavedCredentialData(c4oT.getString("email", null), c4oT.getString("profile_picture_url", null), c4oT.getString("profile_name", null));
    }

    public final SavedDBLData getSavedDBLInfo() {
        return new SavedDBLData(C4oT.A00(AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.SAVED_DBL), KEY_ID_FOR_DBL_DATA));
    }

    public final void removeAccountInformation() {
        BzK bzKA9q = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.SAVED_ACCOUNT).A9q();
        bzKA9q.A08();
        bzKA9q.apply();
    }

    public final void saveAccountInformation(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        BzK bzKA9q = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.SAVED_ACCOUNT).A9q();
        bzKA9q.AYr("email", str);
        bzKA9q.AYr("profile_picture_url", str2);
        bzKA9q.AYr("profile_name", str3);
        bzKA9q.apply();
    }
}
