package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes5.dex */
public abstract class COU extends AbstractCollection implements Serializable {
    public static final Object[] A00 = BV4.A1W();

    private final int A02() {
        if (this instanceof C3800Cej) {
            return 0;
        }
        C3797Ceg c3797Ceg = (C3797Ceg) this;
        return c3797Ceg.zzc.A02() + c3797Ceg.A00;
    }

    private final Object[] A03() {
        return this instanceof C3800Cej ? ((C3800Cej) this).A01 : ((C3797Ceg) this).zzc.A03();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int iA02;
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrA03 = A03();
            if (objArrA03 != null) {
                int iA022 = A02();
                if (this instanceof C3800Cej) {
                    iA02 = ((C3800Cej) this).A00;
                } else {
                    C3797Ceg c3797Ceg = (C3797Ceg) this;
                    iA02 = c3797Ceg.zzc.A02() + c3797Ceg.A00 + c3797Ceg.A01;
                }
                return Arrays.copyOfRange(objArrA03, iA022, iA02, objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else {
            BV7.A1P(objArr, length, size);
        }
        AbstractC3798Ceh abstractC3798Ceh = (AbstractC3798Ceh) this;
        if (abstractC3798Ceh instanceof C3800Cej) {
            C3800Cej c3800Cej = (C3800Cej) abstractC3798Ceh;
            System.arraycopy(c3800Cej.A01, 0, objArr, 0, c3800Cej.A00);
        } else {
            int size2 = abstractC3798Ceh.size();
            for (int i = 0; i < size2; i++) {
                objArr[i] = abstractC3798Ceh.get(i);
            }
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(A00);
    }
}
