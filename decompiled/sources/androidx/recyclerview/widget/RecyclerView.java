package androidx.recyclerview.widget;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AbstractC8060FRo;
import X.AbstractC8091FSx;
import X.AbstractC8094FTa;
import X.AbstractC8109FTy;
import X.AbstractC8110FUa;
import X.AbstractC8113FUd;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BDV;
import X.BDX;
import X.BDY;
import X.BT4;
import X.BV4;
import X.BV5;
import X.C3cG;
import X.C60O;
import X.C6979Edd;
import X.C7384Etj;
import X.C7782FEm;
import X.C7803FFj;
import X.C8058FRm;
import X.C8095FTb;
import X.C8096FTc;
import X.C8097FTd;
import X.C8098FTe;
import X.C8102FTp;
import X.C8103FTr;
import X.C8207FYz;
import X.C8j3;
import X.DQZ;
import X.FDW;
import X.FF9;
import X.FFA;
import X.FFB;
import X.FFC;
import X.FFD;
import X.FFL;
import X.FGI;
import X.FS5;
import X.FSJ;
import X.FSO;
import X.FSP;
import X.FTD;
import X.FTN;
import X.FTP;
import X.FTR;
import X.FTT;
import X.FTU;
import X.FTV;
import X.FTW;
import X.FTZ;
import X.FTf;
import X.FTg;
import X.FTs;
import X.FU0;
import X.FU1;
import X.FUE;
import X.FUH;
import X.FUJ;
import X.FUK;
import X.FUR;
import X.FUX;
import X.FZ7;
import X.HrF;
import X.HsC;
import X.HsM;
import X.I0I;
import X.I15;
import X.InterfaceC8078FSh;
import X.InterfaceC8111FUb;
import X.InterfaceC8112FUc;
import X.InterfaceC8114FUe;
import X.InterfaceC8115FUf;
import X.InterfaceC8116FUg;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import com.bloks.stdlib.components.bkcomponentscollection.StickyItemsLinearLayoutManager;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class RecyclerView extends ViewGroup implements InterfaceC8078FSh {
    public static boolean A1H;
    public static boolean A1I;
    public static final Interpolator A1K;
    public static final FUX A1L;
    public static final Class<?>[] A1M;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public VelocityTracker A05;
    public EdgeEffect A06;
    public EdgeEffect A07;
    public EdgeEffect A08;
    public EdgeEffect A09;
    public FUK A0A;
    public FTZ A0B;
    public FTW A0C;
    public C8095FTb A0D;
    public FTU A0E;
    public AbstractC8091FSx A0F;
    public FTP A0G;
    public FTN A0H;
    public FSO A0I;
    public InterfaceC8116FUg A0J;
    public FS5 A0K;
    public InterfaceC8111FUb A0L;
    public SavedState A0M;
    public C8058FRm A0N;
    public Runnable A0O;
    public List<FS5> A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public int A0e;
    public int A0f;
    public int A0g;
    public int A0h;
    public int A0i;
    public int A0j;
    public int A0k;
    public int A0l;
    public int A0m;
    public int A0n;
    public FTg A0o;
    public InterfaceC8115FUf A0p;
    public AbstractC8113FUd A0q;
    public InterfaceC8112FUc A0r;
    public boolean A0s;
    public boolean A0t;
    public final float A0u;
    public final int A0v;
    public final int A0w;
    public final Rect A0x;
    public final Rect A0y;
    public final RectF A0z;
    public final AccessibilityManager A10;
    public final FTR A11;
    public final C8096FTc A12;
    public final C8097FTd A13;
    public final FTT A14;
    public final InterfaceC8114FUe A15;
    public final C8098FTe A16;
    public final Runnable A17;
    public final ArrayList<AbstractC8109FTy> A18;
    public final ArrayList<InterfaceC8116FUg> A19;
    public final List<FTV> A1A;
    public final List<InterfaceC8111FUb> A1B;
    public final int[] A1C;
    public final int[] A1D;
    public final FUR A1E;
    public final int[] A1F;
    public final int[] A1G;
    public static final int[] A1N = {R.attr.nestedScrollingEnabled};
    public static final float A1J = (float) (Math.log(0.78d) / Math.log(0.9d));

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void A0L(View view, View view2) {
        if (view2 != null) {
            view = view2;
        }
        Rect rect = this.A0x;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FTf) {
            FTf fTf = (FTf) layoutParams;
            if (!fTf.A01) {
                Rect rect2 = fTf.A03;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.A0H.A1T(rect, view, this, !this.A0U, AnonymousClass002.A1Y(view2));
    }

    private boolean A0c(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fA00 = HrF.A00(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.A0u * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = A1J;
        return ((float) (((double) f) * Math.exp((d / (d - 1.0d)) * dLog))) < fA00;
    }

    public final void A0m() {
        AbstractC8094FTa abstractC8094FTa;
        setScrollState(0);
        FTT ftt = this.A14;
        ftt.A06.removeCallbacks(ftt);
        ftt.A01.abortAnimation();
        FTN ftn = this.A0H;
        if (ftn == null || (abstractC8094FTa = ftn.A06) == null) {
            return;
        }
        abstractC8094FTa.A00();
    }

    public final void A0v(int i, int i2, boolean z) {
        FTN ftn = this.A0H;
        if (ftn == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.A0Z) {
            return;
        }
        if (!ftn.A1P()) {
            i = 0;
        }
        if (!ftn.A1Q()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().A06(i3, 1);
        }
        this.A14.A02(null, i, i2, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A0H.A1T(rect, view, this, z, false);
    }

    public void setAdapter(AbstractC8091FSx abstractC8091FSx) {
        suppressLayout(false);
        AbstractC8091FSx abstractC8091FSx2 = this.A0F;
        if (abstractC8091FSx2 != null) {
            abstractC8091FSx2.A01.unregisterObserver(this.A12);
            AbstractC8091FSx abstractC8091FSx3 = this.A0F;
            if (abstractC8091FSx3 instanceof FF9) {
                ((FFL) abstractC8091FSx3).A02 = null;
            }
        }
        A0l();
        FTZ ftz = this.A0B;
        FTZ.A05(ftz, ftz.A04);
        FTZ.A05(ftz, ftz.A05);
        ftz.A00 = 0;
        AbstractC8091FSx abstractC8091FSx4 = this.A0F;
        this.A0F = abstractC8091FSx;
        if (abstractC8091FSx != null) {
            abstractC8091FSx.A01.registerObserver(this.A12);
            if (abstractC8091FSx instanceof FF9) {
                ((FFL) abstractC8091FSx).A02 = this;
            }
        }
        FTN ftn = this.A0H;
        if (ftn != null) {
            AbstractC8091FSx abstractC8091FSx5 = this.A0F;
            if (ftn instanceof StickyItemsLinearLayoutManager) {
                StickyItemsLinearLayoutManager.A04(abstractC8091FSx5, (StickyItemsLinearLayoutManager) ftn);
            } else if (ftn instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) ftn;
                staggeredGridLayoutManager.A09.A02();
                for (int i = 0; i < staggeredGridLayoutManager.A06; i++) {
                    staggeredGridLayoutManager.A0H[i].A08();
                }
            }
        }
        FTR ftr = this.A11;
        AbstractC8091FSx abstractC8091FSx6 = this.A0F;
        ftr.A05.clear();
        FTR.A03(ftr);
        FTR.A00(abstractC8091FSx4, ftr, true);
        FTR.A01(ftr);
        FTs fTs = ftr.A02;
        if (abstractC8091FSx4 != null) {
            fTs.A00--;
        }
        if (fTs.A00 == 0) {
            int i2 = 0;
            while (true) {
                SparseArray<FU1> sparseArray = fTs.A01;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ArrayList<FTV> arrayList = sparseArray.valueAt(i2).A02;
                Iterator<FTV> it = arrayList.iterator();
                while (it.hasNext()) {
                    BDV.A01(it.next().A0I);
                }
                arrayList.clear();
                i2++;
            }
        }
        if (abstractC8091FSx6 != null) {
            fTs.A00++;
        }
        FTR.A02(ftr);
        this.A13.A0C = true;
        A14(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC8115FUf interfaceC8115FUf) {
        if (interfaceC8115FUf != null) {
            this.A0p = interfaceC8115FUf;
            setChildrenDrawingOrderEnabled(true);
        }
    }

    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new I15(4);
        public Parcelable A00;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.A00, 0);
        }
    }

    public static int A06(EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i, int i2) {
        int iA09;
        if (i > 0) {
            if (edgeEffect == null || HrF.A00(edgeEffect) == 0.0f) {
                return i;
            }
            iA09 = AbstractC7607F5u.A09((-i2) / 4.0f, HrF.A01(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (iA09 != i) {
                edgeEffect.finish();
            }
        } else {
            if (i >= 0 || edgeEffect2 == null || HrF.A00(edgeEffect2) == 0.0f) {
                return i;
            }
            float f = i2;
            iA09 = AbstractC7607F5u.A09(f / 4.0f, HrF.A01(edgeEffect2, (i * 4.0f) / f, 0.5f));
            if (iA09 != i) {
                edgeEffect2.finish();
            }
        }
        return i - iA09;
    }

    private final FTV A07(int i) {
        FTV ftv = null;
        if (!this.A0S) {
            FTW ftw = this.A0C;
            int iA05 = ftw.A05();
            for (int i2 = 0; i2 < iA05; i2++) {
                FTV ftvA01 = FTW.A01(ftw, i2);
                if (ftvA01 != null && !AnonymousClass002.A1L(ftvA01.A00 & 8) && A0f(ftvA01) == i) {
                    if (!ftw.A04.contains(ftvA01.A0I)) {
                        return ftvA01;
                    }
                    ftv = ftvA01;
                }
            }
        }
        return ftv;
    }

    public static FTV A08(View view) {
        if (view == null) {
            return null;
        }
        return AbstractC7607F5u.A0m(view).A00;
    }

    public static RecyclerView A09(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewA09 = A09(viewGroup.getChildAt(i));
            if (recyclerViewA09 != null) {
                return recyclerViewA09;
            }
        }
        return null;
    }

    private void A0A() {
        VelocityTracker velocityTracker = this.A05;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        A0q(0);
        A0E();
        setScrollState(0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:28:0x007e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0B() {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0B():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0D() {
        /*
            r4 = this;
            boolean r0 = r4.A0S
            if (r0 == 0) goto L27
            X.FTZ r1 = r4.A0B
            java.util.ArrayList<X.FTp> r0 = r1.A04
            X.FTZ.A05(r1, r0)
            java.util.ArrayList<X.FTp> r0 = r1.A05
            X.FTZ.A05(r1, r0)
            r0 = 0
            r1.A00 = r0
            boolean r0 = r4.A0T
            if (r0 == 0) goto L27
            X.FTN r1 = r4.A0H
            boolean r0 = r1 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L83
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            X.FTi r0 = r1.A09
            r0.A02()
            r1.A10()
        L27:
            X.FTP r0 = r4.A0G
            if (r0 == 0) goto L34
            X.FTN r0 = r4.A0H
            boolean r0 = r0.A1R()
            r1 = 1
            if (r0 != 0) goto L35
        L34:
            r1 = 0
        L35:
            X.FTZ r0 = r4.A0B
            if (r1 == 0) goto L7f
            r0.A09()
        L3c:
            boolean r0 = r4.A0X
            r3 = 0
            if (r0 != 0) goto L46
            boolean r0 = r4.A0Y
            r2 = 0
            if (r0 == 0) goto L47
        L46:
            r2 = 1
        L47:
            X.FTd r1 = r4.A13
            boolean r0 = r4.A0U
            if (r0 == 0) goto L7d
            X.FTP r0 = r4.A0G
            if (r0 == 0) goto L7d
            boolean r0 = r4.A0S
            if (r0 != 0) goto L78
            if (r2 != 0) goto L5d
            X.FTN r0 = r4.A0H
            boolean r0 = r0.A0C
        L5b:
            if (r0 == 0) goto L7d
        L5d:
            r0 = 1
        L5e:
            r1.A0B = r0
            if (r0 == 0) goto L75
            if (r2 == 0) goto L75
            boolean r0 = r4.A0S
            if (r0 != 0) goto L75
            X.FTP r0 = r4.A0G
            if (r0 == 0) goto L75
            X.FTN r0 = r4.A0H
            boolean r0 = r0.A1R()
            if (r0 == 0) goto L75
            r3 = 1
        L75:
            r1.A0A = r3
            return
        L78:
            X.FSx r0 = r4.A0F
            boolean r0 = r0.A00
            goto L5b
        L7d:
            r0 = 0
            goto L5e
        L7f:
            r0.A08()
            goto L3c
        L83:
            boolean r0 = r1 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto L27
            X.FTN.A0f(r1)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0D():void");
    }

    private void A0E() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.A07;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.A07.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.A09;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.A09.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A08;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.A08.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A06;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.A06.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f0 A[PHI: r8
  0x02f0: PHI (r8v7 androidx.recyclerview.widget.RecyclerView) = (r8v6 androidx.recyclerview.widget.RecyclerView), (r8v8 androidx.recyclerview.widget.RecyclerView) binds: [B:174:0x03ab, B:139:0x02ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x02ff A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0F() {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0F():void");
    }

    private final void A0G() {
        FTW ftw = this.A0C;
        int iA05 = ftw.A05();
        for (int i = 0; i < iA05; i++) {
            AbstractC7607F5u.A0m(((C8103FTr) ftw.A03).A00.getChildAt(i)).A01 = true;
        }
        ArrayList<FTV> arrayList = this.A11.A06;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            FTf fTfA0m = AbstractC7607F5u.A0m(AbstractC7607F5u.A0n(arrayList, i2).A0I);
            if (fTfA0m != null) {
                fTfA0m.A01 = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0H(int i) {
        FTN ftn = this.A0H;
        boolean zA1P = ftn.A1P();
        int i2 = zA1P;
        if (ftn.A1Q()) {
            i2 = (zA1P ? 1 : 0) | 2;
        }
        getScrollingChildHelper().A06(i2, i);
    }

    public static void A0J(MotionEvent motionEvent, RecyclerView recyclerView, int i, int i2) {
        float y;
        float x;
        FTN ftn = recyclerView.A0H;
        if (ftn == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (recyclerView.A0Z) {
            return;
        }
        int[] iArr = recyclerView.A1D;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zA1P = ftn.A1P();
        boolean zA1Q = ftn.A1Q();
        int i3 = zA1P ? 1 : 0;
        if (zA1Q) {
            i3 = (zA1P ? 1 : 0) | 2;
        }
        if (motionEvent == null) {
            y = AbstractC7607F5u.A03(recyclerView) / 2.0f;
            x = AbstractC7607F5u.A02(recyclerView) / 2.0f;
        } else {
            y = motionEvent.getY();
            x = motionEvent.getX();
        }
        int iA03 = i - recyclerView.A03(i, y);
        int iA04 = i2 - recyclerView.A04(i2, x);
        recyclerView.getScrollingChildHelper().A06(i3, 1);
        if (recyclerView.A18(iArr, recyclerView.A1G, zA1P ? iA03 : 0, zA1Q ? iA04 : 0, 1)) {
            iA03 -= iArr[0];
            iA04 -= iArr[1];
        }
        recyclerView.A0b(motionEvent, zA1P ? iA03 : 0, zA1Q ? iA04 : 0, 1);
        FTU ftu = recyclerView.A0E;
        if (ftu != null && (iA03 != 0 || iA04 != 0)) {
            ftu.A01(recyclerView, iA03, iA04);
        }
        recyclerView.A0q(1);
    }

    public static void A0P(FTV ftv) {
        WeakReference<RecyclerView> weakReference = ftv.A0D;
        if (weakReference != null) {
            Object parent = weakReference.get();
            while (true) {
                for (View view = (View) parent; view != null; view = null) {
                    if (view == ftv.A0I) {
                        return;
                    }
                    parent = view.getParent();
                    if (!(parent instanceof View)) {
                    }
                }
                ftv.A0D = null;
                return;
            }
        }
    }

    public static void A0Q(FTV ftv, RecyclerView recyclerView) {
        View view = ftv.A0I;
        boolean zA1Z = AnonymousClass002.A1Z(view.getParent(), recyclerView);
        recyclerView.A11.A0D(recyclerView.A0i(view));
        boolean zA1L = AnonymousClass002.A1L(ftv.A00 & 256);
        FTW ftw = recyclerView.A0C;
        if (zA1L) {
            ftw.A0A(view, view.getLayoutParams(), -1, true);
            return;
        }
        if (!zA1Z) {
            ftw.A09(view, -1, true);
            return;
        }
        int iIndexOfChild = ((C8103FTr) ftw.A03).A00.indexOfChild(view);
        if (iIndexOfChild < 0) {
            throw BV5.A0O(view, "view is not a child, cannot hide ");
        }
        ftw.A02.A04(iIndexOfChild);
        FTW.A02(view, ftw);
    }

    public static final void A0R(RecyclerView recyclerView) {
        int measuredHeight;
        if (recyclerView.A06 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(recyclerView.getContext());
            recyclerView.A06 = edgeEffect;
            boolean z = recyclerView.A0R;
            int measuredWidth = recyclerView.getMeasuredWidth();
            if (z) {
                measuredWidth = AbstractC7610F5x.A0I(recyclerView, measuredWidth);
                measuredHeight = AbstractC7610F5x.A0H(recyclerView, recyclerView.getMeasuredHeight());
            } else {
                measuredHeight = recyclerView.getMeasuredHeight();
            }
            edgeEffect.setSize(measuredWidth, measuredHeight);
        }
    }

    public static final void A0S(RecyclerView recyclerView) {
        int measuredWidth;
        if (recyclerView.A07 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(recyclerView.getContext());
            recyclerView.A07 = edgeEffect;
            boolean z = recyclerView.A0R;
            int measuredHeight = recyclerView.getMeasuredHeight();
            if (z) {
                measuredHeight = AbstractC7610F5x.A0H(recyclerView, measuredHeight);
                measuredWidth = AbstractC7610F5x.A0I(recyclerView, recyclerView.getMeasuredWidth());
            } else {
                measuredWidth = recyclerView.getMeasuredWidth();
            }
            edgeEffect.setSize(measuredHeight, measuredWidth);
        }
    }

    public static final void A0T(RecyclerView recyclerView) {
        int measuredWidth;
        if (recyclerView.A08 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(recyclerView.getContext());
            recyclerView.A08 = edgeEffect;
            boolean z = recyclerView.A0R;
            int measuredHeight = recyclerView.getMeasuredHeight();
            if (z) {
                measuredHeight = AbstractC7610F5x.A0H(recyclerView, measuredHeight);
                measuredWidth = AbstractC7610F5x.A0I(recyclerView, recyclerView.getMeasuredWidth());
            } else {
                measuredWidth = recyclerView.getMeasuredWidth();
            }
            edgeEffect.setSize(measuredHeight, measuredWidth);
        }
    }

    public static final void A0U(RecyclerView recyclerView) {
        int measuredHeight;
        if (recyclerView.A09 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(recyclerView.getContext());
            recyclerView.A09 = edgeEffect;
            boolean z = recyclerView.A0R;
            int measuredWidth = recyclerView.getMeasuredWidth();
            if (z) {
                measuredWidth = AbstractC7610F5x.A0I(recyclerView, measuredWidth);
                measuredHeight = AbstractC7610F5x.A0H(recyclerView, recyclerView.getMeasuredHeight());
            } else {
                measuredHeight = recyclerView.getMeasuredHeight();
            }
            edgeEffect.setSize(measuredWidth, measuredHeight);
        }
    }

    public static final void A0V(RecyclerView recyclerView) {
        int i = recyclerView.A0h + 1;
        recyclerView.A0h = i;
        if (i != 1 || recyclerView.A0Z) {
            return;
        }
        recyclerView.A0a = false;
    }

    public static final void A0Y(RecyclerView recyclerView, boolean z) {
        int i = recyclerView.A0h;
        if (i < 1) {
            if (A1H) {
                throw BV5.A0U("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.", recyclerView.A0j());
            }
            recyclerView.A0h = 1;
            i = 1;
        }
        if (!z && !recyclerView.A0Z) {
            recyclerView.A0a = false;
        }
        if (i == 1) {
            if (z && recyclerView.A0a && !recyclerView.A0Z && recyclerView.A0H != null && recyclerView.A0F != null) {
                recyclerView.A0F();
            }
            if (!recyclerView.A0Z) {
                recyclerView.A0a = false;
            }
        }
        recyclerView.A0h--;
    }

    private void A0Z(int[] iArr) {
        int i;
        FTW ftw = this.A0C;
        int iA04 = ftw.A04();
        if (iA04 == 0) {
            i = -1;
            iArr[0] = -1;
        } else {
            int i2 = Integer.MAX_VALUE;
            i = Integer.MIN_VALUE;
            for (int i3 = 0; i3 < iA04; i3++) {
                FTV ftvA08 = A08(ftw.A07(i3));
                if (!AnonymousClass002.A1L(ftvA08.A00 & 128)) {
                    int iA0E = AbstractC7609F5w.A0E(ftvA08);
                    if (iA0E < i2) {
                        i2 = iA0E;
                    }
                    if (iA0E > i) {
                        i = iA0E;
                    }
                }
            }
            iArr[0] = i2;
        }
        iArr[1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0b(android.view.MotionEvent r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0b(android.view.MotionEvent, int, int, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0e(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0e(androidx.recyclerview.widget.RecyclerView, int, int, int, int):boolean");
    }

    private FTg getScrollingChildHelper() {
        FTg fTg = this.A0o;
        if (fTg != null) {
            return fTg;
        }
        FTg fTg2 = new FTg(this);
        this.A0o = fTg2;
        return fTg2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        A1H = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        A1I = z;
    }

    public final int A0f(FTV ftv) {
        int i = ftv.A00;
        if ((524 & i) == 0 && (i & 1) != 0) {
            FTZ ftz = this.A0B;
            int i2 = ftv.A04;
            ArrayList<C8102FTp> arrayList = ftz.A04;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C8102FTp c8102FTp = arrayList.get(i3);
                int i4 = c8102FTp.A00;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 8) {
                            if (c8102FTp.A02 == i2) {
                                i2 = c8102FTp.A01;
                            } else {
                                if (c8102FTp.A02 < i2) {
                                    i2--;
                                }
                                if (c8102FTp.A01 <= i2) {
                                    i2++;
                                }
                            }
                        }
                    } else if (c8102FTp.A02 > i2) {
                        continue;
                    } else if (c8102FTp.A02 + c8102FTp.A01 <= i2) {
                        i2 -= c8102FTp.A01;
                    }
                } else if (c8102FTp.A02 <= i2) {
                    i2 += c8102FTp.A01;
                }
            }
            return i2;
        }
        return -1;
    }

    public final String A0j() {
        StringBuilder sbA0x = C60O.A0x(InviteCodeScratcherKt.CODE_SEPARATOR);
        sbA0x.append(super.toString());
        sbA0x.append(", adapter:");
        sbA0x.append(this.A0F);
        sbA0x.append(", layout:");
        sbA0x.append(this.A0H);
        sbA0x.append(", context:");
        return C8j3.A14(getContext(), sbA0x);
    }

    public final void A0k() {
        if (!this.A0U || this.A0S) {
            Trace.beginSection("RV FullInvalidate");
            A0F();
        } else {
            FTZ ftz = this.A0B;
            ArrayList<C8102FTp> arrayList = ftz.A04;
            if (arrayList.size() <= 0) {
                return;
            }
            int i = ftz.A00;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (arrayList.size() <= 0) {
                    return;
                }
                Trace.beginSection("RV FullInvalidate");
                A0F();
            } else {
                Trace.beginSection("RV PartialInvalidate");
                A0V(this);
                this.A03++;
                ftz.A09();
                if (!this.A0a) {
                    FTW ftw = this.A0C;
                    int iA04 = ftw.A04();
                    int i2 = 0;
                    while (true) {
                        if (i2 < iA04) {
                            FTV ftvA08 = A08(ftw.A07(i2));
                            if (ftvA08 != null && !AnonymousClass002.A1L(ftvA08.A00 & 128) && (ftvA08.A00 & 2) != 0) {
                                A0F();
                                break;
                            }
                            i2++;
                        } else {
                            ftz.A07();
                            break;
                        }
                    }
                }
                A0Y(this, true);
                A13(true);
            }
        }
        Trace.endSection();
    }

    public final void A0l() {
        FTP ftp = this.A0G;
        if (ftp != null) {
            ftp.A04();
        }
        FTN ftn = this.A0H;
        if (ftn != null) {
            FTR ftr = this.A11;
            ftn.A1H(ftr);
            this.A0H.A1I(ftr);
        }
        FTR ftr2 = this.A11;
        ftr2.A05.clear();
        FTR.A03(ftr2);
    }

    public final void A0n(int i) {
        if (this.A0H != null) {
            setScrollState(2);
            this.A0H.A13(i);
            awakenScrollBars();
        }
    }

    public final void A0o(int i) {
        if (this.A0Z) {
            return;
        }
        A0m();
        FTN ftn = this.A0H;
        if (ftn == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            ftn.A13(i);
            awakenScrollBars();
        }
    }

    public final void A0p(int i) {
        if (this.A0Z) {
            return;
        }
        FTN ftn = this.A0H;
        if (ftn == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (ftn instanceof StaggeredGridLayoutManager) {
            FSJ fsj = new FSJ(getContext());
            ((AbstractC8094FTa) fsj).A00 = i;
            ftn.A1K(fsj);
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ftn;
            AbstractC8094FTa i0i = linearLayoutManager instanceof FSP ? new I0I(getContext(), linearLayoutManager, 2) : new FSJ(getContext());
            i0i.A00 = i;
            linearLayoutManager.A1K(i0i);
        }
    }

    public final void A0r(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.A07;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.A07.onRelease();
            zIsFinished = this.A07.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A08;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.A08.onRelease();
            zIsFinished |= this.A08.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A09;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.A09.onRelease();
            zIsFinished |= this.A09.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A06;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.A06.onRelease();
            zIsFinished |= this.A06.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void A0t(int i, int i2) {
        this.A0e++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        FS5 fs5 = this.A0K;
        if (fs5 != null) {
            fs5.A02(this, i, i2);
        }
        List<FS5> list = this.A0P;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    this.A0P.get(size).A02(this, i, i2);
                }
            }
        }
        this.A0e--;
    }

    public final void A0u(int i, int i2, boolean z) {
        int i3 = i + i2;
        FTW ftw = this.A0C;
        int iA05 = ftw.A05();
        for (int i4 = 0; i4 < iA05; i4++) {
            FTV ftvA01 = FTW.A01(ftw, i4);
            if (ftvA01 != null && !AnonymousClass002.A1L(ftvA01.A00 & 128)) {
                int i5 = ftvA01.A04;
                if (i5 >= i3) {
                    if (A1I) {
                        StringBuilder sbA0y = C60O.A0y("offsetPositionRecordsForRemove attached child ", i4);
                        sbA0y.append(" holder ");
                        sbA0y.append(ftvA01);
                        sbA0y.append(" now at position ");
                        Log.d("RecyclerView", BV4.A0l(sbA0y, ftvA01.A04 - i2));
                    }
                    ftvA01.A02(-i2, z);
                } else if (i5 >= i) {
                    if (A1I) {
                        StringBuilder sbA0y2 = C60O.A0y("offsetPositionRecordsForRemove attached child ", i4);
                        sbA0y2.append(" holder ");
                        sbA0y2.append(ftvA01);
                        Log.d("RecyclerView", AnonymousClass001.A0v(" now REMOVED", sbA0y2));
                    }
                    ftvA01.A00 |= 8;
                    ftvA01.A02(-i2, z);
                    ftvA01.A04 = i - 1;
                }
                this.A13.A0C = true;
            }
        }
        FTR ftr = this.A11;
        ArrayList<FTV> arrayList = ftr.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            FTV ftvA0n = AbstractC7607F5u.A0n(arrayList, size);
            if (ftvA0n != null) {
                if (ftvA0n.A04 >= i3) {
                    if (A1I) {
                        StringBuilder sbA0y3 = C60O.A0y("offsetPositionRecordsForRemove cached ", size);
                        sbA0y3.append(" holder ");
                        sbA0y3.append(ftvA0n);
                        sbA0y3.append(" now at position ");
                        Log.d("RecyclerView", BV4.A0l(sbA0y3, ftvA0n.A04 - i2));
                    }
                    ftvA0n.A02(-i2, z);
                } else if (ftvA0n.A04 >= i) {
                    ftvA0n.A00 |= 8;
                    FTR.A04(ftr, size);
                }
            }
        }
    }

    public final void A0x(FTD ftd, FTV ftv) {
        int i = ftv.A00 & (-8193);
        ftv.A00 = i;
        if (this.A13.A0D && (i & 2) != 0 && !AnonymousClass002.A1L(i & 8) && !AnonymousClass002.A1L(ftv.A00 & 128)) {
            this.A16.A00.A08(this.A0F.A00 ? ftv.A07 : ftv.A04, ftv);
        }
        DQZ<FTV, FU0> dqz = this.A16.A01;
        FU0 fu0A00 = dqz.get(ftv);
        if (fu0A00 == null) {
            fu0A00 = HsC.A00();
            dqz.put(ftv, fu0A00);
        }
        fu0A00.A02 = ftd;
        fu0A00.A00 |= 4;
    }

    public final void A0y(AbstractC8109FTy abstractC8109FTy) {
        FTN ftn = this.A0H;
        if (ftn != null) {
            ftn.A1O("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<AbstractC8109FTy> arrayList = this.A18;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC8109FTy);
        A0G();
        requestLayout();
    }

    public final void A0z(AbstractC8109FTy abstractC8109FTy) {
        FTN ftn = this.A0H;
        if (ftn != null) {
            ftn.A1O("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList<AbstractC8109FTy> arrayList = this.A18;
        arrayList.remove(abstractC8109FTy);
        if (arrayList.isEmpty()) {
            setWillNotDraw(AnonymousClass002.A1Q(getOverScrollMode(), 2));
        }
        A0G();
        requestLayout();
    }

    public void A10(FS5 fs5) {
        List listA0h = this.A0P;
        if (listA0h == null) {
            listA0h = C3cG.A0h();
            this.A0P = listA0h;
        }
        listA0h.add(fs5);
    }

    public void A11(FS5 fs5) {
        List<FS5> list = this.A0P;
        if (list != null) {
            list.remove(fs5);
        }
    }

    public final void A12(String str) {
        if (this.A03 > 0) {
            if (str != null) {
                throw C3cG.A0Q(str);
            }
            throw BV5.A0U("Cannot call this method while RecyclerView is computing a layout or scrolling", A0j());
        }
        if (this.A0e > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", BV5.A0U("", A0j()));
        }
    }

    public final void A13(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.A03 - 1;
        this.A03 = i2;
        if (i2 >= 1) {
            return;
        }
        if (A1H && i2 < 0) {
            throw BV5.A0U("layout or scroll counter cannot go below zero.Some calls are not matching", A0j());
        }
        this.A03 = 0;
        if (!z) {
            return;
        }
        int i3 = this.A02;
        this.A02 = 0;
        if (i3 != 0 && (accessibilityManager = this.A10) != null && accessibilityManager.isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(2048);
            accessibilityEventObtain.setContentChangeTypes(i3);
            sendAccessibilityEventUnchecked(accessibilityEventObtain);
        }
        List<FTV> list = this.A1A;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                list.clear();
                return;
            }
            FTV ftv = list.get(size);
            if (ftv.A0I.getParent() == this && !AnonymousClass002.A1L(ftv.A00 & 128) && (i = ftv.A03) != -1) {
                ftv.A0I.setImportantForAccessibility(i);
                ftv.A03 = -1;
            }
        }
    }

    public final void A14(boolean z) {
        this.A0T = z | this.A0T;
        this.A0S = true;
        FTW ftw = this.A0C;
        int iA05 = ftw.A05();
        for (int i = 0; i < iA05; i++) {
            FTV ftvA01 = FTW.A01(ftw, i);
            if (ftvA01 != null && !AnonymousClass002.A1L(ftvA01.A00 & 128)) {
                ftvA01.A00 |= 6;
            }
        }
        A0G();
        FTR ftr = this.A11;
        ArrayList<FTV> arrayList = ftr.A06;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            FTV ftvA0n = AbstractC7607F5u.A0n(arrayList, i2);
            if (ftvA0n != null) {
                int i3 = ftvA0n.A00 | 6;
                ftvA0n.A00 = i3;
                ftvA0n.A00 = 1024 | i3;
            }
        }
        AbstractC8091FSx abstractC8091FSx = ftr.A08.A0F;
        if (abstractC8091FSx == null || !abstractC8091FSx.A00) {
            FTR.A03(ftr);
        }
    }

    public final boolean A17() {
        return !this.A0U || this.A0S || this.A0B.A04.size() > 0;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof FTf) {
            FTN ftn = this.A0H;
            FTf fTf = (FTf) layoutParams;
            if (ftn instanceof StaggeredGridLayoutManager ? fTf instanceof C7803FFj : ftn instanceof GridLayoutManager ? fTf instanceof FUH : AnonymousClass002.A1X(fTf)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        FTN ftn = this.A0H;
        if (ftn == null || !ftn.A1P()) {
            return 0;
        }
        return ftn.A0r(this.A13);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        FTN ftn = this.A0H;
        if (ftn == null || !ftn.A1P()) {
            return 0;
        }
        C8097FTd c8097FTd = this.A13;
        if (ftn instanceof StaggeredGridLayoutManager) {
            return StaggeredGridLayoutManager.A08(c8097FTd, (StaggeredGridLayoutManager) ftn);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ftn;
        if (!(linearLayoutManager instanceof StickyItemsLinearLayoutManager)) {
            return LinearLayoutManager.A0K(linearLayoutManager, c8097FTd);
        }
        StickyItemsLinearLayoutManager stickyItemsLinearLayoutManagerA0a = FTN.A0a(linearLayoutManager, c8097FTd);
        int iA0K = LinearLayoutManager.A0K(stickyItemsLinearLayoutManagerA0a, c8097FTd);
        StickyItemsLinearLayoutManager.A0A(stickyItemsLinearLayoutManagerA0a);
        return iA0K;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        FTN ftn = this.A0H;
        if (ftn == null || !ftn.A1P()) {
            return 0;
        }
        return ftn.A0s(this.A13);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        FTN ftn = this.A0H;
        if (ftn == null || !ftn.A1Q()) {
            return 0;
        }
        return ftn.A0t(this.A13);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        FTN ftn = this.A0H;
        if (ftn == null || !ftn.A1Q()) {
            return 0;
        }
        C8097FTd c8097FTd = this.A13;
        if (ftn instanceof StaggeredGridLayoutManager) {
            return StaggeredGridLayoutManager.A08(c8097FTd, (StaggeredGridLayoutManager) ftn);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ftn;
        if (!(linearLayoutManager instanceof StickyItemsLinearLayoutManager)) {
            return LinearLayoutManager.A0K(linearLayoutManager, c8097FTd);
        }
        StickyItemsLinearLayoutManager stickyItemsLinearLayoutManagerA0a = FTN.A0a(linearLayoutManager, c8097FTd);
        int iA0K = LinearLayoutManager.A0K(stickyItemsLinearLayoutManagerA0a, c8097FTd);
        StickyItemsLinearLayoutManager.A0A(stickyItemsLinearLayoutManagerA0a);
        return iA0K;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        FTN ftn = this.A0H;
        if (ftn == null || !ftn.A1Q()) {
            return 0;
        }
        return ftn.A0u(this.A13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r17) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.draw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0123, code lost:
    
        if (r10 > 0) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052 A[PHI: r5
  0x0052: PHI (r5v3 android.view.View) = (r5v1 android.view.View), (r5v4 android.view.View) binds: [B:43:0x008b, B:27:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0135 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r12, int r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        FTN ftn = this.A0H;
        if (ftn != null) {
            return ftn.A0z();
        }
        throw BV5.A0U("RecyclerView has no LayoutManager", A0j());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        FTN ftn = this.A0H;
        if (ftn == null) {
            throw BV5.A0U("RecyclerView has no LayoutManager", A0j());
        }
        if (ftn instanceof StaggeredGridLayoutManager) {
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C7803FFj((ViewGroup.MarginLayoutParams) layoutParams) : new C7803FFj(layoutParams);
        }
        if (!(ftn instanceof GridLayoutManager)) {
            return layoutParams instanceof FTf ? new FTf((FTf) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new FTf((ViewGroup.MarginLayoutParams) layoutParams) : new FTf(layoutParams);
        }
        FUH fuh = layoutParams instanceof ViewGroup.MarginLayoutParams ? new FUH((ViewGroup.MarginLayoutParams) layoutParams) : new FUH(layoutParams);
        fuh.A00 = -1;
        fuh.A01 = 0;
        return fuh;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC8091FSx getAdapter() {
        return this.A0F;
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.A0H != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.A0R;
    }

    public C8058FRm getCompatAccessibilityDelegate() {
        return this.A0N;
    }

    public AbstractC8113FUd getEdgeEffectFactory() {
        return this.A0q;
    }

    public FTP getItemAnimator() {
        return this.A0G;
    }

    public int getItemDecorationCount() {
        return this.A18.size();
    }

    public FTN getLayoutManager() {
        return this.A0H;
    }

    public int getMaxFlingVelocity() {
        return this.A0v;
    }

    public int getMinFlingVelocity() {
        return this.A0w;
    }

    public FSO getOnFlingListener() {
        return this.A0I;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0d;
    }

    public FTs getRecycledViewPool() {
        FTR ftr = this.A11;
        FTR.A01(ftr);
        return ftr.A02;
    }

    public int getScrollState() {
        return this.A04;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.A0W;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.A0Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[PHI: r3
  0x0090: PHI (r3v4 float) = (r3v0 float), (r3v9 float) binds: [B:25:0x0074, B:14:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            X.FTN r0 = r8.A0H
            r7 = 0
            if (r0 == 0) goto L68
            boolean r0 = r8.A0Z
            if (r0 != 0) goto L68
            int r1 = r9.getAction()
            r0 = 8
            if (r1 != r0) goto L68
            int r0 = r9.getSource()
            r0 = r0 & 2
            r3 = 0
            if (r0 == 0) goto L6d
            X.FTN r0 = r8.A0H
            boolean r0 = r0.A1Q()
            if (r0 == 0) goto L29
            r0 = 9
            float r0 = r9.getAxisValue(r0)
            float r3 = -r0
        L29:
            X.FTN r0 = r8.A0H
            boolean r0 = r0.A1P()
            if (r0 == 0) goto L90
            r0 = 10
            float r2 = r9.getAxisValue(r0)
            r6 = 0
            r4 = 0
        L39:
            float r0 = r8.A01
            float r3 = r3 * r0
            int r5 = (int) r3
            float r0 = r8.A00
            float r2 = r2 * r0
            int r3 = (int) r2
            if (r6 == 0) goto L69
            X.FTT r0 = r8.A14
            android.widget.OverScroller r2 = r0.A01
            int r1 = r2.getFinalY()
            int r0 = r2.getCurrY()
            int r1 = r1 - r0
            int r5 = r5 + r1
            int r1 = r2.getFinalX()
            int r0 = r2.getCurrX()
            int r1 = r1 - r0
            int r3 = r3 + r1
            r0 = 1
            r8.A0v(r3, r5, r0)
        L5f:
            if (r4 == 0) goto L68
            if (r6 != 0) goto L68
            X.FUK r0 = r8.A0A
            r0.A00(r9, r4)
        L68:
            return r7
        L69:
            A0J(r9, r8, r3, r5)
            goto L5f
        L6d:
            int r1 = r9.getSource()
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L90
            r4 = 26
            float r2 = r9.getAxisValue(r4)
            X.FTN r1 = r8.A0H
            boolean r0 = r1.A1Q()
            if (r0 == 0) goto L89
            float r3 = -r2
        L85:
            r2 = 0
        L86:
            boolean r6 = r8.A0b
            goto L39
        L89:
            boolean r0 = r1.A1P()
            if (r0 == 0) goto L85
            goto L86
        L90:
            r4 = 0
            r2 = 0
            r6 = 0
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.A0Z) {
            this.A0J = null;
            if (A0a(motionEvent)) {
                A0A();
                return true;
            }
            FTN ftn = this.A0H;
            if (ftn != null) {
                boolean zA1P = ftn.A1P();
                boolean zA1Q = ftn.A1Q();
                VelocityTracker velocityTrackerObtain = this.A05;
                if (velocityTrackerObtain == null) {
                    velocityTrackerObtain = VelocityTracker.obtain();
                    this.A05 = velocityTrackerObtain;
                }
                velocityTrackerObtain.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.A0s) {
                        this.A0s = false;
                    }
                    this.A0m = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.A0k = x;
                    this.A0f = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.A0l = y;
                    this.A0g = y;
                    EdgeEffect edgeEffect = this.A07;
                    if (edgeEffect == null || HrF.A00(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        HrF.A01(this.A07, 0.0f, 1.0f - AbstractC7608F5v.A01(this, motionEvent.getY()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.A08;
                    if (edgeEffect2 != null && HrF.A00(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        HrF.A01(this.A08, 0.0f, AbstractC7608F5v.A01(this, motionEvent.getY()));
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.A09;
                    if (edgeEffect3 != null && HrF.A00(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        HrF.A01(this.A09, 0.0f, AbstractC7608F5v.A00(this, motionEvent.getX()));
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.A06;
                    if (edgeEffect4 == null || HrF.A00(edgeEffect4) == 0.0f || canScrollVertically(1)) {
                        if (z || this.A04 == 2) {
                        }
                        int[] iArr = this.A1F;
                        iArr[1] = 0;
                        iArr[0] = 0;
                        A0H(0);
                    } else {
                        HrF.A01(this.A06, 0.0f, 1.0f - AbstractC7608F5v.A00(this, motionEvent.getX()));
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    A0q(1);
                    int[] iArr2 = this.A1F;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    A0H(0);
                } else if (actionMasked == 1) {
                    this.A05.clear();
                    A0q(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.A0m);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", FGI.A0I("Error processing scroll; pointer index for id ", this.A0m, " not found. Did any MotionEvents get skipped?"));
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.A04 != 1) {
                        int i = x2 - this.A0f;
                        int i2 = y2 - this.A0g;
                        if (!zA1P || Math.abs(i) <= this.A0n) {
                            z2 = false;
                        } else {
                            this.A0k = x2;
                            z2 = true;
                        }
                        if (zA1Q && Math.abs(i2) > this.A0n) {
                            this.A0l = y2;
                        } else if (z2) {
                        }
                        setScrollState(1);
                    }
                } else if (actionMasked == 3) {
                    A0A();
                } else if (actionMasked == 5) {
                    this.A0m = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.A0k = x3;
                    this.A0f = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.A0l = y3;
                    this.A0g = y3;
                } else if (actionMasked == 6) {
                    A0I(motionEvent);
                }
                if (this.A04 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        A0F();
        Trace.endSection();
        this.A0U = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C8097FTd c8097FTd;
        FTN ftn = this.A0H;
        if (ftn == null) {
            A0s(i, i2);
            return;
        }
        boolean z = false;
        if (!(ftn instanceof StaggeredGridLayoutManager ? AnonymousClass002.A1L(((StaggeredGridLayoutManager) ftn).A01) : true)) {
            if (this.A0V) {
                ftn.A07.A0s(i, i2);
                return;
            }
            if (this.A0Q) {
                A0V(this);
                this.A03++;
                A0D();
                A13(true);
                c8097FTd = this.A13;
                if (c8097FTd.A0A) {
                    c8097FTd.A08 = true;
                } else {
                    this.A0B.A08();
                    c8097FTd.A08 = false;
                }
                this.A0Q = false;
                A0Y(this, false);
            } else {
                c8097FTd = this.A13;
                if (c8097FTd.A0A) {
                    setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                    return;
                }
            }
            AbstractC8091FSx abstractC8091FSx = this.A0F;
            if (abstractC8091FSx != null) {
                c8097FTd.A03 = abstractC8091FSx.A03();
            } else {
                c8097FTd.A03 = 0;
            }
            A0V(this);
            this.A0H.A07.A0s(i, i2);
            A0Y(this, false);
            c8097FTd.A08 = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        FTN ftn2 = this.A0H;
        C8097FTd c8097FTd2 = this.A13;
        ftn2.A07.A0s(i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z = true;
        }
        this.A0t = z;
        if (z || this.A0F == null) {
            return;
        }
        if (c8097FTd2.A04 == 1) {
            A0B();
        }
        this.A0H.A14(i, i2);
        c8097FTd2.A09 = true;
        A0C();
        this.A0H.A15(i, i2);
        FTN ftn3 = this.A0H;
        if ((ftn3 instanceof LinearLayoutManager) && ftn3.A01 != 1073741824 && ftn3.A04 != 1073741824) {
            int iA0h = ftn3.A0h();
            int i3 = 0;
            while (true) {
                if (i3 >= iA0h) {
                    break;
                }
                ViewGroup.LayoutParams layoutParams = ftn3.A0x(i3).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    this.A0H.A14(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    c8097FTd2.A09 = true;
                    A0C();
                    this.A0H.A15(i, i2);
                    break;
                }
                i3++;
            }
        }
        this.A0j = getMeasuredWidth();
        this.A0i = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.A03 > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.A0M = savedState;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableA0v;
        Parcelable.Creator<SavedState> creator = SavedState.CREATOR;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.A0M;
        if (savedState2 != null) {
            parcelableA0v = savedState2.A00;
        } else {
            FTN ftn = this.A0H;
            parcelableA0v = ftn != null ? ftn.A0v() : null;
        }
        savedState.A00 = parcelableA0v;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0204 A[PHI: r5
  0x0204: PHI (r5v13 int) = (r5v8 int), (r5v17 int) binds: [B:101:0x01f7, B:106:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0211 A[PHI: r4
  0x0211: PHI (r4v21 int) = (r4v20 int), (r4v24 int) binds: [B:140:0x0296, B:112:0x020f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0296 A[PHI: r4
  0x0296: PHI (r4v20 int) = (r4v15 int), (r4v24 int) binds: [B:108:0x0205, B:112:0x020f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.A0H.A1U(view, view2, this.A13, this) && view2 != null) {
            A0L(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList<InterfaceC8116FUg> arrayList = this.A19;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.A0h != 0 || this.A0Z) {
            this.A0a = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        FTN ftn = this.A0H;
        if (ftn == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.A0Z) {
            return;
        }
        boolean zA1P = ftn.A1P();
        boolean zA1Q = ftn.A1Q();
        if (zA1P || zA1Q) {
            if (!zA1P) {
                i = 0;
            }
            if (!zA1Q) {
                i2 = 0;
            }
            A0b(null, i, i2, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int contentChangeTypes;
        if (this.A03 <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
            return;
        }
        int i = 0;
        if (accessibilityEvent != null && (contentChangeTypes = accessibilityEvent.getContentChangeTypes()) != 0) {
            i = contentChangeTypes;
        }
        this.A02 |= i;
    }

    public void setAccessibilityDelegateCompat(C8058FRm c8058FRm) {
        this.A0N = c8058FRm;
        AbstractC8060FRo.A06(this, c8058FRm);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.A0R) {
            this.A06 = null;
            this.A09 = null;
            this.A08 = null;
            this.A07 = null;
        }
        this.A0R = z;
        super.setClipToPadding(z);
        if (this.A0U) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z) {
        this.A0V = z;
    }

    public void setItemAnimator(FTP ftp) {
        FTP ftp2 = this.A0G;
        if (ftp2 != null) {
            ftp2.A04();
            this.A0G.A00 = null;
        }
        this.A0G = ftp;
        if (ftp != null) {
            ftp.A00 = this.A0r;
        }
    }

    public void setItemViewCacheSize(int i) {
        FTR ftr = this.A11;
        ftr.A00 = i;
        ftr.A08();
    }

    public void setLayoutManager(FTN ftn) {
        FTR ftr;
        FUJ fuj;
        if (ftn != this.A0H) {
            A0m();
            if (this.A0H != null) {
                FTP ftp = this.A0G;
                if (ftp != null) {
                    ftp.A04();
                }
                FTN ftn2 = this.A0H;
                ftr = this.A11;
                ftn2.A1H(ftr);
                this.A0H.A1I(ftr);
                ftr.A05.clear();
                FTR.A03(ftr);
                if (this.A0W) {
                    FTN ftn3 = this.A0H;
                    ftn3.A0A = false;
                    ftn3.A1N(this);
                }
                FTN ftn4 = this.A0H;
                ftn4.A07 = null;
                ftn4.A05 = null;
                ftn4.A03 = 0;
                ftn4.A00 = 0;
                ftn4.A04 = 1073741824;
                ftn4.A01 = 1073741824;
                this.A0H = null;
            } else {
                ftr = this.A11;
                ftr.A05.clear();
                FTR.A03(ftr);
            }
            FTW ftw = this.A0C;
            ftw.A02.A02();
            List<View> list = ftw.A04;
            int size = list.size();
            while (true) {
                size--;
                fuj = ftw.A03;
                if (size < 0) {
                    break;
                }
                fuj.ATo(list.get(size));
                list.remove(size);
            }
            RecyclerView recyclerView = ((C8103FTr) fuj).A00;
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                recyclerView.A0w(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeAllViews();
            this.A0H = ftn;
            if (ftn != null) {
                if (ftn.A07 != null) {
                    StringBuilder sbA0f = C3cG.A0f(ftn, "LayoutManager ");
                    sbA0f.append(" is already attached to a RecyclerView:");
                    throw C8j3.A0w(ftn.A07.A0j(), sbA0f);
                }
                ftn.A07 = this;
                ftn.A05 = ftw;
                ftn.A03 = getWidth();
                ftn.A00 = getHeight();
                ftn.A04 = 1073741824;
                ftn.A01 = 1073741824;
                if (this.A0W) {
                    FTN ftn5 = this.A0H;
                    ftn5.A0A = true;
                    ftn5.A1M(this);
                }
            }
            ftr.A08();
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw C60O.A0i("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    public void setOnFlingListener(FSO fso) {
        this.A0I = fso;
    }

    @Deprecated
    public void setOnScrollListener(FS5 fs5) {
        this.A0K = fs5;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.A0d = z;
    }

    public void setRecycledViewPool(FTs fTs) {
        FTR ftr = this.A11;
        RecyclerView recyclerView = ftr.A08;
        FTR.A00(recyclerView.A0F, ftr, false);
        if (ftr.A02 != null) {
            r1.A00--;
        }
        ftr.A02 = fTs;
        if (fTs != null && recyclerView.A0F != null) {
            fTs.A00++;
        }
        FTR.A02(ftr);
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC8111FUb interfaceC8111FUb) {
        this.A0L = interfaceC8111FUb;
    }

    public void setScrollState(int i) {
        AbstractC8094FTa abstractC8094FTa;
        int i2 = this.A04;
        if (i == i2) {
            return;
        }
        if (A1I) {
            Log.d("RecyclerView", FGI.A0T("setting scroll state to ", " from ", i, i2), new Exception());
        }
        this.A04 = i;
        if (i != 2) {
            FTT ftt = this.A14;
            ftt.A06.removeCallbacks(ftt);
            ftt.A01.abortAnimation();
            FTN ftn = this.A0H;
            if (ftn != null && (abstractC8094FTa = ftn.A06) != null) {
                abstractC8094FTa.A00();
            }
        }
        FTN ftn2 = this.A0H;
        if (ftn2 != null && (ftn2 instanceof StaggeredGridLayoutManager)) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) ftn2;
            if (i == 0) {
                staggeredGridLayoutManager.A1W();
            }
        }
        FS5 fs5 = this.A0K;
        if (fs5 != null) {
            fs5.A01(this, i);
        }
        List<FS5> list = this.A0P;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.A0P.get(size).A01(this, i);
            }
        }
    }

    public void setViewCacheExtension(AbstractC8110FUa abstractC8110FUa) {
        this.A11.A03 = abstractC8110FUa;
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.A0Z) {
            A12("Do not suppressLayout in layout or scroll");
            if (z) {
                onTouchEvent(AbstractC7611F5y.A0L());
                this.A0Z = true;
                this.A0s = true;
                A0m();
                return;
            }
            this.A0Z = false;
            if (this.A0a && this.A0H != null && this.A0F != null) {
                requestLayout();
            }
            this.A0a = false;
        }
    }

    static {
        Class cls = Integer.TYPE;
        A1M = new Class[]{Context.class, AttributeSet.class, cls, cls};
        A1K = new FUE();
        A1L = new FUX();
    }

    private int A03(int i, float f) {
        EdgeEffect edgeEffect;
        float fA01;
        EdgeEffect edgeEffect2;
        float fA012 = AbstractC7608F5v.A01(this, f);
        float fA00 = AbstractC7608F5v.A00(this, i);
        EdgeEffect edgeEffect3 = this.A07;
        float f2 = 0.0f;
        if (edgeEffect3 == null || HrF.A00(edgeEffect3) == 0.0f) {
            EdgeEffect edgeEffect4 = this.A08;
            if (edgeEffect4 != null && HrF.A00(edgeEffect4) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                edgeEffect = this.A08;
                if (!zCanScrollHorizontally) {
                    fA01 = HrF.A01(edgeEffect, fA00, fA012);
                    if (HrF.A00(this.A08) == 0.0f) {
                        edgeEffect2 = this.A08;
                        edgeEffect2.onRelease();
                    }
                    f2 = fA01;
                    invalidate();
                }
                edgeEffect.onRelease();
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            edgeEffect = this.A07;
            if (!zCanScrollHorizontally2) {
                fA01 = -HrF.A01(edgeEffect, -fA00, 1.0f - fA012);
                if (HrF.A00(this.A07) == 0.0f) {
                    edgeEffect2 = this.A07;
                    edgeEffect2.onRelease();
                }
                f2 = fA01;
                invalidate();
            }
            edgeEffect.onRelease();
            invalidate();
        }
        return AbstractC7607F5u.A09(f2, AbstractC7607F5u.A02(this));
    }

    private int A04(int i, float f) {
        EdgeEffect edgeEffect;
        float fA01;
        EdgeEffect edgeEffect2;
        float fA00 = AbstractC7608F5v.A00(this, f);
        float fA012 = AbstractC7608F5v.A01(this, i);
        EdgeEffect edgeEffect3 = this.A09;
        float f2 = 0.0f;
        if (edgeEffect3 == null || HrF.A00(edgeEffect3) == 0.0f) {
            EdgeEffect edgeEffect4 = this.A06;
            if (edgeEffect4 != null && HrF.A00(edgeEffect4) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                edgeEffect = this.A06;
                if (!zCanScrollVertically) {
                    fA01 = HrF.A01(edgeEffect, fA012, 1.0f - fA00);
                    if (HrF.A00(this.A06) == 0.0f) {
                        edgeEffect2 = this.A06;
                        edgeEffect2.onRelease();
                    }
                    f2 = fA01;
                    invalidate();
                }
                edgeEffect.onRelease();
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            edgeEffect = this.A09;
            if (!zCanScrollVertically2) {
                fA01 = -HrF.A01(edgeEffect, -fA012, fA00);
                if (HrF.A00(this.A09) == 0.0f) {
                    edgeEffect2 = this.A09;
                    edgeEffect2.onRelease();
                }
                f2 = fA01;
                invalidate();
            }
            edgeEffect.onRelease();
            invalidate();
        }
        return AbstractC7607F5u.A09(f2, AbstractC7607F5u.A03(this));
    }

    public static final int A05(View view) {
        RecyclerView recyclerView;
        FTV ftvA08 = A08(view);
        if (ftvA08 == null || (recyclerView = ftvA08.A0C) == null) {
            return -1;
        }
        return recyclerView.A0f(ftvA08);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0C() {
        /*
            r4 = this;
            A0V(r4)
            int r0 = r4.A03
            int r0 = r0 + 1
            r4.A03 = r0
            X.FTd r3 = r4.A13
            r0 = 6
            r3.A01(r0)
            X.FTZ r0 = r4.A0B
            r0.A08()
            X.FSx r0 = r4.A0F
            int r0 = r0.A03()
            r3.A03 = r0
            r2 = 0
            r3.A00 = r2
            androidx.recyclerview.widget.RecyclerView$SavedState r0 = r4.A0M
            if (r0 == 0) goto L2f
            android.os.Parcelable r1 = r0.A00
            if (r1 == 0) goto L2c
            X.FTN r0 = r4.A0H
            r0.A18(r1)
        L2c:
            r0 = 0
            r4.A0M = r0
        L2f:
            r3.A08 = r2
            X.FTN r1 = r4.A0H
            X.FTR r0 = r4.A11
            r1.A1J(r0, r3)
            r3.A0C = r2
            boolean r0 = r3.A0B
            if (r0 == 0) goto L43
            X.FTP r1 = r4.A0G
            r0 = 1
            if (r1 != 0) goto L44
        L43:
            r0 = 0
        L44:
            r3.A0B = r0
            r0 = 4
            r3.A04 = r0
            r0 = 1
            r4.A13(r0)
            A0Y(r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0C():void");
    }

    private void A0I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A0m) {
            boolean zA1M = AnonymousClass002.A1M(actionIndex);
            this.A0m = motionEvent.getPointerId(zA1M ? 1 : 0);
            int x = (int) (motionEvent.getX(zA1M ? 1 : 0) + 0.5f);
            this.A0k = x;
            this.A0f = x;
            int y = (int) (motionEvent.getY(zA1M ? 1 : 0) + 0.5f);
            this.A0l = y;
            this.A0g = y;
        }
    }

    public static void A0K(View view, Rect rect) {
        FTf fTfA0m = AbstractC7607F5u.A0m(view);
        Rect rect2 = fTfA0m.A03;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) fTfA0m).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) fTfA0m).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) fTfA0m).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) fTfA0m).bottomMargin);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0a(android.view.MotionEvent r15) {
        /*
            r14 = this;
            int r7 = r15.getAction()
            java.util.ArrayList<X.FUg> r6 = r14.A19
            int r5 = r6.size()
            r13 = 0
            r4 = 0
        Lc:
            if (r4 >= r5) goto L80
            java.lang.Object r3 = r6.get(r4)
            X.FUg r3 = (X.InterfaceC8116FUg) r3
            r8 = r3
            X.FTX r8 = (X.FTX) r8
            int r0 = r8.A08
            r2 = 2
            r1 = 1
            if (r0 != r1) goto L7a
            float r9 = r15.getX()
            float r0 = r15.getY()
            boolean r12 = X.FTX.A01(r8, r9, r0)
            float r11 = r15.getX()
            float r10 = r15.getY()
            int r9 = r8.A06
            int r0 = r8.A0E
            int r9 = r9 - r0
            float r0 = (float) r9
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L4f
            int r10 = r8.A04
            int r0 = r8.A05
            int r9 = r0 / 2
            int r0 = r10 - r9
            float r0 = (float) r0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L4f
            int r10 = r10 + r9
            float r0 = (float) r10
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r9 = 1
            if (r0 <= 0) goto L50
        L4f:
            r9 = 0
        L50:
            int r0 = r15.getAction()
            if (r0 != 0) goto L7d
            if (r12 != 0) goto L6d
            if (r9 == 0) goto L7d
        L5a:
            r8.A03 = r1
            float r0 = r15.getX()
            int r0 = (int) r0
            float r0 = (float) r0
            r8.A00 = r0
        L64:
            r8.A02(r2)
        L67:
            r0 = 3
            if (r7 == r0) goto L7d
            r14.A0J = r3
            return r1
        L6d:
            if (r9 != 0) goto L5a
            r8.A03 = r2
            float r0 = r15.getY()
            int r0 = (int) r0
            float r0 = (float) r0
            r8.A01 = r0
            goto L64
        L7a:
            if (r0 != r2) goto L7d
            goto L67
        L7d:
            int r4 = r4 + 1
            goto Lc
        L80:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0a(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if ((r1 & 4) == 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Rect A0g(android.view.View r24) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0g(android.view.View):android.graphics.Rect");
    }

    public final View A0h(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent != this) {
            return null;
        }
        return view;
    }

    public final FTV A0i(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return AbstractC7607F5u.A0m(view).A00;
        }
        throw BV5.A0P(this, " is not a direct child of ", C3cG.A0f(view, "View "));
    }

    public final void A0q(int i) {
        getScrollingChildHelper().A02(i);
    }

    public final void A0s(int i, int i2) {
        setMeasuredDimension(FTN.A0W(i, AbstractC7609F5w.A09(this), getMinimumWidth()), FTN.A0W(i2, AbstractC7609F5w.A0B(this), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0w(View view) {
        HsM hsMA0D;
        FTV ftvA08 = A08(view);
        AbstractC8091FSx abstractC8091FSx = this.A0F;
        if (abstractC8091FSx == null || ftvA08 == null || !(abstractC8091FSx instanceof FF9)) {
            return;
        }
        FF9 ff9 = (FF9) abstractC8091FSx;
        FFD ffd = (FFD) ftvA08;
        if (ff9.A01 != null) {
            FFC ffc = (FFC) ffd;
            C7384Etj.A0Y(ffc, 0);
            ffc.A03 = false;
        }
        FFB ffb = ff9.A00;
        C7384Etj.A0Y(ffd, 0);
        FDW fdwA0C = ((C7782FEm) ffd.A00).A01.A0C(132);
        if (fdwA0C == null || fdwA0C.A05 != 13366 || (hsMA0D = fdwA0C.A0D(40)) == null) {
            return;
        }
        C6979Edd.A00();
        FFA ffa = ffb.A01;
        ffa.sendMessage(ffa.obtainMessage(0, hsMA0D));
    }

    public final void A15(int[] iArr, int i, int i2) {
        FTV ftv;
        A0V(this);
        this.A03++;
        Trace.beginSection("RV Scroll");
        C8097FTd c8097FTd = this.A13;
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A14.A01;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
        int iA0p = i != 0 ? this.A0H.A0p(this.A11, c8097FTd, i) : 0;
        int iA0q = i2 != 0 ? this.A0H.A0q(this.A11, c8097FTd, i2) : 0;
        Trace.endSection();
        FTW ftw = this.A0C;
        int iA04 = ftw.A04();
        for (int i3 = 0; i3 < iA04; i3++) {
            View viewA07 = ftw.A07(i3);
            FTV ftvA0i = A0i(viewA07);
            if (ftvA0i != null && (ftv = ftvA0i.A0B) != null) {
                View view = ftv.A0I;
                int left = viewA07.getLeft();
                int top = viewA07.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        A13(true);
        A0Y(this, false);
        if (iArr != null) {
            iArr[0] = iA0p;
            iArr[1] = iA0q;
        }
    }

    public final void A16(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        FTg.A01(getScrollingChildHelper(), iArr, iArr2, i, i2, i3, i4, i5);
    }

    public final boolean A18(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        return getScrollingChildHelper().A07(iArr, iArr2, i, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode;
        if (!super.dispatchKeyEvent(keyEvent)) {
            FTN ftn = this.A0H;
            int iA03 = 0;
            if (ftn != null) {
                if (ftn.A1Q()) {
                    keyCode = keyEvent.getKeyCode();
                    if (keyCode == 92 || keyCode == 93) {
                        int measuredHeight = getMeasuredHeight();
                        if (keyCode != 93) {
                            measuredHeight = -measuredHeight;
                        }
                        A0v(0, measuredHeight, false);
                        return true;
                    }
                } else if (ftn.A1P()) {
                    keyCode = keyEvent.getKeyCode();
                    if (keyCode == 92 || keyCode == 93) {
                        int measuredWidth = getMeasuredWidth();
                        if (keyCode != 93) {
                            measuredWidth = -measuredWidth;
                        }
                        A0v(measuredWidth, 0, false);
                    }
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean z = ftn instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) ftn).A0D : ((LinearLayoutManager) ftn).A08;
                    if (keyCode != 122 ? !z : z) {
                        iA03 = this.A0F.A03();
                    }
                    A0p(iA03);
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().A05(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().A04(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A07(iArr, iArr2, i, i2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return FTg.A01(getScrollingChildHelper(), iArr, null, i, i2, i3, i4, 0);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return AnonymousClass002.A1X(getScrollingChildHelper().A01);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r2 = 0
            r4.A03 = r2
            r1 = 1
            r4.A0W = r1
            boolean r0 = r4.A0U
            if (r0 == 0) goto L73
            boolean r0 = r4.isLayoutRequested()
            if (r0 != 0) goto L73
        L13:
            r4.A0U = r1
            X.FTR r0 = r4.A11
            X.FTR.A02(r0)
            X.FTN r1 = r4.A0H
            if (r1 == 0) goto L24
            r0 = 1
            r1.A0A = r0
            r1.A1M(r4)
        L24:
            r4.A0c = r2
            java.lang.ThreadLocal<X.FTU> r3 = X.FTU.A05
            java.lang.Object r0 = r3.get()
            X.FTU r0 = (X.FTU) r0
            r4.A0E = r0
            if (r0 != 0) goto L5b
            X.FTU r0 = new X.FTU
            r0.<init>()
            r4.A0E = r0
            android.view.Display r1 = r4.getDisplay()
            boolean r0 = r4.isInEditMode()
            if (r0 != 0) goto L70
            if (r1 == 0) goto L70
            float r1 = r1.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L70
        L4f:
            X.FTU r2 = r4.A0E
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r0 / r1
            long r0 = (long) r0
            r2.A00 = r0
            r3.set(r2)
        L5b:
            X.FTU r1 = r4.A0E
            boolean r0 = androidx.recyclerview.widget.RecyclerView.A1H
            if (r0 == 0) goto L75
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r1.A02
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L75
            java.lang.String r0 = "RecyclerView already present in worker list!"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L70:
            r1 = 1114636288(0x42700000, float:60.0)
            goto L4f
        L73:
            r1 = 0
            goto L13
        L75:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r1.A02
            r0.add(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FTP ftp = this.A0G;
        if (ftp != null) {
            ftp.A04();
        }
        A0m();
        this.A0W = false;
        FTN ftn = this.A0H;
        if (ftn != null) {
            ftn.A0A = false;
            ftn.A1N(this);
        }
        this.A1A.clear();
        removeCallbacks(this.A0O);
        while (FU0.A03.A2t() != null) {
        }
        FTR ftr = this.A11;
        int i = 0;
        while (true) {
            ArrayList<FTV> arrayList = ftr.A06;
            if (i >= arrayList.size()) {
                break;
            }
            BDV.A01(AbstractC7607F5u.A0n(arrayList, i).A0I);
            i++;
        }
        FTR.A00(ftr.A08.A0F, ftr, false);
        BT4 bt4 = new BT4(this);
        while (bt4.hasNext()) {
            ArrayList<BDY> arrayList2 = BDV.A00((View) bt4.next()).A00;
            for (int iA0E = AnonymousClass002.A0E(arrayList2); -1 < iA0E; iA0E--) {
                ((BDX) arrayList2.get(iA0E)).A00.A0C();
            }
        }
        FTU ftu = this.A0E;
        if (ftu != null) {
            boolean zRemove = ftu.A02.remove(this);
            if (A1H && !zRemove) {
                throw C3cG.A0Q("RecyclerView removal failed!");
            }
            this.A0E = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<AbstractC8109FTy> arrayList = this.A18;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if ((arrayList.get(i) instanceof FZ7) && (this.A0F instanceof C8207FYz) && (this.A0H instanceof GridLayoutManager)) {
                throw BV4.A0a("getSelectedRanges");
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.A06 = null;
        this.A09 = null;
        this.A08 = null;
        this.A07 = null;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        FTV ftvA08 = A08(view);
        if (ftvA08 != null) {
            if (AnonymousClass002.A1L(ftvA08.A00 & 256)) {
                ftvA08.A00 &= -257;
            } else if (!AnonymousClass002.A1L(ftvA08.A00 & 128)) {
                throw C8j3.A0w(A0j(), C3cG.A0f(ftvA08, "Called removeDetachedView with a view which is not flagged as tmp detached."));
            }
        } else if (A1H) {
            throw C8j3.A0w(A0j(), C3cG.A0f(view, "No ViewHolder found for child: "));
        }
        view.clearAnimation();
        A0w(view);
        super.removeDetachedView(view, z);
    }

    public void setEdgeEffectFactory(AbstractC8113FUd abstractC8113FUd) {
        abstractC8113FUd.getClass();
        this.A0q = abstractC8113FUd;
        this.A06 = null;
        this.A09 = null;
        this.A08 = null;
        this.A07 = null;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().A03(z);
    }

    public void setScrollingTouchSlop(int i) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (i != 1) {
            Log.w("RecyclerView", FGI.A0I("setScrollingTouchSlop(): bad argument constant ", i, "; using default value"));
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.A0n = scaledTouchSlop;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().A06(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().A02(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FTN ftn = this.A0H;
        if (ftn != null) {
            Context context = getContext();
            if (ftn instanceof StaggeredGridLayoutManager) {
                return new C7803FFj(context, attributeSet);
            }
            if (ftn instanceof GridLayoutManager) {
                FUH fuh = new FUH(context, attributeSet);
                fuh.A00 = -1;
                fuh.A01 = 0;
                return fuh;
            }
            return new FTf(context, attributeSet);
        }
        throw BV5.A0U("RecyclerView has no LayoutManager", A0j());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:25)(9:27|(1:29)|65|30|(1:32)(1:34)|33|63|35|38)|65|30|(0)(0)|33|63|35|38) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0245, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0246, code lost:
    
        r1 = null;
        r9 = r10.getConstructor(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0258, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0259, code lost:
    
        r2.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x026b, code lost:
    
        throw new java.lang.IllegalStateException(X.FGI.A0U(r20.getPositionDescription(), ": Error creating LayoutManager ", r7), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x021a A[Catch: ClassCastException -> 0x026c, IllegalAccessException -> 0x027d, InstantiationException -> 0x028e, InvocationTargetException -> 0x029d, ClassNotFoundException -> 0x02ac, TryCatch #4 {ClassCastException -> 0x026c, ClassNotFoundException -> 0x02ac, IllegalAccessException -> 0x027d, InstantiationException -> 0x028e, InvocationTargetException -> 0x029d, blocks: (B:30:0x0214, B:32:0x021a, B:33:0x0222, B:35:0x0232, B:38:0x024b, B:37:0x0246, B:40:0x0259, B:41:0x026b, B:34:0x022d), top: B:65:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x022d A[Catch: ClassCastException -> 0x026c, IllegalAccessException -> 0x027d, InstantiationException -> 0x028e, InvocationTargetException -> 0x029d, ClassNotFoundException -> 0x02ac, TRY_LEAVE, TryCatch #4 {ClassCastException -> 0x026c, ClassNotFoundException -> 0x02ac, IllegalAccessException -> 0x027d, InstantiationException -> 0x028e, InvocationTargetException -> 0x029d, blocks: (B:30:0x0214, B:32:0x021a, B:33:0x0222, B:35:0x0232, B:38:0x024b, B:37:0x0246, B:40:0x0259, B:41:0x026b, B:34:0x022d), top: B:65:0x0214 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecyclerView(android.content.Context r19, android.util.AttributeSet r20, int r21) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.facebook.aura.R.attr._name_removed__res_0x7f040490);
    }
}
