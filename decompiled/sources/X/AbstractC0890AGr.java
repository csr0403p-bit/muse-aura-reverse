package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AGr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0890AGr<E> implements Collection<E>, BOA {
    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        if (!C8j4.A1Z(collection)) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public int A0D() {
        Map map;
        if (this instanceof AJZ) {
            map = ((AJZ) this).A00;
        } else if (this instanceof AK0) {
            map = ((AK0) this).A00;
        } else if (this instanceof AJB) {
            map = ((AJB) this).A00;
        } else if (this instanceof AJ1) {
            map = ((AJ1) this).A00;
        } else if (this instanceof AJ5) {
            map = ((AJ5) this).A00;
        } else if (this instanceof AJ3) {
            map = ((AJ3) this).A00;
        } else {
            if (!(this instanceof C0947AJa)) {
                return this instanceof AHJ ? ((AHJ) this).A01 : this instanceof AH8 ? ((AH8) this).A00 : this instanceof C0888AGp ? ((C0888AGp) this).A00 : this instanceof C0880AGh ? ((C0880AGh) this).A00 : this instanceof AH4 ? ((AH4) this).A00 : this instanceof AHU ? ((AHU) this).A01 : ((AH9) this).A00;
            }
            map = ((C0947AJa) this).A00;
        }
        return map.size();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (!(this instanceof Collection) || !isEmpty()) {
            Iterator<E> it = iterator();
            while (it.hasNext()) {
                if (C7384Etj.areEqual(it.next(), obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        if (this instanceof AK0) {
            return new C0966AJt(((AK0) this).A00);
        }
        C0956AJj<K, V> c0956AJj = ((AJB) this).A00.A00;
        C7384Etj.A0Y(c0956AJj, 0);
        AJH[] ajhArr = new AJH[8];
        int i = 0;
        do {
            ajhArr[i] = new AJK();
            i++;
        } while (i < 8);
        return new AJL(c0956AJj, ajhArr);
    }

    public final String toString() {
        return AbstractC0878AGe.A0L(", ", "[", "]", this, C2297BSx.A00(this, 42));
    }

    public static int A00(AbstractC0890AGr abstractC0890AGr) {
        return (abstractC0890AGr.size() - 1) & (-32);
    }

    @Override // java.util.Collection
    public final boolean add(E e) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return A0D();
    }

    @Override // java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C8j3.A1Z(this, tArr);
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}
