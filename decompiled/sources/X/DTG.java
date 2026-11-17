package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes5.dex */
public final class DTG<V> extends AbstractCollection<V> {
    public final /* synthetic */ DTL A00;

    public DTG(DTL dtl) {
        this.A00 = dtl;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new DTH(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A00.size();
    }
}
