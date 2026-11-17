package X;

/* loaded from: classes5.dex */
public final class E4D {
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public long A06;
    public final InterfaceC5563Dkg A07;

    public final void A00(long j, int i, boolean z) {
        long j2 = this.A02;
        C1G.A08(AnonymousClass002.A1L((j2 > (-9223372036854775807L) ? 1 : (j2 == (-9223372036854775807L) ? 0 : -1))));
        if (this.A00 == 182 && z && this.A04) {
            this.A07.Abz(null, this.A05 ? 1 : 0, (int) (j - this.A06), i, j2);
        }
        if (this.A00 != 179) {
            this.A06 = j;
        }
    }

    public final void A01(byte[] bArr, int i, int i2) {
        if (this.A03) {
            int i3 = this.A01;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.A01 = i3 + (i2 - i);
            } else {
                this.A05 = AnonymousClass002.A1M((bArr[i4] & 192) >> 6);
                this.A03 = false;
            }
        }
    }

    public E4D(InterfaceC5563Dkg interfaceC5563Dkg) {
        this.A07 = interfaceC5563Dkg;
    }
}
