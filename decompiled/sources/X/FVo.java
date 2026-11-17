package X;

import android.content.res.Resources;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes6.dex */
public final class FVo implements Runnable {
    public static final String __redex_internal_original_name = "BottomSheetBehavior$2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ BottomSheetBehavior A02;

    public FVo(View view, BottomSheetBehavior bottomSheetBehavior, int i) {
        this.A02 = bottomSheetBehavior;
        this.A01 = view;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        this.A02.A0B(this.A01, this.A00);
    }
}
