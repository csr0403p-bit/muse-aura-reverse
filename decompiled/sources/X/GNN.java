package X;

import android.os.Bundle;
import android.util.Log;
import java.util.Set;
import org.json.JSONException;

/* loaded from: classes6.dex */
public abstract class GNN {
    public static final int A00 = Runtime.getRuntime().availableProcessors();

    public static int A00(Bundle bundle, String str) {
        String strConcat;
        if (bundle == null) {
            strConcat = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("RESPONSE_CODE");
            if (obj == null) {
                A05(str, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            }
            if (obj instanceof Integer) {
                return AnonymousClass001.A0F(obj);
            }
            strConcat = "Unexpected type for bundle response code: ".concat(C60Q.A0e(obj));
        }
        A06(str, strConcat);
        return 6;
    }

    public static GNP A02(String str, String str2, Set set) {
        if (str == null || str2 == null) {
            A05("BillingHelper", "Received a null purchase data.");
            int i = C9433GIx.c;
            C9434GIy c9434GIy = new C9434GIy();
            C9433GIx.A0A(str == null ? G4h.A05 : G4h.A06, (C9433GIx) GIG.A02(c9434GIy));
            return new GNP(null, (C9433GIx) c9434GIy.A03());
        }
        try {
            C10470Hkc c10470Hkc = new C10470Hkc(str, str2);
            if (!set.isEmpty()) {
                c10470Hkc.A00 = set;
            }
            int i2 = C9433GIx.c;
            C9434GIy c9434GIy2 = new C9434GIy();
            C9433GIx.A0A(G4h.A02, (C9433GIx) GIG.A02(c9434GIy2));
            return new GNP(c10470Hkc, (C9433GIx) c9434GIy2.A03());
        } catch (JSONException e) {
            A06("BillingHelper", AnonymousClass007.A0a("Got JSONException while parsing purchase data: ", e));
            int i3 = C9433GIx.c;
            C9434GIy c9434GIy3 = new C9434GIy();
            C9433GIx.A0A(G4h.A03, (C9433GIx) GIG.A02(c9434GIy3));
            String strConcat = "Error parsing: ".concat(str);
            C9433GIx c9433GIx = (C9433GIx) GIG.A02(c9434GIy3);
            c9433GIx.getClass();
            c9433GIx.bitField0_ |= 2;
            c9433GIx.additionalDetails_ = strConcat;
            return new GNP(null, (C9433GIx) c9434GIy3.A03());
        }
    }

    public static void A05(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i));
                Log.v(str, BV4.A0j(str2, iMin));
                str2 = str2.substring(iMin);
                i -= iMin;
            }
        }
    }

    public static void A06(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void A07(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static String A03(Bundle bundle, String str) {
        String strConcat;
        if (bundle == null) {
            strConcat = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("DEBUG_MESSAGE");
            if (obj == null) {
                A05(str, "getDebugMessageFromBundle() got null response code, assuming OK");
                return "";
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            strConcat = "Unexpected type for debug message: ".concat(C60Q.A0e(obj));
        }
        A06(str, strConcat);
        return "";
    }

    public static void A04(Bundle bundle, String str, String str2, long j) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j);
    }

    public static Bundle A01(GNM gnm, EnumC9535GNn enumC9535GNn) {
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putInt("RESPONSE_CODE", gnm.A00);
        bundleA0N.putString("DEBUG_MESSAGE", gnm.A02);
        bundleA0N.putInt("LOG_REASON", enumC9535GNn.a);
        return bundleA0N;
    }
}
