package X;

/* renamed from: X.19f, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C19f {
    public static final C1003AOr<B6A> A00 = AnonymousClass003.A0Q(null);

    public static final C1BO A00(AOc aOc, BFM bfm, int i, int i2, long j) {
        AOc aOc2 = aOc;
        if ((i2 & 2) != 0) {
            aOc2 = A00;
        }
        long j2 = B6A.A01;
        int i3 = (int) (j & 63);
        Hw7[] hw7Arr = HDi.A0O;
        boolean zA65 = bfm.A65(hw7Arr[i3]);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = (C31w) AUs.A00.invoke(hw7Arr[i3]);
            bfm.Ai0(objAaT);
        }
        return C31t.A00(aOc2, (C31w) objAaT, bfm, new B6A(j), null, AnonymousClass001.A0A(i << 6, (i << 3) & 896));
    }
}
