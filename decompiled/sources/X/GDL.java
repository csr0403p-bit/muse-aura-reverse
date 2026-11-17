package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class GDL<E> extends GDD<E> implements RandomAccess {
    public static final GDL<Object> A02;
    public E[] A01 = (E[]) new Object[10];
    public int A00 = 0;

    static {
        GDL<Object> gdl = new GDL<>();
        gdl.A01 = (E[]) new Object[0];
        gdl.A00 = 0;
        A02 = gdl;
        ((GDD) gdl).A00 = false;
    }

    private void A00(int i) {
        if (i < 0 || i >= this.A00) {
            throw C8j3.A0y("Index:", ", Size:", i, this.A00);
        }
    }

    @Override // X.GDO
    public final /* bridge */ /* synthetic */ GDO AQy(int i) {
        if (i < this.A00) {
            throw BV4.A0P();
        }
        E[] eArr = (E[]) Arrays.copyOf(this.A01, i);
        int i2 = this.A00;
        GDL gdl = new GDL();
        gdl.A01 = eArr;
        gdl.A00 = i2;
        return gdl;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }

    @Override // X.GDD, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        A01();
        int i = this.A00;
        E[] eArr = this.A01;
        if (i == eArr.length) {
            eArr = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
            this.A01 = eArr;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        eArr[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        A00(i);
        return this.A01[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        A01();
        A00(i);
        E[] eArr = this.A01;
        E e = eArr[i];
        AbstractC7610F5x.A1J(eArr, this.A00, i);
        this.A00--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        A01();
        A00(i);
        E[] eArr = this.A01;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        A01();
        if (i >= 0 && i <= (i2 = this.A00)) {
            E[] eArr = this.A01;
            if (i2 < eArr.length) {
                AbstractC7608F5v.A1K(eArr, i, i2);
            } else {
                E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.A01, i, eArr2, i + 1, this.A00 - i);
                this.A01 = eArr2;
            }
            this.A01[i] = e;
            this.A00++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw C8j3.A0y("Index:", ", Size:", i, this.A00);
    }
}
