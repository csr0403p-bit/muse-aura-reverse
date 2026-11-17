package X;

import android.util.Range;
import java.util.Arrays;

/* renamed from: X.BbT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2440BbT {
    public static final Range<Integer> A00;
    public static final Range<Integer> A01;
    public static final C2439BbS A02;

    static {
        Integer numA0V = BV4.A0V();
        A01 = new Range<>(numA0V, Integer.MAX_VALUE);
        A00 = new Range<>(numA0V, Integer.MAX_VALUE);
        C2421Bax c2421Bax = C2421Bax.A00;
        A02 = C2439BbS.A00(new C2442BbV(c2421Bax, 1), Arrays.asList(c2421Bax, C2421Bax.A01, C2421Bax.A05));
    }
}
