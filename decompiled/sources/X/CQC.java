package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.ImmutableEntry;
import com.google.common.collect.Iterators$EmptyModifiableIterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class CQC<T> implements Iterator<T> {
    public K A00 = null;
    public Collection<V> A01 = null;
    public Iterator<V> A02 = Iterators$EmptyModifiableIterator.A01;
    public final Iterator<Map.Entry<K, Collection<V>>> A03;
    public final /* synthetic */ AbstractMapBasedMultimap A04;

    public CQC(final AbstractMapBasedMultimap this$0) {
        this.A04 = this$0;
        this.A03 = AnonymousClass002.A0n(this$0.A01);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A03.hasNext() || this.A02.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [K, java.lang.Object] */
    @Override // java.util.Iterator
    public final T next() {
        if (!this.A02.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(this.A03);
            this.A00 = entryA0l.getKey();
            Collection<V> collection = (Collection) entryA0l.getValue();
            this.A01 = collection;
            this.A02 = collection.iterator();
        }
        K k = this.A00;
        T t = (T) this.A02.next();
        return this instanceof DOX ? (T) new ImmutableEntry(k, t) : t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A02.remove();
        Collection<V> collection = this.A01;
        collection.getClass();
        if (collection.isEmpty()) {
            this.A03.remove();
        }
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A04;
        abstractMapBasedMultimap.A00--;
    }
}
