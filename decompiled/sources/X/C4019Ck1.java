package X;

/* renamed from: X.Ck1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4019Ck1 {
    public final InterfaceC3618CYn A00;
    public final C4033CkZ A01;
    public final CGu A02;
    public final CYD A03;
    public final String A04;
    public volatile CYB A05;
    public volatile boolean A06;

    public final void A00() {
        if (this.A06) {
            return;
        }
        if (this.A05 != null) {
            CG5 cg5 = this.A05.A00;
            if (cg5 instanceof CG6) {
                ((CG6) cg5).release();
            }
        }
        this.A06 = true;
    }

    public final void finalize() {
        if (this.A06) {
            return;
        }
        A00();
    }

    public C4019Ck1(C4028CkJ c4028CkJ) {
        String str = c4028CkJ.A03;
        if (str == null) {
            throw C3cG.A0Q("Must set friendlyName");
        }
        this.A04 = str;
        this.A03 = c4028CkJ.A04;
        this.A02 = c4028CkJ.A02;
        this.A01 = c4028CkJ.A01;
        InterfaceC3618CYn interfaceC3618CYn = c4028CkJ.A00;
        if (interfaceC3618CYn == null) {
            throw C3cG.A0Q("Must set callback");
        }
        this.A00 = interfaceC3618CYn;
    }
}
