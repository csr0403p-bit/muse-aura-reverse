package X;

import androidx.collection.OrderedSetWrapper$iterator$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public class AIN<E> implements Set<E>, BOA {
    public final AIT<E> A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.A00.A04(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(E e) {
        if (this instanceof AIQ) {
            return ((AIQ) this).A00.A07(e);
        }
        throw C8j4.A10();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        if (!(this instanceof AIQ)) {
            throw C8j4.A10();
        }
        C7384Etj.A0Y(collection, 0);
        AIR<E> air = ((AIQ) this).A00;
        int i = air.A01;
        for (E e : collection) {
            int iA01 = AIR.A01(air, e);
            int iA03 = AIT.A03(air, e, iA01);
            air.A02 = iA01;
            if (air.A03 == iA03) {
                air.A03 = iA01;
            }
        }
        return i != air.A01;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (!(this instanceof AIQ)) {
            throw C8j4.A10();
        }
        ((AIQ) this).A00.A05();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.A04(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((AIN) obj).A00);
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
        return this instanceof AIQ ? new BTG((AIQ) this) : BL3.A0C(new OrderedSetWrapper$iterator$1(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (this instanceof AIQ) {
            return ((AIQ) this).A00.A08(obj);
        }
        throw C8j4.A10();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if ((X.C8j4.A0M(r13) & (-9187201950435737472L)) != 0) goto L31;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection<?> r17) {
        /*
            r16 = this;
            r2 = r16
            boolean r0 = r2 instanceof X.AIQ
            if (r0 == 0) goto L84
            X.AIQ r2 = (X.AIQ) r2
            r0 = 0
            r1 = r17
            X.C7384Etj.A0Y(r1, r0)
            X.AIR<E> r10 = r2.A00
            r17 = 0
            int r9 = r10.A01
            java.util.Iterator r16 = r1.iterator()
        L18:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r8 = r16.next()
            r15 = 0
            int r0 = X.C60R.A01(r8)
            int r0 = X.C8j3.A0D(r0)
            r7 = r0 & 127(0x7f, float:1.78E-43)
            int r6 = r10.A00
            int r5 = r0 >>> 7
        L31:
            r5 = r5 & r6
            long[] r0 = r10.A04
            long r13 = X.C8j5.A0H(r0, r5)
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r13
            long r11 = r2 - r0
            r0 = -1
            long r2 = r2 ^ r0
            long r2 = r2 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L4b:
            long r2 = r2 & r11
            r11 = 0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L6b
            int r1 = X.C8j4.A08(r5, r6, r2)
            java.lang.Object[] r0 = r10.A06
            r0 = r0[r1]
            boolean r0 = X.C7384Etj.areEqual(r0, r8)
            if (r0 == 0) goto L66
            if (r1 < 0) goto L18
            r10.A06(r1)
            goto L18
        L66:
            r0 = 1
            long r11 = r2 - r0
            goto L4b
        L6b:
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = X.C8j4.A0M(r13)
            long r1 = r1 & r3
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L18
            int r15 = r15 + 8
            int r5 = r5 + r15
            goto L31
        L7d:
            int r0 = r10.A01
            if (r9 == r0) goto L83
            r17 = 1
        L83:
            return r17
        L84:
            java.lang.UnsupportedOperationException r0 = X.C8j4.A10()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIN.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        if (!(this instanceof AIQ)) {
            throw C8j4.A10();
        }
        C7384Etj.A0Y(collection, 0);
        return ((AIQ) this).A00.A09(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.A01;
    }

    public final String toString() {
        return this.A00.toString();
    }

    public AIN(AIT<E> ait) {
        this.A00 = ait;
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
