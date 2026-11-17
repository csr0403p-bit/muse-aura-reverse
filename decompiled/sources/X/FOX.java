package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.facebook.aura.R;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FOX extends Dialog {
    public static final FSE A0N = new I0O(0);
    public static final FSE A0O = new I0O(2);
    public float A00;
    public float A01;
    public int A02;
    public Context A03;
    public FrameLayout A04;
    public FPP A05;
    public FPY A06;
    public C8003FOx A07;
    public FSE A08;
    public FSE A09;
    public FS7 A0A;
    public C8005FOz A0B;
    public Float A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public View A0K;
    public final Handler A0L;
    public final FSC A0M;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.app.Dialog, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r3 = 0
            X.C7384Etj.A0Y(r6, r3)
            X.FPn r0 = X.FP9.A03
            int r4 = r6.getActionMasked()
            r2 = 1
            if (r4 == 0) goto L2f
            if (r4 == r2) goto L33
            r1 = 3
            if (r4 == r1) goto L3e
        L12:
            X.FP9.A03 = r0
            int r0 = r6.getAction()
            if (r0 != r2) goto L44
            java.util.concurrent.atomic.AtomicLong r2 = X.FP9.A02
            long r0 = r6.getEventTime()
            r2.set(r0)
            java.util.concurrent.atomic.AtomicLong r2 = X.FP9.A01
            X.DK9 r0 = X.FP9.A00
            long r0 = r0.now()
            r2.set(r0)
            goto L44
        L2f:
            r6.getEventTime()
            goto L3e
        L33:
            r6.getDownTime()
            r6.getEventTime()
            X.DK9 r0 = X.FP9.A00
            r0.now()
        L3e:
            X.FPn r0 = new X.FPn
            r0.<init>()
            goto L12
        L44:
            boolean r0 = super.dispatchTouchEvent(r6)     // Catch: java.lang.NullPointerException -> L49
            return r0
        L49:
            r2 = move-exception
            java.lang.String r1 = "FoaBottomSheetDialog"
            java.lang.String r0 = "NullPointerException in dispatchTouchEvent, child view was removed during touch dispatch"
            X.CFK.A08(r1, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FOX.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog
    public final void show() {
        FSE fse;
        AccessibilityManager accessibilityManagerA0F;
        Integer num;
        this.A0H = false;
        Set<FSE> set = this.A0A.A0K;
        FSE fse2 = A0N;
        if (!set.contains(fse2)) {
            set.add(fse2);
        }
        FS7 fs7 = this.A0A;
        FS8 fs8 = fs7.A06;
        C8003FOx c8003FOx = this.A07;
        fs8.A0A(c8003FOx == null ? null : c8003FOx.A00());
        C8003FOx c8003FOx2 = this.A07;
        int iIntValue = (c8003FOx2 == null || (num = c8003FOx2.A01.A02) == null) ? -1 : num.intValue();
        fs7.A0C = true;
        super.show();
        Context context = this.A03;
        if ((!Boolean.getBoolean("is_accessibility_enabled") && (context == null || (accessibilityManagerA0F = AbstractC7608F5v.A0F(context)) == null || !accessibilityManagerA0F.isTouchExplorationEnabled())) || (fse = this.A08) == null) {
            fse = this.A09;
        }
        fs7.A02(fse, iIntValue, this.A0I);
    }

    public static void A00(FOX fox) {
        InputMethodManager inputMethodManager;
        Integer num;
        FS7 fs7 = fox.A0A;
        if (!fs7.hasWindowFocus() || fox.A0G) {
            fox.A02();
        }
        Window window = fox.getWindow();
        if (window != null) {
            window.setFlags(8, 8);
        }
        fox.A0H = true;
        Set<FSE> set = fs7.A0K;
        FSE fse = A0N;
        if (set.contains(fse)) {
            set.remove(fse);
        }
        if (!fox.A0D) {
            fox.A03(0.0f);
        }
        FS8 fs8 = fs7.A06;
        C8003FOx c8003FOx = fox.A07;
        fs8.A0A(c8003FOx == null ? null : c8003FOx.A00());
        C8003FOx c8003FOx2 = fox.A07;
        fs7.A02(fse, (c8003FOx2 == null || (num = c8003FOx2.A01.A02) == null) ? -1 : num.intValue(), false);
        fs7.setInteractable(false);
        View currentFocus = fox.getCurrentFocus();
        if (currentFocus == null || (inputMethodManager = (InputMethodManager) C8j4.A0n(currentFocus)) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    public static void A01(FOX fox, float f) {
        ColorDrawable colorDrawable;
        Float f2 = fox.A0C;
        float fFloatValue = f2 != null ? f2.floatValue() : f * fox.A01;
        Window window = fox.getWindow();
        if (window != null) {
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            View childAt = viewGroup.getChildAt(0);
            View view = viewGroup;
            if (childAt != null) {
                view = childAt;
            }
            int iA05 = EGb.A05(fox.A02, (int) (Math.min(1.0f, Math.max(0.0f, fFloatValue)) * 255.0f));
            Drawable background = view.getBackground();
            if (background instanceof ColorDrawable) {
                colorDrawable = (ColorDrawable) background;
            } else {
                colorDrawable = new ColorDrawable();
                view.setBackground(colorDrawable);
            }
            colorDrawable.setColor(iA05);
        }
    }

    public final void A03(float f) {
        if (this.A01 != f) {
            this.A01 = f;
            A01(this, this.A00);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(java.lang.Integer r9) {
        /*
            r8 = this;
            X.FPP r7 = r8.A05
            if (r7 == 0) goto L64
            r6 = 0
            X.FOS r5 = r7.A01
            X.FNW r0 = X.FOF.A00
            java.util.Deque<X.FNZ> r0 = r5.A0K
            X.AbstractC7610F5x.A1T(r0)
            r0.size()
            X.F0C<java.lang.String> r4 = X.FNW.A00
            java.lang.Object r1 = X.C7384Etj.A0G(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "DEFAULT"
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.Integer r0 = X.C79.A01
            r2 = 2
            if (r9 == r0) goto L47
            int r1 = r9.intValue()
            r0 = 3
            if (r1 == r6) goto L32
            if (r1 == r2) goto L45
            if (r1 != r0) goto L34
            r0 = 5
        L32:
            r5.A00 = r0
        L34:
            java.lang.Object r1 = X.C7384Etj.A0G(r4)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L64
            java.lang.IllegalArgumentException r0 = X.AbstractC7610F5x.A0o(r1)
            throw r0
        L45:
            r0 = 4
            goto L32
        L47:
            android.content.Context r0 = r7.A00
            r5.A0B(r0)
            r5.A00 = r2
            java.lang.Object r1 = X.C7384Etj.A0G(r4)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L67
            java.lang.IllegalArgumentException r0 = X.AbstractC7610F5x.A0o(r1)
            throw r0
        L5f:
            java.lang.IllegalArgumentException r0 = X.AbstractC7610F5x.A0o(r1)
            throw r0
        L64:
            super.cancel()
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FOX.A04(java.lang.Integer):void");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        A04(C79.A0P);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.A0E) {
            A04(C79.A01);
        }
    }

    public FOX(Context context, EnumC7946FMb enumC7946FMb, boolean z, boolean z2) {
        Integer num;
        super(context, R.style._name_removed__res_0x7f130076);
        this.A0M = new C7984FOb(this);
        this.A09 = A0O;
        this.A08 = new I0O(1);
        this.A0H = false;
        this.A0L = C60O.A02();
        this.A0F = true;
        this.A0E = true;
        this.A0D = true;
        this.A0J = true;
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A0C = null;
        this.A02 = -16777216;
        this.A0I = false;
        this.A0G = false;
        Context context2 = getContext();
        this.A03 = context2;
        FS7 fs7 = new FS7(context2);
        this.A0A = fs7;
        fs7.A0J.add(this.A0M);
        FS7 fs72 = this.A0A;
        C8003FOx c8003FOx = this.A07;
        fs72.A00 = (c8003FOx == null || (num = c8003FOx.A01.A02) == null) ? -1 : num.intValue();
        FSE fse = A0N;
        fs72.A03(new FSE[]{fse, this.A09, this.A08}, true);
        Set<FSE> set = this.A0A.A0K;
        if (!set.contains(fse)) {
            set.add(fse);
        }
        FS7 fs73 = this.A0A;
        fs73.A02 = new C8006FPa(this);
        FS8 fs8 = fs73.A06;
        C8003FOx c8003FOx2 = this.A07;
        fs8.A0A(c8003FOx2 == null ? null : c8003FOx2.A00());
        FrameLayout frameLayout = new FrameLayout(this.A03);
        this.A04 = frameLayout;
        frameLayout.addView(this.A0A);
        C8005FOz c8005FOz = new C8005FOz(this.A03);
        this.A0B = c8005FOz;
        c8005FOz.setAutomaticStatusBarInsets(!z2);
        this.A0B.setAutomaticNavigationBarInsets(!z);
        this.A0B.A0B.A00.add(new C8000FOt(this));
        this.A0B.setKeyboardMode(enumC7946FMb);
        this.A0B.addView(this.A04);
        super.setContentView(this.A0B);
        AbstractC8060FRo.A06(this.A0A, new I0C(this, 0));
    }

    public final void A02() {
        View viewPeekDecorView;
        InputMethodManager inputMethodManager;
        View currentFocus = getCurrentFocus();
        if (currentFocus != null && (inputMethodManager = (InputMethodManager) C8j4.A0n(currentFocus)) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        try {
            super.dismiss();
        } catch (IllegalArgumentException e) {
            Window window = getWindow();
            if (window != null && (viewPeekDecorView = window.peekDecorView()) != null && viewPeekDecorView.isAttachedToWindow()) {
                throw e;
            }
            CFK.A0A("FoaBottomSheetDialog", "Dialog window was already removed from the window manager", e);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.A0L;
        if (looperMyLooper == handler.getLooper()) {
            A00(this);
        } else {
            handler.post(new Runnable() { // from class: X.FPR
                public static final String __redex_internal_original_name = "FoaBottomSheetDialog$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    FOX.A00(this.A00);
                }
            });
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        this.A0E = z;
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.A0F = z;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        setContentView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.A0A, false), null);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        View view2 = this.A0K;
        if (view2 != null) {
            this.A0A.removeView(view2);
        }
        this.A0K = view;
        FS7 fs7 = this.A0A;
        if (layoutParams == null) {
            fs7.addView(view);
        } else {
            fs7.addView(view, layoutParams);
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        setContentView(view, null);
    }
}
