package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.FRn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8059FRn {
    public static WindowInsets A00(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static CharSequence A01(View view) {
        return view.getStateDescription();
    }
}
