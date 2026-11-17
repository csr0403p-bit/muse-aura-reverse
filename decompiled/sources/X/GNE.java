package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public abstract class GNE extends GNG implements List, RandomAccess {
    public static final GNC A00 = new GNC(GNJ.A02, 0);

    public static GNJ A01(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] == null) {
                throw BV4.A0a(FGI.A0H("at index ", i));
            }
        }
        return length == 0 ? GNJ.A02 : new GNJ(length, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
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

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GNE A00(List list) {
        if (!(list instanceof GNG)) {
            return A01(list.toArray());
        }
        GNE gneA04 = ((GNG) list).A04();
        if (!(gneA04 instanceof GNA) && (gneA04 instanceof GNJ)) {
            return gneA04;
        }
        Object[] array = gneA04.toArray(GNG.A00);
        int length = array.length;
        return length == 0 ? GNJ.A02 : new GNJ(length, array);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.List
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final GNE subList(int i, int i2) {
        if (!(this instanceof GNI)) {
            AbstractC3790CeZ.A02(i, i2, size());
            int i3 = i2 - i;
            return i3 == size() ? this : i3 == 0 ? GNJ.A02 : new GNI(this, i, i3);
        }
        GNI gni = (GNI) this;
        AbstractC3790CeZ.A02(i, i2, gni.A01);
        GNE gne = gni.e;
        int i4 = gni.A00;
        return gne.subList(i + i4, i2 + i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            int size = size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (BV7.A1Y(obj, this, i)) {
                    if (i < 0) {
                        break;
                    }
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!C6xC.A00(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !C6xC.A00(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
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

    @Override // java.util.List
    /* renamed from: A06, reason: merged with bridge method [inline-methods] */
    public final GNC listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            throw BV6.A0g(AbstractC3790CeZ.A01(i, size, "index"));
        }
        return isEmpty() ? A00 : new GNC(this, i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw C8j3.A17();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw C8j3.A17();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iA0G = 1;
        for (int i = 0; i < size; i++) {
            iA0G = AnonymousClass005.A0G(get(i), iA0G * 31);
        }
        return iA0G;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw C8j3.A17();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw C8j3.A17();
    }
}
