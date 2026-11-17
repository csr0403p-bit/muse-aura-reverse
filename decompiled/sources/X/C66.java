package X;

/* loaded from: classes5.dex */
public final class C66 implements InterfaceC3235C4s {
    public static final C7V A05 = new C7R();
    public C3279C7i A00;
    public C7V A01;
    public final C3232C4p A02;
    public final C7V A03;
    public final C54 A04;
    public byte[] mOomReservation;

    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(java.lang.Thread r13, java.lang.Throwable r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66.A00(java.lang.Thread, java.lang.Throwable):void");
    }

    @Override // X.InterfaceC3235C4s
    public final /* synthetic */ C3238C4v AH4() {
        return null;
    }

    @Override // X.InterfaceC3235C4s
    public final C5l AHs() {
        return C5l.A06;
    }

    @Override // X.InterfaceC3235C4s
    public final void start() {
        C67 c67;
        C6w.A00("JavaCrashDetector");
        synchronized (C67.class) {
            c67 = C67.A03;
        }
        if (c67 != null) {
            C67.A02(new C3258C6a(this));
        } else {
            Thread.setDefaultUncaughtExceptionHandler(new C6V(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
        this.mOomReservation = new byte[65536];
    }

    public C66(C3232C4p c3232C4p, C3279C7i c3279C7i, C7V c7v, C7V c7v2, C54 c54) {
        this.A04 = c54;
        this.A02 = c3232C4p;
        this.A00 = c3279C7i;
        this.A01 = c7v;
        this.A03 = c7v2;
    }

    @Override // X.InterfaceC3235C4s
    public final /* synthetic */ int AGC() {
        return 100000;
    }
}
