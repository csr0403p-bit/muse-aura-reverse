package X;

import android.animation.Animator;
import com.facebook.aura.R;
import java.util.AbstractMap;

/* loaded from: classes6.dex */
public final class F88 implements Animator.AnimatorListener {
    public final /* synthetic */ FBB A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public F88(FBB fbb, String str, boolean z) {
        this.A02 = z;
        this.A00 = fbb;
        this.A01 = str;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.A02) {
            FBB fbb = this.A00;
            ((AbstractMap) fbb.A03(R.id.bk_context_key_animations)).remove(this.A01);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.A02) {
            FBB fbb = this.A00;
            ((AbstractMap) fbb.A03(R.id.bk_context_key_animations)).remove(this.A01);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
