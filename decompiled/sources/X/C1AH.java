package X;

/* renamed from: X.1AH, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1AH {
    public static final AKH<C1AI> A00 = C05443bq.A00(9);

    public static final C1DE A00(BFM bfm, Integer num) {
        C1AI c1ai = (C1AI) bfm.A6v(A00);
        switch (num.intValue()) {
            case 0:
                return c1ai.A00;
            case 1:
                C1DE c1de = c1ai.A00;
                C1D9 c1d9 = new C1D9(0.0f);
                return new C1D3(c1de.A03, c1de.A02, new C1D9(0.0f), c1d9);
            case 2:
                return c1ai.A01;
            default:
                return C1D8.A00;
        }
    }
}
