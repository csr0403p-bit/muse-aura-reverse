package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes5.dex */
public final class COC extends CO8 implements NavigableSet, COF {
    public static final COC A03;
    public transient COC A00;
    public final transient COO A01;
    public final transient Comparator A02;

    @Override // X.COD, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.A01, obj, this.A02) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // X.CO8, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            COO coo = this.A01;
            if (coo.size() != set.size()) {
                return false;
            }
            if (!isEmpty()) {
                Comparator comparator = this.A02;
                if (!A01(set, comparator)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    COR corListIterator = coo.listIterator(0);
                    while (corListIterator.hasNext()) {
                        E next = corListIterator.next();
                        Object next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                            return false;
                        }
                    }
                } catch (ClassCastException | NoSuchElementException unused) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iA08 = A08(obj, true) - 1;
        if (iA08 == -1) {
            return null;
        }
        return this.A01.get(iA08);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iA08 = A08(obj, false) - 1;
        if (iA08 == -1) {
            return null;
        }
        return this.A01.get(iA08);
    }

    static {
        COR cor = COO.A00;
        A03 = new COC(COM.A02, COG.A00);
    }

    public static COC A00(Comparator comparator) {
        if (COG.A00.equals(comparator)) {
            return A03;
        }
        COR cor = COO.A00;
        return new COC(COM.A02, comparator);
    }

    private final COC A0B(Object obj, boolean z) {
        COO coo = this.A01;
        int iBinarySearch = Collections.binarySearch(coo, obj, this.A02);
        if (iBinarySearch < 0) {
            iBinarySearch ^= -1;
        } else if (!z) {
            iBinarySearch++;
        }
        return A0A(iBinarySearch, coo.size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: A09, reason: merged with bridge method [inline-methods] */
    public final COC descendingSet() {
        COC cocA00 = this.A00;
        if (cocA00 == null) {
            Comparator comparatorReverseOrder = Collections.reverseOrder(this.A02);
            cocA00 = isEmpty() ? A00(comparatorReverseOrder) : new COC(this.A01.A07(), comparatorReverseOrder);
            this.A00 = cocA00;
            cocA00.A00 = this;
        }
        return cocA00;
    }

    public final COC A0A(int i, int i2) {
        if (i == 0) {
            if (i2 == this.A01.size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return A00(this.A02);
        }
        COO coo = this.A01;
        return new COC(coo.subList(i, i2), this.A02);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        COO coo = this.A01;
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(coo, obj, this.A02);
        if (iBinarySearch < 0) {
            iBinarySearch ^= -1;
        }
        if (iBinarySearch == coo.size()) {
            return null;
        }
        return coo.get(iBinarySearch);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.A02;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.A02;
        if (!A01(collection, comparator) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        COR corListIterator = this.A01.listIterator(0);
        Iterator it = collection.iterator();
        if (!corListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = corListIterator.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare >= 0) {
                    if (iCompare != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!corListIterator.hasNext()) {
                        return false;
                    }
                    next2 = corListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return this.A01.A07().listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        COO coo = this.A01;
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(coo, obj, this.A02);
        int i = iBinarySearch ^ (-1);
        if (iBinarySearch >= 0) {
            i = iBinarySearch + 1;
        }
        if (i == coo.size()) {
            return null;
        }
        return coo.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.A01.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A01.size();
    }

    public COC(COO coo, Comparator comparator) {
        this.A02 = comparator;
        this.A01 = coo;
    }

    public static boolean A01(Iterable iterable, Comparator comparator) {
        Object objComparator;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            objComparator = ((SortedSet) iterable).comparator();
            if (objComparator == null) {
                objComparator = COG.A00;
            }
        } else {
            if (!(iterable instanceof COF)) {
                return false;
            }
            objComparator = ((COC) ((COF) iterable)).A02;
        }
        return comparator.equals(objComparator);
    }

    public final int A08(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.A01, obj, this.A02);
        return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : iBinarySearch ^ (-1);
    }

    @Deprecated
    public final void addFirst(Object obj) {
        throw C8j3.A17();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw C8j3.A17();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw C8j3.A1D();
        }
        return C8j4.A0p(this.A01);
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return A0A(0, A08(obj, false));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw C8j3.A1D();
        }
        COO coo = this.A01;
        return coo.get(C8j3.A0K(coo));
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw C8j3.A17();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw C8j3.A17();
    }

    @Deprecated
    public final Object removeFirst() {
        throw C8j3.A17();
    }

    @Deprecated
    public final Object removeLast() {
        throw C8j3.A17();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.A02.compare(obj, obj2) > 0) {
            throw BV4.A0P();
        }
        COC cocA0B = A0B(obj, true);
        return cocA0B.A0A(0, cocA0B.A08(obj2, false));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return A0B(obj, true);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        return A0A(0, A08(obj, z));
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.A02.compare(obj, obj2) <= 0) {
            COC cocA0B = A0B(obj, z);
            return cocA0B.A0A(0, cocA0B.A08(obj2, z2));
        }
        throw BV4.A0P();
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return A0B(obj, z);
    }
}
