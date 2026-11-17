package X;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes4.dex */
public abstract class BA9 {
    public static void A00(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            BAJ.A00(window, z);
            return;
        }
        if (i >= 30) {
            BAA.A00(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i2 = systemUiVisibility | 1792;
        if (z) {
            i2 = systemUiVisibility & (-1793);
        }
        decorView.setSystemUiVisibility(i2);
    }
}
