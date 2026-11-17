package androidx.recyclerview.widget;

import X.AbstractC7607F5u;
import X.AbstractC8085FSq;
import X.AnonymousClass002;
import X.BV7;
import X.C10638I0i;
import X.C2197BAc;
import X.C60O;
import X.C8097FTd;
import X.C8099FTi;
import X.C8104FTt;
import X.C8105FTu;
import X.C8j3;
import X.FSN;
import X.FTN;
import X.FTO;
import X.FTR;
import X.FTm;
import X.FU3;
import X.FUV;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes6.dex */
public class StaggeredGridLayoutManager extends FTN implements FSN {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public AbstractC8085FSq A07;
    public AbstractC8085FSq A08;
    public C8099FTi A09;
    public SavedState A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public int[] A0G;
    public FTO[] A0H;
    public BitSet A0I;
    public boolean A0J;
    public final Rect A0K;
    public final C8104FTt A0L;
    public final Runnable A0M;
    public final C8105FTu A0N;

    public final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10638I0i(23);
        public int A00;
        public int A01;
        public int A02;
        public int A03;
        public List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> A04;
        public boolean A05;
        public boolean A06;
        public boolean A07;
        public int[] A08;
        public int[] A09;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A03);
            parcel.writeInt(this.A02);
            if (this.A02 > 0) {
                parcel.writeIntArray(this.A09);
            }
            parcel.writeInt(this.A01);
            if (this.A01 > 0) {
                parcel.writeIntArray(this.A08);
            }
            parcel.writeInt(this.A07 ? 1 : 0);
            parcel.writeInt(this.A05 ? 1 : 0);
            parcel.writeInt(this.A06 ? 1 : 0);
            parcel.writeList(this.A04);
        }
    }

    public static int A08(C8097FTd c8097FTd, StaggeredGridLayoutManager staggeredGridLayoutManager) {
        if (staggeredGridLayoutManager.A0h() == 0) {
            return 0;
        }
        AbstractC8085FSq abstractC8085FSq = staggeredGridLayoutManager.A07;
        boolean z = staggeredGridLayoutManager.A0F;
        boolean z2 = !z;
        return FTm.A02(A0B(staggeredGridLayoutManager, z2), A0A(staggeredGridLayoutManager, z2), abstractC8085FSq, staggeredGridLayoutManager, c8097FTd, z, staggeredGridLayoutManager.A0E);
    }

    private final void A0E(int i) {
        A1O(null);
        if (i != this.A06) {
            this.A09.A02();
            A10();
            this.A06 = i;
            this.A0I = new BitSet(i);
            FTO[] ftoArr = new FTO[i];
            this.A0H = ftoArr;
            for (int i2 = 0; i2 < i; i2++) {
                ftoArr[i2] = new FTO(this, i2);
            }
            A10();
        }
    }

    public static final void A0I(C8097FTd c8097FTd, StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        int iA01;
        int i2;
        if (i > 0) {
            iA01 = staggeredGridLayoutManager.A02();
            i2 = 1;
        } else {
            iA01 = staggeredGridLayoutManager.A01();
            i2 = -1;
        }
        C8104FTt c8104FTt = staggeredGridLayoutManager.A0L;
        c8104FTt.A07 = true;
        staggeredGridLayoutManager.A0H(c8097FTd, iA01);
        staggeredGridLayoutManager.A0D(i2);
        c8104FTt.A01 = iA01 + c8104FTt.A03;
        c8104FTt.A00 = Math.abs(i);
    }

    @Override // X.FTN
    public final void A1J(FTR ftr, C8097FTd c8097FTd) {
        A0G(ftr, c8097FTd, true);
    }

    @Override // X.FTN
    public final void A1L(C8097FTd c8097FTd) {
        this.A03 = -1;
        this.A04 = Integer.MIN_VALUE;
        this.A0A = null;
        this.A0N.A00();
    }

    private int A03(int i) {
        int iA05 = this.A0H[0].A05(i);
        for (int i2 = 1; i2 < this.A06; i2++) {
            int iA052 = this.A0H[i2].A05(i);
            if (iA052 > iA05) {
                iA05 = iA052;
            }
        }
        return iA05;
    }

    private int A04(int i) {
        int iA06 = this.A0H[0].A06(i);
        for (int i2 = 1; i2 < this.A06; i2++) {
            int iA062 = this.A0H[i2].A06(i);
            if (iA062 < iA06) {
                iA06 = iA062;
            }
        }
        return iA06;
    }

    public static int A05(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A06(X.C8104FTt r24, X.FTR r25, X.C8097FTd r26) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A06(X.FTt, X.FTR, X.FTd):int");
    }

    public static final View A0A(StaggeredGridLayoutManager staggeredGridLayoutManager, boolean z) {
        AbstractC8085FSq abstractC8085FSq = staggeredGridLayoutManager.A07;
        int iA04 = abstractC8085FSq.A04();
        int iA02 = abstractC8085FSq.A02();
        View view = null;
        for (int iA0h = staggeredGridLayoutManager.A0h() - 1; iA0h >= 0; iA0h--) {
            View viewA0x = staggeredGridLayoutManager.A0x(iA0h);
            int iA09 = abstractC8085FSq.A09(viewA0x);
            int iA06 = abstractC8085FSq.A06(viewA0x);
            if (iA06 > iA04 && iA09 < iA02) {
                if (iA06 <= iA02 || !z) {
                    return viewA0x;
                }
                if (view == null) {
                    view = viewA0x;
                }
            }
        }
        return view;
    }

    public static final View A0B(StaggeredGridLayoutManager staggeredGridLayoutManager, boolean z) {
        AbstractC8085FSq abstractC8085FSq = staggeredGridLayoutManager.A07;
        int iA04 = abstractC8085FSq.A04();
        int iA02 = abstractC8085FSq.A02();
        int iA0h = staggeredGridLayoutManager.A0h();
        View view = null;
        for (int i = 0; i < iA0h; i++) {
            View viewA0x = staggeredGridLayoutManager.A0x(i);
            int iA09 = abstractC8085FSq.A09(viewA0x);
            if (abstractC8085FSq.A06(viewA0x) > iA04 && iA09 < iA02) {
                if (iA09 >= iA04 || !z) {
                    return viewA0x;
                }
                if (view == null) {
                    view = viewA0x;
                }
            }
        }
        return view;
    }

    private void A0C() {
        this.A0E = (this.A02 == 1 || !BV7.A1Q(super.A07.getLayoutDirection())) ? this.A0D : !this.A0D;
    }

    private void A0D(int i) {
        C8104FTt c8104FTt = this.A0L;
        c8104FTt.A04 = i;
        c8104FTt.A03 = this.A0E != AnonymousClass002.A1Q(i, -1) ? -1 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if (r0 == (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0F(X.C8104FTt r8, X.FTR r9) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0F(X.FTt, X.FTR):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0G(X.FTR r12, X.C8097FTd r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0G(X.FTR, X.FTd, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0H(X.C8097FTd r8, int r9) {
        /*
            r7 = this;
            X.FTt r4 = r7.A0L
            r3 = 0
            r4.A00 = r3
            r4.A01 = r9
            X.FTa r0 = r7.A06
            if (r0 == 0) goto L10
            boolean r1 = r0.A05
            r0 = 1
            if (r1 != 0) goto L11
        L10:
            r0 = 0
        L11:
            r6 = 1
            if (r0 == 0) goto L64
            int r1 = r8.A06
            r0 = -1
            if (r1 == r0) goto L64
            boolean r2 = r7.A0E
            boolean r1 = X.C8j3.A1T(r1, r9)
            X.FSq r0 = r7.A07
            int r5 = r0.A05()
            if (r2 == r1) goto L65
            r2 = r5
            r5 = 0
        L29:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            if (r0 == 0) goto L32
            boolean r1 = r0.A0R
            r0 = 1
            if (r1 != 0) goto L33
        L32:
            r0 = 0
        L33:
            X.FSq r1 = r7.A07
            if (r0 == 0) goto L59
            int r0 = r1.A04()
            int r0 = r0 - r2
            r4.A05 = r0
            int r0 = r1.A02()
            int r0 = r0 + r5
            r4.A02 = r0
        L45:
            r4.A08 = r3
            r4.A07 = r6
            int r0 = r1.A03()
            if (r0 != 0) goto L56
            int r0 = r1.A01()
            if (r0 != 0) goto L56
            r3 = 1
        L56:
            r4.A06 = r3
            return
        L59:
            int r0 = r1.A01()
            int r0 = r0 + r5
            r4.A02 = r0
            int r0 = -r2
            r4.A05 = r0
            goto L45
        L64:
            r5 = 0
        L65:
            r2 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0H(X.FTd, int):void");
    }

    private void A0J(FTO fto, int i, int i2) {
        int i3 = fto.A02;
        if (i == -1) {
            int i4 = fto.A01;
            if (i4 == Integer.MIN_VALUE) {
                FTO.A02(fto);
                i4 = fto.A01;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = fto.A00;
            if (i5 == Integer.MIN_VALUE) {
                FTO.A01(fto);
                i5 = fto.A00;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.A0I.set(fto.A04, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0K(androidx.recyclerview.widget.StaggeredGridLayoutManager r7, int r8, int r9, int r10) {
        /*
            boolean r0 = r7.A0E
            if (r0 == 0) goto L47
            int r6 = r7.A02()
        L8:
            r5 = 8
            if (r10 != r5) goto L43
            int r4 = r9 + 1
            if (r8 < r9) goto L45
            int r4 = r8 + 1
            r3 = r9
        L13:
            X.FTi r2 = r7.A09
            r2.A04(r3)
            r1 = 1
            if (r10 == r1) goto L3f
            r0 = 2
            if (r10 == r0) goto L3b
            if (r10 != r5) goto L26
            r2.A06(r8, r1)
            r2.A05(r9, r1)
        L26:
            if (r4 <= r6) goto L35
            boolean r0 = r7.A0E
            if (r0 == 0) goto L36
            int r0 = r7.A01()
        L30:
            if (r3 > r0) goto L35
            r7.A10()
        L35:
            return
        L36:
            int r0 = r7.A02()
            goto L30
        L3b:
            r2.A06(r8, r9)
            goto L26
        L3f:
            r2.A05(r8, r9)
            goto L26
        L43:
            int r4 = r8 + r9
        L45:
            r3 = r8
            goto L13
        L47:
            int r6 = r7.A01()
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0K(androidx.recyclerview.widget.StaggeredGridLayoutManager, int, int, int):void");
    }

    private boolean A0L(int i) {
        if (this.A02 != 0) {
            if (AnonymousClass002.A1Q(AnonymousClass002.A1Q(i, -1) ? 1 : 0, this.A0E ? 1 : 0) == BV7.A1Q(super.A07.getLayoutDirection())) {
                return true;
            }
        } else if (AnonymousClass002.A1Q(i, -1) != this.A0E) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.Parcelable, androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    @Override // X.FTN
    public final Parcelable A0v() {
        ?? obj;
        int iA06;
        int iA04;
        int[] iArr;
        SavedState savedState = this.A0A;
        if (savedState != null) {
            obj = new SavedState();
            obj.A02 = savedState.A02;
            obj.A00 = savedState.A00;
            obj.A03 = savedState.A03;
            obj.A09 = savedState.A09;
            obj.A01 = savedState.A01;
            obj.A08 = savedState.A08;
            obj.A07 = savedState.A07;
            obj.A05 = savedState.A05;
            obj.A06 = savedState.A06;
            obj.A04 = savedState.A04;
        } else {
            obj = new Object();
            obj.A07 = this.A0D;
            obj.A05 = this.A0B;
            obj.A06 = this.A0C;
            C8099FTi c8099FTi = this.A09;
            if (c8099FTi == null || (iArr = c8099FTi.A01) == null) {
                obj.A01 = 0;
            } else {
                obj.A08 = iArr;
                obj.A01 = iArr.length;
                obj.A04 = c8099FTi.A00;
            }
            if (A0h() <= 0) {
                obj.A00 = -1;
                obj.A03 = -1;
                obj.A02 = 0;
                return obj;
            }
            obj.A00 = this.A0B ? A02() : A01();
            View viewA0A = this.A0E ? A0A(this, true) : A0B(this, true);
            obj.A03 = viewA0A == null ? -1 : FTN.A0Y(viewA0A);
            int i = this.A06;
            obj.A02 = i;
            obj.A09 = new int[i];
            for (int i2 = 0; i2 < this.A06; i2++) {
                boolean z = this.A0B;
                FTO fto = this.A0H[i2];
                if (z) {
                    iA06 = fto.A05(Integer.MIN_VALUE);
                    if (iA06 != Integer.MIN_VALUE) {
                        iA04 = this.A07.A02();
                        iA06 -= iA04;
                    }
                } else {
                    iA06 = fto.A06(Integer.MIN_VALUE);
                    if (iA06 != Integer.MIN_VALUE) {
                        iA04 = this.A07.A04();
                        iA06 -= iA04;
                    }
                }
                obj.A09[i2] = iA06;
            }
        }
        return obj;
    }

    @Override // X.FTN
    public final void A18(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.A0A = savedState;
            if (this.A03 != -1) {
                savedState.A09 = null;
                savedState.A02 = 0;
                savedState.A00 = -1;
                savedState.A03 = -1;
                savedState.A09 = null;
                savedState.A02 = 0;
                savedState.A01 = 0;
                savedState.A08 = null;
                savedState.A04 = null;
            }
            A10();
        }
    }

    @Override // X.FTN
    public final void A1O(String str) {
        if (this.A0A == null) {
            super.A1O(str);
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.A06 = -1;
        this.A0D = false;
        this.A0E = false;
        this.A03 = -1;
        this.A04 = Integer.MIN_VALUE;
        this.A09 = new C8099FTi();
        this.A01 = 2;
        this.A0K = AbstractC7607F5u.A0X();
        this.A0N = new C8105FTu(this);
        this.A0J = false;
        this.A0F = true;
        this.A0M = new FU3(this);
        this.A02 = i2;
        A0E(i);
        this.A0L = new C8104FTt();
        this.A07 = AbstractC8085FSq.A00(this, this.A02);
        this.A08 = AbstractC8085FSq.A00(this, 1 - this.A02);
    }

    private final int A01() {
        if (A0h() != 0) {
            return FTN.A0Z(this, 0);
        }
        return 0;
    }

    private final int A02() {
        int iA0h = A0h();
        if (iA0h == 0) {
            return 0;
        }
        return FTN.A0Z(this, iA0h - 1);
    }

    private final int A07(FTR ftr, C8097FTd c8097FTd, int i) {
        if (A0h() == 0 || i == 0) {
            return 0;
        }
        A0I(c8097FTd, this, i);
        C8104FTt c8104FTt = this.A0L;
        int iA06 = A06(c8104FTt, ftr, c8097FTd);
        if (c8104FTt.A00 >= iA06) {
            i = iA06;
            if (i < 0) {
                i = -iA06;
            }
        }
        this.A07.A0C(-i);
        this.A0B = this.A0E;
        c8104FTt.A00 = 0;
        A0F(c8104FTt, ftr);
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.view.View A09() {
        /*
            r11 = this;
            int r6 = r11.A0h()
            int r5 = r6 + (-1)
            int r2 = r11.A06
            java.util.BitSet r4 = new java.util.BitSet
            r4.<init>(r2)
            r0 = 0
            r1 = 1
            r4.set(r0, r2, r1)
            int r0 = r11.A02
            r10 = -1
            if (r0 != r1) goto L24
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            int r0 = r0.getLayoutDirection()
            boolean r0 = X.BV7.A1Q(r0)
            r9 = 1
            if (r0 != 0) goto L25
        L24:
            r9 = -1
        L25:
            boolean r0 = r11.A0E
            if (r0 == 0) goto Ld8
            r6 = -1
        L2a:
            if (r5 >= r6) goto L2d
            r10 = 1
        L2d:
            if (r5 == r6) goto Ldb
            android.view.View r3 = r11.A0x(r5)
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            X.FFj r7 = (X.C7803FFj) r7
            X.FTO r0 = r7.A00
            int r0 = r0.A04
            boolean r0 = r4.get(r0)
            if (r0 == 0) goto L91
            X.FTO r8 = r7.A00
            boolean r0 = r11.A0E
            r2 = 0
            if (r0 == 0) goto L74
            int r1 = r8.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L55
            X.FTO.A01(r8)
            int r1 = r8.A00
        L55:
            X.FSq r0 = r11.A07
            int r0 = r0.A02()
            if (r1 >= r0) goto L8a
            java.util.ArrayList<android.view.View> r0 = r8.A03
            int r2 = X.C8j3.A0K(r0)
        L63:
            android.view.View r0 = X.AbstractC7607F5u.A0d(r0, r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.FFj r0 = (X.C7803FFj) r0
            boolean r0 = r0.A01
            r0 = r0 ^ 1
            if (r0 == 0) goto L8a
            return r3
        L74:
            int r1 = r8.A01
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L7f
            X.FTO.A02(r8)
            int r1 = r8.A01
        L7f:
            X.FSq r0 = r11.A07
            int r0 = r0.A04()
            if (r1 <= r0) goto L8a
            java.util.ArrayList<android.view.View> r0 = r8.A03
            goto L63
        L8a:
            X.FTO r0 = r7.A00
            int r0 = r0.A04
            r4.clear(r0)
        L91:
            boolean r0 = r7.A01
            if (r0 != 0) goto Ld5
            int r0 = r5 + r10
            if (r0 == r6) goto Ld5
            android.view.View r2 = r11.A0x(r0)
            boolean r1 = r11.A0E
            X.FSq r0 = r11.A07
            if (r1 == 0) goto Lae
            int r1 = r0.A06(r3)
            int r0 = r0.A06(r2)
            if (r1 >= r0) goto Lb9
            return r3
        Lae:
            int r1 = r0.A09(r3)
            int r0 = r0.A09(r2)
            if (r1 <= r0) goto Lb9
            return r3
        Lb9:
            if (r1 != r0) goto Ld5
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            X.FFj r2 = (X.C7803FFj) r2
            X.FTO r0 = r7.A00
            int r1 = r0.A04
            X.FTO r0 = r2.A00
            int r0 = r0.A04
            int r1 = r1 - r0
            boolean r1 = X.C8j3.A1R(r1)
            boolean r0 = X.C8j3.A1R(r9)
            if (r1 == r0) goto Ld5
            return r3
        Ld5:
            int r5 = r5 + r10
            goto L2d
        Ld8:
            r5 = 0
            goto L2a
        Ldb:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A09():android.view.View");
    }

    @Override // X.FTN
    public final int A0p(FTR ftr, C8097FTd c8097FTd, int i) {
        return A07(ftr, c8097FTd, i);
    }

    @Override // X.FTN
    public final int A0q(FTR ftr, C8097FTd c8097FTd, int i) {
        return A07(ftr, c8097FTd, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        if (r11.A02 == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ae, code lost:
    
        if (r11.A02 == 1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    @Override // X.FTN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View A0y(android.view.View r12, X.FTR r13, X.C8097FTd r14, int r15) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0y(android.view.View, X.FTR, X.FTd, int):android.view.View");
    }

    @Override // X.FTN
    public final void A11(int i) {
        super.A11(i);
        for (int i2 = 0; i2 < this.A06; i2++) {
            FTO fto = this.A0H[i2];
            int i3 = fto.A01;
            if (i3 != Integer.MIN_VALUE) {
                fto.A01 = i3 + i;
            }
            int i4 = fto.A00;
            if (i4 != Integer.MIN_VALUE) {
                fto.A00 = i4 + i;
            }
        }
    }

    @Override // X.FTN
    public final void A12(int i) {
        super.A12(i);
        for (int i2 = 0; i2 < this.A06; i2++) {
            FTO fto = this.A0H[i2];
            int i3 = fto.A01;
            if (i3 != Integer.MIN_VALUE) {
                fto.A01 = i3 + i;
            }
            int i4 = fto.A00;
            if (i4 != Integer.MIN_VALUE) {
                fto.A00 = i4 + i;
            }
        }
    }

    @Override // X.FTN
    public final void A16(Rect rect, int i, int i2) {
        int iA0W;
        int iA0W2;
        int iA0k = A0k() + A0l();
        int iA0m = A0m() + A0j();
        if (this.A02 == 1) {
            iA0W2 = FTN.A0W(i2, rect.height() + iA0m, super.A07.getMinimumHeight());
            iA0W = FTN.A0W(i, (this.A05 * this.A06) + iA0k, super.A07.getMinimumWidth());
        } else {
            iA0W = FTN.A0W(i, rect.width() + iA0k, super.A07.getMinimumWidth());
            iA0W2 = FTN.A0W(i2, (this.A05 * this.A06) + iA0m, super.A07.getMinimumHeight());
        }
        super.A07.setMeasuredDimension(iA0W, iA0W2);
    }

    @Override // X.FTN
    public final void A1E(AccessibilityEvent accessibilityEvent) {
        super.A1E(accessibilityEvent);
        if (A0h() > 0) {
            View viewA0B = A0B(this, false);
            View viewA0A = A0A(this, false);
            if (viewA0B == null || viewA0A == null) {
                return;
            }
            int iA0Y = FTN.A0Y(viewA0B);
            int iA0Y2 = FTN.A0Y(viewA0A);
            if (iA0Y < iA0Y2) {
                accessibilityEvent.setFromIndex(iA0Y);
                accessibilityEvent.setToIndex(iA0Y2);
            } else {
                accessibilityEvent.setFromIndex(iA0Y2);
                accessibilityEvent.setToIndex(iA0Y);
            }
        }
    }

    @Override // X.FTN
    public final void A1F(C2197BAc c2197BAc, FTR ftr, C8097FTd c8097FTd) {
        super.A1F(c2197BAc, ftr, c8097FTd);
        c2197BAc.A02.setClassName("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final boolean A1W() {
        int iA01;
        int iA02;
        int i;
        if (A0h() != 0 && this.A01 != 0 && super.A0A) {
            if (this.A0E) {
                iA01 = A02();
                iA02 = A01();
            } else {
                iA01 = A01();
                iA02 = A02();
            }
            if (iA01 == 0 && A09() != null) {
                this.A09.A02();
            } else if (this.A0J) {
                int i2 = this.A0E ? -1 : 1;
                C8099FTi c8099FTi = this.A09;
                int i3 = iA02 + 1;
                List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> list = c8099FTi.A00;
                if (list != null) {
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = c8099FTi.A00.get(i4);
                        int i5 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01;
                        if (i5 >= i3) {
                            break;
                        }
                        if (i5 >= iA01 && (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A00 == i2 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A02)) {
                            int i6 = -i2;
                            List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> list2 = c8099FTi.A00;
                            if (list2 != null) {
                                int size2 = list2.size();
                                for (int i7 = 0; i7 < size2; i7++) {
                                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = c8099FTi.A00.get(i7);
                                    int i8 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.A01;
                                    if (i8 >= i5) {
                                        break;
                                    }
                                    if (i8 >= iA01 && (i6 == 0 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.A00 == i6 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.A02)) {
                                        i = i8 + 1;
                                        break;
                                    }
                                }
                                i = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01;
                                c8099FTi.A03(i);
                            } else {
                                i = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.A01;
                                c8099FTi.A03(i);
                            }
                        }
                    }
                }
                this.A0J = false;
                c8099FTi.A03(i3);
            }
            super.A0C = true;
            A10();
            return true;
        }
        return false;
    }

    @Override // X.FSN
    public final PointF A6k(int i) {
        int i2 = (A0h() != 0 ? C8j3.A1T(i, A01()) == this.A0E : this.A0E) ? 1 : -1;
        PointF pointF = new PointF();
        if (this.A02 == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A06 = -1;
        this.A0D = false;
        this.A0E = false;
        this.A03 = -1;
        this.A04 = Integer.MIN_VALUE;
        this.A09 = new C8099FTi();
        this.A01 = 2;
        this.A0K = AbstractC7607F5u.A0X();
        this.A0N = new C8105FTu(this);
        this.A0J = false;
        this.A0F = true;
        this.A0M = new FU3(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FUV.A00, i, i2);
        int i3 = typedArrayObtainStyledAttributes.getInt(0, 1);
        int i4 = typedArrayObtainStyledAttributes.getInt(10, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(9, false);
        typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        if (i3 != 0 && i3 != 1) {
            throw C60O.A0i("invalid orientation.");
        }
        A1O(null);
        if (i3 != this.A02) {
            this.A02 = i3;
            AbstractC8085FSq abstractC8085FSq = this.A07;
            this.A07 = this.A08;
            this.A08 = abstractC8085FSq;
            A10();
        }
        A0E(i4);
        A1O(null);
        SavedState savedState = this.A0A;
        if (savedState != null && savedState.A07 != z) {
            savedState.A07 = z;
        }
        this.A0D = z;
        A10();
        this.A0L = new C8104FTt();
        this.A07 = AbstractC8085FSq.A00(this, this.A02);
        this.A08 = AbstractC8085FSq.A00(this, 1 - this.A02);
    }
}
