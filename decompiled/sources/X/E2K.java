package X;

/* loaded from: classes5.dex */
public interface E2K extends C1L {
    static E1P A00(E2K e2k, int i) {
        E1P e1p = new E1P();
        byte[] bArr = new byte[i];
        e1p.A02 = bArr;
        e1p.A00 = i;
        e2k.readFully(bArr, 0, i);
        return e1p;
    }

    static void A01(E1P e1p, E2K e2k, int i) {
        e2k.AXi(e1p.A02, 0, i);
    }

    static void A02(E1P e1p, E2K e2k, int i) {
        e1p.A0P(i);
        e2k.AXi(e1p.A02, 0, i);
    }

    void A47(int i);

    long AIf();

    long AIu();

    int AXh(byte[] bArr, int i, int i2);

    void AXi(byte[] bArr, int i, int i2);

    boolean AXj(byte[] bArr, int i, int i2, boolean z);

    boolean AZM(byte[] bArr, int i, int i2, boolean z);

    void AbN();

    int Afj(int i);

    void Afm(int i);

    boolean Afn(int i, boolean z);

    long getLength();

    @Override // X.C1L
    int read(byte[] bArr, int i, int i2);

    void readFully(byte[] bArr, int i, int i2);

    static boolean A03(E1P e1p, E2K e2k, int i) {
        e1p.A0P(i);
        e2k.AXi(e1p.A02, 0, i);
        return false;
    }
}
