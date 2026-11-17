package X;

/* loaded from: classes5.dex */
public final class E4Z implements E5D {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final E1P A04;

    @Override // X.E5D
    public final int AFk() {
        return -1;
    }

    @Override // X.E5D
    public final int AJt() {
        return this.A03;
    }

    @Override // X.E5D
    public final int AZQ() {
        int i = this.A02;
        if (i == 8) {
            return this.A04.A0A();
        }
        if (i == 16) {
            return this.A04.A0D();
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 % 2 != 0) {
            return this.A00 & 15;
        }
        int iA0A = this.A04.A0A();
        this.A00 = iA0A;
        return (iA0A & 240) >> 4;
    }

    public E4Z(C6419E4v c6419E4v) {
        E1P e1p = c6419E4v.A00;
        this.A04 = e1p;
        this.A02 = BV6.A04(e1p, 12) & 255;
        this.A03 = e1p.A0C();
    }
}
