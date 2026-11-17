package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes5.dex */
public final class CGT {
    public static String A00 = "Unknown";
    public static int A01;
    public static volatile boolean A02;

    public static final void A00(Context context) {
        if (A02) {
            return;
        }
        synchronized (CGT.class) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    A01 = packageInfo.versionCode;
                    String str = packageInfo.versionName;
                    if (str == null) {
                        str = "";
                    }
                    A00 = str;
                    C7384Etj.A0T(packageInfo.packageName);
                    A02 = true;
                } else {
                    CFK.A0I("ApplicationManifestHelper", "Package info for %s is null", context.getPackageName());
                }
            } catch (PackageManager.NameNotFoundException e) {
                CFK.A0C("ApplicationManifestHelper", "Failed to get package info for %s", e, context.getPackageName());
            }
        }
    }
}
