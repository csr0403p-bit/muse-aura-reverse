package X;

import android.animation.ValueAnimator;

/* loaded from: classes6.dex */
public final class HwE implements InterfaceC2787BlA {
    public float A00;
    public ValueAnimator A01;
    public final /* synthetic */ C2919Bok A02;

    public HwE(C2919Bok c2919Bok) {
        this.A02 = c2919Bok;
    }

    @Override // X.InterfaceC2787BlA
    public final void A4Q(final BlP blP, long j) {
        AbstractC2875Bni.A01("ScreenFlashView", "ScreenFlash#apply");
        C2919Bok c2919Bok = this.A02;
        this.A00 = c2919Bok.getBrightness();
        c2919Bok.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        blP.getClass();
        Runnable runnable = new Runnable() { // from class: X.Hxx
            public static final String __redex_internal_original_name = "ScreenFlashView$1$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                blP.ASK();
            }
        };
        AbstractC2875Bni.A01("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        C8919Ftb.A01(valueAnimatorOfFloat, c2919Bok, 0);
        valueAnimatorOfFloat.addListener(new I0N(0, c2919Bok, runnable));
        valueAnimatorOfFloat.start();
        this.A01 = valueAnimatorOfFloat;
    }

    @Override // X.InterfaceC2787BlA
    public final void clear() {
        AbstractC2875Bni.A01("ScreenFlashView", "ScreenFlash#clearScreenFlashUi");
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.A01 = null;
        }
        C2919Bok c2919Bok = this.A02;
        c2919Bok.setAlpha(0.0f);
        c2919Bok.setBrightness(this.A00);
    }
}
