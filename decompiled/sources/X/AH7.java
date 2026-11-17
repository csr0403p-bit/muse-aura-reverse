package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public abstract class AH7<E> extends AbstractC0890AGr<E> implements List<E>, BOA {
    public static final void A01(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(FGI.A0T("index: ", ", size: ", i, i2));
        }
    }

    public static final void A02(int i, int i2) {
        if (i < 0 || i > i2) {
            throw C8j3.A0y("index: ", ", size: ", i, i2);
        }
    }

    public static final void A03(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(FGI.A0Z("startIndex: ", ", endIndex: ", ", size: ", i, i2, i3));
        }
        if (i > i2) {
            throw new IllegalArgumentException(FGI.A0T("startIndex: ", " > endIndex: ", i, i2));
        }
    }

    public static final void A04(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(FGI.A0Z("fromIndex: ", ", toIndex: ", ", size: ", i, i2, i3));
        }
        if (i > i2) {
            throw C8j3.A0v("fromIndex: ", " > toIndex: ", i, i2);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        C7384Etj.A0Y(collection, 1);
        if (size() != collection.size()) {
            return false;
        }
        Iterator<E> it = collection.iterator();
        Iterator<E> it2 = iterator();
        while (it2.hasNext()) {
            if (!C7384Etj.areEqual(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public E get(int i) {
        List list;
        int i2;
        if (this instanceof AH8) {
            AH8 ah8 = (AH8) this;
            AHB.A00(i, ah8.A00);
            list = ah8.A02;
            i2 = ah8.A01;
        } else {
            if (this instanceof C0888AGp) {
                C0888AGp c0888AGp = (C0888AGp) this;
                A01(i, c0888AGp.size());
                return (E) c0888AGp.A03[(c0888AGp.A01 + i) % c0888AGp.A02];
            }
            if (this instanceof C0893AGu) {
                C0893AGu c0893AGu = (C0893AGu) this;
                return (E) c0893AGu.A00.get(BHL.A19(c0893AGu, i));
            }
            if (this instanceof C0880AGh) {
                C0880AGh c0880AGh = (C0880AGh) this;
                A01(i, c0880AGh.A00);
                list = c0880AGh.A02;
                i2 = c0880AGh.A01;
            } else {
                if (this instanceof AH4) {
                    AH4 ah4 = (AH4) this;
                    A01(i, ah4.A00);
                    return ah4.A02.get(ah4.A01 + i);
                }
                AH9 ah9 = (AH9) this;
                AHA.A00(i, ah9.A00);
                list = ah9.A02;
                i2 = ah9.A01;
            }
        }
        return (E) list.get(i2 + i);
    }

    @Override // X.AbstractC0890AGr, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new AH5(this);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return this instanceof C0893AGu ? new AGv((C0893AGu) this, i) : new AH6(this, i);
    }

    @Override // java.util.List
    public final List<E> subList(int i, int i2) {
        if (this instanceof AHF) {
            return new AH8((AHF) this, i, i2);
        }
        if (this instanceof AH8) {
            return ((AH8) this).AgX(i, i2);
        }
        if (this instanceof AH4) {
            AH4 ah4 = (AH4) this;
            A04(i, i2, ah4.A00);
            AH7<E> ah7 = ah4.A02;
            int i3 = ah4.A01;
            return new AH4(ah7, i + i3, i3 + i2);
        }
        if (this instanceof AHE) {
            return new AH9((AHE) this, i, i2);
        }
        if (!(this instanceof AH9)) {
            return new AH4(this, i, i2);
        }
        AH9 ah9 = (AH9) this;
        AH9.A05(i, i2, ah9.A00);
        AHC<E> ahc = ah9.A02;
        int i4 = ah9.A01;
        return new AH9(ahc, i + i4, i4 + i2);
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iA01 = 1;
        while (it.hasNext()) {
            iA01 = (iA01 * 31) + C60R.A01(it.next());
        }
        return iA01;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (C7384Etj.areEqual(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C7384Etj.areEqual(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        if (this instanceof C0893AGu) {
            return listIterator(0);
        }
        return new AH6(this, 0);
    }
}
