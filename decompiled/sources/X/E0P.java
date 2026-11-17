package X;

import android.os.Bundle;
import android.text.Spanned;

/* loaded from: classes5.dex */
public abstract class E0P {
    public static final String A03 = Integer.toString(0, 36);
    public static final String A00 = Integer.toString(1, 36);
    public static final String A01 = Integer.toString(2, 36);
    public static final String A04 = Integer.toString(3, 36);
    public static final String A02 = Integer.toString(4, 36);

    public static Bundle A00(Bundle bundle, Spanned spanned, Object obj, int i) {
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putInt(A03, spanned.getSpanStart(obj));
        bundleA0N.putInt(A00, spanned.getSpanEnd(obj));
        bundleA0N.putInt(A01, spanned.getSpanFlags(obj));
        bundleA0N.putInt(A04, i);
        if (bundle != null) {
            bundleA0N.putBundle(A02, bundle);
        }
        return bundleA0N;
    }
}
