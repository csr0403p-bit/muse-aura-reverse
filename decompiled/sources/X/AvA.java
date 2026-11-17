package X;

/* loaded from: classes4.dex */
public final class AvA {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final C1958Aux A05;

    public final C1962AvE A00(int i) {
        return new C1962AvE(AbstractC1973Ave.A00(this.A05, i), i, this.A04);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SelectionInfo(id=");
        sbA0x.append(this.A04);
        sbA0x.append(", range=(");
        int i = this.A02;
        sbA0x.append(i);
        sbA0x.append('-');
        C1958Aux c1958Aux = this.A05;
        sbA0x.append(AbstractC2052AxP.A00(AbstractC1973Ave.A00(c1958Aux, i)));
        sbA0x.append(',');
        int i2 = this.A00;
        sbA0x.append(i2);
        sbA0x.append('-');
        sbA0x.append(AbstractC2052AxP.A00(AbstractC1973Ave.A00(c1958Aux, i2)));
        sbA0x.append("), prevOffset=");
        return C8j5.A0X(sbA0x, this.A01);
    }

    public AvA(C1958Aux c1958Aux, int i, int i2, int i3, int i4, long j) {
        this.A04 = j;
        this.A03 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A05 = c1958Aux;
    }
}
