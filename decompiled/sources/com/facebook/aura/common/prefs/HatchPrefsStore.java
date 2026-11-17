package com.facebook.aura.common.prefs;

import X.AbstractC3358CGz;
import X.C4oT;
import X.C7384Etj;
import X.CH0;

/* loaded from: classes3.dex */
public final class HatchPrefsStore {
    public static final HatchPrefsStore INSTANCE = new HatchPrefsStore();

    public final C4oT acsTokenPrefs(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return AuraUserPrefs.INSTANCE.get(((CH0) abstractC3358CGz).A01, AuraUserPrefStore.ACS_TOKENS);
    }

    public final C4oT userPrefs(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return AuraUserPrefs.INSTANCE.get(((CH0) abstractC3358CGz).A01, AuraUserPrefStore.COMMON);
    }

    public final C4oT abraTokenPrefs() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.ABRA_TOKENS);
    }

    public final C4oT acsConfigPrefs() {
        return AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.ACS_CONFIG);
    }

    public final C4oT authPrefs() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.AUTH);
    }

    public final C4oT internalPrefs() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.INTERNAL_SETTINGS);
    }

    public final C4oT metaTokenPrefs() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.META_TOKENS);
    }

    public final C4oT metaUserSessionPrefs() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.META_USER_SESSION);
    }
}
