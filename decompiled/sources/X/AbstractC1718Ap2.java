package X;

import android.content.Context;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.facebook.aura.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Ap2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1718Ap2 extends ViewGroup {
    public C1575Alq A00;
    public IBinder A01;
    public BMy A02;
    public BBV A03;
    public WeakReference<BBV> A04;
    public Function0<Unit> A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;

    public AbstractC1718Ap2(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.A05 = BDU.A00.ANo(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[LOOP:0: B:3:0x0005->B:11:0x001b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0024 A[EDGE_INSN: B:16:0x0024->B:14:0x0024 BREAK  A[LOOP:0: B:3:0x0005->B:11:0x001b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A02(android.view.View r4, int r5) {
        /*
            r3 = 0
            r2 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
        L5:
            if (r4 == 0) goto L24
            java.lang.Object r0 = r4.getTag(r5)
            if (r0 == 0) goto L11
            if (r3 != 0) goto L1e
            r3 = r0
        L10:
            r1 = r2
        L11:
            int r2 = r2 + 1
            android.view.ViewParent r4 = X.AbstractC1722ApB.A00(r4)
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L24
            android.view.View r4 = (android.view.View) r4
            goto L5
        L1e:
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L10
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1718Ap2.A02(android.view.View, int):int");
    }

    public final void A0C() {
        AndroidComposeView androidComposeView;
        View childAt = getChildAt(0);
        if ((childAt instanceof AndroidComposeView) && (androidComposeView = (AndroidComposeView) childAt) != null) {
            androidComposeView.A0M();
        }
        BMy bMy = this.A02;
        if (bMy != null) {
            bMy.dispose();
        }
        this.A02 = null;
        requestLayout();
    }

    public void A0D(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public void A0F(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public abstract boolean getShouldCreateCompositionOnAttachedToWindow();

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, X.BOg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.BBV A04() {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1718Ap2.A04():X.BBV");
    }

    private final void A07() {
        if (!this.A06) {
            throw C8j3.A18(FGI.A0U("Cannot add views to ", C3cI.A0Y(this), "; only Compose content is supported"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8 A[Catch: all -> 0x0137, TryCatch #0 {all -> 0x0137, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x001a, B:12:0x0022, B:14:0x0026, B:15:0x002a, B:17:0x0034, B:22:0x0043, B:35:0x0065, B:36:0x006b, B:24:0x0047, B:27:0x004f, B:34:0x005e, B:29:0x0053, B:38:0x0071, B:39:0x0073, B:37:0x006c, B:40:0x008d, B:42:0x00a5, B:43:0x00cc, B:45:0x00d2, B:47:0x00da, B:49:0x00de, B:50:0x00e1, B:52:0x00e8, B:53:0x00ed, B:55:0x00f8, B:58:0x0112, B:57:0x00fc, B:60:0x0124, B:59:0x0121), top: B:70:0x000f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc A[Catch: all -> 0x0137, TryCatch #0 {all -> 0x0137, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x001a, B:12:0x0022, B:14:0x0026, B:15:0x002a, B:17:0x0034, B:22:0x0043, B:35:0x0065, B:36:0x006b, B:24:0x0047, B:27:0x004f, B:34:0x005e, B:29:0x0053, B:38:0x0071, B:39:0x0073, B:37:0x006c, B:40:0x008d, B:42:0x00a5, B:43:0x00cc, B:45:0x00d2, B:47:0x00da, B:49:0x00de, B:50:0x00e1, B:52:0x00e8, B:53:0x00ed, B:55:0x00f8, B:58:0x0112, B:57:0x00fc, B:60:0x0124, B:59:0x0121), top: B:70:0x000f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A08() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1718Ap2.A08():void");
    }

    private final void A09(BBV bbv) {
        if (!(bbv instanceof BBH) || ((BBH) bbv).A0Q.getValue().compareTo(BFw.A07) > 0) {
            this.A04 = new WeakReference<>(bbv);
        }
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    public static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(BBV bbv) {
        if (this.A03 != bbv) {
            this.A03 = bbv;
            if (bbv != null) {
                this.A04 = null;
            }
            BMy bMy = this.A02;
            if (bMy != null) {
                bMy.dispose();
                this.A02 = null;
                if (isAttachedToWindow()) {
                    A08();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.A01 != iBinder) {
            this.A01 = iBinder;
            this.A04 = null;
        }
    }

    public final void A0B() {
        C1575Alq c1575Alq;
        if (this.A03 == null && !isAttachedToWindow() && ((c1575Alq = this.A00) == null || !c1575Alq.A02.isAttachedToWindow())) {
            throw C3cG.A0Q("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
        A08();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0E(BFM bfm, int i) {
        BBb bBbAAc;
        int i2;
        ApG apG;
        if (this instanceof B1N) {
            B1N b1n = (B1N) this;
            bfm.AgG(1735448596);
            int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, b1n) | i : i;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
                AnonymousClass001.A1H(bfm, (G0V) b1n.A05.getValue(), 0);
            } else {
                bfm.Afo();
            }
            bBbAAc = bfm.AAc();
            if (bBbAAc == null) {
                return;
            }
            i2 = 3;
            apG = b1n;
        } else {
            ApG apG2 = (ApG) this;
            bfm.AgG(576708319);
            if ((((i & 6) == 0 ? AnonymousClass004.A0T(bfm, apG2) | i : i) & 3) == 2 && bfm.AKh()) {
                bfm.Afo();
            } else {
                AnonymousClass001.A1H(bfm, (G0V) apG2.A03.getValue(), 0);
            }
            bBbAAc = bfm.AAc();
            if (bBbAAc == null) {
                return;
            }
            i2 = 1;
            apG = apG2;
        }
        bBbAAc.A06 = new C2330BUe(apG, i, i2);
    }

    public final C1575Alq getComposeViewContext$ui() {
        return this.A00;
    }

    public final boolean getHasComposition() {
        return AnonymousClass002.A1X(this.A02);
    }

    public final boolean getShowLayoutBounds() {
        return this.A08;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.A07 || super.isTransitionGroup();
    }

    public final void setComposeViewContext$ui(C1575Alq c1575Alq) {
        AndroidComposeView androidComposeView;
        if (this.A00 != c1575Alq) {
            if (c1575Alq == null) {
                A0C();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                if ((childAt instanceof AndroidComposeView) && (androidComposeView = (AndroidComposeView) childAt) != null) {
                    if (androidComposeView.A0A != c1575Alq.A03.A0T()) {
                        A0C();
                    }
                    androidComposeView.setComposeViewContext(c1575Alq);
                }
            }
            this.A00 = c1575Alq;
        }
    }

    public final void setShowLayoutBounds(boolean z) {
        this.A08 = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((AndroidComposeView) ((InterfaceC1464AjX) childAt)).A0H = z;
        }
    }

    public final void setViewCompositionStrategy(InterfaceC1725ApE interfaceC1725ApE) {
        Function0<Unit> function0 = this.A05;
        if (function0 != null) {
            function0.invoke();
        }
        this.A05 = interfaceC1725ApE.ANo(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public static final View A03(View view) {
        View view2;
        View view3;
        if (view.isAttachedToWindow()) {
            int iMin = Math.min(A02(view, R.id.view_tree_lifecycle_owner), A02(view, R.id.view_tree_saved_state_registry_owner));
            int i = 0;
            View view4 = view;
            do {
                if (i == iMin) {
                    if (!(view.getParent() instanceof ViewGroup)) {
                        return view4;
                    }
                } else if (A05(view) == null) {
                    i++;
                    Object objA00 = AbstractC1722ApB.A00(view);
                    view2 = objA00 instanceof View ? (View) objA00 : null;
                    view3 = view4;
                    view4 = view;
                    view = view2;
                }
            } while (view2 != null);
            return view3;
        }
        return view;
    }

    public static final C1575Alq A05(View view) {
        Reference reference;
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        if (!(tag instanceof WeakReference) || (reference = (Reference) tag) == null) {
            return null;
        }
        return (C1575Alq) reference.get();
    }

    private final C1575Alq A06(View view, C1575Alq c1575Alq) {
        BBV bbvA04 = A04();
        C1HY c1hyA00 = AbstractC1720Ap8.A00(view);
        BOD bodA00 = ViewTreeViewModelStoreOwner.A00(view);
        A6I a6iA00 = Ap6.A00(view);
        BBV bbv = c1575Alq.A03;
        if (bbvA04 == bbv && c1hyA00 == c1575Alq.A0J && bodA00 == c1575Alq.A0K && a6iA00 == c1575Alq.A0L) {
            return c1575Alq;
        }
        if (bbvA04.A0T() != bbv.A0T()) {
            A0C();
        }
        if (c1hyA00 == null) {
            c1hyA00 = c1575Alq.A0J;
        }
        if (a6iA00 == null) {
            a6iA00 = c1575Alq.A0L;
        }
        C1575Alq c1575Alq2 = new C1575Alq(view, bbvA04, c1575Alq, c1hyA00, bodA00, a6iA00);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c1575Alq2));
        return c1575Alq2;
    }

    public static final void A0A(AbstractC1718Ap2 abstractC1718Ap2) {
        AndroidComposeView androidComposeView;
        if (abstractC1718Ap2.isAttachedToWindow()) {
            abstractC1718Ap2.setPreviousAttachedWindowToken(abstractC1718Ap2.getWindowToken());
            if (abstractC1718Ap2.A00 == null && abstractC1718Ap2.getChildCount() != 0) {
                View childAt = abstractC1718Ap2.getChildAt(0);
                if ((childAt instanceof AndroidComposeView) && (androidComposeView = (AndroidComposeView) childAt) != null) {
                    androidComposeView.setComposeViewContext(abstractC1718Ap2.A06(A03(abstractC1718Ap2), androidComposeView.getComposeViewContext()));
                }
            }
            if (abstractC1718Ap2.getShouldCreateCompositionOnAttachedToWindow()) {
                abstractC1718Ap2.A08();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        A07();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A07();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m18getAutoClearFocusBehavior4UtRPd4() {
        C1622Amt c1622Amt;
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        if (!(tag instanceof C1622Amt) || (c1622Amt = (C1622Amt) tag) == null) {
            return 1;
        }
        return c1622Amt.A00;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this;
        C0918AHu<Context, C1BN<Float>> c0918AHu = AbstractC1639AnF.A00;
        ViewParent viewParentA00 = AbstractC1722ApB.A00(this);
        while (viewParentA00 instanceof View) {
            View view2 = (View) viewParentA00;
            if (view2.getId() == 16908290) {
                break;
            }
            viewParentA00 = view2.getParent();
            view = view2;
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new Runnable() { // from class: X.ApC
                public static final String __redex_internal_original_name = "AbstractComposeView$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1718Ap2.A0A(this.A00);
                }
            });
        } else {
            A0A(this);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        A08();
        A0D(i, i2);
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m19setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new C1622Amt(i));
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.A07 = true;
    }

    public final void setParentCompositionContext(BBV bbv) {
        setParentContext(bbv);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        A0F(z, i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        A07();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        A07();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        A07();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A07();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        A07();
        super.addView(view, layoutParams);
    }
}
