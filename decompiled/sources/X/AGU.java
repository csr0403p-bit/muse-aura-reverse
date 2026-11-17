package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public class AGU<E> implements Set<E>, BOA {
    public final AbstractC0916AHs<E> A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.A00.A05(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        if (!(this instanceof AGW)) {
            throw C8j4.A10();
        }
        C7384Etj.A0Y(collection, 0);
        return ((AGW) this).A00.A0A(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (!(this instanceof AGW)) {
            throw C8j4.A10();
        }
        ((AGW) this).A00.A06();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.A05(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((AGU) obj).A00);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(this.A00.A01);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return this instanceof AGW ? new BTG((AGW) this) : BL3.A0C(new C2324BTy(this, null, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        if (!(this instanceof AGW)) {
            throw C8j4.A10();
        }
        C7384Etj.A0Y(collection, 0);
        C0917AHt<E> c0917AHt = ((AGW) this).A00;
        int i = c0917AHt.A01;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            c0917AHt.A09(it.next());
        }
        return i != c0917AHt.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(java.util.Collection<?> r17) {
        /*
            r16 = this;
            r1 = r16
            boolean r0 = r1 instanceof X.AGW
            if (r0 == 0) goto L62
            X.AGW r1 = (X.AGW) r1
            r0 = 0
            r12 = r17
            X.C7384Etj.A0Y(r12, r0)
            X.AHt<E> r11 = r1.A00
            r17 = 0
            java.lang.Object[] r10 = r11.A04
            int r9 = r11.A01
            long[] r8 = r11.A03
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L5b
            r6 = 0
        L1e:
            r15 = r8[r6]
            long r3 = X.C8j5.A0A(r15)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L56
            int r0 = X.C8j3.A0E(r6, r7)
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L37:
            if (r3 >= r4) goto L54
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r15
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L50
            int r1 = r6 << 3
            int r1 = r1 + r3
            r0 = r10[r1]
            boolean r0 = X.AbstractC0878AGe.A0k(r12, r0)
            if (r0 != 0) goto L50
            r11.A07(r1)
        L50:
            long r15 = r15 >> r5
            int r3 = r3 + 1
            goto L37
        L54:
            if (r4 != r5) goto L5b
        L56:
            if (r6 == r7) goto L5b
            int r6 = r6 + 1
            goto L1e
        L5b:
            int r0 = r11.A01
            if (r9 == r0) goto L61
            r17 = 1
        L61:
            return r17
        L62:
            java.lang.UnsupportedOperationException r0 = X.C8j4.A10()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AGU.retainAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.A01;
    }

    public final String toString() {
        return this.A00.toString();
    }

    public AGU(AbstractC0916AHs<E> abstractC0916AHs) {
        this.A00 = abstractC0916AHs;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e) {
        throw C8j4.A10();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
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
