package com.facebook.aura.common.url;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7Je;
import X.C7mU;
import X.C7n4;
import X.CFK;
import X.FGI;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PlayStoreListingKt {
    public static final String TAG = "PlayStoreListing";

    public static final boolean openPlayStoreListing(Context context, String str) {
        Object[] objArr;
        String str2;
        AnonymousClass003.A0u(context, str);
        C7n4 c7n4A03 = C7mU.A00().A03();
        List listAsList = Arrays.asList(FGI.A0M("market://details?id=", str), FGI.A0M("https://play.google.com/store/apps/details?id=", str));
        if (!(listAsList instanceof Collection) || !listAsList.isEmpty()) {
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                Uri uriA01 = null;
                try {
                    uriA01 = C7Je.A01(AnonymousClass005.A0j(it));
                } catch (SecurityException | UnsupportedOperationException unused) {
                }
                if (uriA01 != null) {
                    try {
                        if (c7n4A03.A05(context, new Intent("android.intent.action.VIEW", uriA01).addFlags(268435456))) {
                            return true;
                        }
                    } catch (ActivityNotFoundException e) {
                        e = e;
                        objArr = new Object[]{uriA01};
                        str2 = "No activity for %s";
                        CFK.A0D(TAG, str2, e, objArr);
                    } catch (SecurityException e2) {
                        e = e2;
                        objArr = new Object[]{uriA01};
                        str2 = "Blocked from launching %s";
                        CFK.A0D(TAG, str2, e, objArr);
                    }
                }
            }
        }
        CFK.A0H(TAG, "No Play Store available for %s", str);
        return false;
    }
}
