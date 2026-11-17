package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes5.dex */
public abstract class CQO {
    public static Integer A00(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        applicationInfo.getClass();
        int i = applicationInfo.flags;
        return (AnonymousClass002.A1L(i & 1) || ((i & 128) != 0)) ? C79.A00 : C79.A01;
    }
}
