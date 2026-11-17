package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class FK7 implements ValueAnimator.AnimatorUpdateListener {
    public final RecyclerView A00;
    public final FK4 A01;

    public FK7(RecyclerView recyclerView, FK4 fk4) {
        this.A00 = recyclerView;
        this.A01 = fk4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A00 = AbstractC7609F5w.A03(valueAnimator);
        this.A00.invalidate();
    }
}
