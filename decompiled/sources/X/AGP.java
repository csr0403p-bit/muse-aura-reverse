package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class AGP<K, V> implements Set<Map.Entry<? extends K, ? extends V>>, BOA {
    public final AbstractC0915AHr<K, V> A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        if (!C8j4.A1Z(collection)) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(it);
                if (!C7384Etj.areEqual(this.A00.A05(entryA0l.getKey()), entryA0l.getValue())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return BL3.A0C(new C2324BTy(this, null, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entryA15 = C8j4.A15(obj);
        return C7384Etj.areEqual(this.A00.A05(entryA15.getKey()), entryA15.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(this.A00.A01);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.A01;
    }

    public final String toString() {
        return AbstractC0878AGe.A0L(", ", "[", "]", this, null);
    }

    public AGP(AbstractC0915AHr<K, V> abstractC0915AHr) {
        this.A00 = abstractC0915AHr;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw C8j4.A10();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C8j3.A1Z(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}
