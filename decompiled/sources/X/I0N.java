package X;

import android.animation.Animator;

/* loaded from: classes6.dex */
public final class I0N implements Animator.AnimatorListener {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public I0N(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.$t == 0) {
            AbstractC2875Bni.A01("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
            ((Runnable) this.A01).run();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        if (this.$t != 0) {
            C8124FUo c8124FUo = (C8124FUo) this.A00;
            C8125FUp c8125FUp = (C8125FUp) this.A01;
            c8124FUo.A02(c8125FUp, 1.0f, true);
            c8125FUp.A07 = c8125FUp.A04;
            c8125FUp.A05 = c8125FUp.A01;
            c8125FUp.A06 = c8125FUp.A03;
            int i = c8125FUp.A0C + 1;
            int[] iArr = c8125FUp.A0G;
            int length = i % iArr.length;
            c8125FUp.A0C = length;
            c8125FUp.A0D = iArr[length];
            if (!c8124FUo.A04) {
                c8124FUo.A01 += 1.0f;
                return;
            }
            c8124FUo.A04 = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (c8125FUp.A0F) {
                c8125FUp.A0F = false;
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.$t != 0) {
            ((C8124FUo) this.A00).A01 = 0.0f;
        }
    }
}
