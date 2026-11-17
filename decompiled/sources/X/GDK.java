package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class GDK<E> extends GDE<E> implements RandomAccess {
    public static final GDK<Object> A02;
    public int A00;
    public E[] A01;

    static {
        GDK<Object> gdk = new GDK<>(false);
        gdk.A01 = (E[]) new Object[0];
        gdk.A00 = 0;
        A02 = gdk;
    }

    public GDK() {
        super(true);
        this.A01 = (E[]) new Object[10];
        this.A00 = 0;
    }

    private void A02(int index) {
        if (index < 0 || index >= this.A00) {
            throw C8j3.A0y("Index:", ", Size:", index, this.A00);
        }
    }

    @Override // X.GDM
    public final /* bridge */ /* synthetic */ GDM AQz(int i) {
        if (i < this.A00) {
            throw BV4.A0P();
        }
        E[] eArr = (E[]) Arrays.copyOf(this.A01, i);
        int i2 = this.A00;
        GDK gdk = new GDK(true);
        gdk.A01 = eArr;
        gdk.A00 = i2;
        return gdk;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        A03();
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
    public final E get(int index) {
        A02(index);
        return this.A01[index];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int index) {
        A03();
        A02(index);
        E[] eArr = this.A01;
        E e = eArr[index];
        AbstractC7610F5x.A1J(eArr, this.A00, index);
        this.A00--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int index, E element) {
        A03();
        A02(index);
        E[] eArr = this.A01;
        E e = eArr[index];
        eArr[index] = element;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        A03();
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
