package X;

/* renamed from: X.CVo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3588CVo {
    public static final void A00(int i, int i2, int i3, int i4, int i5) {
        boolean zA1Q = C8j3.A1Q(i4);
        Integer numValueOf = Integer.valueOf(i4);
        CVn.A05(zA1Q, "count (%d) ! >= 0", numValueOf);
        boolean zA1Q2 = C8j3.A1Q(i);
        Integer numValueOf2 = Integer.valueOf(i);
        CVn.A05(zA1Q2, "offset (%d) ! >= 0", numValueOf2);
        boolean zA1Q3 = C8j3.A1Q(i3);
        Integer numValueOf3 = Integer.valueOf(i3);
        CVn.A05(zA1Q3, "otherOffset (%d) ! >= 0", numValueOf3);
        CVn.A05(BV7.A1S(i + i4, i5), "offset (%d) + count (%d) ! <= %d", numValueOf2, numValueOf, Integer.valueOf(i5));
        CVn.A05(BV7.A1S(i3 + i4, i2), "otherOffset (%d) + count (%d) ! <= %d", numValueOf3, numValueOf, Integer.valueOf(i2));
    }
}
