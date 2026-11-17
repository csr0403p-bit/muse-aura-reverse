package X;

import android.util.Log;

/* renamed from: X.Bni, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2875Bni {
    public static int A00 = 3;

    public static void A01(String str, String str2) {
        if (A08(str, 3)) {
            Log.d(str, str2);
        }
    }

    public static void A02(String str, String str2) {
        if (A08(str, 6)) {
            Log.e(str, str2);
        }
    }

    public static void A03(String str, String str2) {
        if (A08(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void A05(String str, String str2, Throwable th) {
        if (A08(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    public static void A06(String str, String str2, Throwable th) {
        if (A08(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    public static void A00(Object obj, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(obj);
        A01(str2, sb.toString());
    }

    public static boolean A08(String str, int i) {
        return A00 <= i || Log.isLoggable(str, i);
    }

    public static void A04(String str, String str2, String str3) {
        A01(str3, FGI.A0M(str, str2));
    }

    public static void A07(String str, String str2, Object[] objArr) {
        A01(str2, String.format(str, objArr));
    }
}
