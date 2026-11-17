package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.CeK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3777CeK extends COV implements List, RandomAccess {
    public static final F0L A00 = new C3779CeM(C3776CeJ.A02, 0);

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        for (int i = 0; i < size; i++) {
                            Object obj2 = get(i);
                            Object obj3 = list.get(i);
                            if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                            }
                        }
                    } else {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            boolean zHasNext2 = it2.hasNext();
                            if (zHasNext) {
                                if (!zHasNext2 || ((next = it.next()) != (next2 = it2.next()) && (next == null || !next.equals(next2)))) {
                                    break;
                                }
                            } else if (!zHasNext2) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (BV7.A1Y(obj, this, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj != null) {
            int size = size();
            do {
                size--;
                if (size >= 0) {
                }
            } while (!BV7.A1Y(obj, this, size));
            return size;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.List
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final AbstractC3777CeK subList(int i, int i2) {
        if (!(this instanceof C3778CeL)) {
            AbstractC3788CeW.A02(i, i2, size());
            int i3 = i2 - i;
            return i3 == size() ? this : i3 == 0 ? C3776CeJ.A02 : new C3778CeL(this, i, i3);
        }
        C3778CeL c3778CeL = (C3778CeL) this;
        AbstractC3788CeW.A02(i, i2, c3778CeL.A01);
        int i4 = c3778CeL.A00;
        return c3778CeL.zzc.subList(i + i4, i2 + i4);
    }

    @Override // java.util.List
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final F0L listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            throw BV6.A0g(AbstractC3788CeW.A00(i, size, "index"));
        }
        return isEmpty() ? A00 : new C3779CeM(this, i);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw C8j3.A17();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw C8j3.A17();
    }

    @Override // X.COV, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return C8j3.A1Q(indexOf(obj));
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iA0C = 1;
        for (int i = 0; i < size; i++) {
            iA0C = BV8.A0C(this, iA0C, i);
        }
        return iA0C;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw C8j3.A17();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw C8j3.A17();
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }
}
