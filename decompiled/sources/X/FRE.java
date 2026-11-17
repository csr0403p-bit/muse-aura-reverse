package X;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import com.facebook.rendercore.text.RCTextView;
import java.util.Collections;

/* loaded from: classes6.dex */
public abstract class FRE extends View {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public ViewTreeObserver.OnPreDrawListener A0A;
    public FRH A0B;
    public boolean A0C;
    public float A0D;
    public float A0E;
    public float A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public boolean A0J;
    public int A0K;
    public int A0L;
    public Drawable A0M;
    public Drawable A0N;
    public Drawable A0O;
    public final float A0P;
    public final PopupWindow A0Q;
    public final RCTextView A0R;
    public final FRD A0S;
    public final int[] A0T;
    public final long[] A0U;

    public static final void A00(FRE fre, int i, int i2, boolean z) {
        fre.A04(fre.getCurrentCursorOffset(), false, false);
        if (z || fre.A0J) {
            if (!fre.A0C) {
                RCTextView rCTextView = fre.A0R;
                float horizontalOffset = fre.A06 + fre.A02 + fre.getHorizontalOffset();
                float f = fre.A07;
                float[] fArr = RCTextView.A0h;
                synchronized (fArr) {
                    fArr[0] = horizontalOffset;
                    fArr[1] = f;
                    View view = rCTextView;
                    while (view != null) {
                        if (view != rCTextView) {
                            fArr[0] = fArr[0] - view.getScrollX();
                            fArr[1] = fArr[1] - view.getScrollY();
                        }
                        float f2 = fArr[0];
                        if (f2 >= 0.0f && fArr[1] >= 0.0f && f2 <= AbstractC7607F5u.A02(view) && fArr[1] <= AbstractC7607F5u.A03(view)) {
                            if (!view.getMatrix().isIdentity()) {
                                view.getMatrix().mapPoints(fArr);
                            }
                            fArr[0] = fArr[0] + view.getLeft();
                            fArr[1] = fArr[1] + view.getTop();
                            Object parent = view.getParent();
                            if (!(parent instanceof View)) {
                                break;
                            } else {
                                view = (View) parent;
                            }
                        } else {
                            PopupWindow popupWindow = fre.A0Q;
                            if (popupWindow.isShowing()) {
                                fre.A0C = false;
                                popupWindow.dismiss();
                                fre.A01();
                            }
                        }
                    }
                }
                fre.A0J = false;
            }
            if (i != fre.A03 || i2 != fre.A04) {
                fre.A0E += i - r2;
                fre.A0F += i2 - fre.A04;
                fre.A03 = i;
                fre.A04 = i2;
            }
            int[] iArr = {fre.A06 + fre.A02 + fre.getHorizontalOffset(), fre.A07};
            int[] iArr2 = new int[2];
            RCTextView rCTextView2 = fre.A0R;
            rCTextView2.getLocationInWindow(iArr2);
            int i3 = iArr[0] + iArr2[0];
            iArr[0] = i3;
            iArr[1] = iArr[1] + iArr2[1];
            iArr[0] = i3 - (fre.A02 + fre.getHorizontalOffset());
            PopupWindow popupWindow2 = fre.A0Q;
            if (popupWindow2.isShowing()) {
                popupWindow2.update(iArr[0], iArr[1], -1, -1);
            } else {
                popupWindow2.showAtLocation(rCTextView2, 0, iArr[0], iArr[1]);
            }
            fre.A0J = false;
        }
    }

    public final void A02() {
        this.A0C = false;
        this.A0Q.dismiss();
        A01();
        if (this.A0A != null) {
            this.A0R.getViewTreeObserver().removeOnPreDrawListener(this.A0A);
            this.A0A = null;
        }
    }

    public abstract int getCurrentCursorOffset();

    public abstract int getMagnifierHandleTrigger();

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[PHI: r0 r1
  0x00ba: PHI (r0v63 boolean) = (r0v62 boolean), (r0v65 boolean) binds: [B:37:0x00b8, B:33:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00ba: PHI (r1v20 int) = (r1v19 int), (r1v21 int) binds: [B:37:0x00b8, B:33:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r16) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FRE.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private final void A04(int i, boolean z, boolean z2) {
        boolean z3;
        RCTextView rCTextView = this.A0R;
        Layout layout = rCTextView.A06;
        if (layout != null) {
            if (i != this.A0L) {
                z3 = true;
                FRJ frj = (FRJ) this;
                FRD frd = frj.A0S;
                Spannable spannable = frd.A02;
                if (spannable != null) {
                    if (frj.A00 == 0) {
                        Selection.setSelection(spannable, i, frd.A02());
                    } else {
                        Selection.setSelection(spannable, frd.A03(), i);
                    }
                    frj.A06(false);
                    ActionMode actionMode = frd.A03;
                    if (actionMode != null) {
                        actionMode.invalidate();
                    }
                }
                int i2 = (this.A09 + 1) % 5;
                this.A09 = i2;
                this.A0T[i2] = i;
                this.A0U[i2] = SystemClock.uptimeMillis();
                this.A05++;
            } else {
                z3 = false;
                if (!z) {
                    return;
                }
            }
            int lineForOffset = layout.getLineForOffset(i);
            this.A06 = (((int) (layout.getPrimaryHorizontal(i) - 0.5f)) - this.A02) - getHorizontalOffset();
            this.A07 = Build.VERSION.SDK_INT >= 34 ? layout.getLineBottom(lineForOffset, false) : layout.getLineBottom(lineForOffset);
            this.A06 += rCTextView.getTotalPaddingLeft() - rCTextView.getScrollX();
            this.A07 += rCTextView.getTotalPaddingTop() - rCTextView.getScrollY();
            if (z3 && z2) {
                rCTextView.performHapticFeedback(9);
            }
            this.A0L = i;
            this.A0J = true;
        }
    }

    private final void A06(boolean z) {
        RCTextView rCTextView;
        Layout layout;
        if ((z || !this.A0C) && (layout = (rCTextView = this.A0R).A06) != null) {
            int currentCursorOffset = getCurrentCursorOffset();
            boolean zIsRtlCharAt = layout.isRtlCharAt(currentCursorOffset);
            Drawable drawable = this.A0M;
            Drawable drawable2 = zIsRtlCharAt ? this.A0O : this.A0N;
            this.A0M = drawable2;
            int i = ((FRJ) this).A00;
            boolean zA1M = AnonymousClass002.A1M(i);
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            if (zIsRtlCharAt != zA1M) {
                intrinsicWidth *= 3;
            }
            this.A02 = intrinsicWidth / 4;
            this.A0K = zIsRtlCharAt == AnonymousClass002.A1M(i) ? 3 : 5;
            if (drawable == this.A0M || !this.A0Q.isShowing()) {
                return;
            }
            int primaryHorizontal = (((int) (layout.getPrimaryHorizontal(currentCursorOffset) - 0.5f)) - this.A02) - getHorizontalOffset();
            this.A06 = primaryHorizontal;
            this.A06 = primaryHorizontal + (rCTextView.getTotalPaddingLeft() - rCTextView.getScrollX());
            this.A0J = true;
            A00(this, this.A03, this.A04, false);
            postInvalidate();
        }
    }

    private FRE getOtherSelectionHandle() {
        FRD frd = this.A0S;
        FRF frf = frd.A04;
        if (frf == null) {
            frf = new FRF(frd.A0F, frd);
            frd.A04 = frf;
        }
        FRJ frj = frf.A06;
        if (frj == null || !frj.A0Q.isShowing()) {
            return null;
        }
        FRJ frj2 = frf.A06;
        return frj2 == this ? frf.A05 : frj2;
    }

    public final void A01() {
        FRH frh = this.A0B;
        if (frh != null) {
            frh.A08.dismiss();
            frh.A07.cancel();
            frh.A06 = false;
            setVisible(true);
            FRE otherSelectionHandle = getOtherSelectionHandle();
            if (otherSelectionHandle != null) {
                otherSelectionHandle.setVisible(true);
            }
        }
    }

    public final void A03() {
        if (this.A0Q.isShowing()) {
            return;
        }
        this.A0L = -1;
        A04(getCurrentCursorOffset(), false, false);
        if (this.A0A == null) {
            this.A0A = new ViewTreeObserverOnPreDrawListenerC10642I0m(this, 1);
            this.A0R.getViewTreeObserver().addOnPreDrawListener(this.A0A);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FRE.A05(android.view.MotionEvent):void");
    }

    public int getCursorOffset() {
        return 0;
    }

    public float getIdealVerticalOffset() {
        return this.A0P;
    }

    public FRH getMagnifierAnimator() {
        return this.A0B;
    }

    public final int getPreferredHeight() {
        return Math.max(this.A0M.getIntrinsicHeight(), this.A0I);
    }

    public final int getPreferredWidth() {
        return Math.max(this.A0M.getIntrinsicWidth(), this.A0I);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int intrinsicWidth = this.A0M.getIntrinsicWidth();
        int horizontalOffset = getHorizontalOffset();
        Drawable drawable = this.A0M;
        drawable.setBounds(horizontalOffset, 0, intrinsicWidth + horizontalOffset, drawable.getIntrinsicHeight());
        this.A0M.draw(canvas);
    }

    public void setDrawables(Drawable drawable, Drawable drawable2) {
        this.A0N = drawable;
        this.A0O = drawable2;
        A06(true);
    }

    public void setVisible(boolean z) {
        this.A0Q.getContentView().setVisibility(z ? 0 : 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FRE(Drawable drawable, Drawable drawable2, RCTextView rCTextView, FRD frd) {
        Context context = rCTextView.getContext();
        super(context);
        this.A0L = -1;
        this.A0J = true;
        this.A08 = -1;
        this.A0U = new long[5];
        this.A0T = new int[5];
        this.A09 = 0;
        this.A05 = 0;
        this.A0R = rCTextView;
        this.A0S = frd;
        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.textSelectHandleWindowStyle);
        this.A0Q = popupWindow;
        popupWindow.setSplitTouchEnabled(true);
        popupWindow.setClippingEnabled(false);
        popupWindow.setWindowLayoutType(1002);
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        popupWindow.setContentView(this);
        setDrawables(drawable, drawable2);
        this.A0I = (int) (C60Q.A0B(context).density * 40.0f);
        float preferredHeight = getPreferredHeight();
        this.A0D = (-0.3f) * preferredHeight;
        this.A0P = preferredHeight * 0.7f;
    }

    private int getHorizontalOffset() {
        int preferredWidth = getPreferredWidth();
        int intrinsicWidth = this.A0M.getIntrinsicWidth();
        int i = this.A0K;
        if (i == 3) {
            return 0;
        }
        int i2 = preferredWidth - intrinsicWidth;
        return i != 5 ? i2 / 2 : i2;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (this.A0Q.isShowing()) {
            A04(getCurrentCursorOffset(), true, false);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(getPreferredWidth(), getPreferredHeight());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setSystemGestureExclusionRects(Collections.singletonList(new Rect(0, 0, i, i2)));
    }
}
