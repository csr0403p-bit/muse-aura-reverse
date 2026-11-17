package X;

import android.animation.Animator;

/* loaded from: classes6.dex */
public final class FD2 implements Runnable {
    public static final String __redex_internal_original_name = "ScreenQueryWrapperBinderUtil$getScreenTransitionsMountBinder$1$bind$1$onGlobalLayout$1";
    public final /* synthetic */ C7747FCz A00;

    public FD2(C7747FCz c7747FCz) {
        this.A00 = c7747FCz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7747FCz c7747FCz = this.A00;
        Animator animator = c7747FCz.A00;
        if (animator != null) {
            if (c7747FCz.A08) {
                animator.end();
            } else {
                animator.start();
            }
        }
    }
}
