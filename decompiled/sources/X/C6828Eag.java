package X;

/* renamed from: X.Eag, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6828Eag implements InterfaceC6834Eam {
    public int A00;
    public long A01;
    public C6830Eai A02;
    public boolean A03;
    public final C6818EaW A04;
    public final InterfaceC6831Eaj A05;

    @Override // X.InterfaceC6834Eam
    public final long AZ7(C6818EaW c6818EaW, long j) {
        C6830Eai c6830Eai;
        C6830Eai c6830Eai2;
        C7384Etj.A0Y(c6818EaW, 0);
        if (j < 0) {
            throw BV5.A0R("byteCount < 0: ", j);
        }
        if (this.A03) {
            throw BV4.A0R();
        }
        C6830Eai c6830Eai3 = this.A02;
        if (c6830Eai3 != null && (c6830Eai3 != (c6830Eai2 = this.A04.A01) || this.A00 != c6830Eai2.A01)) {
            throw C3cG.A0Q("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.A05.Ab8(this.A01 + 1)) {
            return -1L;
        }
        if (this.A02 == null && (c6830Eai = this.A04.A01) != null) {
            this.A02 = c6830Eai;
            this.A00 = c6830Eai.A01;
        }
        C6818EaW c6818EaW2 = this.A04;
        long j2 = c6818EaW2.A00;
        long j3 = this.A01;
        long jMin = Math.min(j, j2 - j3);
        c6818EaW2.A0C(c6818EaW, j3, jMin);
        this.A01 += jMin;
        return jMin;
    }

    @Override // X.InterfaceC6834Eam, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A03 = true;
    }

    @Override // X.InterfaceC6834Eam
    public final C6848Eb1 Ags() {
        return this.A05.Ags();
    }

    public C6828Eag(InterfaceC6831Eaj interfaceC6831Eaj) {
        this.A05 = interfaceC6831Eaj;
        C6818EaW c6818EaWAD5 = interfaceC6831Eaj.AD5();
        this.A04 = c6818EaWAD5;
        C6830Eai c6830Eai = c6818EaWAD5.A01;
        this.A02 = c6830Eai;
        this.A00 = c6830Eai != null ? c6830Eai.A01 : -1;
    }
}
