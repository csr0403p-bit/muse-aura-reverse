package X;

/* loaded from: classes5.dex */
public final class E3E implements E51 {
    public final int A00;
    public final E5Z A01 = new E5Z();
    public final E3A A02;

    @Override // X.E51
    public final /* synthetic */ void AVf() {
    }

    private long A00(E2K e2k) {
        long length;
        long j;
        while (true) {
            long jAIf = e2k.AIf();
            length = e2k.getLength();
            j = length - 6;
            if (jAIf >= j) {
                break;
            }
            E3A e3a = this.A02;
            int i = this.A00;
            E5Z e5z = this.A01;
            byte[] bArr = new byte[2];
            e2k.AXi(bArr, 0, 2);
            if ((BV6.A0D(bArr, 0) | (bArr[1] & 255)) == i) {
                E1P e1pA0Y = BV6.A0Y(16);
                System.arraycopy(bArr, 0, e1pA0Y.A02, 0, 2);
                byte[] bArr2 = e1pA0Y.A02;
                int i2 = 0;
                do {
                    int iAXh = e2k.AXh(bArr2, i2 + 2, 14 - i2);
                    if (iAXh == -1) {
                        break;
                    }
                    i2 += iAXh;
                } while (i2 < 14);
                e1pA0Y.A0Q(i2);
                e2k.AbN();
                e2k.A47((int) (jAIf - e2k.AIu()));
                if (E3L.A01(e1pA0Y, e5z, e3a, i)) {
                    break;
                }
            } else {
                e2k.AbN();
                e2k.A47((int) (jAIf - e2k.AIu()));
            }
            e2k.A47(1);
        }
        long jAIf2 = e2k.AIf();
        if (jAIf2 < j) {
            return this.A01.A00;
        }
        e2k.A47((int) (length - jAIf2));
        return this.A02.A09;
    }

    public E3E(E3A e3a, int i) {
        this.A02 = e3a;
        this.A00 = i;
    }

    @Override // X.E51
    public final C6422E4y AcJ(E2K e2k, long j) {
        long jAIu = e2k.AIu();
        long jA00 = A00(e2k);
        long jAIf = e2k.AIf();
        e2k.A47(Math.max(6, this.A02.A06));
        long jA002 = A00(e2k);
        return (jA00 > j || jA002 <= j) ? jA002 <= j ? new C6422E4y(-2, jA002, e2k.AIf()) : new C6422E4y(-1, jA00, jAIu) : new C6422E4y(0, -9223372036854775807L, jAIf);
    }
}
