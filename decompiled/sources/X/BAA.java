package X;

import android.view.View;
import android.view.Window;

/* loaded from: classes4.dex */
public abstract class BAA {
    public static void A00(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i = systemUiVisibility | 256;
        if (z) {
            i = systemUiVisibility & (-257);
        }
        decorView.setSystemUiVisibility(i);
        window.setDecorFitsSystemWindows(z);
    }
}
