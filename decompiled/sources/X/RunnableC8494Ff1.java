package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.Ff1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8494Ff1 implements Runnable {
    public static final String __redex_internal_original_name = "WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$3";
    public final /* synthetic */ ValueAnimator A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C8492Fez A02;
    public final /* synthetic */ ViewOnApplyWindowInsetsListenerC8486Fet A03;
    public final /* synthetic */ C8490Fex A04;

    public RunnableC8494Ff1(ValueAnimator valueAnimator, View view, C8492Fez c8492Fez, ViewOnApplyWindowInsetsListenerC8486Fet viewOnApplyWindowInsetsListenerC8486Fet, C8490Fex c8490Fex) {
        this.A03 = viewOnApplyWindowInsetsListenerC8486Fet;
        this.A01 = view;
        this.A04 = c8490Fex;
        this.A02 = c8492Fez;
        this.A00 = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8487Feu.A01(this.A01, this.A02, this.A04);
        this.A00.start();
    }
}
