package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class GDR extends GDC implements GDN, InterfaceC10548Hrv, RandomAccess {
    public static final GDR A02;
    public int A00;
    public int[] A01;

    static {
        GDR gdr = new GDR(false);
        gdr.A01 = new int[0];
        gdr.A00 = 0;
        A02 = gdr;
    }

    @Override // X.GDC, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GDR)) {
            return super.equals(o);
        }
        GDR gdr = (GDR) o;
        int i = this.A00;
        if (i == gdr.A00) {
            int[] iArr = gdr.A01;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A01[i2] == iArr[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.GDC, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + this.A01[i2];
        }
        return i;
    }

    public GDR() {
        super(true);
        this.A01 = new int[10];
        this.A00 = 0;
    }

    public static void A02(GDR gdr, int i) {
        if (i < 0 || i >= gdr.A00) {
            throw C8j3.A0y("Index:", ", Size:", i, gdr.A00);
        }
    }

    @Override // X.GDN
    public final /* bridge */ /* synthetic */ GDN AR0(int capacity) {
        if (capacity < this.A00) {
            throw BV4.A0P();
        }
        int[] iArrCopyOf = Arrays.copyOf(this.A01, capacity);
        int i = this.A00;
        GDR gdr = new GDR(true);
        gdr.A01 = iArrCopyOf;
        gdr.A00 = i;
        return gdr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object element) {
        if (element instanceof Integer) {
            int iA0F = AnonymousClass001.A0F(element);
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.A01[i] == iA0F) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }

    public final void A04(int element) {
        A03();
        int i = this.A00;
        int[] iArr = this.A01;
        if (i == iArr.length) {
            int[] iArr2 = new int[((i * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.A01 = iArr2;
            iArr = iArr2;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        iArr[i2] = element;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object element) {
        A04(AnonymousClass001.A0F(element));
        return true;
    }

    @Override // X.GDC, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        A03();
        Charset charset = AbstractC9349GFi.A04;
        collection.getClass();
        if (!(collection instanceof GDR)) {
            return super.addAll(collection);
        }
        GDR gdr = (GDR) collection;
        int i = gdr.A00;
        if (i == 0) {
            return false;
        }
        int i2 = this.A00;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArrCopyOf = this.A01;
        if (i3 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
            this.A01 = iArrCopyOf;
        }
        System.arraycopy(gdr.A01, 0, iArrCopyOf, this.A00, gdr.A00);
        this.A00 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object element) {
        return AnonymousClass002.A1P(indexOf(element), -1);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int index) {
        return Integer.valueOf(GDC.A00(this, index));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int index) {
        A03();
        A02(this, index);
        int[] iArr = this.A01;
        int i = iArr[index];
        AbstractC7610F5x.A1J(iArr, this.A00, index);
        this.A00--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int fromIndex, int toIndex) {
        A03();
        if (toIndex < fromIndex) {
            throw BV6.A0g("toIndex < fromIndex");
        }
        int[] iArr = this.A01;
        System.arraycopy(iArr, toIndex, iArr, fromIndex, this.A00 - toIndex);
        this.A00 -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int index, Object element) {
        int iA0F = AnonymousClass001.A0F(element);
        A03();
        A02(this, index);
        int[] iArr = this.A01;
        int i = iArr[index];
        iArr[index] = iA0F;
        return Integer.valueOf(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int index, Object element) {
        int i;
        int iA0F = AnonymousClass001.A0F(element);
        A03();
        if (index >= 0 && index <= (i = this.A00)) {
            int[] iArr = this.A01;
            if (i < iArr.length) {
                AbstractC7608F5v.A1K(iArr, index, i);
            } else {
                int[] iArr2 = new int[((i * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, index);
                System.arraycopy(this.A01, index, iArr2, index + 1, this.A00 - index);
                this.A01 = iArr2;
            }
            this.A01[index] = iA0F;
            this.A00++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw C8j3.A0y("Index:", ", Size:", index, this.A00);
    }
}
