package com.facebook.aura.user.provider;

import X.BzK;
import X.C60O;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;

/* loaded from: classes3.dex */
public final class AuraUserDataFetchState {
    public static final AuraUserDataFetchState INSTANCE = new AuraUserDataFetchState();

    public final boolean isFirstFetchPending() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.USER_DATA_FETCH).getBoolean("needs_blocking_fetch", true);
    }

    public final void markFetched() {
        BzK bzKA0F = C60O.A0F(AuraDevicePrefStore.USER_DATA_FETCH, AuraDevicePrefs.INSTANCE);
        bzKA0F.A0A("needs_blocking_fetch", false);
        bzKA0F.apply();
    }
}
