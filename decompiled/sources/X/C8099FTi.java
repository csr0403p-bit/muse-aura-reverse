package X;

import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.FTi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8099FTi {
    public List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> A00;
    public int[] A01;

    public static final void A00(C8099FTi c8099FTi, int i) {
        int[] iArr = c8099FTi.A01;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            c8099FTi.A01 = iArr2;
            Arrays.fill(iArr2, -1);
            return;
        }
        int length = iArr.length;
        if (i >= length) {
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            c8099FTi.A01 = iArr3;
            int length2 = iArr.length;
            System.arraycopy(iArr, 0, iArr3, 0, length2);
            int[] iArr4 = c8099FTi.A01;
            Arrays.fill(iArr4, length2, iArr4.length, -1);
        }
    }

    public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem A01(int i) {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> list = this.A00;
        if (list != null) {
            int size = list.size();
            do {
                size--;
                if (size >= 0) {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = this.A00.get(size);
                }
            } while (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01 != i);
            return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        }
        return null;
    }

    public final void A02() {
        int[] iArr = this.A01;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.A00 = null;
    }

    public final void A03(int i) {
        List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> list = this.A00;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (this.A00.get(size).A01 >= i) {
                    this.A00.remove(size);
                }
            }
        }
        A04(i);
    }

    public final void A04(int i) {
        int i2;
        int[] iArr = this.A01;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        if (this.A00 == null) {
            i2 = -1;
        } else {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemA01 = A01(i);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemA01 != null) {
                this.A00.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItemA01);
            }
            int size = this.A00.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                if (this.A00.get(i3).A01 < i) {
                    i3++;
                } else if (i3 != -1) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = this.A00.get(i3);
                    this.A00.remove(i3);
                    i2 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01;
                }
            }
            i2 = -1;
        }
        int[] iArr2 = this.A01;
        Arrays.fill(iArr2, i, i2 == -1 ? iArr2.length : Math.min(i2 + 1, iArr2.length), -1);
    }

    public final void A05(int i, int i2) {
        int[] iArr = this.A01;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        A00(this, i3);
        int[] iArr2 = this.A01;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill(this.A01, i, i3, -1);
        List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> list = this.A00;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = this.A00.get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01;
            if (i4 >= i) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01 = i4 + i2;
            }
        }
    }

    public final void A06(int i, int i2) {
        int[] iArr = this.A01;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        A00(this, i3);
        int[] iArr2 = this.A01;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = this.A01;
        int length = iArr3.length;
        Arrays.fill(iArr3, length - i2, length, -1);
        List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> list = this.A00;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = this.A00.get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01;
            if (i4 >= i) {
                if (i4 < i3) {
                    this.A00.remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01 = i4 - i2;
                }
            }
        }
    }
}
