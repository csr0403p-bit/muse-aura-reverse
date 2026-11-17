package com.facebook.analytics2.logger;

import X.AbstractC4063Cl8;
import X.BV4;
import X.C4001CjU;
import X.C4044Ckn;
import X.CFK;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

/* loaded from: classes5.dex */
public class GooglePlayServicesFactory {
    public static final String TAG = "GooglePlayServicesFactory";

    public static boolean canLoadUploaderService() throws ClassNotFoundException {
        try {
            Class.forName("com.facebook.analytics2.logger.GooglePlayUploadService");
            return true;
        } catch (ClassNotFoundException e) {
            CFK.A0E(TAG, "Can't class load GooglePlayUploadService %s, className: %s", e, "com.facebook.analytics2.logger.GooglePlayUploadService");
            return false;
        }
    }

    public static boolean canUseGooglePlayServices(Context context) throws PackageManager.NameNotFoundException {
        Bundle bundle;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null && (bundle = ((PackageItemInfo) applicationInfo).metaData) != null) {
                    return bundle.containsKey("com.google.android.gms.version");
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw BV4.A0e(e);
            }
        }
        return false;
    }

    public static AbstractC4063Cl8 createUploadSchedulerImpl(Context context) {
        String str;
        if (!canLoadUploaderService()) {
            str = "Not using Google Play services: failed to load GooglePlayUploadService.";
        } else {
            if (canUseGooglePlayServices(context)) {
                int iA01 = C4001CjU.A00.A01(context, 12451000);
                if (iA01 == 0) {
                    GooglePlayUploadService.A01(context);
                    return new C4044Ckn(context);
                }
                boolean z = GooglePlayServicesUtil.A00;
                CFK.A03(ConnectionResult.A00(iA01), TAG, "Failed to connect to Google Play services: %s");
                return null;
            }
            str = "Not using Google Play services: missing required manifest metadata.";
        }
        CFK.A05(TAG, str);
        return null;
    }
}
