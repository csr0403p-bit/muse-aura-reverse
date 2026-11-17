package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.FSb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8073FSb extends FSY {
    @Override // android.view.ViewGroup
    public final void detachViewFromParent(View view) {
        if (indexOfChild(view) != -1) {
            super.detachViewFromParent(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }
}
