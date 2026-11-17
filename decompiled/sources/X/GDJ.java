package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class GDJ<E> extends GDF<E> implements RandomAccess {
    public static final GDJ<Object> A02;
    public static final Object[] A03;
    public int A00;
    public E[] A01;

    static {
        E[] eArr = (E[]) new Object[0];
        A03 = eArr;
        GDJ<Object> gdj = new GDJ<>(false);
        gdj.A01 = eArr;
        gdj.A00 = 0;
        A02 = gdj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GDJ() {
        super(true);
        E[] eArr = (E[]) A03;
        this.A01 = eArr;
        this.A00 = 0;
    }

    private void A02(int index) {
        if (index < 0 || index >= this.A00) {
            throw C8j3.A0y("Index:", ", Size:", index, this.A00);
        }
    }

    @Override // X.GDP
    public final /* bridge */ /* synthetic */ GDP AR1(int i) {
        if (i < this.A00) {
            throw BV4.A0P();
        }
        E[] eArr = i == 0 ? (E[]) A03 : (E[]) Arrays.copyOf(this.A01, i);
        int i2 = this.A00;
        GDJ gdj = new GDJ(true);
        gdj.A01 = eArr;
        gdj.A00 = i2;
        return gdj;
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
        int length = eArr.length;
        if (i == length) {
            eArr = (E[]) Arrays.copyOf(eArr, AbstractC7610F5x.A07(length));
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
            int length = eArr.length;
            if (i2 < length) {
                AbstractC7608F5v.A1K(eArr, i, i2);
            } else {
                E[] eArr2 = (E[]) new Object[AbstractC7610F5x.A07(length)];
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
