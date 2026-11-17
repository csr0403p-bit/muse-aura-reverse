package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;

/* renamed from: X.EyD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7498EyD {
    public static F2B A00(Context context) {
        F2B f2b;
        Integer num;
        String str;
        F2B f2b2;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName("com.facebook.appmanager", "com.facebook.oxygen.appmanager.firstparty.tos.ShouldAcceptTos");
        ComponentName componentName2 = new ComponentName("com.facebook.appmanager", "com.facebook.oxygen.appmanager.firstparty.tos.ShouldShowExplicitTos");
        try {
            packageManager.getClass();
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            int componentEnabledSetting2 = packageManager.getComponentEnabledSetting(componentName2);
            if (componentEnabledSetting == 0 || componentEnabledSetting2 == 0) {
                PackageManager packageManager2 = context.getPackageManager();
                try {
                    packageManager2.getClass();
                    packageManager2.getReceiverInfo(componentName, 0);
                    PackageManager packageManager3 = context.getPackageManager();
                    packageManager3.getClass();
                    packageManager3.getReceiverInfo(componentName2, 0);
                    PackageManager packageManager4 = context.getPackageManager();
                    try {
                        packageManager4.getClass();
                        packageInfo = packageManager4.getPackageInfo("com.facebook.appmanager", 0);
                        applicationInfo = packageInfo.applicationInfo;
                        applicationInfo.getClass();
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    f2b = ((applicationInfo.flags & 1) == 0 && (packageInfo.applicationInfo.flags & 128) == 0) ? new F2B(C79.A0C, true, false) : new F2B(C79.A0C, true, true);
                } catch (PackageManager.NameNotFoundException unused2) {
                    PackageManager packageManager5 = context.getPackageManager();
                    ComponentName componentName3 = new ComponentName("com.facebook.appmanager", "com.facebook.oxygen.appmanager.firstparty.tos.ShouldShowTos");
                    f2b = null;
                    try {
                        try {
                            packageManager5.getClass();
                            int componentEnabledSetting3 = packageManager5.getComponentEnabledSetting(componentName3);
                            if (componentEnabledSetting3 == 0) {
                                PackageManager packageManager6 = context.getPackageManager();
                                packageManager6.getClass();
                                packageManager6.getReceiverInfo(componentName3, 0);
                                f2b2 = new F2B(C79.A0C, true, true);
                            } else {
                                boolean z = componentEnabledSetting3 == 1;
                                f2b2 = new F2B(C79.A01, z, z);
                            }
                            f2b = f2b2;
                        } catch (IllegalArgumentException unused3) {
                            f2b = new F2B(C79.A0P, false, false);
                        }
                    } catch (Throwable unused4) {
                    }
                }
            } else {
                f2b = new F2B(C79.A01, AnonymousClass002.A1Q(componentEnabledSetting, 1), componentEnabledSetting2 == 1);
            }
        } catch (IllegalArgumentException unused5) {
            f2b = new F2B(C79.A0P, false, false);
        } catch (Throwable unused6) {
            f2b = null;
        }
        if (f2b != null) {
            str = "getTosFlow() componentBasedStatus tosFlow=";
        } else {
            Object systemService = context.getSystemService(HatchLinkOrderSheetKt.PHONE);
            systemService.getClass();
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            if (telephonyManager.getSimState() == 5) {
                String simOperator = telephonyManager.getSimOperator();
                if (simOperator.startsWith("2") || simOperator.startsWith("302")) {
                    num = C79.A0W;
                } else {
                    f2b = new F2B(C79.A0Y, true, false);
                    str = "getTosFlow() simBasedStatus tosFlow=";
                }
            } else {
                num = C79.A0T;
            }
            f2b = new F2B(num, true, true);
            str = "getTosFlow() simBasedStatus tosFlow=";
        }
        Log.d("TosState", AnonymousClass007.A0a(str, f2b));
        return f2b;
    }
}
