package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8iq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC07378iq {
    public static final boolean A01(Context context, String str, String str2, String str3) {
        String str4;
        ApplicationInfo applicationInfo;
        Intent intent = new Intent("android.intent.action.VIEW", C7Je.A01(str2));
        intent.setPackage(str3);
        PackageManager packageManager = context.getPackageManager();
        HashSet hashSetA13 = C60O.A13();
        hashSetA13.add("com.facebook.katana");
        hashSetA13.add("com.facebook.wakizashi");
        hashSetA13.add("com.facebook.orca");
        hashSetA13.add("com.instagram.android");
        hashSetA13.add("com.whatsapp");
        hashSetA13.add(BV3.A00(60));
        String strA00 = BV3.A00(57);
        hashSetA13.add(strA00);
        hashSetA13.add(BV3.A00(59));
        hashSetA13.add("com.facebook.stella");
        String strA002 = BV3.A00(58);
        hashSetA13.add(strA002);
        hashSetA13.add("com.facebook.pronest");
        ArrayList arrayListA0h = C3cG.A0h();
        if (packageManager != null) {
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 131072);
            C7384Etj.A0U(listQueryIntentActivities);
            arrayListA0h.addAll(listQueryIntentActivities);
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && (applicationInfo = ((ComponentInfo) activityInfo).applicationInfo) != null && hashSetA13.contains(((PackageItemInfo) applicationInfo).packageName)) {
                arrayListA0h2.add(resolveInfo);
            }
        }
        if (!arrayListA0h2.isEmpty()) {
            String str5 = ((PackageItemInfo) context.getApplicationInfo()).name;
            if (str5 == null) {
                str5 = ((PackageItemInfo) context.getApplicationInfo()).packageName;
            }
            C7384Etj.A0X(str5);
            try {
                C7384Etj.A0Z(Class.forName((C7BY.A0q(str5, "com.facebook.stella", false) || C7BY.A0q(str5, strA002, false)) ? "com.facebook.bloks.common.utils.deeplinktootherapputil.DefaultDeepLinkSecureContextHelperProviderImpl" : C7BY.A0q(str5, strA00, false) ? "com.facebook.bloks.facebook.actions.plugins.bkactiondeeplinktootherappordirecttoappstore.lite.DeepLinkSecureContextHelperProviderImpl" : "com.facebook.bloks.facebook.actions.plugins.bkactiondeeplinktootherappordirecttoappstore.di.DeepLinkSecureContextHelperProviderImpl").newInstance(), "null cannot be cast to non-null type com.facebook.bloks.facebook.actions.plugins.bkactiondeeplinktootherappordirecttoappstore.common.DeepLinkSecureContextHelperProvider");
                C7mU.A00().A06().A06(null).A05(context, intent);
                return true;
            } catch (ClassNotFoundException e) {
                e = e;
                str4 = "ClassNotFoundException when loading DeepLinkSecureContextHelperProviderImpl class";
                CFK.A08(str, str4, e);
                return false;
            } catch (IllegalAccessException e2) {
                e = e2;
                str4 = "IllegalAccessException when loading DeepLinkSecureContextHelperProviderImpl class";
                CFK.A08(str, str4, e);
                return false;
            } catch (InstantiationException e3) {
                e = e3;
                str4 = "InstantiationException when loading DeepLinkSecureContextHelperProviderImpl class";
                CFK.A08(str, str4, e);
                return false;
            }
        }
        return false;
    }

    public static final void A00(Context context, String str, String str2) {
        if (str2 == null) {
            CFK.A04(str, "fallback url is null");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(C7Je.A01(str2));
        C7mU.A00().A03().A05(context, intent);
    }
}
