package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.9tP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9tP implements Collection<C9314GDq>, BOA {
    public final long[] A00;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r3 < 0) goto L21;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsAll(java.util.Collection<?> r10) {
        /*
            r9 = this;
            r0 = 0
            X.C7384Etj.A0Y(r10, r0)
            long[] r9 = r9.A00
            r8 = 1
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L34
            java.util.Iterator r7 = r10.iterator()
        L11:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r1 = r7.next()
            boolean r0 = r1 instanceof X.C9314GDq
            if (r0 == 0) goto L33
            X.GDq r1 = (X.C9314GDq) r1
            long r5 = r1.A00
            int r4 = r9.length
            r3 = 0
        L25:
            if (r3 >= r4) goto L33
            r1 = r9[r3]
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L30
            if (r3 < 0) goto L33
            goto L11
        L30:
            int r3 = r3 + 1
            goto L25
        L33:
            r8 = 0
        L34:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9tP.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C9314GDq)) {
            return false;
        }
        long j = ((C9314GDq) obj).A00;
        long[] jArr = this.A00;
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            if (j == jArr[i]) {
                return i >= 0;
            }
            i++;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof C9tP) && this.A00.equals(((C9tP) obj).A00);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(this.A00.length);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<C9314GDq> iterator() {
        return new C9tO(this.A00);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ int size() {
        return this.A00.length;
    }

    public final String toString() {
        return C8j4.A0x("ULongArray(storage=", Arrays.toString(this.A00));
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C9314GDq c9314GDq) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C9314GDq> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw C8j4.A10();
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
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C8j3.A1Z(this, tArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}
