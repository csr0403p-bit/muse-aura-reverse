package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EIU {
    public final Function0<Unit> A03;
    public final AtomicInteger A02 = BV4.A13(0);
    public final AtomicBoolean A01 = BV4.A12(false);
    public final AtomicBoolean A00 = BV4.A12(false);

    public EIU(Function0<Unit> function0) {
        this.A03 = function0;
    }

    public final void A00() {
        synchronized (this) {
            AtomicInteger atomicInteger = this.A02;
            atomicInteger.decrementAndGet();
            if (atomicInteger.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }
}
