package X;

/* renamed from: X.Asb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1862Asb {
    public static final ApQ A00(C1805ArO c1805ArO, int i) {
        ApQ apQ = c1805ArO.A01;
        int iA01 = Au3.A01(c1805ArO.A00);
        int iA0I = iA01 + i;
        if (((i ^ iA0I) & (iA01 ^ iA0I)) < 0) {
            iA0I = C8j3.A0I(apQ);
        }
        return apQ.subSequence(iA01, Math.min(iA0I, C8j3.A0I(apQ)));
    }

    public static final ApQ A01(C1805ArO c1805ArO, int i) {
        ApQ apQ = c1805ArO.A01;
        int iA02 = Au3.A02(c1805ArO.A00);
        int i2 = iA02 - i;
        if (((i ^ iA02) & (iA02 ^ i2)) < 0) {
            i2 = 0;
        }
        return apQ.subSequence(Math.max(0, i2), iA02);
    }
}
