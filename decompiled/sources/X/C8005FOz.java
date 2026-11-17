package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.FOz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8005FOz extends FrameLayout {
    public static WeakReference<FP0> A0C;
    public int A00;
    public View A01;
    public EnumC7946FMb A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public FP0 A09;
    public final FP1 A0A;
    public final C7931FLd A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8005FOz(Context context) {
        super(context);
        C7384Etj.A0Y(context, 0);
        this.A0B = new C7931FLd();
        this.A0A = new FP1();
        this.A04 = true;
        this.A06 = true;
        this.A08 = true;
        this.A02 = EnumC7946FMb.A05;
    }

    public final void setKeyboardMode(EnumC7946FMb enumC7946FMb) {
        C7384Etj.A0Y(enumC7946FMb, 0);
        if (enumC7946FMb != this.A02) {
            this.A02 = enumC7946FMb;
            if (this.A01 != null) {
                A00();
            }
        }
    }

    private final void A00() {
        View rootView;
        AbstractC8162FXe.A02("Reset window inset listeners must be called on the main thread");
        if (this.A08 || !A01()) {
            rootView = getRootView();
            C7384Etj.A0U(rootView);
        } else {
            rootView = this;
        }
        View view = this.A01;
        if (view != null) {
            C8490Fex.A01(view, null);
            AbstractC8082FSn.A00(view, null);
        }
        setWindowInsetListener(rootView);
        this.A01 = rootView;
    }

    public static final boolean A01() {
        return C8j4.A1V(Build.VERSION.SDK_INT, 29);
    }

    private final void setWindowInsetListener(View view) {
        FP0 fp0 = new FP0(this, this);
        this.A09 = fp0;
        C8490Fex.A01(view, fp0);
        AbstractC8082FSn.A00(view, this.A09);
        A0C = BV4.A0q(this.A09);
    }

    public final View getAttachedView() {
        return this.A01;
    }

    public final boolean getAutomaticLeftInsets() {
        return this.A03;
    }

    public final boolean getAutomaticNavigationBarInsets() {
        return this.A04;
    }

    public final boolean getAutomaticRightInsets() {
        return this.A05;
    }

    public final boolean getAutomaticStatusBarInsets() {
        return this.A06;
    }

    public final boolean getConsumeInsets() {
        return this.A07;
    }

    public final boolean getDecorFitsSystemWindow() {
        return this.A08;
    }

    public final int getExtraBottomPadding() {
        return this.A00;
    }

    public final EnumC7946FMb getKeyboardMode() {
        return this.A02;
    }

    public final FP1 getOnApplyWindowInsetsListenerDelegate() {
        return this.A0A;
    }

    public final C7931FLd getWindowInsetsAnimationCallbackDelegate() {
        return this.A0B;
    }

    public final void setAttachedView(View view) {
        this.A01 = view;
    }

    public final void setAutomaticLeftInsets(boolean z) {
        if (z != this.A03) {
            this.A03 = z;
            requestApplyInsets();
        }
    }

    public final void setAutomaticNavigationBarInsets(boolean z) {
        if (z != this.A04) {
            this.A04 = z;
            requestApplyInsets();
        }
    }

    public final void setAutomaticRightInsets(boolean z) {
        if (z != this.A05) {
            this.A05 = z;
            requestApplyInsets();
        }
    }

    public final void setAutomaticStatusBarInsets(boolean z) {
        if (z != this.A06) {
            this.A06 = z;
            requestApplyInsets();
        }
    }

    public final void setConsumeInsets(boolean z) {
        this.A07 = z;
    }

    public final void setDecorFitsSystemWindow(boolean z) {
        if (z != this.A08) {
            this.A08 = z;
            if (this.A01 != null) {
                A00();
            }
        }
    }

    public final void setExtraBottomPadding(int i) {
        this.A00 = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A00();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View view = this.A01;
        if (view != null) {
            WeakReference<FP0> weakReference = A0C;
            if ((weakReference != null ? weakReference.get() : null) == this.A09) {
                C8490Fex.A01(view, null);
                AbstractC8082FSn.A00(view, null);
            }
        }
        this.A0B.A00.clear();
        this.A0A.A00.clear();
        this.A01 = null;
    }
}
