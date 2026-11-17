package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.FWw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8154FWw<T> implements C3b6<T> {
    public final AtomicReference<C3b6<T>> A00;

    @Override // X.C3b6
    public final Iterator<T> iterator() {
        C3b6<T> andSet = this.A00.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }

    public C8154FWw(C3b6<? extends T> c3b6) {
        this.A00 = new AtomicReference<>(c3b6);
    }
}
