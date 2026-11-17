package X;

import android.util.Range;

/* renamed from: X.Bc8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2481Bc8 {
    public static final Range<Integer> A00;

    public final C2493BcK A00() {
        C2492BcJ c2492BcJ = (C2492BcJ) this;
        C2493BcK c2493BcK = new C2493BcK();
        c2493BcK.A01 = c2492BcJ.A01;
        c2493BcK.A02 = c2492BcJ.A02;
        c2493BcK.A00 = c2492BcJ.A00;
        c2493BcK.A03 = c2492BcJ.A03;
        c2493BcK.A04 = Boolean.valueOf(c2492BcJ.A04);
        return c2493BcK;
    }

    static {
        Integer numA0V = BV4.A0V();
        A00 = new Range<>(numA0V, numA0V);
    }
}
