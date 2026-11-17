package X;

/* loaded from: classes5.dex */
public final class Du0 implements InterfaceC6022DuF {
    public final InterfaceC6022DuF A00;
    public final long A01;

    @Override // X.InterfaceC6022DuF
    public final void AQQ() {
        this.A00.AQQ();
    }

    @Override // X.InterfaceC6022DuF
    public final int AZE(Di2 di2, C5406Dhz c5406Dhz, int i) {
        int iAZE = this.A00.AZE(di2, c5406Dhz, i);
        if (iAZE == -4) {
            di2.A00 = BV5.A07(di2.A00 + this.A01);
        }
        return iAZE;
    }

    @Override // X.InterfaceC6022DuF
    public final int Afl(long j) {
        return this.A00.Afl(j - this.A01);
    }

    @Override // X.InterfaceC6022DuF
    public final boolean isReady() {
        return this.A00.isReady();
    }

    public Du0(InterfaceC6022DuF interfaceC6022DuF, long j) {
        this.A00 = interfaceC6022DuF;
        this.A01 = j;
    }
}
