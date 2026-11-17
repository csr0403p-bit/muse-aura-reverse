package X;

import java.util.ListIterator;

/* loaded from: classes4.dex */
public abstract class AHZ<E> implements ListIterator<E>, BOA {
    public int A00;
    public int A01;

    @Override // java.util.ListIterator
    public final void add(E e) {
        if (!(this instanceof AHW)) {
            throw C8j4.A10();
        }
        AHW ahw = (AHW) this;
        AHW.A00(ahw);
        AHV<T> ahv = ahw.A03;
        ahv.add(((AHZ) ahw).A00, e);
        ((AHZ) ahw).A00++;
        ((AHZ) ahw).A01 = ahv.size();
        ahw.A00 = ahv.A0T();
        ahw.A01 = -1;
        AHW.A01(ahw);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A00, this.A01);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return AnonymousClass002.A1N(this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        AHZ ahz;
        Object[] objArr;
        int i;
        int i2;
        AHX ahx;
        AHX ahx2;
        if (this instanceof AHY) {
            AHY ahy = (AHY) this;
            if (!ahy.hasNext()) {
                throw C8j3.A1D();
            }
            int i3 = ((AHZ) ahy).A00 & 31;
            Object obj = ahy.A02[ahy.A00 - 1];
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
            E e = (E) ((Object[]) obj)[i3];
            int i4 = ((AHZ) ahy).A00 + 1;
            ((AHZ) ahy).A00 = i4;
            if (i4 == ((AHZ) ahy).A01) {
                ahy.A01 = true;
            } else {
                int i5 = 0;
                while (((i4 >> i5) & 31) == 0) {
                    i5 += 5;
                }
                if (i5 > 0) {
                    AHY.A00(ahy, i4, ((ahy.A00 - 1) - (i5 / 5)) + 1);
                    return e;
                }
            }
            return e;
        }
        if (this instanceof C0899AHb) {
            C0899AHb c0899AHb = (C0899AHb) this;
            if (!c0899AHb.hasNext()) {
                throw C8j3.A1D();
            }
            ((AHZ) c0899AHb).A00++;
            return c0899AHb.A00;
        }
        if (this instanceof AHW) {
            AHW ahw = (AHW) this;
            AHW.A00(ahw);
            if (!ahw.hasNext()) {
                throw C8j3.A1D();
            }
            i = ((AHZ) ahw).A00;
            ahw.A01 = i;
            ahz = ahw.A02;
            if (ahz == null) {
                objArr = ahw.A03.A04;
                ((AHZ) ahw).A00 = i + 1;
            } else {
                if (ahz.hasNext()) {
                    i2 = i + 1;
                    ahx2 = ahw;
                    ((AHZ) ahx2).A00 = i2;
                    return (E) ahz.next();
                }
                objArr = ahw.A03.A04;
                ahx = ahw;
                ((AHZ) ahx).A00 = i + 1;
                i -= ahz.A01;
            }
        } else {
            AHX ahx3 = (AHX) this;
            if (!ahx3.hasNext()) {
                throw C8j3.A1D();
            }
            ahz = ahx3.A00;
            if (ahz.hasNext()) {
                i2 = ((AHZ) ahx3).A00 + 1;
                ahx2 = ahx3;
                ((AHZ) ahx2).A00 = i2;
                return (E) ahz.next();
            }
            objArr = ahx3.A01;
            i = ((AHZ) ahx3).A00;
            ahx = ahx3;
            ((AHZ) ahx).A00 = i + 1;
            i -= ahz.A01;
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
        if (!(this instanceof AHW)) {
            throw C8j4.A10();
        }
        AHW ahw = (AHW) this;
        AHW.A00(ahw);
        int i = ahw.A01;
        if (i == -1) {
            throw new IllegalStateException();
        }
        AHV<T> ahv = ahw.A03;
        ahv.remove(i);
        int i2 = ahw.A01;
        if (i2 < ((AHZ) ahw).A00) {
            ((AHZ) ahw).A00 = i2;
        }
        ((AHZ) ahw).A01 = ahv.size();
        ahw.A00 = ahv.A0T();
        ahw.A01 = -1;
        AHW.A01(ahw);
    }

    @Override // java.util.ListIterator
    public final void set(E e) {
        if (!(this instanceof AHW)) {
            throw C8j4.A10();
        }
        AHW ahw = (AHW) this;
        AHW.A00(ahw);
        int i = ahw.A01;
        if (i == -1) {
            throw new IllegalStateException();
        }
        AHV<T> ahv = ahw.A03;
        ahv.set(i, e);
        ahw.A00 = ahv.A0T();
        AHW.A01(ahw);
    }
}
