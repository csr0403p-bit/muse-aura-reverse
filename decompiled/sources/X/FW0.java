package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes6.dex */
public final class FW0 implements Runnable {
    public static final String __redex_internal_original_name = "BaseTransientBottomBar$3";
    public final /* synthetic */ FW1 A00;

    public FW0(FW1 fw1) {
        this.A00 = fw1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        FW1 fw1 = this.A00;
        FW2 fw2 = fw1.A0E;
        if (fw2 == null || (context = fw1.A0A) == null) {
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int[] iArr = new int[2];
        fw2.getLocationOnScreen(iArr);
        int height = (i - (iArr[1] + fw2.getHeight())) + ((int) fw2.getTranslationY());
        if (height < fw1.A02) {
            ViewGroup.LayoutParams layoutParams = fw2.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w("BaseTransientBottomBar", "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += fw1.A02 - height;
            fw2.requestLayout();
        }
    }
}
