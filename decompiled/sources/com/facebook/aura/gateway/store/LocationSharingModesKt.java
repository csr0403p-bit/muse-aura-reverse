package com.facebook.aura.gateway.store;

import X.C7384Etj;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class LocationSharingModesKt {
    public static final LocationSharingMode deriveLocationMode(Context context) {
        C7384Etj.A0Y(context, 0);
        return !hasForegroundLocationPermission(context) ? LocationSharingMode.NEVER : hasBackgroundLocationPermission(context) ? LocationSharingMode.ALWAYS : LocationSharingMode.WHEN_CHATTING;
    }

    public static final boolean hasBackgroundLocationPermission(Context context) {
        C7384Etj.A0Y(context, 0);
        return context.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") == 0;
    }

    public static final boolean hasForegroundLocationPermission(Context context) {
        C7384Etj.A0Y(context, 0);
        return context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0;
    }
}
