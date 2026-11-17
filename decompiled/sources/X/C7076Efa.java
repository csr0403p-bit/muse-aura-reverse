package X;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: X.Efa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7076Efa<T> implements InterfaceC7015EeM<T> {
    public long A00;
    public final InterfaceC7015EeM<T> A01;
    public final ConcurrentLinkedQueue<Pair<InterfaceC7028EeZ<T>, InterfaceC7029Eea>> A02 = new ConcurrentLinkedQueue<>();
    public final Executor A03;

    public C7076Efa(InterfaceC7015EeM interfaceC7015EeM, Executor executor) {
        this.A01 = interfaceC7015EeM;
        this.A03 = executor;
    }

    @Override // X.InterfaceC7015EeM
    public final void AYc(InterfaceC7028EeZ<T> interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea) {
        boolean z;
        AnonymousClass003.A0u(interfaceC7028EeZ, interfaceC7029Eea);
        InterfaceC7027EeY interfaceC7027EeY = ((C7185Ehv) interfaceC7029Eea).A05;
        interfaceC7027EeY.AV6(interfaceC7029Eea, "ThrottlingProducer");
        synchronized (this) {
            long j = this.A00;
            if (j >= 5) {
                this.A02.add(Pair.create(interfaceC7028EeZ, interfaceC7029Eea));
                z = true;
            } else {
                this.A00 = j + 1;
                z = false;
            }
        }
        if (z) {
            return;
        }
        interfaceC7027EeY.AV4(interfaceC7029Eea, "ThrottlingProducer", null);
        this.A01.AYc(new C7075EfZ(interfaceC7028EeZ, this), interfaceC7029Eea);
    }
}
