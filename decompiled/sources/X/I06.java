package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes6.dex */
public final class I06 extends AnimatorListenerAdapter {
    public final int $t;
    public final int A00;
    public final Object A01;

    public I06(FW1 fw1, int i, int i2) {
        this.$t = i2;
        this.A01 = fw1;
        this.A00 = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ((FW1) this.A01).A02();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (1 - this.$t != 0) {
            super.onAnimationStart(animator);
            return;
        }
        FW1 fw1 = (FW1) this.A01;
        Handler handler = FW1.A0H;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) fw1.A0F;
        snackbarContentLayout.A01.setAlpha(1.0f);
        snackbarContentLayout.A01.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
        if (snackbarContentLayout.A00.getVisibility() == 0) {
            snackbarContentLayout.A00.setAlpha(1.0f);
            snackbarContentLayout.A00.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
        }
    }
}
