package X;

/* renamed from: X.Eit, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7229Eit<T> extends AbstractC7206EiO<T> {
    public InterfaceC7236Ej0<T> A00 = null;

    @Override // X.AbstractC7206EiO, X.InterfaceC7236Ej0
    public final boolean A6Q() {
        synchronized (this) {
            if (!super.A6Q()) {
                return false;
            }
            InterfaceC7236Ej0<T> interfaceC7236Ej0 = this.A00;
            this.A00 = null;
            if (interfaceC7236Ej0 == null) {
                return true;
            }
            interfaceC7236Ej0.A6Q();
            return true;
        }
    }

    @Override // X.AbstractC7206EiO, X.InterfaceC7236Ej0
    public final synchronized T AJm() {
        InterfaceC7236Ej0<T> interfaceC7236Ej0;
        interfaceC7236Ej0 = this.A00;
        return interfaceC7236Ej0 != null ? interfaceC7236Ej0.AJm() : null;
    }

    public final void A08(InterfaceC7005EeA<InterfaceC7236Ej0<T>> interfaceC7005EeA) {
        if (A05()) {
            return;
        }
        InterfaceC7236Ej0<T> interfaceC7236Ej0 = interfaceC7005EeA != null ? interfaceC7005EeA.get() : null;
        synchronized (this) {
            if (A05()) {
                if (interfaceC7236Ej0 != null) {
                    interfaceC7236Ej0.A6Q();
                }
                return;
            }
            InterfaceC7236Ej0<T> interfaceC7236Ej02 = this.A00;
            this.A00 = interfaceC7236Ej0;
            if (interfaceC7236Ej0 != null) {
                interfaceC7236Ej0.Agc(new C7233Eix(this), C2952Bpp.A00);
            }
            if (interfaceC7236Ej02 != null) {
                interfaceC7236Ej02.A6Q();
            }
        }
    }
}
