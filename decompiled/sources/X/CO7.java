package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class CO7 extends CO8 {
    public static final CO7 A02;
    public static final Object[] A03;
    public final transient Object[] A00;
    public final transient Object[] A01;

    @Override // X.COD, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.A01;
        if (objArr.length == 0) {
            return false;
        }
        obj.hashCode();
        do {
            obj2 = objArr[0];
            if (obj2 == null) {
                return false;
            }
        } while (!obj2.equals(obj));
        return true;
    }

    @Override // X.CO8, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    static {
        Object[] objArrA1W = BV4.A1W();
        A03 = objArrA1W;
        A02 = new CO7(objArrA1W, objArrA1W);
    }

    public CO7(Object[] objArr, Object[] objArr2) {
        this.A00 = objArr;
        this.A01 = objArr2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return A07().listIterator(0);
    }
}
