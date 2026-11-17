package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes5.dex */
public final class CTN {
    public boolean A00;
    public final Context A01;
    public final SharedPreferences A02;
    public final CTQ A03;

    public CTN(Context context, CTQ ctq, String str) {
        boolean z;
        Context context2;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        this.A01 = contextCreateDeviceProtectedStorageContext;
        SharedPreferences sharedPreferencesA07 = BV4.A07(contextCreateDeviceProtectedStorageContext, FGI.A0M("com.google.firebase.common.prefs:", str));
        this.A02 = sharedPreferencesA07;
        this.A03 = ctq;
        if (sharedPreferencesA07.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferencesA07.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                context2 = this.A01;
                packageManager = context2.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context2.getPackageName(), 128)) == null || (bundle = ((PackageItemInfo) applicationInfo).metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) ? true : ((PackageItemInfo) applicationInfo).metaData.getBoolean("firebase_data_collection_default_enabled");
        }
        this.A00 = z;
    }
}
