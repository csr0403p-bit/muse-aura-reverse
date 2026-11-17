package X;

import android.transition.Transition;

/* renamed from: X.FgM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8568FgM implements Transition.TransitionListener {
    public final /* synthetic */ C8565FgJ A00;
    public final /* synthetic */ Runnable A01;

    public C8568FgM(C8565FgJ c8565FgJ, Runnable runnable) {
        this.A00 = c8565FgJ;
        this.A01 = runnable;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.A01.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
