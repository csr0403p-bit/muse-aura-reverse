package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.Cep, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3806Cep extends AbstractCollection implements Serializable {
    public static final Object[] A00 = BV4.A1W();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    private final int A00() {
        if (this instanceof C3794Ced) {
            return 0;
        }
        if (!(this instanceof C3809Ces)) {
            throw C8j3.A17();
        }
        C3809Ces c3809Ces = (C3809Ces) this;
        return c3809Ces.zzc.A00() + c3809Ces.A00;
    }

    private final int A01(Object[] objArr) {
        AbstractC3804Cen c3810Cet;
        if (this instanceof C3803Cem) {
            c3810Cet = ((C3803Cem) this).A00;
        } else {
            if (!(this instanceof C3807Ceq)) {
                AbstractC3804Cen abstractC3804Cen = (AbstractC3804Cen) this;
                if (abstractC3804Cen instanceof C3794Ced) {
                    C3794Ced c3794Ced = (C3794Ced) abstractC3804Cen;
                    Object[] objArr2 = c3794Ced.A01;
                    int i = c3794Ced.A00;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    return i;
                }
                int size = abstractC3804Cen.size();
                for (int i2 = 0; i2 < size; i2++) {
                    objArr[i2] = abstractC3804Cen.get(i2);
                }
                return size;
            }
            C3807Ceq c3807Ceq = (C3807Ceq) this;
            c3810Cet = ((AbstractC3805Ceo) c3807Ceq).A00;
            if (c3810Cet == null) {
                c3810Cet = new C3810Cet(c3807Ceq);
                ((AbstractC3805Ceo) c3807Ceq).A00 = c3810Cet;
            }
        }
        return c3810Cet.A01(objArr);
    }

    private final Object[] A02() {
        if (this instanceof C3794Ced) {
            return ((C3794Ced) this).A01;
        }
        if (this instanceof C3809Ces) {
            return ((C3809Ces) this).zzc.A02();
        }
        return null;
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
                if (this instanceof C3794Ced) {
                    iA00 = ((C3794Ced) this).A00;
                } else {
                    if (!(this instanceof C3809Ces)) {
                        throw C8j3.A17();
                    }
                    C3809Ces c3809Ces = (C3809Ces) this;
                    iA00 = c3809Ces.zzc.A00() + c3809Ces.A00 + c3809Ces.A01;
                }
                return Arrays.copyOfRange(objArrA02, iA002, iA00, objArr.getClass());
            }
            objArr = BV8.A1a(objArr, size);
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
