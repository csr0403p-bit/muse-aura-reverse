package X;

import java.util.Comparator;

/* renamed from: X.Dnr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5709Dnr implements Comparator<C5690DnX> {
    public static final C5709Dnr A00 = new C5709Dnr();

    public static boolean A00(C5690DnX c5690DnX) {
        C6154Dwx c6154Dwx = c5690DnX.A02;
        C5731DoQ c5731DoQ = c5690DnX.A03;
        return (AbstractC5655Dmj.A02(c6154Dwx) ? c5731DoQ.A00 : c5731DoQ.A01) <= 0.0d && Double.compare(c5690DnX.A04.A00, 1.0d) == 0;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(C5690DnX c5690DnX, C5690DnX c5690DnX2) {
        double d;
        C5713Dnw c5713Dnw;
        C5690DnX c5690DnX3 = c5690DnX;
        C5690DnX c5690DnX4 = c5690DnX2;
        if (A00(c5690DnX3) && A00(c5690DnX4)) {
            d = c5690DnX4.A04.A04.A03;
            c5713Dnw = c5690DnX3.A04;
        } else {
            int iCompare = Double.compare(c5690DnX3.A00, c5690DnX4.A00);
            if (iCompare != 0) {
                return iCompare;
            }
            d = c5690DnX3.A04.A04.A03;
            c5713Dnw = c5690DnX4.A04;
        }
        return Double.compare(d, c5713Dnw.A04.A03);
    }
}
