package com.facebook.aura.settings;

import X.C7384Etj;
import X.C7BY;
import X.C7mU;
import X.CFK;
import X.FGI;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class MetaAiLauncherKt {
    public static final String GLASSES_TAB_DEEPLINK = "fb-viewapp://devices";
    public static final String META_AI_PACKAGE = "com.facebook.stella";
    public static final String META_AI_PACKAGE_DEBUG = "com.facebook.stella_debug";
    public static final String SERIAL_QUERY_PARAM = "serial";
    public static final String TAG = "MetaAiLauncher";

    public static final void launchMetaAiGlassesTab(Context context, String str) {
        Object next;
        C7384Etj.A0Y(context, 0);
        C7mU c7mUA00 = C7mU.A00();
        PackageManager packageManager = context.getPackageManager();
        Iterator it = Arrays.asList("com.facebook.stella", "com.facebook.stella_debug").iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (packageManager.getLaunchIntentForPackage((String) next) != null) {
                    break;
                }
            }
        }
        String str2 = (String) next;
        if (str2 == null) {
            CFK.A06(TAG, "launchMetaAiGlassesTab: Meta AI not installed, opening Play Store");
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.facebook.stella"));
                intent.addFlags(268435456);
                c7mUA00.A03().A05(context, intent);
                return;
            } catch (ActivityNotFoundException unused) {
                CFK.A06(TAG, "launchMetaAiGlassesTab: Play Store not available");
                return;
            }
        }
        Uri uriBuild = Uri.parse(GLASSES_TAB_DEEPLINK);
        if (str != null && !C7BY.A0j(str)) {
            uriBuild = uriBuild.buildUpon().appendQueryParameter(SERIAL_QUERY_PARAM, str).build();
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", uriBuild);
        intent2.setPackage(str2);
        intent2.addCategory("android.intent.category.BROWSABLE");
        intent2.addFlags(268435456);
        if (c7mUA00.A05().A05(context, intent2)) {
            return;
        }
        CFK.A06(TAG, FGI.A0M("launchMetaAiGlassesTab: deeplink launch failed for package=", str2));
    }
}
