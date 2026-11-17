package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class FW3 implements Runnable {
    public static final String __redex_internal_original_name = "BaseTransientBottomBar$10";
    public final /* synthetic */ FW1 A00;

    public FW3(FW1 fw1) {
        this.A00 = fw1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator valueAnimator;
        FW1 fw1 = this.A00;
        FW2 fw2 = fw1.A0E;
        if (fw2 != null) {
            if (fw2.getParent() != null) {
                fw2.setVisibility(0);
            }
            if (fw2.A00 == 1) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setInterpolator(AbstractC8136FVz.A03);
                valueAnimatorOfFloat.addUpdateListener(new C8919Ftb(fw1, 7));
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                valueAnimatorOfFloat2.setInterpolator(AbstractC8136FVz.A04);
                valueAnimatorOfFloat2.addUpdateListener(new C8919Ftb(fw1, 8));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                animatorSet.setDuration(150L);
                I05.A00(animatorSet, fw1, 9);
                valueAnimator = animatorSet;
            } else {
                int height = fw2.getHeight();
                ViewGroup.LayoutParams layoutParams = fw2.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                }
                fw2.setTranslationY(height);
                ValueAnimator valueAnimator2 = new ValueAnimator();
                valueAnimator2.setIntValues(height, 0);
                valueAnimator2.setInterpolator(AbstractC8136FVz.A02);
                valueAnimator2.setDuration(250L);
                I05.A00(valueAnimator2, fw1, 10);
                valueAnimator2.addUpdateListener(new C8919Ftb(fw1, 9));
                valueAnimator = valueAnimator2;
            }
            valueAnimator.start();
        }
    }
}
