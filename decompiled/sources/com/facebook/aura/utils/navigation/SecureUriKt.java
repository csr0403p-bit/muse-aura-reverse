package com.facebook.aura.utils.navigation;

import X.AnonymousClass003;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import X.C7Je;
import X.C7LB;
import X.C7VN;
import X.CFK;
import X.FGI;
import X.HsJ;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class SecureUriKt {
    public static final String TAG = "SecureUri";

    public static final SecureUri asSecureUri(String str) {
        C7384Etj.A0Y(str, 0);
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            str = FGI.A0M("https://", str);
        }
        Uri uriA01 = C7Je.A01(str);
        C7384Etj.A0U(uriA01);
        return new SecureUri(uriA01);
    }

    public static final void openInApp(SecureUri secureUri, Context context) {
        Object objA0s;
        boolean zA1Y = C60P.A1Y(secureUri, context);
        C7VN c7vn = new C7VN();
        c7vn.A01.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", zA1Y ? 1 : 0);
        C7LB c7lbA02 = c7vn.A02();
        if (!(context instanceof Activity)) {
            openInBrowser(secureUri, context);
            CFK.A05(TAG, "openInApp: context is not an Activity, opening in browser");
            return;
        }
        try {
            c7lbA02.A00(context, MetaWebUrlLocalizerKt.localizedForDevice(secureUri.uri, context));
            objA0s = Unit.INSTANCE;
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            CFK.A0E(TAG, "Failed to open URL in app: %s", thA00, secureUri.uri.toString());
            openInBrowser(secureUri, context);
        }
    }

    public static final void openInBrowser(SecureUri secureUri, Context context) {
        AnonymousClass003.A0u(secureUri, context);
        Intent intentA03 = C60P.A03("android.intent.action.VIEW");
        intentA03.addFlags(268435456);
        intentA03.setData(MetaWebUrlLocalizerKt.localizedForDevice(secureUri.uri, context));
        if (intentA03.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intentA03, null);
        } else {
            CFK.A0I(TAG, "No activity found to handle intent: %s %s", "android.intent.action.VIEW", secureUri.uri.toString());
        }
    }
}
