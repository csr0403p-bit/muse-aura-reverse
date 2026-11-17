package X;

/* loaded from: classes5.dex */
public final class F5M implements BpS {
    public final int $t;
    public final Object A00;

    public F5M(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.BpS
    public final Object apply(Object obj) {
        if (this.$t != 0) {
            ((C2820Blx) this.A00).A00(EvM.STREAMING);
            return null;
        }
        G0U g0u = (G0U) this.A00;
        C2678Bha c2678Bha = C2678Bha.A07;
        return g0u.invoke(obj);
    }
}
