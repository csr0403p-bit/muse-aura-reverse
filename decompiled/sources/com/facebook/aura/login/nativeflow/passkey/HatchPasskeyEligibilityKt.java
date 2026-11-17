package com.facebook.aura.login.nativeflow.passkey;

import X.BV6;
import X.C4001CjU;
import X.C60P;
import X.C7384Etj;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class HatchPasskeyEligibilityKt {
    public static final String CREDENTIAL_PROVIDER_SERVICE = "android.service.credentials.CredentialProviderService";

    public static final HatchPasskeyEligibility hatchPasskeyEligibility(Context context) {
        KeyguardManager keyguardManager;
        C7384Etj.A0Y(context, 0);
        boolean z = true;
        if (Build.VERSION.SDK_INT < 34) {
            z = false;
            if (!hasPlayServices(context)) {
                return HatchPasskeyEligibility.CREDENTIAL_MANAGER_UNAVAILABLE;
            }
        }
        Object systemService = context.getSystemService("keyguard");
        return ((systemService instanceof KeyguardManager) && (keyguardManager = (KeyguardManager) systemService) != null && keyguardManager.isDeviceSecure()) ? (!z || hasCredentialProvider(context)) ? HatchPasskeyEligibility.ELIGIBLE : HatchPasskeyEligibility.NO_CREDENTIAL_PROVIDER : HatchPasskeyEligibility.NO_SCREEN_LOCK;
    }

    public static final boolean hasPlayServices(Context context) {
        int iA01 = C4001CjU.A00.A01(context, 12451000);
        return iA01 == 0 || iA01 == 2;
    }

    public static final boolean hasCredentialProvider(Context context) {
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(C60P.A03(CREDENTIAL_PROVIDER_SERVICE), 131072);
        C7384Etj.A0U(listQueryIntentServices);
        return BV6.A1b(listQueryIntentServices);
    }
}
