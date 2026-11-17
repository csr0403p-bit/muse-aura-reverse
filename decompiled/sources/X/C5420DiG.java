package X;

import java.io.IOException;

@Deprecated
/* renamed from: X.DiG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5420DiG extends AbstractC5421DiH {
    public boolean A00;
    public long A01;
    public final int A02;
    public final C6154Dwx A03;

    @Override // X.InterfaceC5231Ddp
    public final void A5z() {
    }

    @Override // X.InterfaceC5231Ddp
    public final void APf() {
        long j;
        C5456Dir c5456Dir = ((AbstractC5421DiH) this).A00;
        C1G.A05(c5456Dir);
        c5456Dir.A00(0L);
        int iAbu = 0;
        InterfaceC5563Dkg interfaceC5563DkgAhC = c5456Dir.AhC(0, this.A02);
        interfaceC5563DkgAhC.ABq(this.A03);
        try {
            C1O c1o = this.A06;
            long j2 = this.A01;
            long j3 = c1o.A03;
            C1O c1oA00 = c1o.A00(j2, j3 != -1 ? j3 - j2 : -1L);
            DF4 df4 = this.A07;
            long jOpen = df4.open(c1oA00);
            if (jOpen != -1) {
                jOpen += this.A01;
            }
            C5336DgX c5336DgX = C5336DgX.$redex_init_class;
            C5336DgX c5336DgX2 = new C5336DgX(df4, this.A01, jOpen);
            while (true) {
                j = this.A01;
                if (iAbu == -1) {
                    break;
                }
                this.A01 = j + iAbu;
                iAbu = interfaceC5563DkgAhC.Abu(c5336DgX2, Integer.MAX_VALUE, true);
            }
            InterfaceC5563Dkg.A01(interfaceC5563DkgAhC, 1, (int) j, this.A04);
            try {
                df4.close();
            } catch (IOException unused) {
            }
            this.A00 = true;
        } catch (Throwable th) {
            try {
                this.A07.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public C5420DiG(C6154Dwx c6154Dwx, C6154Dwx c6154Dwx2, C1J c1j, C1O c1o, Object obj, int i, int i2, long j, long j2, long j3) {
        super(c6154Dwx, c1j, c1o, obj, i, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.A02 = i2;
        this.A03 = c6154Dwx2;
    }
}
