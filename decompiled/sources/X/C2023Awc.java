package X;

/* renamed from: X.Awc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C2023Awc implements InterfaceC2349BUy, InterfaceC2163Azt {
    public final /* synthetic */ G0U A00;

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC2163Azt) && (obj instanceof InterfaceC2349BUy)) {
            return C7384Etj.areEqual(this.A00, ((InterfaceC2349BUy) obj).getFunctionDelegate());
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

    public C2023Awc(G0U g0u) {
        this.A00 = g0u;
    }
}
