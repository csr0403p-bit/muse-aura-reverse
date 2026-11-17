package X;

import android.graphics.Insets;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* loaded from: classes4.dex */
public abstract class B1P {
    public static final void A01(WindowManager.LayoutParams layoutParams) {
        layoutParams.setFitInsetsSides(0);
    }

    public static final void A02(WindowManager.LayoutParams layoutParams) {
        layoutParams.setFitInsetsTypes(0);
    }

    public static final int A00(Window window) {
        WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        Insets insets = currentWindowMetrics.getWindowInsets().getInsets(WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }
}
