package X;

/* renamed from: X.Hjo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C10462Hjo implements InterfaceC2349BUy, FwT {
    public final /* synthetic */ G0U A00;

    public final boolean equals(Object obj) {
        if ((obj instanceof FwT) && (obj instanceof InterfaceC2349BUy)) {
            return this.A00.equals(((InterfaceC2349BUy) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC2349BUy
    public final Ht9<?> getFunctionDelegate() {
        return this.A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C10462Hjo(G0U g0u) {
        this.A00 = g0u;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return this.A00.invoke(Double.valueOf(BV6.A00(obj)));
    }
}
