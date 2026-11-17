package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes5.dex */
public abstract class COV extends AbstractCollection implements Serializable {
    public static final Object[] A00 = BV4.A1W();

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    private final int A00() {
        if (this instanceof C3776CeJ) {
            return 0;
        }
        if (!(this instanceof C3778CeL)) {
            throw C8j3.A17();
        }
        C3778CeL c3778CeL = (C3778CeL) this;
        return c3778CeL.zzc.A00() + c3778CeL.A00;
    }

    private final int A01(Object[] objArr) {
        AbstractC3777CeK c3775CeI;
        if (this instanceof C3774CeH) {
            c3775CeI = ((C3774CeH) this).A00;
        } else {
            if (!(this instanceof C3773CeG)) {
                AbstractC3777CeK abstractC3777CeK = (AbstractC3777CeK) this;
                if (abstractC3777CeK instanceof C3776CeJ) {
                    C3776CeJ c3776CeJ = (C3776CeJ) abstractC3777CeK;
                    Object[] objArr2 = c3776CeJ.A01;
                    int i = c3776CeJ.A00;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    return i;
                }
                int size = abstractC3777CeK.size();
                for (int i2 = 0; i2 < size; i2++) {
                    objArr[i2] = abstractC3777CeK.get(i2);
                }
                return size;
            }
            C3773CeG c3773CeG = (C3773CeG) this;
            c3775CeI = ((CPY) c3773CeG).A00;
            if (c3775CeI == null) {
                c3775CeI = new C3775CeI(c3773CeG);
                ((CPY) c3773CeG).A00 = c3775CeI;
            }
        }
        return c3775CeI.A01(objArr);
    }

    private final Object[] A02() {
        if (this instanceof C3776CeJ) {
            return ((C3776CeJ) this).A01;
        }
        if (this instanceof C3778CeL) {
            return ((C3778CeL) this).zzc.A02();
        }
        return null;
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
        int iA00;
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrA02 = A02();
            if (objArrA02 != null) {
                int iA002 = A00();
                if (this instanceof C3776CeJ) {
                    iA00 = ((C3776CeJ) this).A00;
                } else {
                    if (!(this instanceof C3778CeL)) {
                        throw C8j3.A17();
                    }
                    C3778CeL c3778CeL = (C3778CeL) this;
                    iA00 = c3778CeL.zzc.A00() + c3778CeL.A00 + c3778CeL.A01;
                }
                return Arrays.copyOfRange(objArrA02, iA002, iA00, objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else {
            BV7.A1P(objArr, length, size);
        }
        A01(objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(A00);
    }
}
