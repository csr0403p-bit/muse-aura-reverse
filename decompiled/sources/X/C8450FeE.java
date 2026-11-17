package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.animation.Animation;

/* renamed from: X.FeE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8450FeE {
    public final AnimatorSet A00;
    public final Animation A01;

    public C8450FeE(Animator animator) {
        this.A01 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.A00 = animatorSet;
        animatorSet.play(animator);
    }

    public C8450FeE(Animation animation) {
        this.A01 = animation;
        this.A00 = null;
    }
}
