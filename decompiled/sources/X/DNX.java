package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.EvictingQueue;
import com.google.common.collect.Sets$UnmodifiableNavigableSet;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class DNX<E> extends AbstractC3450CNv implements Collection<E> {
    private final Collection<E> A00() {
        return this instanceof Sets$UnmodifiableNavigableSet ? ((Sets$UnmodifiableNavigableSet) this).unmodifiableDelegate : this instanceof DOS ? ((DOS) this).A00.A00 : this instanceof EvictingQueue ? ((EvictingQueue) this).delegate : ((C5036DPy) this).A03;
    }

    @Override // java.util.Collection
    public final boolean add(E element) {
        if (!(this instanceof EvictingQueue)) {
            return A00().add(element);
        }
        EvictingQueue evictingQueue = (EvictingQueue) this;
        element.getClass();
        if (evictingQueue.maxSize != 0) {
            if (evictingQueue.size() == evictingQueue.maxSize) {
                evictingQueue.delegate.remove();
            }
            evictingQueue.delegate.add(element);
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it;
        if (!(this instanceof EvictingQueue)) {
            return A00().addAll(collection);
        }
        EvictingQueue evictingQueue = (EvictingQueue) this;
        int size = collection.size();
        if (size >= evictingQueue.maxSize) {
            evictingQueue.clear();
            int i = size - evictingQueue.maxSize;
            Preconditions.checkArgument(C8j3.A1Q(i), "number to skip cannot be negative");
            Iterable cqb = new CQB(collection, i);
            if (cqb instanceof Collection) {
                return evictingQueue.addAll((Collection) cqb);
            }
            it = cqb.iterator();
        } else {
            it = collection.iterator();
        }
        return AbstractC7483Exg.A01(evictingQueue, it);
    }

    @Override // java.util.Collection
    public final void clear() {
        A00().clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object object) {
        return A00().contains(object);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return A00().containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return A00().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return A00().iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object object) {
        return A00().remove(object);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return A00().removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return A00().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return A00().size();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) A00().toArray(tArr);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return A00().toArray();
    }
}
