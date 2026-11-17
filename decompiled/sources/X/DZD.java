package X;

/* loaded from: classes5.dex */
public final class DZD implements InterfaceC5106DYe {
    public InterfaceC5106DYe A00;
    public boolean A01;

    @Override // X.InterfaceC5106DYe
    public final synchronized void cancel() {
        this.A01 = true;
        InterfaceC5106DYe interfaceC5106DYe = this.A00;
        if (interfaceC5106DYe != null) {
            interfaceC5106DYe.cancel();
        }
    }
}
