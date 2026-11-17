package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes5.dex */
public abstract class DTU<E> implements Iterator<E> {

    /* JADX INFO: Incorrect field signature: TE; */
    public InterfaceC5064DTa A00;
    public final /* synthetic */ DTM A01;

    /* JADX WARN: Multi-variable type inference failed */
    public DTU(InterfaceC5064DTa interfaceC5064DTa, E e) {
        this.A01 = e;
        this.A00 = interfaceC5064DTa;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AnonymousClass002.A1X(this.A00);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        InterfaceC5064DTa interfaceC5064DTa = this.A00;
        this.A00 = this instanceof DTT ? ((DTP) interfaceC5064DTa).prev : ((DTP) interfaceC5064DTa).next;
        return interfaceC5064DTa;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j3.A17();
    }
}
