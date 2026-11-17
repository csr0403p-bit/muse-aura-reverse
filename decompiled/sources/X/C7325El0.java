package X;

/* renamed from: X.El0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7325El0<T> implements InterfaceC7327El2<T> {
    public T A00;
    public boolean A01 = false;
    public final InterfaceC7327El2<T> A02;

    @Override // X.InterfaceC7327El2
    public final T get() {
        if (!this.A01) {
            this.A00 = this.A02.get();
            this.A01 = true;
        }
        return this.A00;
    }

    public C7325El0(InterfaceC7327El2<T> interfaceC7327El2) {
        this.A02 = interfaceC7327El2;
    }
}
