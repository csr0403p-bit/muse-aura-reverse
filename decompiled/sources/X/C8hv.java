package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;

/* renamed from: X.8hv, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8hv {
    public static final C8hv A00 = new C8hv();

    public final List<C4Ax> A01(Context context) {
        C7384Etj.A0Y(context, 0);
        PackageManager packageManager = context.getPackageManager();
        context.getPackageName();
        C7384Etj.A0X(packageManager);
        List<ApplicationInfo> installedApplications = Build.VERSION.SDK_INT >= 33 ? packageManager.getInstalledApplications(PackageManager.ApplicationInfoFlags.of(0L)) : packageManager.getInstalledApplications(0);
        C7384Etj.A0X(installedApplications);
        B3i b3iA03 = A6B.A03(new C5830DqJ(packageManager), new C8iN(installedApplications, 0));
        EQe eQe = new EQe(packageManager, 19);
        AnonymousClass003.A0u(b3iA03, eQe);
        return A6B.A02(new C8d6(new C7572F4l(35), new C7AG(eQe, b3iA03)));
    }

    public final String A00(String str, Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            C7384Etj.A0X(packageManager);
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(str, PackageManager.ApplicationInfoFlags.of(0L)) : packageManager.getApplicationInfo(str, 0);
            C7384Etj.A0X(applicationInfo);
            return packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
