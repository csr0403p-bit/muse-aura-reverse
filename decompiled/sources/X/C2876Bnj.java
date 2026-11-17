package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Bnj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2876Bnj extends AbstractC2867Bna {
    public final AtomicBoolean A00;

    @Override // X.AbstractC2867Bna, X.InterfaceC2873Bng, java.lang.AutoCloseable
    public final void close() {
        if (this.A00.getAndSet(true)) {
            return;
        }
        super.close();
    }

    public C2876Bnj(InterfaceC2873Bng interfaceC2873Bng) {
        super(interfaceC2873Bng);
        this.A00 = C60O.A1E();
    }
}
