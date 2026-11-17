package X;

import android.util.Log;

/* loaded from: classes5.dex */
public final class EK9 {
    public static final Object A01 = C3cG.A0T();
    public static volatile EK9 A02;
    public final int A00;

    public static EK9 A00() {
        EK9 ek9;
        synchronized (A01) {
            if (A02 == null) {
                A02 = new EK9(3);
            }
            ek9 = A02;
        }
        return ek9;
    }

    public final void A02(String tag, String message) {
        if (this.A00 <= 3) {
            Log.d(tag, message);
        }
    }

    public EK9(int loggingLevel) {
        this.A00 = loggingLevel;
    }

    public static String A01(String tag) {
        int length = tag.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            tag = tag.substring(0, 20);
        }
        sb.append(tag);
        return sb.toString();
    }
}
