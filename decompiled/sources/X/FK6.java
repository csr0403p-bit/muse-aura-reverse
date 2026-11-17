package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class FK6 implements Runnable {
    public static final String __redex_internal_original_name = "ScrollBarScrollListener$1";
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ FK5 A01;

    public FK6(RecyclerView recyclerView, FK5 fk5) {
        this.A00 = recyclerView;
        this.A01 = fk5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FK5 fk5 = this.A01;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        fk5.A00 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new FK7(this.A00, fk5.A03));
        fk5.A00.setDuration(200L);
        fk5.A00.start();
        fk5.A02 = false;
    }
}
