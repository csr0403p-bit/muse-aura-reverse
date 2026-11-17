package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class GDW extends GDG implements InterfaceC10576Hum, GDX, RandomAccess {
    public static final GDW A02;
    public static final int[] A03;
    public int A00;
    public int[] A01;

    static {
        int[] iArr = new int[0];
        A03 = iArr;
        GDW gdw = new GDW(false);
        gdw.A01 = iArr;
        gdw.A00 = 0;
        A02 = gdw;
    }

    @Override // X.GDG, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GDW)) {
            return super.equals(obj);
        }
        GDW gdw = (GDW) obj;
        int i = this.A00;
        if (i == gdw.A00) {
            int[] iArr = gdw.A01;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A01[i2] == iArr[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + this.A01[i2];
        }
        return i;
    }

    public final void A04(int i) {
        if (i < 0 || i >= this.A00) {
            throw C8j3.A0y("Index:", ", Size:", i, this.A00);
        }
    }

    @Override // X.InterfaceC9313GDp
    public final /* bridge */ /* synthetic */ InterfaceC9313GDp A2h(int i) {
        if (i < this.A00) {
            throw BV4.A0P();
        }
        int[] iArrCopyOf = i == 0 ? A03 : Arrays.copyOf(this.A01, i);
        int i2 = this.A00;
        GDW gdw = new GDW(true);
        gdw.A01 = iArrCopyOf;
        gdw.A00 = i2;
        return gdw;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iA0F = AnonymousClass001.A0F(obj);
            int i = this.A00;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A01[i2] == iA0F) {
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }

    public final void A03(int i) {
        A02();
        int i2 = this.A00;
        int[] iArr = this.A01;
        int length = iArr.length;
        if (i2 == length) {
            int[] iArr2 = new int[GDG.A00(length)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.A01 = iArr2;
            iArr = iArr2;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        A03(AnonymousClass001.A0F(obj));
        return true;
    }

    @Override // X.GDG, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        A02();
        byte[] bArr = AbstractC9307GDj.A00;
        collection.getClass();
        if (!(collection instanceof GDW)) {
            return super.addAll(collection);
        }
        GDW gdw = (GDW) collection;
        int i = gdw.A00;
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
        System.arraycopy(gdw.A01, 0, iArrCopyOf, this.A00, gdw.A00);
        this.A00 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return AnonymousClass002.A1P(indexOf(obj), -1);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(GDG.A01(this, i));
    }

    @Override // X.GDG, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        A02();
        A04(i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        AbstractC7610F5x.A1J(iArr, this.A00, i);
        this.A00--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        A02();
        if (i2 < i) {
            throw BV6.A0g("toIndex < fromIndex");
        }
        int[] iArr = this.A01;
        System.arraycopy(iArr, i2, iArr, i, this.A00 - i2);
        this.A00 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iA0F = AnonymousClass001.A0F(obj);
        A02();
        A04(i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        iArr[i] = iA0F;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iA0F = AnonymousClass001.A0F(obj);
        A02();
        if (i >= 0 && i <= (i2 = this.A00)) {
            int[] iArr = this.A01;
            int length = iArr.length;
            if (i2 < length) {
                AbstractC7608F5v.A1K(iArr, i, i2);
            } else {
                int[] iArr2 = new int[GDG.A00(length)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.A01, i, iArr2, i + 1, this.A00 - i);
                this.A01 = iArr2;
            }
            this.A01[i] = iA0F;
            this.A00++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw C8j3.A0y("Index:", ", Size:", i, this.A00);
    }
}
