package X;

/* renamed from: X.Bkc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2766Bkc implements InterfaceC2787BlA {
    public BlP A00;
    public boolean A01;
    public final InterfaceC2787BlA A02;
    public final Object A03 = C3cG.A0T();

    @Override // X.InterfaceC2787BlA
    public final void A4Q(BlP blP, long j) {
        C7384Etj.A0Y(blP, 1);
        synchronized (this.A03) {
            this.A01 = true;
            this.A00 = blP;
        }
        InterfaceC2787BlA interfaceC2787BlA = this.A02;
        if (interfaceC2787BlA != null) {
            interfaceC2787BlA.A4Q(new BlP() { // from class: X.Bkd
                @Override // X.BlP
                public final void ASK() {
                    C2766Bkc c2766Bkc = this.A00;
                    synchronized (c2766Bkc.A03) {
                        if (c2766Bkc.A00 == null) {
                            AbstractC2875Bni.A03("ScreenFlashWrapper", "apply: pendingListener is null!");
                        }
                        C2766Bkc.A01(c2766Bkc);
                    }
                }
            }, j);
        } else {
            AbstractC2875Bni.A02("ScreenFlashWrapper", "apply: screenFlash is null!");
            A01(this);
        }
    }

    public static final void A00(C2766Bkc c2766Bkc) {
        synchronized (c2766Bkc.A03) {
            if (c2766Bkc.A01) {
                InterfaceC2787BlA interfaceC2787BlA = c2766Bkc.A02;
                if (interfaceC2787BlA != null) {
                    interfaceC2787BlA.clear();
                } else {
                    AbstractC2875Bni.A02("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                }
            } else {
                AbstractC2875Bni.A03("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
            }
            c2766Bkc.A01 = false;
        }
    }

    public static final void A01(C2766Bkc c2766Bkc) {
        synchronized (c2766Bkc.A03) {
            BlP blP = c2766Bkc.A00;
            if (blP != null) {
                blP.ASK();
            }
            c2766Bkc.A00 = null;
        }
    }

    public C2766Bkc(InterfaceC2787BlA interfaceC2787BlA) {
        this.A02 = interfaceC2787BlA;
    }

    @Override // X.InterfaceC2787BlA
    public final void clear() {
        A00(this);
    }
}
