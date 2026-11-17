package X;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public abstract class GDG extends AbstractList implements InterfaceC9313GDp {
    public boolean A00;

    public static int A00(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
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

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int i);

    public final void A02() {
        if (!this.A00) {
            throw C8j3.A17();
        }
    }

    public GDG(boolean z) {
        this.A00 = z;
    }

    public static int A01(GDW gdw, int i) {
        gdw.A04(i);
        return gdw.A01[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        A02();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        A02();
        super.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        A02();
        return AbstractC7611F5y.A1B(obj, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        A02();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        A02();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        A02();
        return super.addAll(i, collection);
    }
}
