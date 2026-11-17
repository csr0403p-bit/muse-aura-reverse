package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.Cf9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3821Cf9 extends AbstractCollection implements Serializable {
    public static final Object[] A00 = BV4.A1W();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    private final int A00() {
        if (this instanceof C3796Cef) {
            return 0;
        }
        if (!(this instanceof C3824CfC)) {
            throw C8j3.A17();
        }
        C3824CfC c3824CfC = (C3824CfC) this;
        return c3824CfC.zzc.A00() + c3824CfC.A00;
    }

    private final int A01(Object[] objArr) {
        AbstractC3820Cf8 c3818Cf6;
        if (this instanceof C3825CfD) {
            c3818Cf6 = ((C3825CfD) this).A00;
        } else {
            if (!(this instanceof C3819Cf7)) {
                AbstractC3820Cf8 abstractC3820Cf8 = (AbstractC3820Cf8) this;
                if (abstractC3820Cf8 instanceof C3796Cef) {
                    C3796Cef c3796Cef = (C3796Cef) abstractC3820Cf8;
                    Object[] objArr2 = c3796Cef.A01;
                    int i = c3796Cef.A00;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    return i;
                }
                int size = abstractC3820Cf8.size();
                for (int i2 = 0; i2 < size; i2++) {
                    objArr[i2] = abstractC3820Cf8.get(i2);
                }
                return size;
            }
            C3819Cf7 c3819Cf7 = (C3819Cf7) this;
            c3818Cf6 = ((AbstractC3822CfA) c3819Cf7).A00;
            if (c3818Cf6 == null) {
                c3818Cf6 = new C3818Cf6(c3819Cf7);
                ((AbstractC3822CfA) c3819Cf7).A00 = c3818Cf6;
            }
        }
        return c3818Cf6.A01(objArr);
    }

    private final Object[] A02() {
        if (this instanceof C3796Cef) {
            return ((C3796Cef) this).A01;
        }
        if (this instanceof C3824CfC) {
            return ((C3824CfC) this).zzc.A02();
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
                if (this instanceof C3796Cef) {
                    iA00 = ((C3796Cef) this).A00;
                } else {
                    if (!(this instanceof C3824CfC)) {
                        throw C8j3.A17();
                    }
                    C3824CfC c3824CfC = (C3824CfC) this;
                    iA00 = c3824CfC.zzc.A00() + c3824CfC.A00 + c3824CfC.A01;
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
