package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: X.Ffq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class AnimationAnimationListenerC8537Ffq implements Animation.AnimationListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C8534Ffn A02;
    public final /* synthetic */ C8542Ffv A03;

    public AnimationAnimationListenerC8537Ffq(View view, ViewGroup viewGroup, C8534Ffn c8534Ffn, C8542Ffv c8542Ffv) {
        this.A03 = c8542Ffv;
        this.A01 = viewGroup;
        this.A00 = view;
        this.A02 = c8534Ffn;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        final ViewGroup viewGroup = this.A01;
        final View view = this.A00;
        final C8534Ffn c8534Ffn = this.A02;
        viewGroup.post(new Runnable() { // from class: X.Ffs
            public static final String __redex_internal_original_name = "DefaultSpecialEffectsController$AnimationEffect$onCommit$1$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                ViewGroup viewGroup2 = viewGroup;
                View view2 = view;
                C8534Ffn c8534Ffn2 = c8534Ffn;
                viewGroup2.endViewTransition(view2);
                ((AbstractC8538Ffr) c8534Ffn2.A00).A00.A04(c8534Ffn2);
            }
        });
        if (AbstractC8571FgQ.A0L()) {
            StringBuilder sbA0x = C60O.A0x("Animation from operation ");
            sbA0x.append(this.A03);
            AbstractC7610F5x.A1O(sbA0x, " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (AbstractC8571FgQ.A0L()) {
            StringBuilder sbA0x = C60O.A0x("Animation from operation ");
            sbA0x.append(this.A03);
            AbstractC7610F5x.A1O(sbA0x, " has reached onAnimationStart.");
        }
    }
}
