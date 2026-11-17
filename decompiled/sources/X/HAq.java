package X;

/* loaded from: classes6.dex */
public final class HAq implements HAy {
    public int A00;
    public int A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    @Override // X.HAy
    public final boolean AQK(HB2 hb2, HB4 hb4) {
        int i;
        int i2;
        String strA00 = (this.A04 && this.A02 == null) ? hb4.A00() : this.A02;
        HB7 hb7 = ((HB3) hb4).A00;
        if (hb7 != null) {
            i = 0;
            i2 = 0;
            for (HB3 hb3 : hb7.ADb()) {
                if (hb3 == hb4) {
                    i = i2;
                }
                if (strA00 == null || hb3.A00().equals(strA00)) {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 1;
        }
        int iSignum = i2 - i;
        if (this.A03) {
            iSignum = i + 1;
        }
        int i3 = this.A00;
        int iSignum2 = this.A01;
        if (i3 != 0) {
            int i4 = iSignum - iSignum2;
            if (i4 % i3 == 0) {
                iSignum = Integer.signum(i4);
                if (iSignum != 0) {
                    iSignum2 = Integer.signum(i3);
                }
            }
        }
        return iSignum == iSignum2;
    }

    public final String toString() {
        Object[] objArr;
        String str;
        String str2 = this.A03 ? "" : "last-";
        boolean z = this.A04;
        Integer numValueOf = Integer.valueOf(this.A00);
        Integer numValueOf2 = Integer.valueOf(this.A01);
        if (z) {
            objArr = new Object[]{str2, numValueOf, numValueOf2, this.A02};
            str = "nth-%schild(%dn%+d of type <%s>)";
        } else {
            objArr = new Object[]{str2, numValueOf, numValueOf2};
            str = "nth-%schild(%dn%+d)";
        }
        return String.format(str, objArr);
    }

    public HAq(int i, String str, boolean z, int i2, boolean z2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = str;
    }
}
