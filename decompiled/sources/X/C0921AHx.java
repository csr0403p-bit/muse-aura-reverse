package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: X.AHx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0921AHx implements List<AbstractC1439Aj8>, BOA {
    public final int A00;
    public final int A01;
    public final /* synthetic */ C0923AHz A02;

    public C0921AHx(C0923AHz c0923AHz, int i, int i2) {
        this.A02 = c0923AHz;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof AbstractC1439Aj8) {
            return AnonymousClass002.A1P(indexOf(obj), -1);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.Aj8, java.lang.Object] */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 get(int i) {
        ?? A03 = this.A02.A02.A03(i + this.A01);
        C7384Etj.A0Z(A03, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return A03;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        int i;
        int i2;
        if (!(obj instanceof AbstractC1439Aj8) || (i = this.A01) > (i2 = this.A00)) {
            return -1;
        }
        while (!C7384Etj.areEqual(this.A02.A02.A03(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i++;
        }
        return i - i;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<AbstractC1439Aj8> iterator() {
        C0923AHz c0923AHz = this.A02;
        int i = this.A01;
        return new C0922AHy(c0923AHz, i, i, this.A00);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        int i;
        int i2;
        if (!(obj instanceof AbstractC1439Aj8) || (i2 = this.A01) > (i = this.A00)) {
            return -1;
        }
        while (!C7384Etj.areEqual(this.A02.A02.A03(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator<AbstractC1439Aj8> listIterator(int i) {
        C0923AHz c0923AHz = this.A02;
        int i2 = this.A01;
        return new C0922AHy(c0923AHz, i + i2, i2, this.A00);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00 - this.A01;
    }

    @Override // java.util.List
    public final List<AbstractC1439Aj8> subList(int i, int i2) {
        C0923AHz c0923AHz = this.A02;
        int i3 = this.A01;
        return new C0921AHx(c0923AHz, i + i3, i3 + i2);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends AbstractC1439Aj8> collection) {
        throw C8j4.A10();
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw C8j4.A10();
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(size());
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 remove(int i) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw C8j4.A10();
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<AbstractC1439Aj8> unaryOperator) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 set(int i, AbstractC1439Aj8 abstractC1439Aj8) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super AbstractC1439Aj8> comparator) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC0905AHh.A01(this, tArr);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, AbstractC1439Aj8 abstractC1439Aj8) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends AbstractC1439Aj8> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final ListIterator<AbstractC1439Aj8> listIterator() {
        C0923AHz c0923AHz = this.A02;
        int i = this.A01;
        return new C0922AHy(c0923AHz, i, i, this.A00);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}
