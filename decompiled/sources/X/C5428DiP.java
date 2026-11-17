package X;

import android.net.Uri;

/* renamed from: X.DiP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5428DiP implements InterfaceC5231Ddp {
    public long A00;
    public C1O A01;
    public final DF4 A04;
    public final Uri A06;
    public final C5778DpK A07;
    public final InterfaceC5543DkL A08;
    public final InterfaceC6413E4p A09;
    public volatile boolean A0A;
    public final /* synthetic */ C5427DiO A0B;
    public final C5542DkK A05 = new C5542DkK();
    public boolean A02 = true;
    public final long A03 = C5072DTn.A05.getAndIncrement();

    @Override // X.InterfaceC5231Ddp
    public final void A5z() {
        this.A0A = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // X.InterfaceC5231Ddp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void APf() throws java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5428DiP.APf():void");
    }

    public C5428DiP(Uri uri, C5778DpK c5778DpK, C1J c1j, InterfaceC5543DkL interfaceC5543DkL, C5427DiO c5427DiO, InterfaceC6413E4p interfaceC6413E4p) {
        this.A0B = c5427DiO;
        this.A06 = uri;
        this.A04 = new DF4(c1j);
        this.A08 = interfaceC5543DkL;
        this.A09 = interfaceC6413E4p;
        this.A07 = c5778DpK;
    }
}
