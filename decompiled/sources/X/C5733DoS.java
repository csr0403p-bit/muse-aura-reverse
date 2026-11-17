package X;

/* renamed from: X.DoS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5733DoS implements DsL {
    public final /* synthetic */ C5627DmA A00;

    public C5733DoS(C5627DmA c5627DmA) {
        this.A00 = c5627DmA;
    }

    @Override // X.DsL
    public final void ARo() {
        C5627DmA c5627DmA = this.A00;
        if (C5627DmA.A08(c5627DmA)) {
            c5627DmA.A0d.set(true);
        }
        c5627DmA.A0M.ARo();
    }

    @Override // X.DsL
    public final void ARp() {
        C5627DmA c5627DmA = this.A00;
        boolean zA08 = C5627DmA.A08(c5627DmA);
        c5627DmA.A0M.ARp();
        if (zA08) {
            c5627DmA.A0q.getAndSet(null);
            c5627DmA.A0d.set(false);
            C5627DmA.A01(c5627DmA);
        }
    }

    @Override // X.DsL
    public final void ATG(int i) {
        C5627DmA c5627DmA = this.A00;
        c5627DmA.A0M.ATG(i);
        if (C5627DmA.A08(c5627DmA)) {
            c5627DmA.A0d.set(false);
            C5627DmA.A01(c5627DmA);
        }
    }

    @Override // X.DsL
    public final void ATH(int i) {
        C5627DmA c5627DmA = this.A00;
        c5627DmA.A0M.ATH(i);
        if (C5627DmA.A08(c5627DmA)) {
            c5627DmA.A0d.set(false);
            c5627DmA.A0q.set(null);
            C5627DmA.A01(c5627DmA);
        }
    }
}
