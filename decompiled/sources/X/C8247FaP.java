package X;

/* renamed from: X.FaP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8247FaP implements InterfaceC8331Fby {
    public final /* synthetic */ C8243FaJ A00;

    public C8247FaP(C8243FaJ c8243FaJ) {
        this.A00 = c8243FaJ;
    }

    @Override // X.InterfaceC8331Fby
    public final void ASE(C8249FaR c8249FaR, boolean z) {
        if (c8249FaR instanceof SubMenuC8248FaQ) {
            c8249FaR.A03().A0C(false);
        }
        InterfaceC8331Fby interfaceC8331Fby = this.A00.A07;
        if (interfaceC8331Fby != null) {
            interfaceC8331Fby.ASE(c8249FaR, z);
        }
    }

    @Override // X.InterfaceC8331Fby
    public final boolean AUQ(C8249FaR c8249FaR) {
        C8243FaJ c8243FaJ = this.A00;
        if (c8249FaR == c8243FaJ.A06) {
            return false;
        }
        ((SubMenuC8248FaQ) c8249FaR).getItem().getItemId();
        InterfaceC8331Fby interfaceC8331Fby = c8243FaJ.A07;
        if (interfaceC8331Fby != null) {
            return interfaceC8331Fby.AUQ(c8249FaR);
        }
        return false;
    }
}
