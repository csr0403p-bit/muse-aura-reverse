package X;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes6.dex */
public final class FVY implements Runnable {
    public static final String __redex_internal_original_name = "SwipeDismissBehavior$SettleRunnable";
    public final View A00;
    public final boolean A01;
    public final /* synthetic */ SwipeDismissBehavior A02;

    public FVY(View view, SwipeDismissBehavior swipeDismissBehavior, boolean z) {
        this.A02 = swipeDismissBehavior;
        this.A00 = view;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FVc fVc;
        SwipeDismissBehavior swipeDismissBehavior = this.A02;
        FUL ful = swipeDismissBehavior.A03;
        if (ful != null && ful.A0D()) {
            this.A00.postOnAnimation(this);
        } else {
            if (!this.A01 || (fVc = swipeDismissBehavior.A04) == null) {
                return;
            }
            fVc.ASY(this.A00);
        }
    }
}
