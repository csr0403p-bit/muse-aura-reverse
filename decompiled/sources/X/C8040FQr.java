package X;

import android.R;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.instagram.common.bloks.BloksParseResult;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.FQr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8040FQr extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public Interpolator A03;
    public Interpolator A04;
    public FR2 A05;
    public FR1 A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public FQI A0B;
    public C7729FCg A0C;
    public FGJ A0D;
    public boolean A0E;
    public final Animator.AnimatorListener A0F;
    public final Animator.AnimatorListener A0G;
    public final GestureDetector.OnGestureListener A0H;
    public final GestureDetector A0I;
    public final Runnable A0J;

    public C8040FQr(Context context, Integer num, boolean z) {
        super(context, null);
        this.A0G = new I05(this, 3);
        this.A0F = new I05(this, 4);
        this.A0J = new RunnableC8048FQz(this);
        GestureDetector.OnGestureListener gestureDetectorOnGestureListenerC8047FQy = new GestureDetectorOnGestureListenerC8047FQy(this);
        this.A0H = gestureDetectorOnGestureListenerC8047FQy;
        this.A09 = z;
        this.A07 = num;
        this.A0I = new GestureDetector(context, z ? gestureDetectorOnGestureListenerC8047FQy : new C8044FQv(this));
    }

    public final void A02() {
        View activityRootView;
        setAlpha(0.0f);
        if (this.A0A && this.A07.equals(C79.A01) && (activityRootView = getActivityRootView()) != null) {
            FQI fqi = new FQI(activityRootView, false);
            this.A0B = fqi;
            fqi.A03.add(new C8046FQx(activityRootView, this));
            this.A0B.onGlobalLayout();
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new I14(this, 4));
    }

    public static void A00(C8040FQr c8040FQr) {
        if (c8040FQr.A00 == 0 || c8040FQr.A0E) {
            return;
        }
        Runnable runnable = c8040FQr.A0J;
        c8040FQr.removeCallbacks(runnable);
        int recommendedTimeoutMillis = c8040FQr.A00;
        AccessibilityManager accessibilityManagerA0F = AbstractC7608F5v.A0F(c8040FQr.getContext());
        if (accessibilityManagerA0F != null && accessibilityManagerA0F.isEnabled()) {
            recommendedTimeoutMillis = accessibilityManagerA0F.getRecommendedTimeoutMillis(recommendedTimeoutMillis, 3);
        }
        c8040FQr.postDelayed(runnable, recommendedTimeoutMillis);
    }

    private boolean A01() {
        if (!this.A08) {
            if (getTranslationY() <= AbstractC7607F5u.A03(this) / 2.0f) {
                A04(null, this.A02);
                return true;
            }
            A03(this.A01);
        }
        return true;
    }

    public final void A03(int i) {
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        removeCallbacks(this.A0J);
        this.A0E = true;
        if (getContext() == null || !isAttachedToWindow()) {
            FR2 fr2 = this.A05;
            if (fr2 != null) {
                fr2.ASZ();
                return;
            }
            return;
        }
        clearAnimation();
        if (this.A09) {
            clearAnimation();
            viewPropertyAnimatorAlpha = animate().setDuration(i).setInterpolator(this.A03).alpha(0.0f).scaleX(1.5f).scaleY(1.5f);
        } else {
            clearAnimation();
            boolean zEquals = this.A07.equals(C79.A00);
            int height = getHeight();
            if (zEquals) {
                height = -height;
            }
            viewPropertyAnimatorAlpha = animate().setDuration(i).translationY(height).setInterpolator(this.A03).alpha(0.0f);
        }
        viewPropertyAnimatorAlpha.setListener(this.A0F);
        FQI fqi = this.A0B;
        if (fqi != null) {
            fqi.A03.clear();
            ViewTreeObserver viewTreeObserver = fqi.A02.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(fqi);
            }
            this.A0B = null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = this.A0I.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A08 = false;
            return true;
        }
        if (action != 1 && action != 3) {
            return zOnTouchEvent || super.onTouchEvent(motionEvent);
        }
        A00(this);
        return A01();
    }

    public void setAutoDismissDurationMs(int i) {
        this.A00 = i;
    }

    public void setBloksContentViewFromParseResult(Context context, FBD fbd, BloksParseResult bloksParseResult) {
        C7729FCg c7729FCg = this.A0C;
        if (c7729FCg != null) {
            c7729FCg.A03();
            this.A0C = null;
        }
        FGJ fgj = this.A0D;
        if (fgj != null) {
            removeView(fgj);
        }
        if (!context.equals(getContext())) {
            FFI.A01(null, "Different Android context for BloksHostingComponent and FoABloksPopoverView", null);
        }
        this.A0D = new FGJ(context);
        Map map = Collections.EMPTY_MAP;
        SparseArray sparseArrayA0B = BV4.A0B();
        bloksParseResult.getClass();
        fbd.getClass();
        C7729FCg c7729FCg2 = new C7729FCg(context, sparseArrayA0B, bloksParseResult, fbd, map, map);
        this.A0C = c7729FCg2;
        c7729FCg2.A05(this.A0D);
        setContentView(this.A0C.A00);
    }

    public void setContentView(View view) {
        if (view == null) {
            FFI.A01(null, "Cannot add null Bloks content view to PopoverView container.", null);
        } else {
            addView(view);
        }
    }

    public void setDismissAnimationDurationMs(int i) {
        this.A01 = i;
    }

    public void setDismissAnimationEndListener(FR2 fr2) {
        this.A05 = fr2;
    }

    public void setDismissAnimationInterpolator(Interpolator interpolator) {
        this.A03 = interpolator;
    }

    public void setIsLastGestureFling(boolean z) {
        this.A08 = z;
    }

    public void setShowAboveKeyboard(boolean z) {
        this.A0A = z;
    }

    public void setShowAnimationDurationMs(int i) {
        this.A02 = i;
    }

    public void setShowAnimationEndListener(FR1 fr1) {
        this.A06 = fr1;
    }

    public void setShowAnimationInterpolator(Interpolator interpolator) {
        this.A04 = interpolator;
    }

    private View getActivityRootView() {
        Window window;
        Activity activityA00 = HiC.A00(getContext());
        if (activityA00 == null || (window = activityA00.getWindow()) == null) {
            return null;
        }
        return window.getDecorView().findViewById(R.id.content);
    }

    public final void A04(Animator.AnimatorListener animatorListener, int i) {
        clearAnimation();
        animate().setDuration(i).translationY(0.0f).setInterpolator(this.A04).alpha(1.0f).setListener(animatorListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C7729FCg c7729FCg = this.A0C;
        if (c7729FCg != null) {
            c7729FCg.A03();
            this.A0C = null;
            this.A0D = null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            removeCallbacks(this.A0J);
        } else if (action == 1 || action == 3) {
            A00(this);
            A01();
        }
        return this.A0I.onTouchEvent(motionEvent);
    }
}
