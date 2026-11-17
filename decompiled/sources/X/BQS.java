package X;

/* loaded from: classes4.dex */
public final class BQS implements BRg {
    public final BRg A00;
    public final BRg A01;

    @Override // X.BRg
    public final boolean all(G0U<? super AbB, Boolean> g0u) {
        return this.A01.all(g0u) && this.A00.all(g0u);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BQS) {
            BQS bqs = (BQS) obj;
            if (this.A01.equals(bqs.A01) && C7384Etj.areEqual(this.A00, bqs.A00)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BRg
    public final <R> R foldIn(R r, G0V<? super R, ? super AbB, ? extends R> g0v) {
        return (R) this.A00.foldIn(this.A01.foldIn(r, g0v), g0v);
    }

    public final int hashCode() {
        return this.A01.hashCode() + AnonymousClass005.A0E(this.A00);
    }

    public final String toString() {
        return FGI.A0N("[", (String) foldIn("", BUR.A00(2)), ']');
    }

    public BQS(BRg bRg, BRg bRg2) {
        this.A01 = bRg;
        this.A00 = bRg2;
    }

    @Override // X.BRg
    public final /* synthetic */ BRg then(BRg bRg) {
        return BRP.A00(this, bRg);
    }
}
