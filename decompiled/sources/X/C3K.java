package X;

import android.os.Trace;

/* loaded from: classes5.dex */
public abstract class C3K {
    public static void A00() {
        Trace.endSection();
    }

    public static void A01(String str, String str2, String str3) {
        String strA0U = FGI.A0U(str, str2, str3);
        if (strA0U.length() > 127 && str2 != null) {
            strA0U = FGI.A0U(str, str2.substring(0, (127 - str.length()) - str3.length()), str3);
        }
        Trace.beginSection(strA0U);
    }
}
