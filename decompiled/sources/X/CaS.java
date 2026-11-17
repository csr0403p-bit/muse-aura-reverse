package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper;
import com.google.android.gms.common.GooglePlayServicesUtil;

/* loaded from: classes5.dex */
public abstract class CaS {
    public static boolean A00(Context context, int i) throws PackageManager.NameNotFoundException {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) CUF.A00(context).A00.getSystemService("appops");
            if (appOpsManager == null) {
                throw BV4.A0a("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE);
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE, 64);
                CaT caTA00 = CaT.A00(context);
                if (packageInfo == null) {
                    return false;
                }
                if (CaT.A01(packageInfo, false)) {
                    return true;
                }
                if (!CaT.A01(packageInfo, true)) {
                    return false;
                }
                if (GooglePlayServicesUtil.A01(caTA00.A00)) {
                    return true;
                }
                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (!Log.isLoggable("UidVerifier", 3)) {
                    return false;
                }
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                return false;
            }
        } catch (SecurityException unused2) {
            return false;
        }
    }
}
