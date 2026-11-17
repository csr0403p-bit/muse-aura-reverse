package X;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FTO {
    public final int A04;
    public final /* synthetic */ StaggeredGridLayoutManager A05;
    public ArrayList<View> A03 = C3cG.A0h();
    public int A01 = Integer.MIN_VALUE;
    public int A00 = Integer.MIN_VALUE;
    public int A02 = 0;

    public FTO(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.A05 = staggeredGridLayoutManager;
        this.A04 = i;
    }

    private final int A00(int i, int i2) {
        AbstractC8085FSq abstractC8085FSq = this.A05.A07;
        int iA04 = abstractC8085FSq.A04();
        int iA02 = abstractC8085FSq.A02();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View viewA0d = AbstractC7607F5u.A0d(this.A03, i);
            int iA09 = abstractC8085FSq.A09(viewA0d);
            int iA06 = abstractC8085FSq.A06(viewA0d);
            boolean z = iA09 <= iA02;
            boolean z2 = iA06 >= iA04;
            if (z && z2 && (iA09 < iA04 || iA06 > iA02)) {
                return FTN.A0Y(viewA0d);
            }
            i += i3;
        }
        return -1;
    }

    public static final void A01(FTO fto) {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemA01;
        ArrayList<View> arrayList = fto.A03;
        View viewA0d = AbstractC7607F5u.A0d(arrayList, arrayList.size() - 1);
        C7803FFj c7803FFj = (C7803FFj) viewA0d.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = fto.A05;
        fto.A00 = staggeredGridLayoutManager.A07.A06(viewA0d);
        if (c7803FFj.A01 && (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemA01 = staggeredGridLayoutManager.A09.A01(AbstractC7609F5w.A0E(((FTf) c7803FFj).A00))) != null && staggeredGridLayoutManager$LazySpanLookup$FullSpanItemA01.A00 == 1) {
            int i = fto.A00;
            int i2 = fto.A04;
            int[] iArr = staggeredGridLayoutManager$LazySpanLookup$FullSpanItemA01.A03;
            fto.A00 = i + (iArr == null ? 0 : iArr[i2]);
        }
    }

    public static final void A02(FTO fto) {
        View viewA0d = AbstractC7607F5u.A0d(fto.A03, 0);
        C7803FFj c7803FFj = (C7803FFj) viewA0d.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = fto.A05;
        fto.A01 = staggeredGridLayoutManager.A07.A09(viewA0d);
        if (c7803FFj.A01) {
            C8099FTi c8099FTi = staggeredGridLayoutManager.A09;
            FTV ftv = ((FTf) c7803FFj).A00;
            int i = ftv.A05;
            if (i == -1) {
                i = ftv.A04;
            }
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemA01 = c8099FTi.A01(i);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemA01 == null || staggeredGridLayoutManager$LazySpanLookup$FullSpanItemA01.A00 != -1) {
                return;
            }
            int i2 = fto.A01;
            int i3 = fto.A04;
            int[] iArr = staggeredGridLayoutManager$LazySpanLookup$FullSpanItemA01.A03;
            fto.A01 = i2 - (iArr == null ? 0 : iArr[i3]);
        }
    }

    public final int A03() {
        int iA0I;
        int size;
        boolean z = this.A05.A0D;
        ArrayList<View> arrayList = this.A03;
        if (z) {
            iA0I = AbstractC7607F5u.A0I(arrayList, 1);
            size = -1;
        } else {
            iA0I = 0;
            size = arrayList.size();
        }
        return A00(iA0I, size);
    }

    public final int A04() {
        int iA0I;
        int size;
        boolean z = this.A05.A0D;
        ArrayList<View> arrayList = this.A03;
        if (z) {
            iA0I = 0;
            size = arrayList.size();
        } else {
            iA0I = AbstractC7607F5u.A0I(arrayList, 1);
            size = -1;
        }
        return A00(iA0I, size);
    }

    public final int A05(int i) {
        int i2 = this.A00;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.A03.size() == 0) {
            return i;
        }
        A01(this);
        return this.A00;
    }

    public final int A06(int i) {
        int i2 = this.A01;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.A03.size() == 0) {
            return i;
        }
        A02(this);
        return this.A01;
    }

    public final View A07(int i, int i2) {
        ArrayList<View> arrayList = this.A03;
        View view = null;
        int size = arrayList.size();
        int i3 = size - 1;
        if (i2 != -1) {
            while (i3 >= 0) {
                View viewA0d = AbstractC7607F5u.A0d(arrayList, i3);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
                if (staggeredGridLayoutManager.A0D && FTN.A0Y(viewA0d) >= i) {
                    break;
                }
                if (!staggeredGridLayoutManager.A0D && FTN.A0Y(viewA0d) <= i) {
                    return view;
                }
                if (!viewA0d.hasFocusable()) {
                    break;
                }
                i3--;
                view = viewA0d;
            }
        } else {
            int i4 = 0;
            while (i4 < size) {
                View viewA0d2 = AbstractC7607F5u.A0d(arrayList, i4);
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.A05;
                if ((staggeredGridLayoutManager2.A0D && FTN.A0Y(viewA0d2) <= i) || ((!staggeredGridLayoutManager2.A0D && FTN.A0Y(viewA0d2) >= i) || !viewA0d2.hasFocusable())) {
                    break;
                }
                i4++;
                view = viewA0d2;
            }
        }
        return view;
    }

    public final void A08() {
        this.A03.clear();
        this.A01 = Integer.MIN_VALUE;
        this.A00 = Integer.MIN_VALUE;
        this.A02 = 0;
    }

    public final void A09() {
        ArrayList<View> arrayList = this.A03;
        int size = arrayList.size();
        View viewRemove = arrayList.remove(size - 1);
        C7803FFj c7803FFj = (C7803FFj) viewRemove.getLayoutParams();
        c7803FFj.A00 = null;
        FTV ftv = ((FTf) c7803FFj).A00;
        if (AnonymousClass002.A1L(ftv.A00 & 8) || (ftv.A00 & 2) != 0) {
            this.A02 -= this.A05.A07.A07(viewRemove);
        }
        if (size == 1) {
            this.A01 = Integer.MIN_VALUE;
        }
        this.A00 = Integer.MIN_VALUE;
    }

    public final void A0A() {
        ArrayList<View> arrayList = this.A03;
        View viewRemove = arrayList.remove(0);
        C7803FFj c7803FFj = (C7803FFj) viewRemove.getLayoutParams();
        c7803FFj.A00 = null;
        if (arrayList.size() == 0) {
            this.A00 = Integer.MIN_VALUE;
        }
        FTV ftv = ((FTf) c7803FFj).A00;
        if (AnonymousClass002.A1L(ftv.A00 & 8) || (ftv.A00 & 2) != 0) {
            this.A02 -= this.A05.A07.A07(viewRemove);
        }
        this.A01 = Integer.MIN_VALUE;
    }

    public final void A0B(View view) {
        C7803FFj c7803FFj = (C7803FFj) view.getLayoutParams();
        c7803FFj.A00 = this;
        ArrayList<View> arrayList = this.A03;
        arrayList.add(view);
        this.A00 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.A01 = Integer.MIN_VALUE;
        }
        FTV ftv = ((FTf) c7803FFj).A00;
        if (AnonymousClass002.A1L(ftv.A00 & 8) || (ftv.A00 & 2) != 0) {
            this.A02 += this.A05.A07.A07(view);
        }
    }

    public final void A0C(View view) {
        C7803FFj c7803FFj = (C7803FFj) view.getLayoutParams();
        c7803FFj.A00 = this;
        ArrayList<View> arrayList = this.A03;
        arrayList.add(0, view);
        this.A01 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.A00 = Integer.MIN_VALUE;
        }
        FTV ftv = ((FTf) c7803FFj).A00;
        if (AnonymousClass002.A1L(ftv.A00 & 8) || (ftv.A00 & 2) != 0) {
            this.A02 += this.A05.A07.A07(view);
        }
    }
}
