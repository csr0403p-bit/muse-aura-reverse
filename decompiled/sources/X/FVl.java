package X;

import android.content.res.Resources;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes6.dex */
public final class FVl implements Runnable {
    public static final String __redex_internal_original_name = "BottomSheetBehavior$SettleRunnable";
    public int A00;
    public boolean A01;
    public final View A02;
    public final /* synthetic */ BottomSheetBehavior A03;

    public FVl(View view, BottomSheetBehavior bottomSheetBehavior, int i) {
        this.A03 = bottomSheetBehavior;
        this.A02 = view;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        BottomSheetBehavior bottomSheetBehavior = this.A03;
        FUL ful = bottomSheetBehavior.A0J;
        if (ful == null || !ful.A0D()) {
            bottomSheetBehavior.A0A(this.A00);
        } else {
            this.A02.postOnAnimation(this);
        }
        this.A01 = false;
    }
}
