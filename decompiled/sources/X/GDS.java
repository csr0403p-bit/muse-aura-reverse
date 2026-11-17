package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class GDS extends GDF implements GDP, RandomAccess {
    public static final int[] A02;
    public static final GDS A03;
    public int A00;
    public int[] A01;

    static {
        int[] iArr = new int[0];
        A02 = iArr;
        GDS gds = new GDS(false);
        gds.A01 = iArr;
        gds.A00 = 0;
        A03 = gds;
    }

    @Override // X.GDF, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GDS)) {
            return super.equals(o);
        }
        GDS gds = (GDS) o;
        int i = this.A00;
        if (i == gds.A00) {
            int[] iArr = gds.A01;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A01[i2] == iArr[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.GDF, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + this.A01[i2];
        }
        return i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GDS() {
        super(true);
        int[] iArr = A02;
        this.A01 = iArr;
        this.A00 = 0;
    }

    public static void A02(GDS gds, int i) {
        if (i < 0 || i >= gds.A00) {
            throw C8j3.A0y("Index:", ", Size:", i, gds.A00);
        }
    }

    @Override // X.GDP
    public final /* bridge */ /* synthetic */ GDP AR1(int capacity) {
        if (capacity < this.A00) {
            throw BV4.A0P();
        }
        int[] iArrCopyOf = capacity == 0 ? A02 : Arrays.copyOf(this.A01, capacity);
        int i = this.A00;
        GDS gds = new GDS(true);
        gds.A01 = iArrCopyOf;
        gds.A00 = i;
        return gds;
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
        int length = iArr.length;
        if (i == length) {
            int[] iArr2 = new int[AbstractC7610F5x.A07(length)];
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

    @Override // X.GDF, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        A03();
        Charset charset = AbstractC9352GFl.A04;
        collection.getClass();
        if (!(collection instanceof GDS)) {
            return super.addAll(collection);
        }
        GDS gds = (GDS) collection;
        int i = gds.A00;
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
        System.arraycopy(gds.A01, 0, iArrCopyOf, this.A00, gds.A00);
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
        return Integer.valueOf(GDF.A00(this, index));
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
            int length = iArr.length;
            if (i < length) {
                AbstractC7608F5v.A1K(iArr, index, i);
            } else {
                int[] iArr2 = new int[AbstractC7610F5x.A07(length)];
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
