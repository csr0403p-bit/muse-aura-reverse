package X;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: X.Ap0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1717Ap0 implements InterfaceC1713Aow {
    @Override // X.InterfaceC1713Aow
    public void AMn(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
