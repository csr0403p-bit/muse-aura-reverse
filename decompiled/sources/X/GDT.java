package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class GDT extends GDF implements GDP, RandomAccess {
    public static final long[] A02;
    public static final GDT A03;
    public int A00;
    public long[] A01;

    static {
        long[] jArr = new long[0];
        A02 = jArr;
        GDT gdt = new GDT(false);
        gdt.A01 = jArr;
        gdt.A00 = 0;
        A03 = gdt;
    }

    @Override // X.GDF, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GDT)) {
            return super.equals(o);
        }
        GDT gdt = (GDT) o;
        int i = this.A00;
        if (i == gdt.A00) {
            long[] jArr = gdt.A01;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A01[i2] == jArr[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.GDF, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA05 = 1;
        for (int i = 0; i < this.A00; i++) {
            int i2 = iA05 * 31;
            long j = this.A01[i];
            Charset charset = AbstractC9352GFl.A04;
            iA05 = AnonymousClass006.A05(j, i2);
        }
        return iA05;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GDT() {
        super(true);
        long[] jArr = A02;
        this.A01 = jArr;
        this.A00 = 0;
    }

    public static void A02(GDT gdt, int i) {
        if (i < 0 || i >= gdt.A00) {
            throw C8j3.A0y("Index:", ", Size:", i, gdt.A00);
        }
    }

    @Override // X.GDP
    public final /* bridge */ /* synthetic */ GDP AR1(int capacity) {
        if (capacity < this.A00) {
            throw BV4.A0P();
        }
        long[] jArrCopyOf = capacity == 0 ? A02 : Arrays.copyOf(this.A01, capacity);
        int i = this.A00;
        GDT gdt = new GDT(true);
        gdt.A01 = jArrCopyOf;
        gdt.A00 = i;
        return gdt;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object element) {
        if (element instanceof Long) {
            long jA05 = C3cG.A05(element);
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.A01[i] == jA05) {
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

    public final void A04(long element) {
        A03();
        int i = this.A00;
        long[] jArr = this.A01;
        int length = jArr.length;
        if (i == length) {
            long[] jArr2 = new long[AbstractC7610F5x.A07(length)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.A01 = jArr2;
            jArr = jArr2;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        jArr[i2] = element;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object element) {
        A04(C3cG.A05(element));
        return true;
    }

    @Override // X.GDF, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        A03();
        Charset charset = AbstractC9352GFl.A04;
        collection.getClass();
        if (!(collection instanceof GDT)) {
            return super.addAll(collection);
        }
        GDT gdt = (GDT) collection;
        int i = gdt.A00;
        if (i == 0) {
            return false;
        }
        int i2 = this.A00;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArrCopyOf = this.A01;
        if (i3 > jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
            this.A01 = jArrCopyOf;
        }
        System.arraycopy(gdt.A01, 0, jArrCopyOf, this.A00, gdt.A00);
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
        return Long.valueOf(GDF.A01(this, index));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int index) {
        A03();
        A02(this, index);
        long[] jArr = this.A01;
        long j = jArr[index];
        AbstractC7610F5x.A1J(jArr, this.A00, index);
        this.A00--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int fromIndex, int toIndex) {
        A03();
        if (toIndex < fromIndex) {
            throw BV6.A0g("toIndex < fromIndex");
        }
        long[] jArr = this.A01;
        System.arraycopy(jArr, toIndex, jArr, fromIndex, this.A00 - toIndex);
        this.A00 -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int index, Object element) {
        long jA05 = C3cG.A05(element);
        A03();
        A02(this, index);
        long[] jArr = this.A01;
        long j = jArr[index];
        jArr[index] = jA05;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int index, Object element) {
        int i;
        long jA05 = C3cG.A05(element);
        A03();
        if (index >= 0 && index <= (i = this.A00)) {
            long[] jArr = this.A01;
            int length = jArr.length;
            if (i < length) {
                AbstractC7608F5v.A1K(jArr, index, i);
            } else {
                long[] jArr2 = new long[AbstractC7610F5x.A07(length)];
                System.arraycopy(jArr, 0, jArr2, 0, index);
                System.arraycopy(this.A01, index, jArr2, index + 1, this.A00 - index);
                this.A01 = jArr2;
            }
            this.A01[index] = jA05;
            this.A00++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw C8j3.A0y("Index:", ", Size:", index, this.A00);
    }
}
