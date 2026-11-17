package com.facebook.aura.mobileconfig.session;

import X.BFI;
import com.facebook.aura.mobileconfig.session.MC;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class AuraUserSessionKt {
    public static final Set<Integer> CRITICAL_CONFIG_KEYS = BFI.A0H(new Integer[]{Integer.valueOf(MC.hatch_android.CONFIG_ID), Integer.valueOf(MC.hatch_android_networking.CONFIG_ID), Integer.valueOf(MC.hatch_android_onboarding_abra.CONFIG_ID), Integer.valueOf(MC.hatch_android_employee.CONFIG_ID), Integer.valueOf(MC.hatch_android_traffic_nts_v2.CONFIG_ID), Integer.valueOf(MC.hatch_android_wear.CONFIG_ID)});
    public static final int DEFERRED_FETCH_ATTEMPTS = 5;
    public static final long DEFERRED_FETCH_RETRY_DELAY_MS = 500;
    public static final long SYNC_FETCH_TIME_OUT_MS = 6000;
    public static final long SYNC_FETCH_TIME_OUT_MS_JEST_AND_SANDBOX = 60000;
    public static final String TAG = "AuraUserSession";
}
