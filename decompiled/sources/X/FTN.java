package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bloks.stdlib.components.bkcomponentscollection.BloksStaggeredGridLayoutManager;
import com.bloks.stdlib.components.bkcomponentscollection.StickyItemsLinearLayoutManager;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class FTN {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public FTW A05;
    public AbstractC8094FTa A06;
    public RecyclerView A07;
    public G3d A08;
    public G3d A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final G3f A0D;
    public final G3f A0E;

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A0X(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            r3 = -2
            r2 = -1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1f
            if (r7 >= 0) goto L2f
            if (r7 != r2) goto L18
            if (r5 == r0) goto L2d
            if (r5 == 0) goto L18
            if (r5 == r1) goto L2d
        L18:
            r5 = 0
            r7 = 0
        L1a:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r0
        L1f:
            if (r7 >= 0) goto L2f
            if (r7 == r2) goto L2d
            if (r7 != r3) goto L18
            if (r5 == r0) goto L2b
            r0 = r5
            r5 = 0
            if (r0 != r1) goto L2d
        L2b:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L2d:
            r7 = r4
            goto L1a
        L2f:
            r5 = 1073741824(0x40000000, float:2.0)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTN.A0X(int, int, int, int, boolean):int");
    }

    public abstract int A0p(FTR ftr, C8097FTd c8097FTd, int i);

    public abstract int A0q(FTR ftr, C8097FTd c8097FTd, int i);

    public final int A0r(C8097FTd c8097FTd) {
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (staggeredGridLayoutManager.A0h() == 0) {
                return 0;
            }
            AbstractC8085FSq abstractC8085FSq = staggeredGridLayoutManager.A07;
            boolean z = staggeredGridLayoutManager.A0F;
            boolean z2 = !z;
            return FTm.A00(StaggeredGridLayoutManager.A0B(staggeredGridLayoutManager, z2), StaggeredGridLayoutManager.A0A(staggeredGridLayoutManager, z2), abstractC8085FSq, staggeredGridLayoutManager, c8097FTd, z);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (!(linearLayoutManager instanceof StickyItemsLinearLayoutManager)) {
            return LinearLayoutManager.A0J(linearLayoutManager, c8097FTd);
        }
        StickyItemsLinearLayoutManager stickyItemsLinearLayoutManagerA0a = A0a(linearLayoutManager, c8097FTd);
        int iA0J = LinearLayoutManager.A0J(stickyItemsLinearLayoutManagerA0a, c8097FTd);
        StickyItemsLinearLayoutManager.A0A(stickyItemsLinearLayoutManagerA0a);
        return iA0J;
    }

    public final int A0s(C8097FTd c8097FTd) {
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (staggeredGridLayoutManager.A0h() == 0) {
                return 0;
            }
            AbstractC8085FSq abstractC8085FSq = staggeredGridLayoutManager.A07;
            boolean z = staggeredGridLayoutManager.A0F;
            boolean z2 = !z;
            return FTm.A01(StaggeredGridLayoutManager.A0B(staggeredGridLayoutManager, z2), StaggeredGridLayoutManager.A0A(staggeredGridLayoutManager, z2), abstractC8085FSq, staggeredGridLayoutManager, c8097FTd, z);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (!(linearLayoutManager instanceof StickyItemsLinearLayoutManager)) {
            return LinearLayoutManager.A0L(linearLayoutManager, c8097FTd);
        }
        StickyItemsLinearLayoutManager stickyItemsLinearLayoutManagerA0a = A0a(linearLayoutManager, c8097FTd);
        int iA0L = LinearLayoutManager.A0L(stickyItemsLinearLayoutManagerA0a, c8097FTd);
        StickyItemsLinearLayoutManager.A0A(stickyItemsLinearLayoutManagerA0a);
        return iA0L;
    }

    public final int A0t(C8097FTd c8097FTd) {
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (staggeredGridLayoutManager.A0h() == 0) {
                return 0;
            }
            AbstractC8085FSq abstractC8085FSq = staggeredGridLayoutManager.A07;
            boolean z = staggeredGridLayoutManager.A0F;
            boolean z2 = !z;
            return FTm.A00(StaggeredGridLayoutManager.A0B(staggeredGridLayoutManager, z2), StaggeredGridLayoutManager.A0A(staggeredGridLayoutManager, z2), abstractC8085FSq, staggeredGridLayoutManager, c8097FTd, z);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (!(linearLayoutManager instanceof StickyItemsLinearLayoutManager)) {
            return LinearLayoutManager.A0J(linearLayoutManager, c8097FTd);
        }
        StickyItemsLinearLayoutManager stickyItemsLinearLayoutManagerA0a = A0a(linearLayoutManager, c8097FTd);
        int iA0J = LinearLayoutManager.A0J(stickyItemsLinearLayoutManagerA0a, c8097FTd);
        StickyItemsLinearLayoutManager.A0A(stickyItemsLinearLayoutManagerA0a);
        return iA0J;
    }

    public final int A0u(C8097FTd c8097FTd) {
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (staggeredGridLayoutManager.A0h() == 0) {
                return 0;
            }
            AbstractC8085FSq abstractC8085FSq = staggeredGridLayoutManager.A07;
            boolean z = staggeredGridLayoutManager.A0F;
            boolean z2 = !z;
            return FTm.A01(StaggeredGridLayoutManager.A0B(staggeredGridLayoutManager, z2), StaggeredGridLayoutManager.A0A(staggeredGridLayoutManager, z2), abstractC8085FSq, staggeredGridLayoutManager, c8097FTd, z);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (!(linearLayoutManager instanceof StickyItemsLinearLayoutManager)) {
            return LinearLayoutManager.A0L(linearLayoutManager, c8097FTd);
        }
        StickyItemsLinearLayoutManager stickyItemsLinearLayoutManagerA0a = A0a(linearLayoutManager, c8097FTd);
        int iA0L = LinearLayoutManager.A0L(stickyItemsLinearLayoutManagerA0a, c8097FTd);
        StickyItemsLinearLayoutManager.A0A(stickyItemsLinearLayoutManagerA0a);
        return iA0L;
    }

    public abstract Parcelable A0v();

    public abstract View A0y(View view, FTR ftr, C8097FTd c8097FTd, int i);

    public abstract void A18(Parcelable parcelable);

    public final void A1A(View view) {
        FTf fTfA0m = AbstractC7607F5u.A0m(view);
        Rect rectA0g = this.A07.A0g(view);
        int i = 0 + rectA0g.left + rectA0g.right;
        int i2 = 0 + rectA0g.top + rectA0g.bottom;
        int iA0X = A0X(this.A03, this.A04, AbstractC7608F5v.A0A(fTfA0m, A0k() + A0l()) + i, ((ViewGroup.LayoutParams) fTfA0m).width, A1P());
        int iA0X2 = A0X(this.A00, this.A01, AbstractC7609F5w.A0C(fTfA0m, A0m(), A0j()) + i2, ((ViewGroup.LayoutParams) fTfA0m).height, A1Q());
        if (A1V(view, fTfA0m, iA0X, iA0X2)) {
            view.measure(iA0X, iA0X2);
        }
    }

    public abstract void A1J(FTR ftr, C8097FTd c8097FTd);

    public abstract void A1L(C8097FTd c8097FTd);

    public static StickyItemsLinearLayoutManager A0a(Object obj, Object obj2) {
        StickyItemsLinearLayoutManager stickyItemsLinearLayoutManager = (StickyItemsLinearLayoutManager) obj;
        C7384Etj.A0Y(obj2, 0);
        StickyItemsLinearLayoutManager.A0B(stickyItemsLinearLayoutManager);
        return stickyItemsLinearLayoutManager;
    }

    public static void A0f(Object obj) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) obj;
        gridLayoutManager.A03.A01.clear();
        gridLayoutManager.A03.A00.clear();
    }

    public final int A0h() {
        FTW ftw = this.A05;
        if (ftw != null) {
            return ftw.A04();
        }
        return 0;
    }

    public final int A0i() {
        AbstractC8091FSx abstractC8091FSx;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (abstractC8091FSx = recyclerView.A0F) == null) {
            return 0;
        }
        return abstractC8091FSx.A03();
    }

    public final int A0j() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int A0k() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int A0l() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int A0m() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final int A0n(FTR ftr, C8097FTd c8097FTd) {
        AbstractC8091FSx abstractC8091FSx;
        int i;
        int iA0i;
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (staggeredGridLayoutManager.A02 != 1) {
                return -1;
            }
            i = staggeredGridLayoutManager.A06;
            iA0i = c8097FTd.A00();
        } else {
            if (!(this instanceof GridLayoutManager)) {
                RecyclerView recyclerView = this.A07;
                if (recyclerView == null || (abstractC8091FSx = recyclerView.A0F) == null || !A1P()) {
                    return 1;
                }
                return abstractC8091FSx.A03();
            }
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this;
            if (((LinearLayoutManager) gridLayoutManager).A01 != 1) {
                int iA00 = c8097FTd.A00();
                if (iA00 < 1) {
                    return 0;
                }
                return GridLayoutManager.A02(gridLayoutManager, ftr, c8097FTd, iA00 - 1) + 1;
            }
            i = gridLayoutManager.A02;
            iA0i = gridLayoutManager.A0i();
        }
        return Math.min(i, iA0i);
    }

    public final int A0o(FTR ftr, C8097FTd c8097FTd) {
        AbstractC8091FSx abstractC8091FSx;
        int i;
        int iA0i;
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (staggeredGridLayoutManager.A02 != 0) {
                return -1;
            }
            i = staggeredGridLayoutManager.A06;
            iA0i = c8097FTd.A00();
        } else {
            if (!(this instanceof GridLayoutManager)) {
                RecyclerView recyclerView = this.A07;
                if (recyclerView == null || (abstractC8091FSx = recyclerView.A0F) == null || !A1Q()) {
                    return 1;
                }
                return abstractC8091FSx.A03();
            }
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this;
            if (((LinearLayoutManager) gridLayoutManager).A01 != 0) {
                int iA00 = c8097FTd.A00();
                if (iA00 < 1) {
                    return 0;
                }
                return GridLayoutManager.A02(gridLayoutManager, ftr, c8097FTd, iA00 - 1) + 1;
            }
            i = gridLayoutManager.A02;
            iA0i = gridLayoutManager.A0i();
        }
        return Math.min(i, iA0i);
    }

    public final View A0x(int i) {
        FTW ftw = this.A05;
        if (ftw != null) {
            return ftw.A07(i);
        }
        return null;
    }

    public final FTf A0z() {
        int i;
        FUH fuh;
        if (this instanceof StaggeredGridLayoutManager) {
            int i2 = ((StaggeredGridLayoutManager) this).A02;
            int i3 = -1;
            int i4 = -2;
            if (i2 == 0) {
                i3 = -2;
                i4 = -1;
            }
            return new C7803FFj(i3, i4);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (!(linearLayoutManager instanceof GridLayoutManager)) {
            return new FTf(-2, -2);
        }
        if (linearLayoutManager.A01 == 0) {
            i = -1;
            fuh = new FUH(-2, -1);
        } else {
            i = -1;
            fuh = new FUH(-1, -2);
        }
        fuh.A00 = i;
        fuh.A01 = 0;
        return fuh;
    }

    public final void A10() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void A11(int i) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int iA04 = recyclerView.A0C.A04();
            for (int i2 = 0; i2 < iA04; i2++) {
                recyclerView.A0C.A07(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void A12(int i) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int iA04 = recyclerView.A0C.A04();
            for (int i2 = 0; i2 < iA04; i2++) {
                recyclerView.A0C.A07(i2).offsetTopAndBottom(i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A13(int i) {
        LinearLayoutManager linearLayoutManager;
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            StaggeredGridLayoutManager.SavedState savedState = staggeredGridLayoutManager.A0A;
            if (savedState != null && savedState.A00 != i) {
                savedState.A09 = null;
                savedState.A02 = 0;
                savedState.A00 = -1;
                savedState.A03 = -1;
            }
            staggeredGridLayoutManager.A03 = i;
            staggeredGridLayoutManager.A04 = Integer.MIN_VALUE;
            linearLayoutManager = staggeredGridLayoutManager;
        } else {
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) this;
            if (linearLayoutManager2 instanceof StickyItemsLinearLayoutManager) {
                linearLayoutManager2.A1c(i, Integer.MIN_VALUE);
                return;
            }
            linearLayoutManager2.A02 = i;
            linearLayoutManager2.A03 = Integer.MIN_VALUE;
            LinearLayoutManager.SavedState savedState2 = linearLayoutManager2.A05;
            linearLayoutManager = linearLayoutManager2;
            if (savedState2 != null) {
                savedState2.A01 = -1;
                linearLayoutManager = linearLayoutManager2;
            }
        }
        linearLayoutManager.A10();
    }

    public final void A1B(View view) {
        FTW ftw = this.A05;
        int i = ftw.A00;
        if (i == 1) {
            throw C3cG.A0Q("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw C3cG.A0Q("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            ftw.A00 = 1;
            ftw.A01 = view;
            RecyclerView recyclerView = ((C8103FTr) ftw.A03).A00;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (ftw.A02.A07(iIndexOfChild)) {
                    FTW.A03(view, ftw);
                }
                View childAt = recyclerView.getChildAt(iIndexOfChild);
                if (childAt != null) {
                    recyclerView.A0w(childAt);
                    childAt.clearAnimation();
                }
                recyclerView.removeViewAt(iIndexOfChild);
            }
        } finally {
            ftw.A00 = 0;
            ftw.A01 = null;
        }
    }

    public final void A1C(View view, Rect rect) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.A0g(view));
        }
    }

    public void A1E(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.A07.canScrollVertically(-1) && !this.A07.canScrollHorizontally(-1) && !this.A07.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC8091FSx abstractC8091FSx = this.A07.A0F;
        if (abstractC8091FSx != null) {
            accessibilityEvent.setItemCount(abstractC8091FSx.A03());
        }
    }

    public void A1F(C2197BAc c2197BAc, FTR ftr, C8097FTd c8097FTd) {
        if (this.A07.canScrollVertically(-1) || this.A07.canScrollHorizontally(-1)) {
            AccessibilityNodeInfo accessibilityNodeInfo = c2197BAc.A02;
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
            C2197BAc.A02(c2197BAc, 67108864, true);
        }
        if (this.A07.canScrollVertically(1) || this.A07.canScrollHorizontally(1)) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = c2197BAc.A02;
            accessibilityNodeInfo2.addAction(4096);
            accessibilityNodeInfo2.setScrollable(true);
            C2197BAc.A02(c2197BAc, 67108864, true);
        }
        c2197BAc.A02.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(A0o(ftr, c8097FTd), A0n(ftr, c8097FTd), false, 0));
    }

    public final void A1I(FTR ftr) {
        ArrayList<FTV> arrayList = ftr.A05;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = AbstractC7607F5u.A0n(arrayList, i).A0I;
            FTV ftvA08 = RecyclerView.A08(view);
            if (!AnonymousClass002.A1L(ftvA08.A00 & 128)) {
                ftvA08.A03(false);
                if (AnonymousClass002.A1L(ftvA08.A00 & 256)) {
                    this.A07.removeDetachedView(view, false);
                }
                FTP ftp = this.A07.A0G;
                if (ftp != null) {
                    ftp.A05(ftvA08);
                }
                ftvA08.A03(true);
                FTV ftvA082 = RecyclerView.A08(view);
                ftvA082.A09 = null;
                ftvA082.A0G = false;
                ftvA082.A00 &= -33;
                ftr.A0C(ftvA082);
            }
        }
        arrayList.clear();
        ArrayList<FTV> arrayList2 = ftr.A04;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.A07.invalidate();
        }
    }

    public final void A1K(AbstractC8094FTa abstractC8094FTa) {
        C7636F7t c7636F7t;
        AbstractC8094FTa abstractC8094FTa2 = this.A06;
        if (abstractC8094FTa2 != null && abstractC8094FTa != abstractC8094FTa2 && abstractC8094FTa2.A05) {
            abstractC8094FTa2.A00();
        }
        this.A06 = abstractC8094FTa;
        RecyclerView recyclerView = this.A07;
        FTT ftt = recyclerView.A14;
        ftt.A06.removeCallbacks(ftt);
        ftt.A01.abortAnimation();
        if (abstractC8094FTa.A06) {
            String strA0Y = C3cI.A0Y(abstractC8094FTa);
            Log.w("RecyclerView", FGI.A0h("An instance of ", strA0Y, " was started more than once. Each instance of", strA0Y, " is intended to only be used once. You should create a new instance for each use."));
        }
        abstractC8094FTa.A03 = recyclerView;
        abstractC8094FTa.A02 = this;
        int i = abstractC8094FTa.A00;
        if (i == -1) {
            throw C60O.A0i("Invalid target position");
        }
        recyclerView.A13.A06 = i;
        abstractC8094FTa.A05 = true;
        abstractC8094FTa.A04 = true;
        abstractC8094FTa.A01 = recyclerView.A0H.A0w(i);
        FSJ fsj = (FSJ) abstractC8094FTa;
        if ((fsj instanceof FF2) && (c7636F7t = ((FF2) fsj).A02) != null) {
            c7636F7t.A01.A05(null);
        }
        abstractC8094FTa.A03.A14.A00();
        abstractC8094FTa.A06 = true;
    }

    public final void A1M(RecyclerView recyclerView) {
        if (this instanceof StickyItemsLinearLayoutManager) {
            StickyItemsLinearLayoutManager.A04(recyclerView.A0F, (StickyItemsLinearLayoutManager) this);
        } else if (this instanceof BloksStaggeredGridLayoutManager) {
            BloksStaggeredGridLayoutManager bloksStaggeredGridLayoutManager = (BloksStaggeredGridLayoutManager) this;
            if (bloksStaggeredGridLayoutManager.A00) {
                bloksStaggeredGridLayoutManager.A00 = false;
            } else if (BloksStaggeredGridLayoutManager.A00(recyclerView, bloksStaggeredGridLayoutManager)) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void A1N(RecyclerView recyclerView) {
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            Runnable runnable = staggeredGridLayoutManager.A0M;
            RecyclerView recyclerView2 = ((FTN) staggeredGridLayoutManager).A07;
            if (recyclerView2 != null) {
                recyclerView2.removeCallbacks(runnable);
            }
            for (int i = 0; i < staggeredGridLayoutManager.A06; i++) {
                staggeredGridLayoutManager.A0H[i].A08();
            }
            recyclerView.requestLayout();
        }
    }

    public void A1O(String str) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.A12(str);
        }
    }

    public final boolean A1P() {
        return this instanceof StaggeredGridLayoutManager ? AnonymousClass002.A1M(((StaggeredGridLayoutManager) this).A02) : AnonymousClass002.A1M(((LinearLayoutManager) this).A01);
    }

    public final boolean A1Q() {
        return this instanceof StaggeredGridLayoutManager ? BV7.A1Q(((StaggeredGridLayoutManager) this).A02) : BV7.A1Q(((LinearLayoutManager) this).A01);
    }

    public final boolean A1R() {
        if (this instanceof StaggeredGridLayoutManager) {
            return AnonymousClass002.A1Y(((StaggeredGridLayoutManager) this).A0A);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (!(linearLayoutManager instanceof GridLayoutManager)) {
            return linearLayoutManager.A05 == null && linearLayoutManager.A07 == linearLayoutManager.A0A;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) linearLayoutManager;
        return ((LinearLayoutManager) gridLayoutManager).A05 == null && !gridLayoutManager.A04;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0 A[PHI: r5
  0x00e0: PHI (r5v6 int) = (r5v3 int), (r5v11 int) binds: [B:52:0x00d0, B:16:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A1S(int r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTN.A1S(int, android.os.Bundle):boolean");
    }

    public boolean A1U(View view, View view2, C8097FTd c8097FTd, RecyclerView recyclerView) {
        AbstractC8094FTa abstractC8094FTa = this.A06;
        return (abstractC8094FTa != null && abstractC8094FTa.A05) || recyclerView.A03 > 0;
    }

    public FTN() {
        FSR fsr = new FSR(this);
        this.A0D = fsr;
        FSQ fsq = new FSQ(this);
        this.A0E = fsq;
        this.A08 = new G3d(fsr);
        this.A09 = new G3d(fsq);
        this.A0C = false;
        this.A0A = false;
    }

    public static int A0W(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    public static final int A0Y(View view) {
        return AbstractC7609F5w.A0E(AbstractC7607F5u.A0m(view).A00);
    }

    public static int A0Z(FTN ftn, int i) {
        return A0Y(ftn.A0x(i));
    }

    public static final void A0b(View view, int i, int i2, int i3, int i4) {
        FTf fTfA0m = AbstractC7607F5u.A0m(view);
        Rect rect = fTfA0m.A03;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) fTfA0m).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) fTfA0m).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) fTfA0m).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) fTfA0m).bottomMargin);
    }

    public static final void A0c(View view, FTN ftn, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        float f = RecyclerView.A1J;
        FTV ftv = AbstractC7607F5u.A0m(view).A00;
        boolean zA1L = AnonymousClass002.A1L(ftv.A00 & 8);
        C8098FTe c8098FTe = ftn.A07.A16;
        if (zA1L) {
            DQZ<FTV, FU0> dqz = c8098FTe.A01;
            FU0 fu0A00 = dqz.get(ftv);
            if (fu0A00 == null) {
                fu0A00 = HsC.A00();
                dqz.put(ftv, fu0A00);
            }
            fu0A00.A00 |= 1;
        } else {
            c8098FTe.A00(ftv);
        }
        ftn.A05.A0A(view, layoutParams, i, AnonymousClass002.A1L(ftv.A00 & 8));
    }

    public static void A0d(View view, FTN ftn, int i, boolean z) {
        FTV ftvA08 = RecyclerView.A08(view);
        if (z || AnonymousClass002.A1L(ftvA08.A00 & 8)) {
            DQZ<FTV, FU0> dqz = ftn.A07.A16.A01;
            FU0 fu0A00 = dqz.get(ftvA08);
            if (fu0A00 == null) {
                fu0A00 = HsC.A00();
                dqz.put(ftvA08, fu0A00);
            }
            fu0A00.A00 |= 1;
        } else {
            ftn.A07.A16.A00(ftvA08);
        }
        FTf fTfA0m = AbstractC7607F5u.A0m(view);
        int i2 = ftvA08.A00;
        if (AnonymousClass002.A1L(i2 & 32) || ftvA08.A09 != null) {
            FTR ftr = ftvA08.A09;
            if (ftr != null) {
                ftr.A0D(ftvA08);
            } else {
                ftvA08.A00 = i2 & (-33);
            }
            ftn.A05.A0A(view, view.getLayoutParams(), i, false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = ftn.A07;
            FTW ftw = ftn.A05;
            if (parent == recyclerView) {
                int iA06 = ftw.A06(view);
                if (i == -1) {
                    i = ftn.A05.A04();
                }
                if (iA06 == -1) {
                    throw FGI.A04("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:", ftn.A07.A0j(), ftn.A07.indexOfChild(view));
                }
                if (iA06 != i) {
                    FTN ftn2 = ftn.A07.A0H;
                    View viewA0x = ftn2.A0x(iA06);
                    if (viewA0x == null) {
                        throw BV5.A0S("Cannot move a child from non-existing index:", ftn2.A07.toString(), iA06);
                    }
                    ftn2.A0x(iA06);
                    ftn2.A05.A08(iA06);
                    A0c(viewA0x, ftn2, i);
                }
            } else {
                ftw.A09(view, i, false);
                fTfA0m.A01 = true;
                AbstractC8094FTa abstractC8094FTa = ftn.A06;
                if (abstractC8094FTa != null && abstractC8094FTa.A05) {
                    FTV ftv = AbstractC7607F5u.A0m(view).A00;
                    if ((ftv != null ? AbstractC7609F5w.A0E(ftv) : -1) == abstractC8094FTa.A00) {
                        abstractC8094FTa.A01 = view;
                        if (RecyclerView.A1I) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (fTfA0m.A02) {
            if (RecyclerView.A1I) {
                Log.d("RecyclerView", C8j3.A14(fTfA0m.A00, C60O.A0x("consuming pending invalidate on child ")));
            }
            ftvA08.A0I.invalidate();
            fTfA0m.A02 = false;
        }
    }

    public static final void A0e(FTN ftn, int i) {
        if (ftn.A0x(i) != null) {
            FTW ftw = ftn.A05;
            int i2 = ftw.A00;
            if (i2 == 1) {
                throw C3cG.A0Q("Cannot call removeView(At) within removeView(At)");
            }
            if (i2 == 2) {
                throw C3cG.A0Q("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iA00 = FTW.A00(ftw, i);
                RecyclerView recyclerView = ((C8103FTr) ftw.A03).A00;
                View childAt = recyclerView.getChildAt(iA00);
                if (childAt != null) {
                    ftw.A00 = 1;
                    ftw.A01 = childAt;
                    if (ftw.A02.A07(iA00)) {
                        FTW.A03(childAt, ftw);
                    }
                    View childAt2 = recyclerView.getChildAt(iA00);
                    if (childAt2 != null) {
                        recyclerView.A0w(childAt2);
                        childAt2.clearAnimation();
                    }
                    recyclerView.removeViewAt(iA00);
                }
            } finally {
                ftw.A00 = 0;
                ftw.A01 = null;
            }
        }
    }

    public static boolean A0g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0 || (mode == 1073741824 && size == i)) {
                    return true;
                }
            } else if (size >= i) {
                return true;
            }
        }
        return false;
    }

    public View A0w(int i) {
        int iA0h = A0h();
        for (int i2 = 0; i2 < iA0h; i2++) {
            View viewA0x = A0x(i2);
            FTV ftvA08 = RecyclerView.A08(viewA0x);
            if (ftvA08 != null && AbstractC7609F5w.A0E(ftvA08) == i && !AnonymousClass002.A1L(ftvA08.A00 & 128) && (this.A07.A13.A08 || !AnonymousClass002.A1L(ftvA08.A00 & 8))) {
                return viewA0x;
            }
        }
        return null;
    }

    public final void A14(int i, int i2) {
        this.A03 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A04 = mode;
        if (mode == 0) {
            float f = RecyclerView.A1J;
        }
        this.A00 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.A01 = mode2;
        if (mode2 == 0) {
            float f2 = RecyclerView.A1J;
        }
    }

    public final void A15(int i, int i2) {
        int iA0h = A0h();
        if (iA0h == 0) {
            this.A07.A0s(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iA0h; i7++) {
            View viewA0x = A0x(i7);
            Rect rect = this.A07.A0x;
            RecyclerView.A0K(viewA0x, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.A07.A0x.set(i5, i6, i3, i4);
        A16(this.A07.A0x, i, i2);
    }

    public void A16(Rect rect, int i, int i2) {
        int iWidth = rect.width() + A0k() + A0l();
        int iHeight = rect.height() + A0m() + A0j();
        this.A07.setMeasuredDimension(A0W(i, iWidth, this.A07.getMinimumWidth()), A0W(i2, iHeight, this.A07.getMinimumHeight()));
    }

    public final void A17(Rect rect, View view) {
        Matrix matrix;
        Rect rectA00 = FTf.A00(view);
        rect.set(-rectA00.left, -rectA00.top, view.getWidth() + rectA00.right, view.getHeight() + rectA00.bottom);
        if (this.A07 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.A07.A0z;
            rectF.set(rect);
            matrix.mapRect(rectF);
            AbstractC7611F5y.A0d(rect, rectF);
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A19(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.A07;
        if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
            throw C60Q.A0U("View should be fully attached to be ignored", this.A07.A0j());
        }
        float f = RecyclerView.A1J;
        FTV ftv = AbstractC7607F5u.A0m(view).A00;
        ftv.A00 = 128 | ftv.A00;
        this.A07.A16.A01(ftv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1D(View view, C2197BAc c2197BAc) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfoObtain;
        GridLayoutManager gridLayoutManager;
        FTV ftvA08 = RecyclerView.A08(view);
        if (ftvA08 == null || AnonymousClass002.A1L(ftvA08.A00 & 8)) {
            return;
        }
        if (this.A05.A04.contains(ftvA08.A0I)) {
            return;
        }
        RecyclerView recyclerView = this.A07;
        FTR ftr = recyclerView.A11;
        C8097FTd c8097FTd = recyclerView.A13;
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            gridLayoutManager = staggeredGridLayoutManager;
            if (layoutParams instanceof C7803FFj) {
                C7803FFj c7803FFj = (C7803FFj) layoutParams;
                int i = staggeredGridLayoutManager.A02;
                FTO fto = c7803FFj.A00;
                int i2 = fto == null ? -1 : fto.A04;
                boolean z = c7803FFj.A01;
                if (i == 0) {
                    collectionItemInfoObtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, z ? staggeredGridLayoutManager.A06 : 1, -1, -1, false, false);
                } else {
                    collectionItemInfoObtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(-1, -1, i2, z ? staggeredGridLayoutManager.A06 : 1, false, false);
                }
                c2197BAc.A02.setCollectionItemInfo(collectionItemInfoObtain);
            }
            gridLayoutManager.A1D(view, c2197BAc);
            return;
        }
        if (this instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager2 = (GridLayoutManager) this;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            gridLayoutManager = gridLayoutManager2;
            if (layoutParams2 instanceof FUH) {
                FUH fuh = (FUH) layoutParams2;
                int iA02 = GridLayoutManager.A02(gridLayoutManager2, ftr, c8097FTd, AbstractC7609F5w.A0E(((FTf) fuh).A00));
                int i3 = ((LinearLayoutManager) gridLayoutManager2).A01;
                int i4 = fuh.A00;
                int i5 = fuh.A01;
                collectionItemInfoObtain = i3 == 0 ? AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, iA02, 1, false, false) : AccessibilityNodeInfo.CollectionItemInfo.obtain(iA02, 1, i4, i5, false, false);
            }
            gridLayoutManager.A1D(view, c2197BAc);
            return;
        }
        collectionItemInfoObtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(A1Q() ? A0Y(view) : 0, 1, A1P() ? A0Y(view) : 0, 1, false, false);
        c2197BAc.A02.setCollectionItemInfo(collectionItemInfoObtain);
    }

    public final void A1G(FTR ftr) {
        int iA0h = A0h();
        while (true) {
            iA0h--;
            if (iA0h < 0) {
                return;
            }
            View viewA0x = A0x(iA0h);
            FTV ftvA08 = RecyclerView.A08(viewA0x);
            if (AnonymousClass002.A1L(ftvA08.A00 & 128)) {
                if (RecyclerView.A1I) {
                    Log.d("RecyclerView", AnonymousClass007.A0a("ignoring view ", ftvA08));
                }
            } else if ((ftvA08.A00 & 4) == 0 || AnonymousClass002.A1L(ftvA08.A00 & 8) || this.A07.A0F.A00) {
                A0x(iA0h);
                this.A05.A08(iA0h);
                ftr.A0A(viewA0x);
                this.A07.A16.A00(ftvA08);
            } else {
                A0e(this, iA0h);
                ftr.A0C(ftvA08);
            }
        }
    }

    public final void A1H(FTR ftr) {
        int iA0h = A0h();
        while (true) {
            iA0h--;
            if (iA0h < 0) {
                return;
            }
            if (!AnonymousClass002.A1L(RecyclerView.A08(A0x(iA0h)).A00 & 128)) {
                View viewA0x = A0x(iA0h);
                A0e(this, iA0h);
                ftr.A09(viewA0x);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A1T(android.graphics.Rect r12, android.view.View r13, androidx.recyclerview.widget.RecyclerView r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            int r4 = r11.A0k()
            int r3 = r11.A0m()
            int r2 = r11.A03
            int r0 = r11.A0l()
            int r2 = r2 - r0
            int r1 = r11.A00
            int r0 = r11.A0j()
            int r1 = r1 - r0
            int r9 = r13.getLeft()
            int r0 = r12.left
            int r9 = r9 + r0
            int r0 = r13.getScrollX()
            int r9 = r9 - r0
            int r8 = r13.getTop()
            int r0 = r12.top
            int r8 = r8 + r0
            int r0 = r13.getScrollY()
            int r8 = r8 - r0
            int r7 = r12.width()
            int r7 = r7 + r9
            int r0 = r12.height()
            int r0 = r0 + r8
            int r9 = r9 - r4
            r6 = 0
            int r4 = java.lang.Math.min(r6, r9)
            int r8 = r8 - r3
            int r3 = java.lang.Math.min(r6, r8)
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r6, r7)
            int r1 = X.AbstractC7607F5u.A0D(r0, r1, r6)
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            int r0 = r0.getLayoutDirection()
            r5 = 1
            if (r0 != r5) goto Lad
            if (r2 != 0) goto L5b
            int r2 = java.lang.Math.max(r4, r7)
        L5b:
            if (r3 != 0) goto L61
            int r3 = java.lang.Math.min(r8, r1)
        L61:
            int[] r0 = new int[]{r2, r3}
            r4 = r0[r6]
            r3 = r0[r5]
            if (r16 == 0) goto La3
            android.view.View r10 = r14.getFocusedChild()
            if (r10 == 0) goto La2
            int r8 = r11.A0k()
            int r7 = r11.A0m()
            int r9 = r11.A03
            int r0 = r11.A0l()
            int r9 = r9 - r0
            int r2 = r11.A00
            int r0 = r11.A0j()
            int r2 = r2 - r0
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            android.graphics.Rect r1 = r0.A0x
            androidx.recyclerview.widget.RecyclerView.A0K(r10, r1)
            int r0 = r1.left
            int r0 = r0 - r4
            if (r0 >= r9) goto La2
            int r0 = r1.right
            int r0 = r0 - r4
            if (r0 <= r8) goto La2
            int r0 = r1.top
            int r0 = r0 - r3
            if (r0 >= r2) goto La2
            int r0 = r1.bottom
            int r0 = r0 - r3
            if (r0 > r7) goto La3
        La2:
            return r6
        La3:
            if (r4 != 0) goto La7
            if (r3 == 0) goto La2
        La7:
            if (r15 == 0) goto Lb5
            r14.scrollBy(r4, r3)
            return r5
        Lad:
            if (r4 != 0) goto Lb3
            int r4 = java.lang.Math.min(r9, r2)
        Lb3:
            r2 = r4
            goto L5b
        Lb5:
            r14.A0v(r4, r3, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTN.A1T(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, boolean, boolean):boolean");
    }

    public final boolean A1V(View view, FTf fTf, int i, int i2) {
        return (!view.isLayoutRequested() && A0g(view.getWidth(), i, ((ViewGroup.LayoutParams) fTf).width) && A0g(view.getHeight(), i2, ((ViewGroup.LayoutParams) fTf).height)) ? false : true;
    }
}
