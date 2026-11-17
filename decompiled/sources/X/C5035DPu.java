package X;

import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.RegularImmutableSortedMultiset;
import com.google.common.collect.RegularImmutableSortedSet;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: X.DPu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5035DPu<E> extends C5029DPn<E> {
    public int A00;
    public boolean A01;
    public int[] A02;
    public E[] A03;
    public final Comparator<? super E> A04;

    @Override // X.C5029DPn, X.DOJ
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMultiset<E> build() {
        int i;
        A00(false);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.A00;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.A02;
            int i4 = iArr[i2];
            if (i4 > 0) {
                E[] eArr = this.A03;
                eArr[i3] = eArr[i2];
                iArr[i3] = i4;
                i3++;
            }
            i2++;
        }
        Arrays.fill(this.A03, i3, i, (Object) null);
        Arrays.fill(this.A02, i3, this.A00, 0);
        this.A00 = i3;
        Comparator<? super E> comparator = this.A04;
        if (i3 == 0) {
            return NaturalOrdering.A00.equals(comparator) ? (ImmutableSortedMultiset<E>) RegularImmutableSortedMultiset.A04 : new RegularImmutableSortedMultiset(comparator);
        }
        RegularImmutableSortedSet regularImmutableSortedSetA06 = ImmutableSortedSet.A06(comparator, this.A03, i3);
        int i5 = this.A00;
        long[] jArr = new long[i5 + 1];
        int i6 = 0;
        while (i6 < i5) {
            int i7 = i6 + 1;
            jArr[i7] = jArr[i6] + this.A02[i6];
            i6 = i7;
        }
        this.A01 = true;
        return new RegularImmutableSortedMultiset(regularImmutableSortedSetA06, jArr, 0, i5);
    }

    @Override // X.C5029DPn, X.DOJ
    public final /* bridge */ /* synthetic */ DOJ add(Object[] elements) {
        for (Object obj : elements) {
            A05(obj, 1);
        }
        return this;
    }

    private void A00(boolean z) {
        int i = this.A00;
        if (i != 0) {
            Object[] objArr = (E[]) Arrays.copyOf(this.A03, i);
            Comparator<? super E> comparator = this.A04;
            Arrays.sort(objArr, comparator);
            int i2 = 1;
            for (int i3 = 1; i3 < objArr.length; i3++) {
                if (comparator.compare((Object) objArr[i2 - 1], (Object) objArr[i3]) < 0) {
                    objArr[i2] = objArr[i3];
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, this.A00, (Object) null);
            if (z) {
                int i4 = i2 * 4;
                int i5 = this.A00;
                if (i4 > i5 * 3) {
                    objArr = (E[]) Arrays.copyOf(objArr, DX6.A01(i5 + (i5 / 2) + 1));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i6 = 0; i6 < this.A00; i6++) {
                int iBinarySearch = Arrays.binarySearch(objArr, 0, i2, this.A03[i6], comparator);
                int i7 = this.A02[i6];
                iArr[iBinarySearch] = i7 >= 0 ? iArr[iBinarySearch] + i7 : i7 ^ (-1);
            }
            this.A03 = (E[]) objArr;
            this.A02 = iArr;
            this.A00 = i2;
        }
    }

    public C5035DPu(Comparator<? super E> comparator) {
        super.A01 = false;
        super.A00 = null;
        comparator.getClass();
        this.A04 = comparator;
        this.A03 = (E[]) new Object[4];
        this.A02 = new int[4];
    }

    /* JADX WARN: Incorrect return type in method signature: (TE;I)LX/DPu<TE;>; */
    public final void A05(Object obj, int i) {
        obj.getClass();
        AbstractC3830CfJ.A00(i, "occurrences");
        if (i != 0) {
            int i2 = this.A00;
            E[] eArr = this.A03;
            int length = eArr.length;
            if (i2 == length) {
                A00(true);
            } else if (this.A01) {
                this.A03 = (E[]) Arrays.copyOf(eArr, length);
            }
            this.A01 = false;
            Object[] objArr = (E[]) this.A03;
            int i3 = this.A00;
            objArr[i3] = obj;
            this.A02[i3] = i;
            this.A00 = i3 + 1;
        }
    }

    @Override // X.C5029DPn, X.DOJ
    public final /* bridge */ /* synthetic */ DOJ add(Object element) {
        A05(element, 1);
        return this;
    }
}
