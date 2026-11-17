package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FSU extends C8073FSb implements InterfaceC8078FSh, FS6 {
    public final FST A00;
    public final FGR A01;
    public final FTg A02;

    public FSU(Context context) {
        super(context, new C8079FSi());
        FGE fge = new FGE(context);
        this.A01 = fge;
        this.A00 = new FST(context, fge);
        this.A02 = new FTg(this);
        addView(fge, new FrameLayout.LayoutParams(-1, -1));
        fge.setClipChildren(false);
        fge.setClipToPadding(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C7384Etj.A0Y(motionEvent, 0);
        FST fst = this.A00;
        FST.A01(motionEvent, fst);
        if (fst.A0P) {
            fst.A0W.onTouchEvent(motionEvent);
        }
        return fst.A0P;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        G0U<? super MotionEvent, Unit> g0u;
        G0U<? super MotionEvent, Unit> g0u2;
        C7384Etj.A0Y(motionEvent, 0);
        FST fst = this.A00;
        FST.A01(motionEvent, fst);
        boolean zA1Q = AnonymousClass002.A1Q(motionEvent.getPointerCount(), 1);
        fst.A0S = zA1Q;
        if (!zA1Q && fst.A0Q) {
            fst.A0Q = false;
        }
        if (fst.A0R) {
            if ((fst.A0O != null || fst.A0M != null || fst.A0N != null) && fst.A0J != C79.A0C && motionEvent.getPointerCount() == 1) {
                ((GestureDetector) fst.A0Z.getValue()).onTouchEvent(motionEvent);
            }
            if (fst.A0J.intValue() != 0 || motionEvent.getPointerCount() == 2) {
                fst.A0W.onTouchEvent(motionEvent);
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1 && actionMasked != 3) {
                return true;
            }
            if (fst.A0Q && motionEvent.getActionMasked() == 1 && (g0u2 = fst.A0N) != null) {
                g0u2.invoke(motionEvent);
            }
            fst.A0Q = false;
            if (fst.A0J == C79.A0C) {
                HxE hxEA00 = FST.A00(fst, 1.0f);
                FST.A04(fst, 1.0d, AnonymousClass001.A02(hxEA00.first) + fst.A09, AnonymousClass001.A02(hxEA00.second) + fst.A0A, false);
            }
            fst.A0P = false;
            FSU fsu = fst.A0E;
            if (fsu == null) {
                throw BV4.A0U();
            }
            fsu.getParent().requestDisallowInterceptTouchEvent(false);
            return true;
        }
        if (motionEvent.getActionMasked() == 0) {
            if (fst.A0J == C79.A01) {
                FSW fsw = fst.A0H;
                fsw.A02(fsw.A05.A00);
                FSW fsw2 = fst.A0F;
                fsw2.A02(fsw2.A05.A00);
                FSW fsw3 = fst.A0G;
                fsw3.A02(fsw3.A05.A00);
                fsw.A00();
                fsw3.A00();
                fsw2.A00();
                FST.A02(fst);
            }
            if (fst.A0J == C79.A0W) {
                fst.A09(C79.A00);
            }
            fst.A0Y.forceFinished(true);
        }
        fst.A0W.onTouchEvent(motionEvent);
        if (fst.A0J != C79.A0K && motionEvent.getPointerCount() == 1) {
            ((GestureDetector) fst.A0Z.getValue()).onTouchEvent(motionEvent);
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 != 1 && actionMasked2 != 3) {
            return true;
        }
        if (fst.A0Q && motionEvent.getActionMasked() == 1 && (g0u = fst.A0N) != null) {
            g0u.invoke(motionEvent);
        }
        fst.A0Q = false;
        Integer num = fst.A0J;
        if (num != C79.A0W && num != C79.A01) {
            float fA02 = AnonymousClass001.A02(ATD.A0A(Float.valueOf(fst.A02), new C2Cy(1.0f, fst.A06)));
            HxE hxEA002 = FST.A00(fst, fA02);
            FST.A04(fst, fA02, AnonymousClass001.A02(hxEA002.first), AnonymousClass001.A02(hxEA002.second), false);
        }
        fst.A0P = false;
        FSU fsu2 = fst.A0E;
        if (fsu2 == null) {
            throw BV4.A0U();
        }
        fsu2.getParent().requestDisallowInterceptTouchEvent(false);
        fst.A00 = 0.0f;
        fst.A01 = 0.0f;
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A02.A05(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.A02.A04(f, f2);
    }

    public final FST getController() {
        return this.A00;
    }

    public final FTg getNestedScrollingChildHelper$fbandroid_libraries_bloks_components_bk_components_zoomable_bk_components_zoomable() {
        return this.A02;
    }

    public final FGR getRenderTreeHostView() {
        return this.A01;
    }

    @Override // X.FSY, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.A02.A03(false);
        super.onDetachedFromWindow();
        FST fst = this.A00;
        FST.A03(fst);
        fst.A0D = null;
    }

    @Override // X.FSY, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A02.A03(true);
        FST fst = this.A00;
        if (fst.A0R) {
            FSU fsu = fst.A0E;
            if (fsu == null) {
                throw BV4.A0U();
            }
            View rootView = fsu.getRootView();
            C7384Etj.A0Z(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            fst.A0D = (ViewGroup) rootView;
        }
    }
}
