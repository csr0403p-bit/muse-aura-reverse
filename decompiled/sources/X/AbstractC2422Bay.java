package X;

import android.util.Range;
import android.util.Rational;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Bay, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2422Bay {
    public static final Map<Integer, Rational> A00;
    public static final Map<C2421Bax, Range<Integer>> A01;

    static {
        HashMap mapA0u = BV4.A0u();
        A01 = mapA0u;
        mapA0u.put(C2421Bax.A06, Range.create(2160, 4319));
        mapA0u.put(C2421Bax.A00, Range.create(1080, 1439));
        mapA0u.put(C2421Bax.A01, Range.create(720, 1079));
        mapA0u.put(C2421Bax.A05, Range.create(241, 719));
        HashMap mapA0u2 = BV4.A0u();
        A00 = mapA0u2;
        mapA0u2.put(BV4.A0V(), AbstractC2498BcP.A02);
        mapA0u2.put(BV4.A0W(), AbstractC2498BcP.A00);
    }
}
