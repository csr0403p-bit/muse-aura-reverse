package X;

import android.view.animation.Animation;

/* renamed from: X.FUi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class AnimationAnimationListenerC8118FUi implements Animation.AnimationListener {
    public final /* synthetic */ C8117FUh A00;

    public AnimationAnimationListenerC8118FUi(C8117FUh c8117FUh) {
        this.A00 = c8117FUh;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        InterfaceC7937FLj interfaceC7937FLj;
        C8117FUh c8117FUh = this.A00;
        if (!c8117FUh.A0L) {
            c8117FUh.A07();
            return;
        }
        C8124FUo c8124FUo = c8117FUh.A0H;
        c8124FUo.setAlpha(255);
        c8124FUo.start();
        if (c8117FUh.A0K && (interfaceC7937FLj = c8117FUh.A0J) != null) {
            interfaceC7937FLj.onRefresh();
        }
        c8117FUh.A04 = c8117FUh.A0G.getTop();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
