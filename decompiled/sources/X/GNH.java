package X;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class GNH extends GNF {
    public static final GNH A05;
    public static final Object[] A06;
    public final transient int A00;
    public final transient int A01;
    public final transient int A02;
    public final transient Object[] A03;
    public final transient Object[] A04;

    static {
        Object[] objArr = new Object[0];
        A06 = objArr;
        A05 = new GNH(objArr, objArr, 0, 0, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.A04;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iA06 = AbstractC7611F5y.A06(obj.hashCode());
        while (true) {
            int i = iA06 & this.A01;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA06 = i + 1;
        }
    }

    @Override // X.GNF, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A00;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A02;
    }

    public GNH(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        this.A03 = objArr;
        this.A00 = i;
        this.A04 = objArr2;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return A04().listIterator(0);
    }
}
