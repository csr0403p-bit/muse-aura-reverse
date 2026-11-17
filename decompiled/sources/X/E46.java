package X;

/* loaded from: classes5.dex */
public final class E46 {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC5563Dkg A0C;

    public static void A00(E46 e46, int i) {
        long j = e46.A04;
        if (j != -9223372036854775807L) {
            long j2 = e46.A01;
            long j3 = e46.A03;
            if (j2 != j3) {
                int i2 = (int) (j2 - j3);
                e46.A0C.Abz(null, e46.A0B ? 1 : 0, i2, i, j);
            }
        }
    }

    public E46(InterfaceC5563Dkg interfaceC5563Dkg) {
        this.A0C = interfaceC5563Dkg;
    }
}
