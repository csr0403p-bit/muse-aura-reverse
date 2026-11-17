package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.animation.Interpolator;

/* loaded from: classes6.dex */
public final class F68 extends AnimatorListenerAdapter {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Interpolator A02;
    public final /* synthetic */ EnumC7948FMe A03;

    public F68(Context context, Interpolator interpolator, EnumC7948FMe enumC7948FMe, long j) {
        this.A01 = context;
        this.A03 = enumC7948FMe;
        this.A00 = j;
        this.A02 = interpolator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC7965FMw.A03(this.A01, this.A02, null, this.A03, Integer.valueOf((int) this.A00));
    }
}
