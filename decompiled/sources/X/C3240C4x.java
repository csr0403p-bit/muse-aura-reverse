package X;

/* renamed from: X.C4x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3240C4x implements InterfaceC3235C4s {
    public final C3232C4p A00;
    public final C54 A01;

    @Override // X.InterfaceC3235C4s
    public final /* synthetic */ C3238C4v AH4() {
        return null;
    }

    @Override // X.InterfaceC3235C4s
    public final C5l AHs() {
        return C5l.A0C;
    }

    public C3240C4x(C3232C4p c3232C4p, C54 c54) {
        this.A01 = c54;
        this.A00 = c3232C4p;
    }

    @Override // X.InterfaceC3235C4s
    public final /* synthetic */ int AGC() {
        return 100000;
    }

    @Override // X.InterfaceC3235C4s
    public final void start() {
        C3228C4l c3228C4lA00 = C3228C4l.A00();
        c3228C4lA00.A03(C6B.A5P, this.A01.A08);
        C3232C4p c3232C4p = this.A00;
        c3232C4p.A06(c3228C4lA00, EnumC3223C4g.CRITICAL_REPORT, this);
        c3232C4p.A06(c3228C4lA00, EnumC3223C4g.LARGE_REPORT, this);
    }
}
