package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class GDH extends GDG implements RandomAccess {
    public static final GDH A02;
    public static final Object[] A03;
    public int A00;
    public Object[] A01;

    static {
        Object[] objArr = new Object[0];
        A03 = objArr;
        GDH gdh = new GDH(false);
        gdh.A01 = objArr;
        gdh.A00 = 0;
        A02 = gdh;
    }

    @Override // X.GDG, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int i = this.A00;
            if (i != list.size()) {
                return false;
            }
            if (obj instanceof GDH) {
                GDH gdh = (GDH) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    if (!this.A01[i2].equals(gdh.A01[i2])) {
                        return false;
                    }
                }
            } else {
                for (int i3 = 0; i3 < i; i3++) {
                    if (!BV7.A1Y(this.A01[i3], list, i3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // X.InterfaceC9313GDp
    public final InterfaceC9313GDp A2h(int i) {
        if (i < this.A00) {
            throw BV4.A0P();
        }
        Object[] objArrCopyOf = i == 0 ? A03 : Arrays.copyOf(this.A01, i);
        int i2 = this.A00;
        GDH gdh = new GDH(true);
        gdh.A01 = objArrCopyOf;
        gdh.A00 = i2;
        return gdh;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i < 0 || i >= this.A00) {
            throw C8j3.A0y("Index:", ", Size:", i, this.A00);
        }
        return this.A01[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.A00;
        int iA0G = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iA0G = AnonymousClass005.A0G(this.A01[i2], iA0G * 31);
        }
        return iA0G;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        A02();
        int i = this.A00;
        Object[] objArrCopyOf = this.A01;
        int length = objArrCopyOf.length;
        if (i == length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, GDG.A00(length));
            this.A01 = objArrCopyOf;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // X.GDG, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        A02();
        if (i < 0 || i >= (i2 = this.A00)) {
            throw C8j3.A0y("Index:", ", Size:", i, this.A00);
        }
        Object[] objArr = this.A01;
        Object obj = objArr[i];
        AbstractC7610F5x.A1J(objArr, i2, i);
        this.A00--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        A02();
        if (i < 0 || i >= this.A00) {
            throw C8j3.A0y("Index:", ", Size:", i, this.A00);
        }
        Object[] objArr = this.A01;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        A02();
        if (i >= 0 && i <= (i2 = this.A00)) {
            Object[] objArr = this.A01;
            int length = objArr.length;
            if (i2 < length) {
                AbstractC7608F5v.A1K(objArr, i, i2);
            } else {
                Object[] objArr2 = new Object[GDG.A00(length)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.A01, i, objArr2, i + 1, this.A00 - i);
                this.A01 = objArr2;
            }
            this.A01[i] = obj;
            this.A00++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw C8j3.A0y("Index:", ", Size:", i, this.A00);
    }
}
