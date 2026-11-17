package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.Fdr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8428Fdr extends AnimatorListenerAdapter {
    public final /* synthetic */ DQd A00;
    public final /* synthetic */ AbstractC8429Fds A01;

    public C8428Fdr(DQd dQd, AbstractC8429Fds abstractC8429Fds) {
        this.A01 = abstractC8429Fds;
        this.A00 = dQd;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.remove(animator);
        this.A01.A0G.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A01.A0G.add(animator);
    }
}
