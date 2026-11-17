package X;

import java.io.IOException;

/* renamed from: X.DiC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5416DiC extends AbstractC5411Di6 {
    public InterfaceC5529Dk6 A00;
    public long A01;
    public final InterfaceC5417DiD A02;
    public volatile boolean A03;

    @Override // X.InterfaceC5231Ddp
    public final void A5z() {
        this.A03 = true;
    }

    @Override // X.InterfaceC5231Ddp
    public final void APf() {
        if (this.A01 == 0) {
            this.A02.ANa(this.A00, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C1O c1o = this.A06;
            long j = this.A01;
            long j2 = c1o.A03;
            C1O c1oA00 = c1o.A00(j, j2 != -1 ? j2 - j : -1L);
            C5336DgX c5336DgX = C5336DgX.$redex_init_class;
            DF4 df4 = this.A07;
            C5336DgX c5336DgX2 = new C5336DgX(df4, c1oA00.A02, df4.open(c1oA00));
            while (!this.A03) {
                try {
                    int iAZ4 = ((C5443Die) this.A02).A05.AZ4(c5336DgX2, C5443Die.A09);
                    C1G.A08(AnonymousClass002.A1P(iAZ4, 1));
                    if (iAZ4 != 0) {
                        break;
                    }
                } finally {
                    this.A01 = c5336DgX2.A02 - c1o.A02;
                }
            }
            try {
                df4.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            try {
                this.A07.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public C5416DiC(C6154Dwx c6154Dwx, C1J c1j, C1O c1o, InterfaceC5417DiD interfaceC5417DiD, Object obj, int i) {
        super(c6154Dwx, c1j, c1o, obj, 2, i, -9223372036854775807L, -9223372036854775807L);
        this.A02 = interfaceC5417DiD;
    }
}
