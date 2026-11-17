package X;

/* renamed from: X.At3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1886At3 {
    public static final long A00(C1958Aux c1958Aux, int i, boolean z, boolean z2) {
        C1956Auv c1956Auv = c1958Aux.A03;
        int iA09 = c1956Auv.A09(i);
        if (iA09 >= c1956Auv.A02) {
            return 9205357640488583168L;
        }
        float fA02 = c1958Aux.A02(i, c1958Aux.A08((!z ? !z2 : z2) ? Math.max(i + (-1), 0) : i) == c1958Aux.A09(i));
        long j = c1958Aux.A02;
        return AnonymousClass005.A0L(ATD.A03(fA02, 0.0f, (int) (j >> 32)), ATD.A03(c1956Auv.A06(iA09), 0.0f, (int) (j & 4294967295L)));
    }
}
