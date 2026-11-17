package X;

/* renamed from: X.Auc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1939Auc {
    public int A00;
    public C2132Az0 A01;
    public C2132Az0 A02;
    public Long A03;
    public boolean A04;

    public final void A00(C1805ArO c1805ArO) {
        C1805ArO c1805ArO2;
        this.A04 = false;
        C2132Az0 c2132Az0 = this.A02;
        if (c1805ArO.equals(c2132Az0 != null ? c2132Az0.A01 : null)) {
            return;
        }
        String str = c1805ArO.A01.A00;
        C2132Az0 c2132Az02 = this.A02;
        boolean zAreEqual = C7384Etj.areEqual(str, (c2132Az02 == null || (c1805ArO2 = c2132Az02.A01) == null) ? null : c1805ArO2.A01.A00);
        C2132Az0 c2132Az03 = this.A02;
        if (zAreEqual) {
            if (c2132Az03 != null) {
                c2132Az03.A01 = c1805ArO;
                return;
            }
            return;
        }
        C2132Az0 c2132Az04 = new C2132Az0();
        c2132Az04.A00 = c2132Az03;
        c2132Az04.A01 = c1805ArO;
        this.A02 = c2132Az04;
        this.A01 = null;
        int length = this.A00 + str.length();
        this.A00 = length;
        if (length <= 100000 || c2132Az03 == null) {
            return;
        }
        do {
            C2132Az0 c2132Az05 = c2132Az04.A00;
            if (c2132Az05 == null || c2132Az05.A00 == null) {
                c2132Az04.A00 = null;
                return;
            }
            c2132Az04 = c2132Az04.A00;
        } while (c2132Az04 != null);
    }
}
