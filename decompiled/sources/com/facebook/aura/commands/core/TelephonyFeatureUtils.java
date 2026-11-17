package com.facebook.aura.commands.core;

import X.C7384Etj;
import android.content.Context;
import android.telephony.TelephonyManager;

/* loaded from: classes3.dex */
public final class TelephonyFeatureUtils {
    public static final int $stable = 0;
    public static final TelephonyFeatureUtils INSTANCE = new TelephonyFeatureUtils();

    public final boolean hasCalling(Context context) {
        TelephonyManager telephonyManager;
        C7384Etj.A0Y(context, 0);
        return hasTelephony(context) && (telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class)) != null && telephonyManager.isVoiceCapable();
    }

    public final boolean hasMessaging(Context context) {
        TelephonyManager telephonyManager;
        C7384Etj.A0Y(context, 0);
        return hasTelephony(context) && (telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class)) != null && telephonyManager.isSmsCapable();
    }

    private final TelephonyManager telephonyManager(Context context) {
        return (TelephonyManager) context.getSystemService(TelephonyManager.class);
    }

    private final boolean hasTelephony(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }
}
