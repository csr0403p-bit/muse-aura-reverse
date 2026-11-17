package X;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public abstract class GDF<E> extends AbstractList<E> implements GDP<E> {
    public boolean A00;

    public GDF() {
        this(true);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o) {
        if (o != this) {
            if (!(o instanceof List)) {
                return false;
            }
            if (!(o instanceof RandomAccess)) {
                return super.equals(o);
            }
            List list = (List) o;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (!BV7.A1Y(get(i), list, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void A03() {
        if (!this.A00) {
            throw C8j3.A17();
        }
    }

    public static int A00(GDS gds, int i) {
        GDS.A02(gds, i);
        return gds.A01[i];
    }

    public static long A01(GDT gdt, int i) {
        GDT.A02(gdt, i);
        return gdt.A01[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> c) {
        A03();
        return super.addAll(c);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        A03();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iA0G = 1;
        for (int i = 0; i < size; i++) {
            iA0G = AnonymousClass005.A0G(get(i), iA0G * 31);
        }
        return iA0G;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object o) {
        A03();
        return AbstractC7611F5y.A1B(o, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> c) {
        A03();
        return super.removeAll(c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> c) {
        A03();
        return super.retainAll(c);
    }

    public GDF(boolean isMutable) {
        this.A00 = isMutable;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int index, Collection<? extends E> c) {
        A03();
        return super.addAll(index, c);
    }
}
