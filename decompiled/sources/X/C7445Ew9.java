package X;

/* renamed from: X.Ew9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C7445Ew9 implements InterfaceC2349BUy, Bs1 {
    public final /* synthetic */ G0U A00;

    public final boolean equals(Object obj) {
        if ((obj instanceof Bs1) && (obj instanceof InterfaceC2349BUy)) {
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

    @Override // X.Bs1
    public final /* synthetic */ void onChanged(Object obj) {
        this.A00.invoke(obj);
    }

    public C7445Ew9(G0U g0u) {
        this.A00 = g0u;
    }
}
