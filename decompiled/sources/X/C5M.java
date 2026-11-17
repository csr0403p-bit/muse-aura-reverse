package X;

import android.util.Log;

/* loaded from: classes5.dex */
public abstract class C5M {
    public static String A00(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (Exception e) {
            StringBuilder sbA0x = C3cI.A0x("[bad fmt: \"", str);
            sbA0x.append("\" (");
            sbA0x.append(e);
            return AnonymousClass001.A0v(")]", sbA0x);
        }
    }

    public static void A01(String str, String str2, Object... objArr) {
        Log.w(str, A00(str2, objArr));
    }
}
