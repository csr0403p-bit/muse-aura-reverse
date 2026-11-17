package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CUM<T> implements CUK<Set<T>> {
    public volatile Set<T> A00;
    public volatile Set<CUK<T>> A01;

    @Override // X.CUK
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.A00 == null) {
            synchronized (this) {
                if (this.A00 == null) {
                    this.A00 = C60O.A18();
                    Iterator<CUK<T>> it = this.A01.iterator();
                    while (it.hasNext()) {
                        this.A00.add(it.next().get());
                    }
                    this.A01 = null;
                }
            }
        }
        return Collections.unmodifiableSet(this.A00);
    }
}
