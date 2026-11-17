package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7L9, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7L9 {
    public static final List<ResolveInfo> A00(Context context, String str) {
        List<ResolveInfo> listQueryIntentActivities;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return C0881AGi.A00;
        }
        Uri uriA01 = C7Je.A01(str);
        C7384Etj.A0U(uriA01);
        PackageManager packageManager2 = context.getPackageManager();
        if (packageManager2 == null) {
            listQueryIntentActivities = C0881AGi.A00;
        } else {
            listQueryIntentActivities = packageManager2.queryIntentActivities(C60Q.A09(uriA01), 0);
            C7384Etj.A0U(listQueryIntentActivities);
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            intent.setPackage(((PackageItemInfo) resolveInfo.activityInfo).packageName);
            if (packageManager.resolveService(intent, 0) != null) {
                arrayListA0h.add(resolveInfo);
            }
        }
        return arrayListA0h;
    }
}
