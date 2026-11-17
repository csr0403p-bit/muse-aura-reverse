package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.Cf8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3820Cf8 extends AbstractC3821Cf9 implements List, RandomAccess {
    public static final F0I A00 = new C3823CfB(C3796Cef.A02, 0);

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        do {
                            boolean zHasNext = it.hasNext();
                            boolean zHasNext2 = it2.hasNext();
                            if (zHasNext) {
                                if (zHasNext2) {
                                }
                            } else if (!zHasNext2) {
                                return true;
                            }
                        } while (AbstractC10554Hsh.A00(it.next(), it2.next()));
                        return false;
                    }
                    for (int i = 0; i < size; i++) {
                        if (AbstractC10554Hsh.A00(get(i), list.get(i))) {
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
    public final AbstractC3820Cf8 subList(int i, int i2) {
        if (!(this instanceof C3824CfC)) {
            AbstractC3791Cea.A02(i, i2, size());
            int i3 = i2 - i;
            return i3 == size() ? this : i3 == 0 ? C3796Cef.A02 : new C3824CfC(this, i, i3);
        }
        C3824CfC c3824CfC = (C3824CfC) this;
        AbstractC3791Cea.A02(i, i2, c3824CfC.A01);
        AbstractC3820Cf8 abstractC3820Cf8 = c3824CfC.zzc;
        int i4 = c3824CfC.A00;
        return abstractC3820Cf8.subList(i + i4, i2 + i4);
    }

    @Override // java.util.List
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final F0I listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            throw BV6.A0g(AbstractC3791Cea.A00(i, size, "index"));
        }
        return isEmpty() ? A00 : new C3823CfB(this, i);
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

    @Override // X.AbstractC3821Cf9, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
