package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;

/* renamed from: X.CMg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3418CMg {
    public static final File A00(Context context) {
        String str;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && (str = applicationInfo.dataDir) != null && str.length() != 0) {
            return BV4.A0G(str);
        }
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getParentFile();
        }
        throw C3cG.A0Q("Path Factory initialised without a valid path");
    }
}
