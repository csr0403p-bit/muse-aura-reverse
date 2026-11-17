package X;

/* renamed from: X.DhF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5363DhF implements InterfaceC6022DuF {
    public int A00;
    public boolean A01;
    public final /* synthetic */ C5362DhE A02;

    @Override // X.InterfaceC6022DuF
    public final void AQQ() {
    }

    public C5363DhF(C5362DhE c5362DhE) {
        this.A02 = c5362DhE;
    }

    private void A00() {
        if (this.A01) {
            return;
        }
        C5362DhE c5362DhE = this.A02;
        C6013Dtw c6013Dtw = c5362DhE.A05;
        C6154Dwx c6154Dwx = c5362DhE.A04;
        c6013Dtw.A05(c6154Dwx, null, AbstractC6161Dx4.A01(c6154Dwx.A0b), 0, 0L);
        this.A01 = true;
    }

    @Override // X.InterfaceC6022DuF
    public final boolean isReady() {
        return this.A02.A01;
    }

    @Override // X.InterfaceC6022DuF
    public final int AZE(Di2 di2, C5406Dhz c5406Dhz, int i) {
        A00();
        C5362DhE c5362DhE = this.A02;
        boolean z = c5362DhE.A01;
        if (z && c5362DhE.A02 == null) {
            this.A00 = 2;
        }
        int i2 = this.A00;
        if (i2 == 2) {
            ((AbstractC5364DhG) di2).A00 |= 4;
        } else {
            if ((i & 2) != 0 || i2 == 0) {
                c5406Dhz.A00 = c5362DhE.A04;
                this.A00 = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            c5362DhE.A02.getClass();
            ((AbstractC5364DhG) di2).A00 |= 1;
            di2.A00 = 0L;
            if ((i & 4) == 0) {
                di2.A04(c5362DhE.A00);
                di2.A01.put(c5362DhE.A02, 0, c5362DhE.A00);
            }
            if ((i & 1) == 0) {
                this.A00 = 2;
                return -4;
            }
        }
        return -4;
    }

    @Override // X.InterfaceC6022DuF
    public final int Afl(long j) {
        A00();
        if (j <= 0 || this.A00 == 2) {
            return 0;
        }
        this.A00 = 2;
        return 1;
    }
}
