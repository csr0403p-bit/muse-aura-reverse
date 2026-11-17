package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.9oV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9oV implements Collection<C9oE>, BOA {
    public final short[] A00;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r1 < 0) goto L21;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsAll(java.util.Collection<?> r7) {
        /*
            r6 = this;
            r0 = 0
            X.C7384Etj.A0Y(r7, r0)
            short[] r6 = r6.A00
            r5 = 1
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L32
            java.util.Iterator r4 = r7.iterator()
        L11:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r1 = r4.next()
            boolean r0 = r1 instanceof X.C9oE
            if (r0 == 0) goto L31
            X.9oE r1 = (X.C9oE) r1
            short r3 = r1.A00
            int r2 = r6.length
            r1 = 0
        L25:
            if (r1 >= r2) goto L31
            short r0 = r6[r1]
            if (r3 != r0) goto L2e
            if (r1 < 0) goto L31
            goto L11
        L2e:
            int r1 = r1 + 1
            goto L25
        L31:
            r5 = 0
        L32:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9oV.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C9oE)) {
            return false;
        }
        short s = ((C9oE) obj).A00;
        short[] sArr = this.A00;
        int length = sArr.length;
        int i = 0;
        while (i < length) {
            if (s == sArr[i]) {
                return i >= 0;
            }
            i++;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof C9oV) && this.A00.equals(((C9oV) obj).A00);
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
    public final Iterator<C9oE> iterator() {
        return new C9oG(this.A00);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ int size() {
        return this.A00.length;
    }

    public final String toString() {
        return C8j4.A0x("UShortArray(storage=", Arrays.toString(this.A00));
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C9oE c9oE) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C9oE> collection) {
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
