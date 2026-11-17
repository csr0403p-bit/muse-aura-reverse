package X;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.net.UnknownHostException;

/* loaded from: classes5.dex */
public abstract class CNC {
    public static final Object A01 = C3cG.A0T();
    public static CND A00 = CND.A00;

    public static String A00(String str, Throwable th) {
        boolean z;
        String strReplace;
        if (th == null) {
            strReplace = null;
        } else {
            synchronized (A01) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        z = false;
                        break;
                    }
                    if (cause instanceof UnknownHostException) {
                        z = true;
                        break;
                    }
                    cause = cause.getCause();
                }
                strReplace = z ? "UnknownHostException (no network)" : Log.getStackTraceString(th).trim().replace("\t", "    ");
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbA0g = C3cG.A0g(str);
        sbA0g.append("\n  ");
        sbA0g.append(strReplace.replace(PairsDiscretionDocument.TERMINATOR, "\n  "));
        return C8j3.A16(sbA0g, '\n');
    }

    public static void A01(String str, String str2) {
        synchronized (A01) {
            Log.d(str, A00(str2, null));
        }
    }

    public static void A02(String str, String str2) {
        synchronized (A01) {
            Log.e(str, A00(str2, null));
        }
    }

    public static void A03(String str, String str2) {
        synchronized (A01) {
            Log.i(str, A00(str2, null));
        }
    }

    public static void A04(String str, String str2) {
        synchronized (A01) {
            Log.w(str, A00(str2, null));
        }
    }

    public static void A05(String str, String str2, Throwable th) {
        synchronized (A01) {
            Log.e(str, A00(str2, th));
        }
    }

    public static void A06(String str, String str2, Throwable th) {
        synchronized (A01) {
            Log.w(str, A00(str2, th));
        }
    }
}
