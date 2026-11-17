package X;

import java.util.ListIterator;

/* loaded from: classes4.dex */
public abstract class AHP<E> implements ListIterator<E>, BOA {
    public int A00;
    public int A01;

    @Override // java.util.ListIterator
    public final void add(E e) {
        if (!(this instanceof AHM)) {
            throw C8j4.A10();
        }
        AHM ahm = (AHM) this;
        AHM.A00(ahm);
        AHL<T> ahl = ahm.A03;
        ahl.add(((AHP) ahm).A00, e);
        ((AHP) ahm).A00++;
        ((AHP) ahm).A01 = ahl.size();
        ahm.A00 = ahl.A0T();
        ahm.A01 = -1;
        AHM.A01(ahm);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.A00 < this.A01;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return AnonymousClass002.A1N(this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        AHP ahp;
        Object[] objArr;
        int i;
        int i2;
        AHN ahn;
        AHN ahn2;
        if (this instanceof AHO) {
            AHO aho = (AHO) this;
            if (!aho.hasNext()) {
                throw C8j3.A1D();
            }
            int i3 = ((AHP) aho).A00 & 31;
            Object obj = aho.A02[aho.A00 - 1];
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
            E e = (E) ((Object[]) obj)[i3];
            int i4 = ((AHP) aho).A00 + 1;
            ((AHP) aho).A00 = i4;
            if (i4 == ((AHP) aho).A01) {
                aho.A01 = true;
            } else {
                int i5 = 0;
                while (((i4 >> i5) & 31) == 0) {
                    i5 += 5;
                }
                if (i5 > 0) {
                    AHO.A00(aho, i4, ((aho.A00 - 1) - (i5 / 5)) + 1);
                    return e;
                }
            }
            return e;
        }
        if (this instanceof AHR) {
            AHR ahr = (AHR) this;
            if (!ahr.hasNext()) {
                throw C8j3.A1D();
            }
            ((AHP) ahr).A00++;
            return ahr.A00;
        }
        if (this instanceof AHM) {
            AHM ahm = (AHM) this;
            AHM.A00(ahm);
            if (!ahm.hasNext()) {
                throw C8j3.A1D();
            }
            i = ((AHP) ahm).A00;
            ahm.A01 = i;
            ahp = ahm.A02;
            if (ahp == null) {
                objArr = ahm.A03.A04;
                ((AHP) ahm).A00 = i + 1;
            } else {
                if (ahp.hasNext()) {
                    i2 = i + 1;
                    ahn2 = ahm;
                    ((AHP) ahn2).A00 = i2;
                    return (E) ahp.next();
                }
                objArr = ahm.A03.A04;
                ahn = ahm;
                ((AHP) ahn).A00 = i + 1;
                i -= ahp.A01;
            }
        } else {
            AHN ahn3 = (AHN) this;
            if (!ahn3.hasNext()) {
                throw C8j3.A1D();
            }
            ahp = ahn3.A00;
            if (ahp.hasNext()) {
                i2 = ((AHP) ahn3).A00 + 1;
                ahn2 = ahn3;
                ((AHP) ahn2).A00 = i2;
                return (E) ahp.next();
            }
            objArr = ahn3.A01;
            i = ((AHP) ahn3).A00;
            ahn = ahn3;
            ((AHP) ahn).A00 = i + 1;
            i -= ahp.A01;
        }
        return (E) objArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A00 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        if (!(this instanceof AHM)) {
            throw C8j4.A10();
        }
        AHM ahm = (AHM) this;
        AHM.A00(ahm);
        int i = ahm.A01;
        if (i == -1) {
            throw new IllegalStateException();
        }
        AHL<T> ahl = ahm.A03;
        ahl.remove(i);
        int i2 = ahm.A01;
        if (i2 < ((AHP) ahm).A00) {
            ((AHP) ahm).A00 = i2;
        }
        ((AHP) ahm).A01 = ahl.size();
        ahm.A00 = ahl.A0T();
        ahm.A01 = -1;
        AHM.A01(ahm);
    }

    @Override // java.util.ListIterator
    public final void set(E e) {
        if (!(this instanceof AHM)) {
            throw C8j4.A10();
        }
        AHM ahm = (AHM) this;
        AHM.A00(ahm);
        int i = ahm.A01;
        if (i == -1) {
            throw new IllegalStateException();
        }
        AHL<T> ahl = ahm.A03;
        ahl.set(i, e);
        ahm.A00 = ahl.A0T();
        AHM.A01(ahm);
    }
}
