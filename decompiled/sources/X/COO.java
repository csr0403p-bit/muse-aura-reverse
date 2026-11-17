package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public abstract class COO extends COD implements List, RandomAccess {
    public static final COR A00 = new COQ(COM.A02, 0);

    public static COO A00(Object[] objArr) {
        if (objArr.length != 0) {
            Object[] objArr2 = (Object[]) objArr.clone();
            int length = objArr2.length;
            for (int i = 0; i < length; i++) {
                if (objArr2[i] == null) {
                    throw BV8.A0n(i);
                }
            }
            if (length != 0) {
                return new COM(length, objArr2);
            }
        }
        return COM.A02;
    }

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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final COO A07() {
        return this instanceof COP ? ((COP) this).A00 : size() <= 1 ? this : new COP(this);
    }

    @Override // java.util.List
    /* renamed from: A08, reason: merged with bridge method [inline-methods] */
    public final COO subList(int i, int i2) {
        if (this instanceof CON) {
            CON con = (CON) this;
            CeX.A02(i, i2, con.A01);
            int i3 = con.A00;
            return con.zzc.subList(i + i3, i2 + i3);
        }
        if (this instanceof COP) {
            COO coo = ((COP) this).A00;
            CeX.A02(i, i2, coo.size());
            return coo.subList(coo.size() - i2, coo.size() - i).A07();
        }
        CeX.A02(i, i2, size());
        int i4 = i2 - i;
        return i4 == size() ? this : i4 == 0 ? COM.A02 : new CON(this, i, i4);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (this instanceof COP) {
            COO coo = ((COP) this).A00;
            int iLastIndexOf = coo.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return C8j3.A0K(coo) - iLastIndexOf;
            }
            return -1;
        }
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

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (this instanceof COP) {
            COO coo = ((COP) this).A00;
            int iIndexOf = coo.indexOf(obj);
            if (iIndexOf >= 0) {
                return C8j3.A0K(coo) - iIndexOf;
            }
            return -1;
        }
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

    @Override // java.util.List
    /* renamed from: A09, reason: merged with bridge method [inline-methods] */
    public final COR listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            throw BV6.A0g(CeX.A00(i, size, "index"));
        }
        return isEmpty() ? A00 : new COQ(this, i);
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

    @Override // X.COD, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
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
