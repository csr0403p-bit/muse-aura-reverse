package X;

import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: X.FQu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8043FQu {
    public static WeakReference<C8040FQr> A00 = BV4.A0q(null);

    public static void A00(C8040FQr c8040FQr, float f) {
        ViewGroup.LayoutParams layoutParams = c8040FQr.getLayoutParams();
        if (layoutParams instanceof WindowManager.LayoutParams) {
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
            layoutParams2.verticalMargin = f;
            ViewManager viewManager = (ViewManager) c8040FQr.getContext().getSystemService("window");
            if (viewManager == null) {
                throw C3cG.A0Q("Window manager required but not found.");
            }
            viewManager.updateViewLayout(c8040FQr, layoutParams2);
        }
    }
}
