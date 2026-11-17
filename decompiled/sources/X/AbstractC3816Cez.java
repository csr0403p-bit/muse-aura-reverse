package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.Cez, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3816Cez extends AbstractCollection implements Serializable {
    public static final Object[] A00 = BV4.A1W();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    private final int A00() {
        if (this instanceof C3795Cee) {
            return 0;
        }
        if (!(this instanceof Cf2)) {
            throw C8j3.A17();
        }
        Cf2 cf2 = (Cf2) this;
        return cf2.zzc.A00() + cf2.A00;
    }

    private final int A01(Object[] objArr) {
        AbstractC3815Cey c3813Cew;
        if (this instanceof Cf3) {
            c3813Cew = ((Cf3) this).A00;
        } else {
            if (!(this instanceof C3814Cex)) {
                AbstractC3815Cey abstractC3815Cey = (AbstractC3815Cey) this;
                if (abstractC3815Cey instanceof C3795Cee) {
                    C3795Cee c3795Cee = (C3795Cee) abstractC3815Cey;
                    Object[] objArr2 = c3795Cee.A01;
                    int i = c3795Cee.A00;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    return i;
                }
                int size = abstractC3815Cey.size();
                for (int i2 = 0; i2 < size; i2++) {
                    objArr[i2] = abstractC3815Cey.get(i2);
                }
                return size;
            }
            C3814Cex c3814Cex = (C3814Cex) this;
            c3813Cew = ((Cf0) c3814Cex).A00;
            if (c3813Cew == null) {
                c3813Cew = new C3813Cew(c3814Cex);
                ((Cf0) c3814Cex).A00 = c3813Cew;
            }
        }
        return c3813Cew.A01(objArr);
    }

    private final Object[] A02() {
        if (this instanceof C3795Cee) {
            return ((C3795Cee) this).A01;
        }
        if (this instanceof Cf2) {
            return ((Cf2) this).zzc.A02();
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
                if (this instanceof C3795Cee) {
                    iA00 = ((C3795Cee) this).A00;
                } else {
                    if (!(this instanceof Cf2)) {
                        throw C8j3.A17();
                    }
                    Cf2 cf2 = (Cf2) this;
                    iA00 = cf2.zzc.A00() + cf2.A00 + cf2.A01;
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
