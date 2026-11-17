package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: X.AHz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0923AHz implements List<AbstractC1439Aj8>, BOA {
    public int A00;
    public AI1 A01;
    public C0912AHo<Object> A02 = new C0912AHo<>(16);

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.A00 = -1;
        this.A02.A06();
        this.A01.A00 = 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<AbstractC1439Aj8> iterator() {
        return new C0922AHy(this, 0, 0, size());
    }

    @Override // java.util.List
    public final ListIterator<AbstractC1439Aj8> listIterator(int i) {
        return new C0922AHy(this, i, 0, size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        throw new java.lang.IndexOutOfBoundsException("Index must be between 0 and size");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A00(X.C0923AHz r9) {
        /*
            r0 = 2139095040(0x7f800000, float:Infinity)
            long r5 = X.C8j3.A0P(r0)
            r0 = 32
            long r5 = r5 << r0
            int r0 = r9.A00
            int r8 = r0 + 1
            int r0 = r9.size()
            int r7 = r0 + (-1)
            if (r8 > r7) goto L3b
        L15:
            X.AI1 r1 = r9.A01
            if (r8 < 0) goto L41
            int r0 = r1.A00
            if (r8 >= r0) goto L41
            long[] r0 = r1.A01
            r0 = r0[r8]
            int r2 = X.AI2.A00(r0, r5)
            if (r2 >= 0) goto L28
            r5 = r0
        L28:
            float r1 = X.AnonymousClass001.A00(r5)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L3c
            r0 = 1
            long r3 = r5 & r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L3c
        L3b:
            return r5
        L3c:
            if (r8 == r7) goto L3b
            int r8 = r8 + 1
            goto L15
        L41:
            java.lang.String r1 = "Index must be between 0 and size"
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0923AHz.A00(X.AHz):long");
    }

    public static final void A01(C0923AHz c0923AHz, int i, int i2) {
        int i3;
        if (i < i2) {
            c0923AHz.A02.A07(i, i2);
            AI1 ai1 = c0923AHz.A01;
            if (i < 0 || i > (i3 = ai1.A00) || i2 < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("Index must be between 0 and size");
            }
            if (i2 < i) {
                throw C60O.A0i("The end index must be < start index");
            }
            if (i2 != i) {
                if (i2 < i3) {
                    long[] jArr = ai1.A01;
                    C7384Etj.A0Y(jArr, 0);
                    System.arraycopy(jArr, i2, jArr, i, i3 - i2);
                }
                ai1.A00 -= i2 - i;
            }
        }
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
        ?? A03 = this.A02.A03(i);
        C7384Etj.A0Z(A03, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return A03;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof AbstractC1439Aj8) {
            int size = size() - 1;
            int i = 0;
            if (size >= 0) {
                while (!C7384Etj.areEqual(this.A02.A03(i), obj)) {
                    int i2 = i;
                    i++;
                    if (i2 == size) {
                    }
                }
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(((AbstractC0913AHp) this.A02).A00);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof AbstractC1439Aj8) {
            for (int size = size() - 1; -1 < size; size--) {
                if (C7384Etj.areEqual(this.A02.A03(size), obj)) {
                    return size;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return ((AbstractC0913AHp) this.A02).A00;
    }

    @Override // java.util.List
    public final List<AbstractC1439Aj8> subList(int i, int i2) {
        return new C0921AHx(this, i, i2);
    }

    public C0923AHz() {
        AI1 ai1 = new AI1();
        ai1.A01 = new long[16];
        this.A01 = ai1;
        this.A00 = -1;
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
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
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
        return new C0922AHy(this, 0, 0, size());
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
