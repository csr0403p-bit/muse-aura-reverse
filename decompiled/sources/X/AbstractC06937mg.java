package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Trace;

/* renamed from: X.7mg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC06937mg {
    public static final String[] A02(Context context, int i) {
        C7384Etj.A0Y(context, 0);
        if (!Trace.isEnabled()) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
            if (packagesForUid == null || packagesForUid.length == 0) {
                throw new PackageManager.NameNotFoundException(FGI.A0H("Unable to get package names for uid ", i));
            }
            return packagesForUid;
        }
        try {
            Trace.beginSection("PackageManagerCompat.getPackagesForUid");
            String[] packagesForUid2 = context.getPackageManager().getPackagesForUid(i);
            if (packagesForUid2 == null || packagesForUid2.length == 0) {
                throw new PackageManager.NameNotFoundException(FGI.A0H("Unable to get package names for uid ", i));
            }
            return packagesForUid2;
        } finally {
            Trace.endSection();
        }
    }

    public static final C06957mi A01(Context context, String str, int i) throws PackageManager.NameNotFoundException {
        if (!Trace.isEnabled()) {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(i)) : packageManager.getPackageInfo(str, i);
            if (packageInfo != null) {
                return new C06957mi(packageInfo);
            }
            throw new PackageManager.NameNotFoundException(FGI.A0M("PackageManager returned null PackageInfo for ", str));
        }
        try {
            Trace.beginSection("PackageManagerCompat.getPackageInfoNoFixups");
            PackageManager packageManager2 = context.getPackageManager();
            PackageInfo packageInfo2 = Build.VERSION.SDK_INT >= 33 ? packageManager2.getPackageInfo(str, PackageManager.PackageInfoFlags.of(i)) : packageManager2.getPackageInfo(str, i);
            if (packageInfo2 != null) {
                return new C06957mi(packageInfo2);
            }
            throw new PackageManager.NameNotFoundException(FGI.A0M("PackageManager returned null PackageInfo for ", str));
        } finally {
            Trace.endSection();
        }
    }

    public static final C06957mi A00(Context context, String str, int i) {
        AnonymousClass003.A0u(context, str);
        if (!Trace.isEnabled()) {
            if ((i & 64) == 64) {
                i = (i & (-65)) | 134217728;
            }
            return A01(context, str, i);
        }
        try {
            Trace.beginSection("PackageManagerCompat.getPackageInfo");
            if ((i & 64) == 64) {
                i = (i & (-65)) | 134217728;
            }
            return A01(context, str, i);
        } finally {
            Trace.endSection();
        }
    }
}
