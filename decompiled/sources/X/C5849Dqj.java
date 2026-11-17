package X;

import androidx.media3.common.util.Util;

/* renamed from: X.Dqj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5849Dqj implements InterfaceC5858Dqs {
    public final long A00;
    public final InterfaceC5858Dqs A01;
    public final C5750Dol A02;

    @Override // X.InterfaceC5858Dqs
    public final float ACE(long j, long j2) {
        if (this.A02.A00() < this.A00) {
            return 1.0f;
        }
        return this.A01.ACE(j, j2);
    }

    @Override // X.InterfaceC5858Dqs
    public final long ALV() {
        return this.A01.ALV();
    }

    @Override // X.InterfaceC5858Dqs
    public final void ARQ() {
        this.A01.ARQ();
    }

    @Override // X.InterfaceC5858Dqs
    public final void Adf(C5777DpJ c5777DpJ) {
        this.A01.Adf(c5777DpJ);
    }

    @Override // X.InterfaceC5858Dqs
    public final void Aev(long j) {
        this.A01.Aev(j);
    }

    public C5849Dqj(InterfaceC5858Dqs interfaceC5858Dqs, C5750Dol c5750Dol, long j) {
        this.A01 = interfaceC5858Dqs;
        this.A02 = c5750Dol;
        this.A00 = Util.A0A(j);
    }
}
