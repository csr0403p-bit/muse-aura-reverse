package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.facebook.secure.trustedapp.exception.FbPermissionException;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.7mm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C06997mm implements C7mr {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C7mr
    public final void A4p(Context context, String str, String str2) {
        ApplicationInfo applicationInfo;
        ?? A0h = Collections.EMPTY_LIST;
        try {
            AnonymousClass003.A0u(context, str);
            if (Trace.isEnabled()) {
                try {
                    Trace.beginSection("PackageManagerCompat.getApplicationInfo");
                    PackageManager packageManager = context.getPackageManager();
                    applicationInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(str, PackageManager.ApplicationInfoFlags.of(128L)) : packageManager.getApplicationInfo(str, 128);
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                PackageManager packageManager2 = context.getPackageManager();
                applicationInfo = Build.VERSION.SDK_INT >= 33 ? packageManager2.getApplicationInfo(str, PackageManager.ApplicationInfoFlags.of(128L)) : packageManager2.getApplicationInfo(str, 128);
            }
            C7384Etj.A0W(applicationInfo);
            Bundle bundle = ((PackageItemInfo) applicationInfo).metaData;
            if (bundle != null && bundle.size() > 0) {
                A0h = C3cG.A0h();
                Iterator<String> it = bundle.keySet().iterator();
                while (it.hasNext()) {
                    String strA0j = AnonymousClass005.A0j(it);
                    if (strA0j.contains(".fbpermission.")) {
                        A0h.add(strA0j);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (!A0h.contains(str2)) {
            throw new FbPermissionException(FGI.A0h("Caller '", str, "' has not declared the FbPermission: '", str2, "' in its AndroidManifest.xml"));
        }
    }
}
