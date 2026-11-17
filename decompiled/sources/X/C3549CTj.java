package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.CTj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3549CTj {
    public static final AtomicInteger A02 = BV4.A13((int) SystemClock.elapsedRealtime());
    public Bundle A00;
    public final Context A01;

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r4v0 X.CTj) */
    public static final synchronized Bundle A00(C3549CTj c3549CTj) {
        Bundle bundle;
        ApplicationInfo applicationInfo;
        synchronized (c3549CTj) {
            bundle = c3549CTj.A00;
            if (bundle == null) {
                try {
                    applicationInfo = c3549CTj.A01.getPackageManager().getApplicationInfo("com.facebook.aura", 128);
                } catch (PackageManager.NameNotFoundException e) {
                    String strValueOf = String.valueOf(e);
                    Log.w("FirebaseMessaging", C60P.A1M("Couldn't get own application info: ", strValueOf, BV4.A0p(BV5.A04(strValueOf) + 35)));
                }
                if (applicationInfo == null || (bundle = ((PackageItemInfo) applicationInfo).metaData) == null) {
                    bundle = Bundle.EMPTY;
                } else {
                    c3549CTj.A00 = bundle;
                }
            }
        }
        return bundle;
    }

    public C3549CTj(Context context) {
        this.A01 = context;
    }

    public static final String A01(Bundle bundle, C3549CTj c3549CTj, String str) throws Resources.NotFoundException {
        Object[] objArr;
        String strA02 = A02(bundle, str);
        if (TextUtils.isEmpty(strA02)) {
            String strA022 = A02(bundle, String.valueOf(str).concat("_loc_key"));
            strA02 = null;
            if (!TextUtils.isEmpty(strA022)) {
                Resources resources = c3549CTj.A01.getResources();
                int identifier = resources.getIdentifier(strA022, "string", "com.facebook.aura");
                String strValueOf = String.valueOf(str);
                if (identifier != 0) {
                    String strA023 = A02(bundle, strValueOf.concat("_loc_args"));
                    if (TextUtils.isEmpty(strA023)) {
                        objArr = null;
                    } else {
                        try {
                            JSONArray jSONArray = new JSONArray(strA023);
                            int length = jSONArray.length();
                            objArr = new String[length];
                            for (int i = 0; i < length; i++) {
                                objArr[i] = jSONArray.opt(i);
                            }
                        } catch (JSONException unused) {
                            String strSubstring = String.valueOf(str).concat("_loc_args").substring(6);
                            StringBuilder sbA0r = BV5.A0r(strA023, BV5.A04(strSubstring) + 41);
                            sbA0r.append("Malformed ");
                            sbA0r.append(strSubstring);
                            sbA0r.append(": ");
                            sbA0r.append(strA023);
                            Log.w("FirebaseMessaging", AnonymousClass001.A0v("  Default value will be used.", sbA0r));
                            objArr = null;
                        }
                    }
                    if (objArr == null) {
                        return resources.getString(identifier);
                    }
                    try {
                        strA02 = resources.getString(identifier, objArr);
                        return strA02;
                    } catch (MissingFormatArgumentException e) {
                        String string = Arrays.toString(objArr);
                        StringBuilder sbA0r2 = BV5.A0r(string, BV5.A04(str) + 58);
                        sbA0r2.append("Missing format argument for ");
                        sbA0r2.append(str);
                        sbA0r2.append(": ");
                        Log.w("FirebaseMessaging", C60P.A1M(string, " Default value will be used.", sbA0r2), e);
                        return strA02;
                    }
                }
                String strSubstring2 = strValueOf.concat("_loc_key").substring(6);
                StringBuilder sbA0r3 = BV5.A0r(str, BV5.A04(strSubstring2) + 49);
                sbA0r3.append(strSubstring2);
                sbA0r3.append(" resource not found: ");
                Log.w("FirebaseMessaging", C60P.A1M(str, " Default value will be used.", sbA0r3));
            }
        }
        return strA02;
    }

    public static String A02(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    public static void A03(Intent intent, Bundle bundle) {
        Iterator itA0w = BV5.A0w(bundle);
        while (itA0w.hasNext()) {
            String strA0j = AnonymousClass005.A0j(itA0w);
            if (strA0j.startsWith("google.c.a.") || strA0j.equals("from")) {
                intent.putExtra(strA0j, bundle.getString(strA0j));
            }
        }
    }
}
