package X;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DNZ<K, V> extends C4998DMo<K, V> {
    public final Predicate<? super Map.Entry<K, V>> A00;
    public final Map<K, V> A01;

    @Override // X.C4998DMo, java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object o) {
        Iterator itA0n = AnonymousClass002.A0n(this.A01);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (this.A00.apply(entryA0l) && Objects.equal(entryA0l.getValue(), o)) {
                itA0n.remove();
                return true;
            }
        }
        return false;
    }

    @Override // X.C4998DMo, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator itA0n = AnonymousClass002.A0n(this.A01);
        boolean zA1Z = false;
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (this.A00.apply(entryA0l)) {
                zA1Z = BV8.A1Z(entryA0l.getValue(), collection, itA0n, zA1Z);
            }
        }
        return zA1Z;
    }

    @Override // X.C4998DMo, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator itA0n = AnonymousClass002.A0n(this.A01);
        boolean z = false;
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (this.A00.apply(entryA0l) && !collection.contains(entryA0l.getValue())) {
                itA0n.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<TK;TV;>;Ljava/util/Map<TK;TV;>;Lcom/google/common/base/Predicate<-Ljava/util/Map$Entry<TK;TV;>;>;)V */
    public DNZ(Predicate filteredMap, Map unfiltered, Map predicate) {
        super(unfiltered);
        this.A01 = predicate;
        this.A00 = filteredMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC7483Exg.A00(this).toArray(tArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return AbstractC7483Exg.A00(this).toArray();
    }
}
