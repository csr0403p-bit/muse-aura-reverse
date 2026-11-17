package androidx.recyclerview.widget;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC8089FSv;
import X.AbstractC8091FSx;
import X.BV5;
import X.C2197BAc;
import X.C2203BAi;
import X.C60O;
import X.C60Q;
import X.C7945FMa;
import X.C8097FTd;
import X.C8j3;
import X.FGI;
import X.FTN;
import X.FTR;
import X.FTf;
import X.FUH;
import X.FUV;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set<Integer> A0B = Collections.unmodifiableSet(BV5.A0v(new Integer[]{17, 66, 33, 130}));
    public int A00;
    public int A01;
    public int A02;
    public AbstractC8089FSv A03;
    public boolean A04;
    public int[] A05;
    public View[] A06;
    public int A07;
    public final Rect A08;
    public final SparseIntArray A09;
    public final SparseIntArray A0A;

    private int A00(int i) {
        int i2 = ((LinearLayoutManager) this).A01;
        RecyclerView recyclerView = ((FTN) this).A07;
        return i2 == 0 ? A02(this, recyclerView.A11, recyclerView.A13, i) : A03(this, recyclerView.A11, recyclerView.A13, i);
    }

    private int A01(int i) {
        int i2 = ((LinearLayoutManager) this).A01;
        RecyclerView recyclerView = ((FTN) this).A07;
        return i2 == 1 ? A02(this, recyclerView.A11, recyclerView.A13, i) : A03(this, recyclerView.A11, recyclerView.A13, i);
    }

    public static int A02(GridLayoutManager gridLayoutManager, FTR ftr, C8097FTd c8097FTd, int i) {
        int i2;
        int i3;
        int i4;
        int iA00;
        if (c8097FTd.A08) {
            int iA06 = ftr.A06(i);
            if (iA06 == -1) {
                Log.w("GridLayoutManager", FGI.A0H("Cannot find span size for pre layout position. ", i));
                return 0;
            }
            AbstractC8089FSv abstractC8089FSv = gridLayoutManager.A03;
            i2 = gridLayoutManager.A02;
            i3 = 0;
            i4 = 0;
            iA00 = abstractC8089FSv.A00(iA06);
            for (int i5 = 0; i5 < iA06; i5++) {
                int iA002 = abstractC8089FSv.A00(i5);
                i4 += iA002;
                if (i4 == i2) {
                    i3++;
                    i4 = 0;
                } else if (i4 > i2) {
                    i3++;
                    i4 = iA002;
                }
            }
        } else {
            AbstractC8089FSv abstractC8089FSv2 = gridLayoutManager.A03;
            i2 = gridLayoutManager.A02;
            i3 = 0;
            i4 = 0;
            iA00 = abstractC8089FSv2.A00(i);
            for (int i6 = 0; i6 < i; i6++) {
                int iA003 = abstractC8089FSv2.A00(i6);
                i4 += iA003;
                if (i4 == i2) {
                    i3++;
                    i4 = 0;
                } else if (i4 > i2) {
                    i3++;
                    i4 = iA003;
                }
            }
        }
        return i4 + iA00 > i2 ? i3 + 1 : i3;
    }

    public static int A03(GridLayoutManager gridLayoutManager, FTR ftr, C8097FTd c8097FTd, int i) {
        if (!c8097FTd.A08) {
            return gridLayoutManager.A03.A01(i, gridLayoutManager.A02);
        }
        int i2 = gridLayoutManager.A09.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iA06 = ftr.A06(i);
        if (iA06 != -1) {
            return gridLayoutManager.A03.A01(iA06, gridLayoutManager.A02);
        }
        Log.w("GridLayoutManager", FGI.A0H("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i));
        return 0;
    }

    public static int A04(GridLayoutManager gridLayoutManager, FTR ftr, C8097FTd c8097FTd, int i) {
        if (!c8097FTd.A08) {
            return gridLayoutManager.A03.A00(i);
        }
        int i2 = gridLayoutManager.A0A.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iA06 = ftr.A06(i);
        if (iA06 != -1) {
            return gridLayoutManager.A03.A00(iA06);
        }
        Log.w("GridLayoutManager", FGI.A0H("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i));
        return 1;
    }

    private final void A06(int i) {
        if (i != this.A02) {
            this.A04 = true;
            if (i < 1) {
                throw BV5.A0Q("Span count should be at least 1. Provided ", i);
            }
            this.A02 = i;
            this.A03.A01.clear();
            A10();
        }
    }

    public static void A08(GridLayoutManager gridLayoutManager) {
        View[] viewArr = gridLayoutManager.A06;
        if (viewArr == null || viewArr.length != gridLayoutManager.A02) {
            gridLayoutManager.A06 = new View[gridLayoutManager.A02];
        }
    }

    public static void A09(GridLayoutManager gridLayoutManager) {
        int iA0j;
        int iA0m;
        if (((LinearLayoutManager) gridLayoutManager).A01 == 1) {
            iA0j = ((FTN) gridLayoutManager).A03 - gridLayoutManager.A0l();
            iA0m = gridLayoutManager.A0k();
        } else {
            iA0j = ((FTN) gridLayoutManager).A00 - gridLayoutManager.A0j();
            iA0m = gridLayoutManager.A0m();
        }
        A0A(gridLayoutManager, iA0j - iA0m);
    }

    public static void A0A(GridLayoutManager gridLayoutManager, int i) {
        int i2;
        int length;
        int[] iArr = gridLayoutManager.A05;
        int i3 = gridLayoutManager.A02;
        if (iArr == null || (length = iArr.length) != i3 + 1 || iArr[length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        gridLayoutManager.A05 = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c7 A[SYNTHETIC] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.FTN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View A0y(android.view.View r22, X.FTR r23, X.C8097FTd r24, int r25) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A0y(android.view.View, X.FTR, X.FTd, int):android.view.View");
    }

    @Override // X.FTN
    public final void A16(Rect rect, int i, int i2) {
        int iA0W;
        int iA0W2;
        if (this.A05 == null) {
            super.A16(rect, i, i2);
        }
        int iA0k = A0k() + A0l();
        int iA0m = A0m() + A0j();
        if (((LinearLayoutManager) this).A01 == 1) {
            iA0W2 = FTN.A0W(i2, rect.height() + iA0m, ((FTN) this).A07.getMinimumHeight());
            int[] iArr = this.A05;
            iA0W = FTN.A0W(i, iArr[iArr.length - 1] + iA0k, ((FTN) this).A07.getMinimumWidth());
        } else {
            iA0W = FTN.A0W(i, rect.width() + iA0k, ((FTN) this).A07.getMinimumWidth());
            int[] iArr2 = this.A05;
            iA0W2 = FTN.A0W(i2, iArr2[iArr2.length - 1] + iA0m, ((FTN) this).A07.getMinimumHeight());
        }
        ((FTN) this).A07.setMeasuredDimension(iA0W, iA0W2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.FTN
    public final void A1J(FTR ftr, C8097FTd c8097FTd) {
        if (c8097FTd.A08) {
            int iA0h = A0h();
            for (int i = 0; i < iA0h; i++) {
                FUH fuh = (FUH) A0x(i).getLayoutParams();
                int iA0E = AbstractC7609F5w.A0E(((FTf) fuh).A00);
                this.A0A.put(iA0E, fuh.A01);
                this.A09.put(iA0E, fuh.A00);
            }
        }
        super.A1J(ftr, c8097FTd);
        this.A0A.clear();
        this.A09.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x015d, code lost:
    
        r13.A01 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x015f, code lost:
    
        r13.A00 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0161, code lost:
    
        if (r8 == (-1)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0231, code lost:
    
        if (r8 == (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0125, code lost:
    
        A13(r8);
        r13.A07 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012a, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x027f  */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.AbstractCollection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.AbstractCollection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.util.AbstractCollection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.util.AbstractCollection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.util.AbstractCollection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.util.AbstractCollection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.AbstractCollection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.AbstractCollection, java.util.HashSet] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.FTN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A1S(int r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A1S(int, android.os.Bundle):boolean");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A1e(boolean z) {
        if (z) {
            throw C8j3.A18("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.A1e(false);
    }

    public GridLayoutManager(int i, int i2) {
        super(i2);
        this.A04 = false;
        this.A02 = -1;
        this.A0A = new SparseIntArray();
        this.A09 = new SparseIntArray();
        this.A03 = new C7945FMa();
        this.A08 = AbstractC7607F5u.A0X();
        this.A07 = -1;
        this.A01 = -1;
        this.A00 = -1;
        A06(i);
    }

    private Set<Integer> A05(int i, int i2) {
        HashSet hashSetA13 = C60O.A13();
        RecyclerView recyclerView = ((FTN) this).A07;
        int iA04 = A04(this, recyclerView.A11, recyclerView.A13, i2);
        for (int i3 = i; i3 < i + iA04; i3++) {
            C60Q.A1P(hashSetA13, i3);
        }
        return hashSetA13;
    }

    public static void A07(View view, GridLayoutManager gridLayoutManager, int i, boolean z) {
        int i2;
        int iA0X;
        int iA0X2;
        FUH fuh = (FUH) view.getLayoutParams();
        Rect rect = fuh.A03;
        int iA0C = AbstractC7609F5w.A0C(fuh, rect.top, rect.bottom);
        int iA0A = AbstractC7608F5v.A0A(fuh, rect.left + rect.right);
        int i3 = fuh.A00;
        int i4 = fuh.A01;
        if (((LinearLayoutManager) gridLayoutManager).A01 == 1 && gridLayoutManager.A1f()) {
            int[] iArr = gridLayoutManager.A05;
            int i5 = gridLayoutManager.A02 - i3;
            i2 = iArr[i5] - iArr[i5 - i4];
        } else {
            int[] iArr2 = gridLayoutManager.A05;
            i2 = iArr2[i4 + i3] - iArr2[i3];
        }
        if (((LinearLayoutManager) gridLayoutManager).A01 == 1) {
            iA0X2 = FTN.A0X(i2, i, iA0A, ((ViewGroup.LayoutParams) fuh).width, false);
            iA0X = FTN.A0X(((LinearLayoutManager) gridLayoutManager).A06.A05(), ((FTN) gridLayoutManager).A01, iA0C, ((ViewGroup.LayoutParams) fuh).height, true);
        } else {
            iA0X = FTN.A0X(i2, i, iA0C, ((ViewGroup.LayoutParams) fuh).height, false);
            iA0X2 = FTN.A0X(((LinearLayoutManager) gridLayoutManager).A06.A05(), ((FTN) gridLayoutManager).A04, iA0A, ((ViewGroup.LayoutParams) fuh).width, true);
        }
        FTf fTfA0m = AbstractC7607F5u.A0m(view);
        if (z) {
            if (FTN.A0g(view.getMeasuredWidth(), iA0X2, ((ViewGroup.LayoutParams) fTfA0m).width) && FTN.A0g(view.getMeasuredHeight(), iA0X, ((ViewGroup.LayoutParams) fTfA0m).height)) {
                return;
            }
        } else if (!gridLayoutManager.A1V(view, fTfA0m, iA0X2, iA0X)) {
            return;
        }
        view.measure(iA0X2, iA0X);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.FTN
    public final int A0p(FTR ftr, C8097FTd c8097FTd, int i) {
        A09(this);
        A08(this);
        return super.A0p(ftr, c8097FTd, i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.FTN
    public final int A0q(FTR ftr, C8097FTd c8097FTd, int i) {
        A09(this);
        A08(this);
        return super.A0q(ftr, c8097FTd, i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.FTN
    public final void A1F(C2197BAc c2197BAc, FTR ftr, C8097FTd c8097FTd) {
        super.A1F(c2197BAc, ftr, c8097FTd);
        c2197BAc.A02.setClassName(GridView.class.getName());
        AbstractC8091FSx abstractC8091FSx = ((FTN) this).A07.A0F;
        if (abstractC8091FSx == null || abstractC8091FSx.A03() <= 1) {
            return;
        }
        c2197BAc.A05(C2203BAi.A0a);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.FTN
    public final void A1L(C8097FTd c8097FTd) {
        View viewA0w;
        super.A1L(c8097FTd);
        this.A04 = false;
        int i = this.A07;
        if (i == -1 || (viewA0w = A0w(i)) == null) {
            return;
        }
        viewA0w.sendAccessibilityEvent(67108864);
        this.A07 = -1;
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A04 = false;
        this.A02 = -1;
        this.A0A = new SparseIntArray();
        this.A09 = new SparseIntArray();
        this.A03 = new C7945FMa();
        this.A08 = AbstractC7607F5u.A0X();
        this.A07 = -1;
        this.A01 = -1;
        this.A00 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FUV.A00, i, i2);
        typedArrayObtainStyledAttributes.getInt(0, 1);
        int i3 = typedArrayObtainStyledAttributes.getInt(10, 1);
        typedArrayObtainStyledAttributes.getBoolean(9, false);
        typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        A06(i3);
    }
}
