package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class C1D<T> extends AbstractC7489Ext<T> {
    public final /* synthetic */ Iterator A00;

    public C1D(final Iterator val$iterator) {
        this.A00 = val$iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return (T) this.A00.next();
    }
}
