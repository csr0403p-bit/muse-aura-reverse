package com.facebook.aura.utils;

import X.AbstractC4103Cmd;
import X.AnonymousClass794;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.C7OQ;
import X.C7OU;
import X.C7VR;
import X.G0U;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class HatchNotificationPermissionLauncherKt {
    public static final boolean isFirstNotificationPromptPending(Context context) {
        C7384Etj.A0Y(context, 0);
        return (Build.VERSION.SDK_INT < 33 || AbstractC4103Cmd.A02(context, "android.permission.POST_NOTIFICATIONS") == 0 || HatchPermissionRequestStore.INSTANCE.isPermissionAlreadyRequested("android.permission.POST_NOTIFICATIONS")) ? false : true;
    }

    public static final C7OU<String, Boolean> rememberNotificationPermissionLauncher(G0U<? super Boolean, Unit> g0u, BFM bfm, int i, int i2) {
        boolean z = true;
        if ((i2 & 1) != 0) {
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchNotificationPermissionLauncherKt$rememberNotificationPermissionLauncher$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            g0u = (G0U) objAaT;
        }
        AnonymousClass794 anonymousClass794 = new AnonymousClass794();
        if ((((i & 14) ^ 6) <= 4 || !bfm.A65(g0u)) && (i & 6) != 4) {
            z = false;
        }
        Object objAaT2 = bfm.AaT();
        if (z || objAaT2 == C78N.A00) {
            objAaT2 = new HatchNotificationPermissionLauncherKt$rememberNotificationPermissionLauncher$2$1(g0u);
            bfm.Ai0(objAaT2);
        }
        return C7OQ.A00(anonymousClass794, bfm, (G0U) objAaT2);
    }

    public static final boolean canRequestNotificationPermission(Activity activity) {
        if (activity == null || Build.VERSION.SDK_INT < 33 || AbstractC4103Cmd.A02(activity, "android.permission.POST_NOTIFICATIONS") == 0) {
            return false;
        }
        return !HatchPermissionRequestStore.INSTANCE.isPermissionAlreadyRequested("android.permission.POST_NOTIFICATIONS") || C7VR.A01(activity, "android.permission.POST_NOTIFICATIONS");
    }
}
