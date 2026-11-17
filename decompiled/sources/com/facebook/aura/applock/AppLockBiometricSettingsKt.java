package com.facebook.aura.applock;

import X.AbstractC10542Hqu;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C2qU;
import X.C7384Etj;
import X.C8328Fbu;
import X.EXE;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes2.dex */
public abstract class AppLockBiometricSettingsKt {
    public static final int appLockAllowedAuthenticators;

    public static final C8328Fbu createAppLockPromptInfo(String str, String str2, String str3) {
        boolean zA1Z = AnonymousClass005.A1Z(str, str2, str3);
        String str4 = null;
        int i = appLockAllowedAuthenticators;
        if ((32768 & i) == 0) {
            str4 = str3;
        }
        return AbstractC10542Hqu.A00(null, str4, str2, str, i, zA1Z);
    }

    public static final int getBiometricStatus(Context context) {
        C7384Etj.A0Y(context, 0);
        return new EXE(new C2qU(context)).A00(15);
    }

    public static final void launchBiometricEnrollment(Context context) {
        Intent intent;
        C7384Etj.A0Y(context, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            intent = new Intent("android.settings.BIOMETRIC_ENROLL");
            intent.putExtra("android.provider.extra.BIOMETRIC_AUTHENTICATORS_ALLOWED", 15);
        } else {
            intent = new Intent("android.settings.SECURITY_SETTINGS");
        }
        boolean z = context instanceof Activity;
        if (!z) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.settings.SECURITY_SETTINGS");
            if (!z) {
                intent2.addFlags(268435456);
            }
            context.startActivity(intent2);
        }
    }

    static {
        appLockAllowedAuthenticators = Build.VERSION.SDK_INT >= 30 ? 32783 : 15;
    }

    public static final int getAppLockAllowedAuthenticators() {
        return appLockAllowedAuthenticators;
    }

    public static final boolean shouldOfferBiometricEnrollment(int i) {
        return AnonymousClass002.A1Q(i, 11);
    }

    public static final boolean shouldShowBiometricsSettings(int i) {
        return i == 0 || AnonymousClass002.A1Q(i, 11);
    }
}
