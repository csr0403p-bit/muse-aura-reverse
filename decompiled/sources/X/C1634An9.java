package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1;
import com.facebook.aura.R;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.An9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1634An9 extends ViewGroup implements BKv, FPU, AnW, FU9 {
    public static final G0U<C1634An9, Unit> A0Q = new BUU(11);
    public int A00;
    public int A01;
    public long A02;
    public C8497Ff4 A03;
    public Function0<Unit> A04;
    public Function0<Unit> A05;
    public Function0<Unit> A06;
    public G0U<? super AaC, Unit> A07;
    public G0U<? super Boolean, Unit> A08;
    public boolean A09;
    public boolean A0A;
    public BRg A0B;
    public AXN A0C;
    public C1HY A0D;
    public A6I A0E;
    public G0U<? super AXN, Unit> A0F;
    public G0U<? super BRg, Unit> A0G;
    public final View A0H;
    public final NestedScrollDispatcher A0I;
    public final C1453AjM A0J;
    public final InterfaceC1464AjX A0K;
    public final Function0<Unit> A0L;
    public final Function0<Unit> A0M;
    public final int[] A0N;
    public final Hqj A0O;
    public final int[] A0P;

    public static final C8497Ff4 A03(C1634An9 c1634An9, C8497Ff4 c8497Ff4) {
        C8496Ff3 c8496Ff3 = c8497Ff4.A00;
        C8345FcJ c8345FcJA04 = c8496Ff3.A04(-1);
        C8345FcJ c8345FcJ = C8345FcJ.A04;
        if (!c8345FcJA04.equals(c8345FcJ) || !c8496Ff3.A05(-9).equals(c8345FcJ) || c8496Ff3.A06() != null) {
            Ai8 ai8 = c1634An9.A0J.A0f.A07;
            if (AZE.A03(ai8)) {
                long jA00 = AbstractC1017AQa.A00(ai8.APo(0L));
                int i = (int) (jA00 >> 32);
                if (i < 0) {
                    i = 0;
                }
                int iA09 = AnonymousClass002.A09(jA00);
                if (iA09 < 0) {
                    iA09 = 0;
                }
                long jAKd = AbstractC1496Ak3.A01(ai8).AKd();
                int i2 = (int) (jAKd & 4294967295L);
                long j = ((AZE) ai8).A03;
                long jA002 = AbstractC1017AQa.A00(ai8.APo(AnonymousClass005.A0M((int) (j >> 32), (int) (j & 4294967295L))));
                int i3 = ((int) (jAKd >> 32)) - ((int) (jA002 >> 32));
                if (i3 < 0) {
                    i3 = 0;
                }
                int iA092 = i2 - AnonymousClass002.A09(jA002);
                if (iA092 < 0) {
                    iA092 = 0;
                }
                if (i != 0 || iA09 != 0 || i3 != 0 || iA092 != 0) {
                    return c8496Ff3.A0A(i, iA09, i3, iA092);
                }
            }
        }
        return c8497Ff4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region != null) {
            int[] iArr = this.A0P;
            getLocationInWindow(iArr);
            int i = iArr[0];
            region.op(i, iArr[1], i + getWidth(), iArr[1] + getHeight(), Region.Op.DIFFERENCE);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (this.A0H.isNestedScrollingEnabled()) {
            long jA0J = AnonymousClass005.A0J(f * (-1.0f), f2 * (-1.0f));
            AnonymousClass001.A1J(new BU3(this, null, 10, jA0J), this.A0I.A02());
        }
        return false;
    }

    public static final int A01(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(ATD.A04(i3, i, i2), 1073741824);
        }
        if (i3 == -2) {
            if (i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
            }
        } else if (i3 == -1 && i2 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // X.BKv
    public final void ASU() {
        this.A05.invoke();
        removeAllViewsInLayout();
    }

    @Override // X.FU2
    public final void AUE(View view, int[] iArr, int i, int i2, int i3) {
        NestedScrollNode nestedScrollNodeA01;
        if (this.A0H.isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.A0I;
            long jA0P = (C8j3.A0P(i2 * (-1.0f)) & 4294967295L) | (C8j3.A0P(i * (-1.0f)) << 32);
            int i4 = i3 == 0 ? 1 : 2;
            NestedScrollNode nestedScrollNode = nestedScrollDispatcher.A01;
            long jMo6onPreScrollOzD1aCk = (nestedScrollNode == null || (nestedScrollNodeA01 = nestedScrollNode.A01()) == null) ? 0L : nestedScrollNodeA01.mo6onPreScrollOzD1aCk(jA0P, i4);
            iArr[0] = -Ab3.A01(AnonymousClass001.A00(jMo6onPreScrollOzD1aCk));
            iArr[1] = -Ab3.A01(AnonymousClass001.A01(jMo6onPreScrollOzD1aCk, 4294967295L));
        }
    }

    @Override // X.FU2
    public final void AUF(View view, int i, int i2, int i3, int i4, int i5) {
        NestedScrollNode nestedScrollNodeA01;
        if (this.A0H.isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.A0I;
            long jA0P = (C8j3.A0P(i2 * (-1.0f)) & 4294967295L) | (C8j3.A0P(i * (-1.0f)) << 32);
            long jA0M = AnonymousClass005.A0M(i3 * (-1.0f), i4 * (-1.0f));
            int i6 = i5 == 0 ? 1 : 2;
            NestedScrollNode nestedScrollNode = nestedScrollDispatcher.A01;
            if (nestedScrollNode == null || (nestedScrollNodeA01 = nestedScrollNode.A01()) == null) {
                return;
            }
            nestedScrollNodeA01.mo4onPostScrollDzOQY0M(jA0P, jA0M, i6);
        }
    }

    @Override // X.FU9
    public final void AUG(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        NestedScrollNode nestedScrollNodeA01;
        if (this.A0H.isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.A0I;
            long jA0P = (C8j3.A0P(i2 * (-1.0f)) & 4294967295L) | (C8j3.A0P(i * (-1.0f)) << 32);
            long jA0M = AnonymousClass005.A0M(i3 * (-1.0f), i4 * (-1.0f));
            int i6 = i5 == 0 ? 1 : 2;
            NestedScrollNode nestedScrollNode = nestedScrollDispatcher.A01;
            long jMo4onPostScrollDzOQY0M = (nestedScrollNode == null || (nestedScrollNodeA01 = nestedScrollNode.A01()) == null) ? 0L : nestedScrollNodeA01.mo4onPostScrollDzOQY0M(jA0P, jA0M, i6);
            iArr[0] = -Ab3.A01(AnonymousClass001.A00(jMo4onPostScrollDzOQY0M));
            iArr[1] = -Ab3.A01(AnonymousClass001.A01(jMo4onPostScrollDzOQY0M, 4294967295L));
        }
    }

    @Override // X.FU2
    public final void AUH(View view, View view2, int i, int i2) {
        Hqj hqj = this.A0O;
        if (i2 == 1) {
            hqj.A00 = i;
        } else {
            hqj.A01 = i;
        }
    }

    @Override // X.BKv
    public final void AVE() {
        this.A04.invoke();
    }

    @Override // X.BKv
    public final void AVb() {
        View view = this.A0H;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.A05.invoke();
        }
    }

    @Override // X.FU2
    public final boolean AWB(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // X.FU2
    public final void AWH(View view, int i) {
        Hqj hqj = this.A0O;
        if (i == 1) {
            hqj.A00 = 0;
        } else {
            hqj.A01 = 0;
        }
    }

    public final AXN getDensity() {
        return this.A0C;
    }

    public final View getInteropView() {
        return this.A0H;
    }

    public final C1453AjM getLayoutNode() {
        return this.A0J;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.A0H.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final C1HY getLifecycleOwner() {
        return this.A0D;
    }

    public final BRg getModifier() {
        return this.A0B;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        Hqj hqj = this.A0O;
        return hqj.A01 | hqj.A00;
    }

    public final G0U<AXN, Unit> getOnDensityChanged$ui() {
        return this.A0F;
    }

    public final G0U<BRg, Unit> getOnModifierChanged$ui() {
        return this.A0G;
    }

    public final G0U<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.A08;
    }

    public final Function0<Unit> getRelease() {
        return this.A04;
    }

    public final Function0<Unit> getReset() {
        return this.A05;
    }

    public final A6I getSavedStateRegistryOwner() {
        return this.A0E;
    }

    public final Function0<Unit> getUpdate() {
        return this.A06;
    }

    public final View getView() {
        return this.A0H;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.A0H.isNestedScrollingEnabled();
    }

    @Override // X.FPU
    public final C8497Ff4 onApplyWindowInsets(View view, C8497Ff4 c8497Ff4) {
        this.A03 = new C8497Ff4(c8497Ff4);
        return A03(this, c8497Ff4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0H.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.A0H;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.A0H.isNestedScrollingEnabled()) {
            long jA0J = AnonymousClass005.A0J(f * (-1.0f), f2 * (-1.0f));
            AnonymousClass001.A1J(new AndroidViewHolder$onNestedFling$1(this, null, jA0J, z), this.A0I.A02());
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        G0U<? super AaC, Unit> g0u = this.A07;
        if (g0u == null) {
            return true;
        }
        g0u.invoke(rect != null ? C8j3.A0f(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        G0U<? super Boolean, Unit> g0u = this.A08;
        if (g0u != null) {
            AnonymousClass001.A1K(z, g0u);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(AXN axn) {
        if (axn != this.A0C) {
            this.A0C = axn;
            G0U<? super AXN, Unit> g0u = this.A0F;
            if (g0u != null) {
                g0u.invoke(axn);
            }
        }
    }

    public final void setLifecycleOwner(C1HY c1hy) {
        if (c1hy != this.A0D) {
            this.A0D = c1hy;
            AbstractC1720Ap8.A01(this, c1hy);
        }
    }

    public final void setModifier(BRg bRg) {
        if (bRg != this.A0B) {
            this.A0B = bRg;
            G0U<? super BRg, Unit> g0u = this.A0G;
            if (g0u != null) {
                g0u.invoke(bRg);
            }
        }
    }

    public final void setSavedStateRegistryOwner(A6I a6i) {
        if (a6i != this.A0E) {
            this.A0E = a6i;
            setTag(R.id.view_tree_saved_state_registry_owner, a6i);
        }
    }

    public final void setUpdate(Function0<Unit> function0) {
        this.A06 = function0;
        this.A09 = true;
        this.A0M.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public C1634An9(Context context, View view, BBV bbv, NestedScrollDispatcher nestedScrollDispatcher, InterfaceC1464AjX interfaceC1464AjX) {
        super(context);
        this.A0I = nestedScrollDispatcher;
        this.A0H = view;
        this.A0K = interfaceC1464AjX;
        if (bbv != null) {
            C0918AHu<Context, C1BN<Float>> c0918AHu = AbstractC1639AnF.A00;
            setTag(R.id.androidx_compose_ui_view_composition_context, bbv);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        C8490Fex.A01(this, new C1636AnB(this));
        AbstractC8082FSn.A00(this, this);
        this.A06 = new BUV(0);
        this.A05 = new BUS(49);
        this.A04 = new BUS(48);
        BS0 bs0 = BRg.A00;
        this.A0B = bs0;
        this.A0C = new ATH(1.0f, 1.0f);
        this.A0N = new int[2];
        this.A02 = 0L;
        this.A0M = C2328BUc.A00(this, 37);
        this.A0L = C2328BUc.A00(this, 36);
        this.A0P = new int[2];
        this.A01 = Integer.MIN_VALUE;
        this.A00 = Integer.MIN_VALUE;
        this.A0O = new Hqj();
        C1453AjM c1453AjM = new C1453AjM(false, ARD.A00.addAndGet(1));
        c1453AjM.A0H = this;
        BRg bRgA01 = ARD.A01(C8jn.A00(bs0, AbstractC1638AnE.A00, this.A0I), new BUU(13), true);
        C1244Afb c1244Afb = new C1244Afb();
        c1244Afb.A01 = BUX.A00(this, 29);
        C1246Afd c1246Afd = new C1246Afd();
        C1246Afd c1246Afd2 = c1244Afb.A00;
        if (c1246Afd2 != null) {
            c1246Afd2.A00 = null;
        }
        c1244Afb.A00 = c1246Afd;
        c1246Afd.A00 = c1244Afb;
        this.A08 = c1246Afd;
        BRg bRgThen = ASZ.A00(AEk.A01(bRgA01.then(c1244Afb), new C2339BUn(this, c1453AjM, this, 10)), new C2334BUi(23, c1453AjM, this)).then(new C1770AqN(new C2326BUa(this, 5)));
        c1453AjM.Adn(this.A0B.then(bRgThen));
        this.A0G = new C2334BUi(20, bRgThen, c1453AjM);
        c1453AjM.A0Z(this.A0C);
        this.A0F = new C2326BUa(c1453AjM, 3);
        c1453AjM.A0J = new C2334BUi(21, c1453AjM, this);
        c1453AjM.A0K = new C2326BUa(this, 4);
        c1453AjM.Adi(new BSW(0, c1453AjM, this));
        this.A0J = c1453AjM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1481Ajo getSnapshotObserver() {
        if (isAttachedToWindow()) {
            return ((AndroidComposeView) this.A0K).A0q;
        }
        ASP.A01("Expected AndroidViewHolder to be attached when observing reads.");
        throw F60.createAndThrow();
    }

    @Override // X.AnW
    public final boolean APE() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @Deprecated(message = "Super method is deprecated")
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (this.A0A) {
            this.A0H.postOnAnimation(new RunnableC1641AnH(this.A0L));
            return null;
        }
        this.A0J.A0I();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0M.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (this.A0A) {
            this.A0H.postOnAnimation(new RunnableC1641AnH(this.A0L));
        } else {
            this.A0J.A0I();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().A00.A02(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public final void setOnDensityChanged$ui(G0U<? super AXN, Unit> g0u) {
        this.A0F = g0u;
    }

    public final void setOnModifierChanged$ui(G0U<? super BRg, Unit> g0u) {
        this.A0G = g0u;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(G0U<? super Boolean, Unit> g0u) {
        this.A08 = g0u;
    }

    public final void setRelease(Function0<Unit> function0) {
        this.A04 = function0;
    }

    public final void setReset(Function0<Unit> function0) {
        this.A05 = function0;
    }
}
