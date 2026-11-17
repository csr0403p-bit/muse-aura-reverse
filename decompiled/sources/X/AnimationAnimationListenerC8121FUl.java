package X;

import android.view.animation.Animation;

/* renamed from: X.FUl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class AnimationAnimationListenerC8121FUl implements Animation.AnimationListener {
    public final /* synthetic */ C8117FUh A00;

    public AnimationAnimationListenerC8121FUl(C8117FUh c8117FUh) {
        this.A00 = c8117FUh;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C8117FUh c8117FUh = this.A00;
        I0B i0b = new I0B(c8117FUh, 1);
        c8117FUh.A0F = i0b;
        i0b.setDuration(150L);
        C8119FUj c8119FUj = c8117FUh.A0G;
        c8119FUj.A01 = null;
        c8119FUj.clearAnimation();
        c8119FUj.startAnimation(c8117FUh.A0F);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
