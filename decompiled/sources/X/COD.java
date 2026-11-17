package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes5.dex */
public abstract class COD extends AbstractCollection implements Serializable {
    public static final Object[] A00 = BV4.A1W();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    private final int A02() {
        if (this instanceof COC) {
            return ((COC) this).A01.A02();
        }
        if (this instanceof CO7) {
            return 0;
        }
        if (this instanceof COM) {
            return ((COM) this).A00;
        }
        if (!(this instanceof CON)) {
            throw C8j3.A17();
        }
        CON con = (CON) this;
        return con.zzc.A03() + con.A00 + con.A01;
    }

    private final int A03() {
        if (this instanceof COC) {
            return ((COC) this).A01.A03();
        }
        if ((this instanceof CO7) || (this instanceof COM)) {
            return 0;
        }
        if (!(this instanceof CON)) {
            throw C8j3.A17();
        }
        CON con = (CON) this;
        return con.zzc.A03() + con.A00;
    }

    private final int A04(Object[] objArr) {
        if (this instanceof COK) {
            objArr[0] = ((COK) this).A00;
            return 1;
        }
        if (this instanceof COC) {
            return ((COC) this).A01.A04(objArr);
        }
        if (this instanceof CO7) {
            System.arraycopy(((CO7) this).A00, 0, objArr, 0, 0);
            return 0;
        }
        if (!(this instanceof COO)) {
            CO4 co4A05 = A05();
            int i = 0;
            while (co4A05.hasNext()) {
                objArr[i] = co4A05.next();
                i++;
            }
            return i;
        }
        COO coo = (COO) this;
        if (coo instanceof COM) {
            COM com2 = (COM) coo;
            Object[] objArr2 = com2.A01;
            int i2 = com2.A00;
            System.arraycopy(objArr2, 0, objArr, 0, i2);
            return i2;
        }
        int size = coo.size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = coo.get(i3);
        }
        return size;
    }

    private final Object[] A06() {
        if (this instanceof COC) {
            return ((COC) this).A01.A06();
        }
        if (this instanceof CO7) {
            return ((CO7) this).A00;
        }
        if (this instanceof COM) {
            return ((COM) this).A01;
        }
        if (this instanceof CON) {
            return ((CON) this).zzc.A06();
        }
        return null;
    }

    public final CO4 A05() {
        if (!(this instanceof COK)) {
            return (this instanceof COC ? ((COC) this).A01 : ((this instanceof CO7) || (this instanceof CO6)) ? ((CO8) this).A07() : (COO) this).listIterator(0);
        }
        Object obj = ((COK) this).A00;
        COL col = new COL();
        col.A00 = obj;
        return col;
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
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrA06 = A06();
            if (objArrA06 != null) {
                return Arrays.copyOfRange(objArrA06, A03(), A02(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else {
            BV7.A1P(objArr, length, size);
        }
        A04(objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(A00);
    }
}
