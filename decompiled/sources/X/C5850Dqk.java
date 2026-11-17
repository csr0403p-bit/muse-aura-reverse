package X;

/* renamed from: X.Dqk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5850Dqk implements InterfaceC5858Dqs {
    public final InterfaceC5858Dqs A00;
    public volatile C5987DtU A01;

    @Override // X.InterfaceC5858Dqs
    public final void Adf(C5777DpJ c5777DpJ) {
        C7384Etj.A0Y(c5777DpJ, 0);
        this.A01.A00.Adf(c5777DpJ);
    }

    @Override // X.InterfaceC5858Dqs
    public final float ACE(long j, long j2) {
        return this.A01.A00.ACE(j, j2);
    }

    @Override // X.InterfaceC5858Dqs
    public final long ALV() {
        return this.A01.A00.ALV();
    }

    @Override // X.InterfaceC5858Dqs
    public final void ARQ() {
        this.A01.A00.ARQ();
    }

    @Override // X.InterfaceC5858Dqs
    public final void Aev(long j) {
        this.A01.A00.Aev(j);
    }

    public C5850Dqk(InterfaceC5858Dqs interfaceC5858Dqs) {
        this.A00 = interfaceC5858Dqs;
        this.A01 = new C5987DtU(interfaceC5858Dqs);
    }
}
