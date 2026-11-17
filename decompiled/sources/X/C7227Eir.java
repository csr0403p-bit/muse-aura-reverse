package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.Eir, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7227Eir<T> implements InterfaceC7248EjS<T> {
    public final /* synthetic */ C7221Eil A00;

    public C7227Eir(C7221Eil c7221Eil) {
        this.A00 = c7221Eil;
    }

    @Override // X.InterfaceC7248EjS
    public final void onFailure(InterfaceC7236Ej0<T> interfaceC7236Ej0) {
        C7221Eil.A01(interfaceC7236Ej0, this.A00);
    }

    @Override // X.InterfaceC7248EjS
    public final void onProgressUpdate(InterfaceC7236Ej0<T> interfaceC7236Ej0) {
        C7221Eil c7221Eil = this.A00;
        c7221Eil.A04(Math.max(c7221Eil.getProgress(), interfaceC7236Ej0.getProgress()));
    }

    @Override // X.InterfaceC7248EjS
    public final void onNewResult(InterfaceC7236Ej0<T> interfaceC7236Ej0) {
        InterfaceC7236Ej0<T> interfaceC7236Ej02;
        if (!interfaceC7236Ej0.ANI()) {
            if (interfaceC7236Ej0.AOQ()) {
                C7221Eil.A01(interfaceC7236Ej0, this.A00);
                return;
            }
            return;
        }
        C7221Eil c7221Eil = this.A00;
        boolean zAOQ = interfaceC7236Ej0.AOQ();
        synchronized (c7221Eil) {
            if (interfaceC7236Ej0 == c7221Eil.A01 && interfaceC7236Ej0 != (interfaceC7236Ej02 = c7221Eil.A02)) {
                if (interfaceC7236Ej02 == null || zAOQ) {
                    c7221Eil.A02 = interfaceC7236Ej0;
                } else {
                    interfaceC7236Ej02 = null;
                }
                if (interfaceC7236Ej02 != null) {
                    interfaceC7236Ej02.A6Q();
                }
            }
        }
        if (interfaceC7236Ej0 == C7221Eil.A00(c7221Eil)) {
            c7221Eil.A06(null, ((AbstractC7206EiO) interfaceC7236Ej0).A04, interfaceC7236Ej0.AOQ());
        }
    }
}
