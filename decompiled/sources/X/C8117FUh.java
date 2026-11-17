package X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState;

/* renamed from: X.FUh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8117FUh extends ViewGroup implements FU2, FU9, InterfaceC8078FSh {
    public static final int[] A0b = {R.attr.enabled};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public Animation.AnimationListener A0B;
    public Animation A0C;
    public Animation A0D;
    public Animation A0E;
    public Animation A0F;
    public C8119FUj A0G;
    public C8124FUo A0H;
    public InterfaceC10528Hpg A0I;
    public InterfaceC7937FLj A0J;
    public boolean A0K;
    public boolean A0L;
    public float A0M;
    public float A0N;
    public float A0O;
    public View A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final Animation A0T;
    public final Animation A0U;
    public final DecelerateInterpolator A0V;
    public final FTg A0W;
    public final Hqj A0X;
    public final int[] A0Y;
    public final int[] A0Z;
    public final int[] A0a;

    public C8117FUh(Context context) {
        super(context, null);
        this.A0L = false;
        this.A00 = -1.0f;
        this.A0a = new int[2];
        this.A0Z = new int[2];
        this.A0Y = new int[2];
        this.A01 = -1;
        this.A03 = -1;
        this.A0B = new AnimationAnimationListenerC8118FUi(this);
        this.A0T = new I0B(this, 2);
        this.A0U = new I0B(this, 3);
        this.A0A = ViewConfiguration.get(context).getScaledTouchSlop();
        Resources resources = getResources();
        this.A07 = resources.getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.A0V = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.A02 = (int) (displayMetrics.density * 40.0f);
        Context context2 = getContext();
        C8119FUj c8119FUj = new C8119FUj(context2);
        Context context3 = c8119FUj.getContext();
        float f = C60Q.A0B(context3).density;
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(AbstractC8123FUn.A00);
        c8119FUj.A00 = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        c8119FUj.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(c8119FUj.A00);
        c8119FUj.setBackground(shapeDrawable);
        this.A0G = c8119FUj;
        C8124FUo c8124FUo = new C8124FUo(context2);
        this.A0H = c8124FUo;
        c8124FUo.A00(1);
        this.A0G.setImageDrawable(this.A0H);
        this.A0G.setVisibility(8);
        addView(this.A0G);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.A09 = i;
        this.A00 = i;
        this.A0X = new Hqj();
        this.A0W = new FTg(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.A02;
        this.A04 = i2;
        this.A08 = i2;
        AbstractC7611F5y.A0l(this, 1.0f, i2, this.A06);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes((AttributeSet) null, A0b);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // X.FU2
    public final void AUF(View view, int i, int i2, int i3, int i4, int i5) {
        AUG(view, this.A0Y, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        float f;
        if (i2 > 0) {
            float f2 = this.A0O;
            if (f2 > 0.0f) {
                float f3 = i2;
                if (f3 > f2) {
                    iArr[1] = (int) f2;
                    this.A0O = 0.0f;
                    f = 0.0f;
                } else {
                    f = f2 - f3;
                    this.A0O = f;
                    iArr[1] = i2;
                }
                A02(f);
            }
        }
        int[] iArr2 = this.A0a;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        AUG(view, this.A0Y, i, i2, i3, i4, 0);
    }

    public void setDistanceToTriggerSync(int i) {
        this.A00 = i;
    }

    public void setRefreshing(boolean z) {
        A05(this, z, false);
    }

    private void A00() {
        if (this.A0P == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.A0G)) {
                    this.A0P = childAt;
                    return;
                }
            }
        }
    }

    private void A01(float f) {
        if (f > this.A00) {
            A04(this, true, true);
            return;
        }
        this.A0L = false;
        C8124FUo c8124FUo = this.A0H;
        C8125FUp c8125FUp = c8124FUo.A05;
        c8125FUp.A04 = 0.0f;
        c8125FUp.A01 = 0.0f;
        c8124FUo.invalidateSelf();
        AnimationAnimationListenerC8121FUl animationAnimationListenerC8121FUl = new AnimationAnimationListenerC8121FUl(this);
        this.A06 = this.A04;
        Animation animation = this.A0U;
        animation.reset();
        animation.setDuration(200L);
        animation.setInterpolator(this.A0V);
        C8119FUj c8119FUj = this.A0G;
        c8119FUj.A01 = animationAnimationListenerC8121FUl;
        c8119FUj.clearAnimation();
        c8119FUj.startAnimation(animation);
        if (c8125FUp.A0F) {
            c8125FUp.A0F = false;
        }
        c8124FUo.invalidateSelf();
    }

    private void A02(float f) {
        Animation animation;
        Animation animation2;
        C8124FUo c8124FUo = this.A0H;
        C8125FUp c8125FUp = c8124FUo.A05;
        if (!c8125FUp.A0F) {
            c8125FUp.A0F = true;
        }
        c8124FUo.invalidateSelf();
        float f2 = this.A00;
        float fMin = Math.min(1.0f, Math.abs(f / f2));
        float fMax = (((float) Math.max(fMin - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - f2;
        int i = this.A05;
        if (i <= 0) {
            i = this.A09;
        }
        float f3 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f3 * 2.0f) / f3) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.A08 + ((int) ((f3 * fMin) + (f3 * fPow * 2.0f)));
        C8119FUj c8119FUj = this.A0G;
        if (c8119FUj.getVisibility() != 0) {
            c8119FUj.setVisibility(0);
        }
        c8119FUj.setScaleX(1.0f);
        c8119FUj.setScaleY(1.0f);
        float f4 = this.A00;
        int i3 = c8125FUp.A09;
        if (f < f4) {
            if (i3 > 76 && ((animation2 = this.A0D) == null || !animation2.hasStarted() || animation2.hasEnded())) {
                C8120FUk c8120FUk = new C8120FUk(this, c8125FUp.A09, 76);
                c8120FUk.setDuration(300L);
                c8119FUj.A01 = null;
                c8119FUj.clearAnimation();
                c8119FUj.startAnimation(c8120FUk);
                this.A0D = c8120FUk;
            }
        } else if (i3 < 255 && ((animation = this.A0C) == null || !animation.hasStarted() || animation.hasEnded())) {
            C8120FUk c8120FUk2 = new C8120FUk(this, c8125FUp.A09, 255);
            c8120FUk2.setDuration(300L);
            c8119FUj.A01 = null;
            c8119FUj.clearAnimation();
            c8119FUj.startAnimation(c8120FUk2);
            this.A0C = c8120FUk2;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        c8125FUp.A04 = 0.0f;
        c8125FUp.A01 = fMin2;
        c8124FUo.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        if (fMin3 != c8125FUp.A00) {
            c8125FUp.A00 = fMin3;
        }
        c8124FUo.invalidateSelf();
        c8125FUp.A03 = (((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f;
        c8124FUo.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.A04);
    }

    private void A03(float f) {
        float f2 = this.A0M;
        float f3 = f - f2;
        float f4 = this.A0A;
        if (f3 <= f4 || this.A0R) {
            return;
        }
        this.A0N = f2 + f4;
        this.A0R = true;
        this.A0H.setAlpha(76);
    }

    public static void A04(C8117FUh c8117FUh, boolean z, boolean z2) {
        if (c8117FUh.A0L != z) {
            c8117FUh.A0K = z2;
            c8117FUh.A00();
            c8117FUh.A0L = z;
            if (!z) {
                Animation.AnimationListener animationListener = c8117FUh.A0B;
                I0B i0b = new I0B(c8117FUh, 1);
                c8117FUh.A0F = i0b;
                i0b.setDuration(150L);
                C8119FUj c8119FUj = c8117FUh.A0G;
                c8119FUj.A01 = animationListener;
                c8119FUj.clearAnimation();
                c8119FUj.startAnimation(c8117FUh.A0F);
                return;
            }
            int i = c8117FUh.A04;
            Animation.AnimationListener animationListener2 = c8117FUh.A0B;
            c8117FUh.A06 = i;
            Animation animation = c8117FUh.A0T;
            animation.reset();
            animation.setDuration(200L);
            animation.setInterpolator(c8117FUh.A0V);
            if (animationListener2 != null) {
                c8117FUh.A0G.A01 = animationListener2;
            }
            C8119FUj c8119FUj2 = c8117FUh.A0G;
            c8119FUj2.clearAnimation();
            c8119FUj2.startAnimation(animation);
        }
    }

    public static void A05(C8117FUh c8117FUh, boolean z, boolean z2) {
        if (!z || c8117FUh.A0L == z) {
            A04(c8117FUh, z, false);
            return;
        }
        c8117FUh.A0L = z;
        c8117FUh.setTargetOffsetTopAndBottom((c8117FUh.A09 + c8117FUh.A08) - c8117FUh.A04);
        c8117FUh.A0K = z2;
        Animation.AnimationListener animationListener = c8117FUh.A0B;
        C8119FUj c8119FUj = c8117FUh.A0G;
        c8119FUj.setVisibility(0);
        c8117FUh.A0H.setAlpha(255);
        I0B i0b = new I0B(c8117FUh, 0);
        c8117FUh.A0E = i0b;
        i0b.setDuration(c8117FUh.A07);
        if (animationListener != null) {
            c8119FUj.A01 = animationListener;
        }
        c8119FUj.clearAnimation();
        c8119FUj.startAnimation(c8117FUh.A0E);
    }

    private final boolean A06() {
        InterfaceC10528Hpg interfaceC10528Hpg = this.A0I;
        View view = this.A0P;
        return interfaceC10528Hpg != null ? interfaceC10528Hpg.canChildScrollUp(this, view) : view instanceof ListView ? ((AbsListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    private void setColorViewAlpha(int i) {
        this.A0G.getBackground().setAlpha(i);
        this.A0H.setAlpha(i);
    }

    public final void A07() {
        C8119FUj c8119FUj = this.A0G;
        c8119FUj.clearAnimation();
        this.A0H.stop();
        c8119FUj.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.A08 - this.A04);
        this.A04 = c8119FUj.getTop();
    }

    @Override // X.FU2
    public final void AUE(View view, int[] iArr, int i, int i2, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // X.FU9
    public final void AUG(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            int i6 = iArr[1];
            int[] iArr2 = this.A0Z;
            FTg.A01(this.A0W, iArr2, iArr, i, i2, i3, i4, 0);
            int i7 = i4 - (iArr[1] - i6);
            if ((i7 == 0 ? i4 + iArr2[1] : i7) >= 0 || A06()) {
                return;
            }
            float fAbs = this.A0O + Math.abs(r10);
            this.A0O = fAbs;
            A02(fAbs);
            AbstractC7607F5u.A1T(iArr, 1, i7);
        }
    }

    @Override // X.FU2
    public final void AUH(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // X.FU2
    public final boolean AWB(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // X.FU2
    public final void AWH(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        A05(this, true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A0W.A05(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.A0W.A04(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A0W.A07(iArr, iArr2, i, i2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return FTg.A01(this.A0W, iArr, null, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.A03;
        return i3 >= 0 ? i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        Hqj hqj = this.A0X;
        return hqj.A01 | hqj.A00;
    }

    public int getProgressCircleDiameter() {
        return this.A02;
    }

    public int getProgressViewEndOffset() {
        return this.A09;
    }

    public int getProgressViewStartOffset() {
        return this.A08;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return AnonymousClass002.A1X(this.A0W.A01);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.A0W.A02;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.A0W.A04(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.A0X.A01 = i;
        startNestedScroll(i & 2);
        this.A0O = 0.0f;
        this.A0S = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SwipeRefreshLayout$SavedState swipeRefreshLayout$SavedState = (SwipeRefreshLayout$SavedState) parcelable;
        super.onRestoreInstanceState(swipeRefreshLayout$SavedState.getSuperState());
        A05(this, swipeRefreshLayout$SavedState.A00, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.A0X.A01 = 0;
        this.A0S = false;
        float f = this.A0O;
        if (f > 0.0f) {
            A01(f);
            this.A0O = 0.0f;
        } else {
            post(new Runnable() { // from class: X.FUm
                public static final String __redex_internal_original_name = "SwipeRefreshLayout$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A07();
                }
            });
        }
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (!this.A0Q || (view = this.A0P) == null || view.isNestedScrollingEnabled()) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAnimationProgress(float f) {
        C8119FUj c8119FUj = this.A0G;
        c8119FUj.setScaleX(f);
        c8119FUj.setScaleY(f);
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.A0Q = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.A0W.A03(z);
    }

    public void setOnChildScrollUpCallback(InterfaceC10528Hpg interfaceC10528Hpg) {
        this.A0I = interfaceC10528Hpg;
    }

    public void setOnRefreshListener(InterfaceC7937FLj interfaceC7937FLj) {
        this.A0J = interfaceC7937FLj;
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.A0G.setBackgroundColor(i);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            this.A02 = (int) (AbstractC7609F5w.A0S(this).density * (i == 0 ? 56.0f : 40.0f));
            C8119FUj c8119FUj = this.A0G;
            c8119FUj.setImageDrawable(null);
            C8124FUo c8124FUo = this.A0H;
            c8124FUo.A00(i);
            c8119FUj.setImageDrawable(c8124FUo);
        }
    }

    public void setSlingshotDistance(int i) {
        this.A05 = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        C8119FUj c8119FUj = this.A0G;
        c8119FUj.bringToFront();
        c8119FUj.offsetTopAndBottom(i);
        this.A04 = c8119FUj.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.A0W.A06(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.A0W.A02(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A07();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.A00()
            int r3 = r5.getActionMasked()
            r2 = 0
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L81
            boolean r0 = r4.A06()
            if (r0 != 0) goto L81
            boolean r0 = r4.A0L
            if (r0 != 0) goto L81
            boolean r0 = r4.A0S
            if (r0 != 0) goto L81
            if (r3 == 0) goto L61
            r0 = 1
            r1 = -1
            if (r3 == r0) goto L5e
            r0 = 2
            if (r3 == r0) goto L44
            r0 = 3
            if (r3 == r0) goto L5e
            r0 = 6
            if (r3 != r0) goto L41
            int r2 = r5.getActionIndex()
            int r1 = r5.getPointerId(r2)
            int r0 = r4.A01
            if (r1 != r0) goto L41
            boolean r0 = X.AnonymousClass002.A1M(r2)
            int r1 = r5.getPointerId(r0)
        L3f:
            r4.A01 = r1
        L41:
            boolean r0 = r4.A0R
            return r0
        L44:
            int r0 = r4.A01
            if (r0 != r1) goto L50
            java.lang.String r1 = "SwipeRefreshLayout"
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r1, r0)
            return r2
        L50:
            int r0 = r5.findPointerIndex(r0)
            if (r0 < 0) goto L81
            float r0 = r5.getY(r0)
            r4.A03(r0)
            goto L41
        L5e:
            r4.A0R = r2
            goto L3f
        L61:
            int r1 = r4.A08
            X.FUj r0 = r4.A0G
            int r0 = X.AbstractC7607F5u.A0E(r0, r1)
            r4.setTargetOffsetTopAndBottom(r0)
            int r0 = r5.getPointerId(r2)
            r4.A01 = r0
            r4.A0R = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 < 0) goto L81
            float r0 = r5.getY(r0)
            r4.A0M = r0
            goto L41
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8117FUh.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.A0P == null) {
                A00();
            }
            View view = this.A0P;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, AbstractC7610F5x.A0I(this, measuredWidth) + paddingLeft, AbstractC7610F5x.A0H(this, measuredHeight) + paddingTop);
                C8119FUj c8119FUj = this.A0G;
                int measuredWidth2 = c8119FUj.getMeasuredWidth();
                int measuredHeight2 = c8119FUj.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.A04;
                c8119FUj.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A0P == null) {
            A00();
        }
        View view = this.A0P;
        if (view != null) {
            AbstractC7608F5v.A1E(view, AbstractC7610F5x.A0H(this, getMeasuredHeight()), 1073741824, View.MeasureSpec.makeMeasureSpec(AbstractC7610F5x.A0I(this, getMeasuredWidth()), 1073741824));
            C8119FUj c8119FUj = this.A0G;
            AbstractC7608F5v.A1E(c8119FUj, this.A02, 1073741824, View.MeasureSpec.makeMeasureSpec(this.A02, 1073741824));
            this.A03 = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == c8119FUj) {
                    this.A03 = i3;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SwipeRefreshLayout$SavedState(super.onSaveInstanceState(), this.A0L);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.A0L || (i & 2) == 0) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        String str2;
        int iA1M;
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !A06() && !this.A0L && !this.A0S) {
            if (actionMasked == 0) {
                this.A01 = motionEvent.getPointerId(0);
                this.A0R = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.A01);
                if (iFindPointerIndex < 0) {
                    str = "SwipeRefreshLayout";
                    str2 = "Got ACTION_UP event but don't have an active pointer id.";
                    Log.e(str, str2);
                    return false;
                }
                if (this.A0R) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.A0N) * 0.5f;
                    this.A0R = false;
                    A01(y);
                }
                this.A01 = -1;
            } else {
                if (actionMasked == 2) {
                    int iFindPointerIndex2 = motionEvent.findPointerIndex(this.A01);
                    if (iFindPointerIndex2 < 0) {
                        str = "SwipeRefreshLayout";
                        str2 = "Got ACTION_MOVE event but have an invalid active pointer id.";
                        Log.e(str, str2);
                        return false;
                    }
                    float y2 = motionEvent.getY(iFindPointerIndex2);
                    A03(y2);
                    if (this.A0R) {
                        float f = (y2 - this.A0N) * 0.5f;
                        if (f > 0.0f) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            A02(f);
                            return true;
                        }
                    }
                    return true;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.A01) {
                                iA1M = AnonymousClass002.A1M(actionIndex);
                            }
                        }
                        return true;
                    }
                    int actionIndex2 = motionEvent.getActionIndex();
                    iA1M = actionIndex2;
                    if (actionIndex2 < 0) {
                        str = "SwipeRefreshLayout";
                        str2 = "Got ACTION_POINTER_DOWN event but have an invalid action index.";
                        Log.e(str, str2);
                        return false;
                    }
                    this.A01 = motionEvent.getPointerId(iA1M);
                    return true;
                }
            }
        }
        return false;
    }

    public void setColorSchemeColors(int... iArr) {
        A00();
        C8124FUo c8124FUo = this.A0H;
        C8125FUp c8125FUp = c8124FUo.A05;
        c8125FUp.A0G = iArr;
        c8125FUp.A0C = 0;
        int i = iArr[0];
        c8125FUp.A0D = i;
        c8125FUp.A0C = 0;
        c8125FUp.A0D = i;
        c8124FUo.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        A07();
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }
}
