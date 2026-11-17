package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: X.7mh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC06947mh {
    public static PackageInfo A00(Context context, PackageManager packageManager) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
