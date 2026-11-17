package com.bloks.stdlib.components.bkcomponentscollection;

import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC7607F5u;
import X.AbstractC8091FSx;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.C3cG;
import X.C3cH;
import X.C4158CoD;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C8097FTd;
import X.C8j4;
import X.FF8;
import X.FFL;
import X.FR6;
import X.FR7;
import X.FTN;
import X.FTR;
import X.FTV;
import X.FZS;
import X.G0U;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class StickyItemsLinearLayoutManager extends LinearLayoutManager {
    public int A00;
    public int A01;
    public FFL<?> A02;
    public int A03;
    public final List<Integer> A04;
    public final List<Integer> A05;
    public final List<FR7> A06;
    public final List<FR7> A07;
    public final Map<Integer, Integer> A08;
    public final Map<Integer, Integer> A09;
    public final Rect A0A;
    public final FR6 A0B;
    public final Map<Integer, View> A0C;

    public final class SavedState implements Parcelable {
        public static final C4158CoD CREATOR = new C4158CoD(0);
        public final int A00;
        public final int A01;
        public final Parcelable A02;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C7384Etj.A0Y(parcel, 0);
            parcel.writeParcelable(this.A02, i);
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A00);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public SavedState(Parcel parcel) {
            int i = Build.VERSION.SDK_INT;
            ClassLoader classLoader = SavedState.class.getClassLoader();
            this(i >= 33 ? (Parcelable) parcel.readParcelable(classLoader, SavedState.class) : parcel.readParcelable(classLoader), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState(Parcelable parcelable, int i, int i2) {
            this.A02 = parcelable;
            this.A01 = i;
            this.A00 = i2;
        }
    }

    private final void A03(View view) {
        A1A(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C7384Etj.A0Z(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = this.A0A;
        A1C(view, rect);
        if (((LinearLayoutManager) this).A01 == 1) {
            int iA0k = A0k() + marginLayoutParams.leftMargin + rect.left;
            view.layout(iA0k, 0, view.getMeasuredWidth() + iA0k, view.getMeasuredHeight());
        } else {
            int iA0m = A0m() + marginLayoutParams.topMargin + rect.top;
            view.layout(0, iA0m, view.getMeasuredWidth(), view.getMeasuredHeight() + iA0m);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x020b A[LOOP:4: B:103:0x01af->B:127:0x020b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ed A[EDGE_INSN: B:197:0x02ed->B:178:0x02ed BREAK  A[LOOP:4: B:103:0x01af->B:127:0x020b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0 A[PHI: r4 r5
  0x00a0: PHI (r4v4 int) = (r4v3 int), (r4v11 int) binds: [B:50:0x009e, B:34:0x006a] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r5v3 int) = (r5v2 int), (r5v7 int) binds: [B:50:0x009e, B:34:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A08(X.FTR r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.stdlib.components.bkcomponentscollection.StickyItemsLinearLayoutManager.A08(X.FTR, boolean):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.FTN
    public final View A0y(View view, FTR ftr, C8097FTd c8097FTd, int i) {
        AnonymousClass005.A11(view, ftr, c8097FTd, 0);
        A0B(this);
        View viewA0y = super.A0y(view, ftr, c8097FTd, i);
        A0A(this);
        return viewA0y;
    }

    @Override // X.FTN
    public final boolean A1U(View view, View view2, C8097FTd c8097FTd, RecyclerView recyclerView) {
        boolean zA1Z = AnonymousClass005.A1Z(recyclerView, c8097FTd, view);
        if (super.A1U(view, view2, c8097FTd, recyclerView)) {
            return zA1Z;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A1c(int i, int i2) {
        this.A01 = -1;
        this.A00 = Integer.MIN_VALUE;
        List<Integer> list = this.A05;
        int iA01 = A01(list, i);
        if (iA01 == -1 || AbstractC0885AGm.A0w(Integer.valueOf(i), list, list.size()) >= 0) {
            super.A1c(i, i2);
            return;
        }
        int i3 = i - 1;
        if (AbstractC0885AGm.A0w(Integer.valueOf(i3), list, list.size()) >= 0) {
            super.A1c(i3, i2);
            return;
        }
        FR7 fr7 = (FR7) AbstractC0878AGe.A0I(this.A07);
        if (fr7 != null) {
            Integer numValueOf = Integer.valueOf(fr7.A00);
            int iA0w = AbstractC0885AGm.A0w(numValueOf, list, list.size());
            if (iA0w < 0) {
                iA0w = -1;
            }
            if (iA01 == iA0w) {
                if (i2 == Integer.MIN_VALUE) {
                    i2 = 0;
                }
                int i4 = ((LinearLayoutManager) this).A01;
                View view = fr7.A01;
                int height = i4 == 1 ? view.getHeight() : view.getWidth();
                Number numberA0b = BV4.A0b(numValueOf, this.A09);
                super.A1c(i, i2 + height + (numberA0b != null ? numberA0b.intValue() : 0));
                return;
            }
        }
        this.A01 = i;
        this.A00 = i2;
        super.A1c(i, i2);
    }

    private final void A02() {
        int i = ((LinearLayoutManager) this).A01 == 1 ? ((FTN) this).A00 : ((FTN) this).A03;
        if (i != this.A03) {
            this.A03 = i;
            Iterator<Integer> it = this.A05.iterator();
            while (it.hasNext()) {
                int iA03 = C60Q.A03(it);
                BV4.A1H(Integer.valueOf(iA03), this.A09, FF8.A00(this.A02, iA03, i));
            }
            Iterator<Integer> it2 = this.A04.iterator();
            while (it2.hasNext()) {
                int iA032 = C60Q.A03(it2);
                BV4.A1H(Integer.valueOf(iA032), this.A08, FF8.A00(this.A02, iA032, i));
            }
        }
    }

    public static final void A04(AbstractC8091FSx abstractC8091FSx, StickyItemsLinearLayoutManager stickyItemsLinearLayoutManager) {
        FFL<?> ffl = stickyItemsLinearLayoutManager.A02;
        if (ffl != null) {
            ((AbstractC8091FSx) ffl).A01.unregisterObserver(stickyItemsLinearLayoutManager.A0B);
        }
        if (abstractC8091FSx instanceof FFL) {
            FFL<?> ffl2 = (FFL) abstractC8091FSx;
            stickyItemsLinearLayoutManager.A02 = ffl2;
            FR6 fr6 = stickyItemsLinearLayoutManager.A0B;
            ((AbstractC8091FSx) ffl2).A01.registerObserver(fr6);
            fr6.A01();
            return;
        }
        stickyItemsLinearLayoutManager.A02 = null;
        stickyItemsLinearLayoutManager.A05.clear();
        stickyItemsLinearLayoutManager.A09.clear();
        stickyItemsLinearLayoutManager.A04.clear();
        stickyItemsLinearLayoutManager.A08.clear();
    }

    private final void A05(FTR ftr, FR7 fr7) {
        View view = fr7.A01;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        float f = RecyclerView.A1J;
        FTV ftv = AbstractC7607F5u.A0m(view).A00;
        ftv.A00 &= -129;
        ftv.A01();
        ftv.A00 |= 4;
        A1B(view);
        if (ftr != null) {
            ftr.A09(view);
        }
    }

    public static final void A06(FTR ftr, StickyItemsLinearLayoutManager stickyItemsLinearLayoutManager) {
        stickyItemsLinearLayoutManager.A0E(FZS.A02(stickyItemsLinearLayoutManager, 20));
        List<FR7> list = stickyItemsLinearLayoutManager.A06;
        Iterator<FR7> it = list.iterator();
        while (it.hasNext()) {
            stickyItemsLinearLayoutManager.A05(ftr, it.next());
        }
        list.clear();
    }

    public static final void A07(FTR ftr, StickyItemsLinearLayoutManager stickyItemsLinearLayoutManager) {
        stickyItemsLinearLayoutManager.A0E(FZS.A02(stickyItemsLinearLayoutManager, 21));
        List<FR7> list = stickyItemsLinearLayoutManager.A07;
        Iterator<FR7> it = list.iterator();
        while (it.hasNext()) {
            stickyItemsLinearLayoutManager.A05(ftr, it.next());
        }
        list.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0113, code lost:
    
        if (A0G(r13, r0 != null ? r0.intValue() : 0) != false) goto L199;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A09(X.FTR r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.stdlib.components.bkcomponentscollection.StickyItemsLinearLayoutManager.A09(X.FTR, boolean):void");
    }

    public static final void A0A(StickyItemsLinearLayoutManager stickyItemsLinearLayoutManager) {
        Iterator<FR7> it = stickyItemsLinearLayoutManager.A07.iterator();
        while (it.hasNext()) {
            FTN.A0c(it.next().A01, stickyItemsLinearLayoutManager, -1);
        }
        Iterator<FR7> it2 = stickyItemsLinearLayoutManager.A06.iterator();
        while (it2.hasNext()) {
            FTN.A0c(it2.next().A01, stickyItemsLinearLayoutManager, -1);
        }
    }

    public static final void A0B(StickyItemsLinearLayoutManager stickyItemsLinearLayoutManager) {
        Iterator<FR7> it = stickyItemsLinearLayoutManager.A07.iterator();
        while (it.hasNext()) {
            int iA06 = ((FTN) stickyItemsLinearLayoutManager).A05.A06(it.next().A01);
            if (iA06 >= 0) {
                ((FTN) stickyItemsLinearLayoutManager).A05.A08(iA06);
            }
        }
        Iterator<FR7> it2 = stickyItemsLinearLayoutManager.A06.iterator();
        while (it2.hasNext()) {
            int iA062 = ((FTN) stickyItemsLinearLayoutManager).A05.A06(it2.next().A01);
            if (iA062 >= 0) {
                ((FTN) stickyItemsLinearLayoutManager).A05.A08(iA062);
            }
        }
    }

    private final void A0E(G0U<? super Integer, Boolean> g0u) {
        Iterator itA0n = AnonymousClass002.A0n(this.A0C);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            int iA0F = AnonymousClass001.A0F(entryA0l.getKey());
            View view = (View) entryA0l.getValue();
            if (AnonymousClass003.A1X(Integer.valueOf(iA0F), g0u)) {
                view.setVisibility(0);
                itA0n.remove();
            }
        }
    }

    private final boolean A0F(View view) {
        Iterator<FR7> it = this.A07.iterator();
        while (it.hasNext()) {
            if (it.next().A01 == view) {
                return true;
            }
        }
        Iterator<FR7> it2 = this.A06.iterator();
        while (it2.hasNext()) {
            if (it2.next().A01 == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0G(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r1 = r4.A01
            r3 = 0
            r2 = 1
            boolean r0 = r4.A08
            if (r1 != r2) goto L27
            if (r0 == 0) goto L1d
            int r0 = r5.getBottom()
            float r1 = (float) r0
            float r0 = r5.getTranslationY()
            float r1 = r1 - r0
            int r0 = r4.A00
        L16:
            int r0 = r0 - r6
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L4c
            return r2
        L1d:
            int r0 = r5.getTop()
            float r1 = (float) r0
            float r0 = r5.getTranslationY()
            goto L38
        L27:
            if (r0 != 0) goto L3f
            boolean r0 = r4.A1f()
            if (r0 != 0) goto L3f
            int r0 = r5.getLeft()
            float r1 = (float) r0
            float r0 = r5.getTranslationX()
        L38:
            float r1 = r1 + r0
            float r0 = (float) r6
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L4c
            return r2
        L3f:
            int r0 = r5.getRight()
            float r1 = (float) r0
            float r0 = r5.getTranslationX()
            float r1 = r1 - r0
            int r0 = r4.A03
            goto L16
        L4c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.stdlib.components.bkcomponentscollection.StickyItemsLinearLayoutManager.A0G(android.view.View, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0H(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r1 = r4.A01
            r3 = 0
            r2 = 1
            boolean r0 = r4.A08
            if (r1 != r2) goto L27
            if (r0 == 0) goto L1a
            int r0 = r5.getTop()
            float r1 = (float) r0
            float r0 = r5.getTranslationY()
        L13:
            float r1 = r1 + r0
            float r0 = (float) r6
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L4c
            return r2
        L1a:
            int r0 = r5.getBottom()
            float r1 = (float) r0
            float r0 = r5.getTranslationY()
            float r1 = r1 - r0
            int r0 = r4.A00
            goto L3b
        L27:
            if (r0 != 0) goto L42
            boolean r0 = r4.A1f()
            if (r0 != 0) goto L42
            int r0 = r5.getRight()
            float r1 = (float) r0
            float r0 = r5.getTranslationX()
            float r1 = r1 - r0
            int r0 = r4.A03
        L3b:
            int r0 = r0 - r6
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L4c
            return r2
        L42:
            int r0 = r5.getLeft()
            float r1 = (float) r0
            float r0 = r5.getTranslationX()
            goto L13
        L4c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.stdlib.components.bkcomponentscollection.StickyItemsLinearLayoutManager.A0H(android.view.View, int):boolean");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.FTN
    public final void A18(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.A18(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.A01 = savedState.A01;
        this.A00 = savedState.A00;
        super.A18(savedState.A02);
    }

    public StickyItemsLinearLayoutManager(int i) {
        super(i);
        this.A05 = C3cG.A0h();
        this.A09 = C3cG.A0j();
        this.A04 = C3cG.A0h();
        this.A08 = C3cG.A0j();
        this.A0B = new FR6(this);
        this.A07 = C3cG.A0h();
        this.A06 = C3cG.A0h();
        this.A0C = C3cG.A0j();
        this.A01 = -1;
        this.A0A = AbstractC7607F5u.A0X();
    }

    public static final int A00(List<Integer> list, int i) {
        int iA00 = C60O.A00(list);
        int i2 = 0;
        while (i2 <= iA00) {
            int i3 = (i2 + iA00) / 2;
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (C8j4.A0H(list, i4) >= i) {
                    iA00 = i4;
                }
            }
            if (C8j4.A0H(list, i3) >= i) {
                return i3;
            }
            i2 = i3 + 1;
        }
        return -1;
    }

    public static final int A01(List<Integer> list, int i) {
        int iA00 = C60O.A00(list);
        int i2 = 0;
        while (i2 <= iA00) {
            int i3 = (i2 + iA00) / 2;
            if (C8j4.A0H(list, i3) > i) {
                iA00 = i3 - 1;
            } else {
                if (i3 >= C60O.A00(list)) {
                    return i3;
                }
                i2 = i3 + 1;
                if (C8j4.A0H(list, i2) > i) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static final void A0C(List<Integer> list, Map<Integer, Integer> map, int i, int i2) {
        int size = list.size();
        if (i2 <= 0) {
            while (i < size) {
                Integer numRemove = map.remove(Integer.valueOf(C8j4.A0H(list, i)));
                list.set(i, Integer.valueOf(C8j4.A0H(list, i) + i2));
                if (numRemove != null) {
                    map.put(list.get(i), numRemove);
                }
                i++;
            }
            return;
        }
        int i3 = size - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            Integer numRemove2 = map.remove(Integer.valueOf(C8j4.A0H(list, i3)));
            list.set(i3, Integer.valueOf(C8j4.A0H(list, i3) + i2));
            if (numRemove2 != null) {
                map.put(list.get(i3), numRemove2);
            }
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0D(java.util.List<X.FR7> r10, X.G0U<? super java.lang.Integer, java.lang.Boolean> r11) {
        /*
            r9 = this;
            java.util.LinkedHashSet r4 = X.C3cG.A0k()
            java.util.Iterator r1 = r10.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r1.next()
            X.FR7 r0 = (X.FR7) r0
            int r0 = r0.A00
            X.C60Q.A1P(r4, r0)
            goto L8
        L1a:
            java.util.Map<java.lang.Integer, android.view.View> r7 = r9.A0C
            java.util.Iterator r3 = X.AnonymousClass002.A0n(r7)
        L20:
            boolean r0 = r3.hasNext()
            r6 = 0
            if (r0 == 0) goto L50
            java.util.Map$Entry r1 = X.C3cH.A0l(r3)
            java.lang.Object r0 = r1.getKey()
            int r0 = X.AnonymousClass001.A0F(r0)
            java.lang.Object r2 = r1.getValue()
            android.view.View r2 = (android.view.View) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.AnonymousClass003.A1X(r1, r11)
            if (r0 == 0) goto L20
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L20
            r2.setVisibility(r6)
            r3.remove()
            goto L20
        L50:
            java.util.Iterator r8 = r10.iterator()
        L54:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r8.next()
            X.FR7 r0 = (X.FR7) r0
            int r5 = r0.A00
            int r4 = r9.A0h()
            r3 = 0
        L67:
            r2 = 0
            if (r3 >= r4) goto L88
            android.view.View r2 = r9.A0x(r3)
            if (r2 == 0) goto La7
            boolean r0 = r9.A0F(r2)
            if (r0 != 0) goto La7
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof X.FTf
            if (r0 == 0) goto La7
            X.FTf r1 = (X.FTf) r1
            if (r1 == 0) goto La7
            int r0 = r1.A01()
            if (r0 != r5) goto La7
        L88:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r7.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L99
            if (r0 == r2) goto L9f
            r0.setVisibility(r6)
        L99:
            if (r2 != 0) goto L9f
            r7.remove(r1)
            goto L54
        L9f:
            r0 = 4
            r2.setVisibility(r0)
            r7.put(r1, r2)
            goto L54
        La7:
            int r3 = r3 + 1
            goto L67
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.stdlib.components.bkcomponentscollection.StickyItemsLinearLayoutManager.A0D(java.util.List, X.G0U):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.FTN
    public final int A0p(FTR ftr, C8097FTd c8097FTd, int i) {
        AnonymousClass003.A0x(ftr, c8097FTd);
        A0B(this);
        int iA0p = super.A0p(ftr, c8097FTd, i);
        A0A(this);
        if (iA0p != 0) {
            A02();
            A09(ftr, false);
            A08(ftr, false);
        }
        return iA0p;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.FTN
    public final int A0q(FTR ftr, C8097FTd c8097FTd, int i) {
        AnonymousClass003.A0x(ftr, c8097FTd);
        A0B(this);
        int iA0q = super.A0q(ftr, c8097FTd, i);
        A0A(this);
        if (iA0q != 0) {
            A02();
            A09(ftr, false);
            A08(ftr, false);
        }
        return iA0q;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.FTN
    public final Parcelable A0v() {
        return new SavedState(super.A0v(), this.A01, this.A00);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.FTN
    public final void A1J(FTR ftr, C8097FTd c8097FTd) {
        boolean zA1Y = C60P.A1Y(ftr, c8097FTd);
        A0B(this);
        super.A1J(ftr, c8097FTd);
        A0A(this);
        if (c8097FTd.A08) {
            return;
        }
        A02();
        A09(ftr, zA1Y);
        A08(ftr, zA1Y);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.FSN
    public final PointF A6k(int i) {
        A0B(this);
        PointF pointFA6k = super.A6k(i);
        A0A(this);
        return pointFA6k;
    }
}
