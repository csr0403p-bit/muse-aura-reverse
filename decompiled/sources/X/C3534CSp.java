package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.PowerWhitelistManager;
import java.util.HashSet;

/* renamed from: X.CSp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3534CSp {
    public final Context A00;
    public final PackageManager A01;

    public final CZr A00() throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PowerWhitelistManager powerWhitelistManager;
        try {
            PackageManager packageManager = this.A01;
            PackageInfo packageInfo = packageManager.getPackageInfo("com.facebook.services", 192);
            if (packageInfo.applicationInfo == null) {
                return null;
            }
            Integer numA00 = CQO.A00(packageInfo);
            HashSet hashSetA13 = C60O.A13();
            if (packageManager.checkPermission("android.permission.CHANGE_DEVICE_IDLE_TEMP_WHITELIST", "com.facebook.services") != 0) {
                hashSetA13.add(CZm.FACEBOOK_SERVICES_NO_PERMISSION);
            }
            boolean zIsWhitelisted = false;
            try {
                powerWhitelistManager = (PowerWhitelistManager) this.A00.getSystemService(PowerWhitelistManager.class);
            } catch (Throwable unused) {
            }
            if (powerWhitelistManager != null) {
                zIsWhitelisted = powerWhitelistManager.isWhitelisted("com.facebook.services", true);
                if (!zIsWhitelisted) {
                }
                boolean z = packageInfo.applicationInfo.enabled;
                int i = packageInfo.versionCode;
                boolean zIsEmpty = hashSetA13.isEmpty();
                applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null && (bundle = ((PackageItemInfo) applicationInfo).metaData) != null) {
                    bundle.getInt("com.facebook.services.api.level", 1);
                }
                return new CZr(numA00, hashSetA13, i, z, zIsEmpty);
            }
            hashSetA13.add(CZm.FACEBOOK_SERVICES_NO_DOZE_MODE_WHITELIST);
            boolean z2 = packageInfo.applicationInfo.enabled;
            int i2 = packageInfo.versionCode;
            boolean zIsEmpty2 = hashSetA13.isEmpty();
            applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                bundle.getInt("com.facebook.services.api.level", 1);
            }
            return new CZr(numA00, hashSetA13, i2, z2, zIsEmpty2);
        } catch (PackageManager.NameNotFoundException unused2) {
            return null;
        }
    }

    public C3534CSp(Context context, PackageManager packageManager) {
        this.A01 = packageManager;
        this.A00 = context;
    }
}
