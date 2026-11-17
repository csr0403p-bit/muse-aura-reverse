package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper;
import java.util.List;

/* loaded from: classes5.dex */
public final class CSi {
    public String A00;
    public int A01;
    public int A02 = 0;
    public String A03;
    public final Context A04;

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r2v0 X.CSi) */
    public static final synchronized void A02(CSi cSi) {
        synchronized (cSi) {
            PackageInfo packageInfoA00 = cSi.A00(cSi.A04.getPackageName());
            if (packageInfoA00 != null) {
                cSi.A03 = Integer.toString(packageInfoA00.versionCode);
                cSi.A00 = packageInfoA00.versionName;
            }
        }
    }

    public final synchronized int A03() {
        int i = this.A02;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.A04.getPackageManager();
        int i2 = 0;
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE) == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
        } else {
            Intent intentA03 = C60P.A03("com.google.iid.TOKEN_REQUEST");
            intentA03.setPackage(AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE);
            List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intentA03, 0);
            i2 = 2;
            if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            }
            this.A02 = 2;
        }
        return i2;
    }

    public final synchronized int A04() {
        PackageInfo packageInfoA00;
        if (this.A01 == 0 && (packageInfoA00 = A00(AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE)) != null) {
            this.A01 = packageInfoA00.versionCode;
        }
        return this.A01;
    }

    public final synchronized String A05() {
        if (this.A03 == null) {
            A02(this);
        }
        return this.A03;
    }

    private final PackageInfo A00(String str) {
        try {
            return this.A04.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String strValueOf = String.valueOf(e);
            Log.w("FirebaseInstanceId", C60P.A1M("Failed to find package ", strValueOf, BV4.A0p(BV5.A04(strValueOf) + 23)));
            return null;
        }
    }

    public CSi(Context context) {
        this.A04 = context;
    }

    public static String A01(C3554CTr c3554CTr) {
        C3554CTr.A01(c3554CTr);
        C3557CTu c3557CTu = c3554CTr.A01;
        String str = c3557CTu.A01;
        if (str == null) {
            C3554CTr.A01(c3554CTr);
            str = c3557CTu.A00;
            if (str.startsWith("1:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length >= 2) {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                    }
                }
                return null;
            }
        }
        return str;
    }
}
