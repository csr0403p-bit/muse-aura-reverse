package com.facebook.aura.partners.voice.gating;

import X.C7384Etj;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* loaded from: classes2.dex */
public final class HatchPipCapability {
    public static final HatchPipCapability INSTANCE = new HatchPipCapability();

    public final boolean isAvailable(Context context) {
        ActivityManager activityManager;
        C7384Etj.A0Y(context, 0);
        return Build.VERSION.SDK_INT >= 31 && context.getPackageManager().hasSystemFeature("android.software.picture_in_picture") && (activityManager = (ActivityManager) context.getSystemService(ActivityManager.class)) != null && !activityManager.isLowRamDevice();
    }
}
