package com.google.android.gms.common;

import X.CUF;
import X.CaT;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public abstract class GooglePlayServicesUtil {
    public static boolean A00;
    public static boolean A01;

    @Deprecated
    public static final AtomicBoolean A02 = new AtomicBoolean();
    public static final AtomicBoolean A03 = new AtomicBoolean();

    @Deprecated
    public static int A00(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static boolean A01(Context context) {
        try {
            if (!A00) {
                try {
                    PackageInfo packageInfo = CUF.A00(context).A00.getPackageManager().getPackageInfo(AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE, 64);
                    CaT.A00(context);
                    if (packageInfo == null || CaT.A01(packageInfo, false) || !CaT.A01(packageInfo, true)) {
                        A01 = false;
                    } else {
                        A01 = true;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                }
            }
            return A01 || !"user".equals(Build.TYPE);
        } finally {
            A00 = true;
        }
    }
}
