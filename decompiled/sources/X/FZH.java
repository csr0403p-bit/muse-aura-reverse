package X;

import android.widget.AbsListView;

/* loaded from: classes6.dex */
public abstract class FZH {
    public static boolean A01(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void A00(AbsListView absListView, boolean z) {
        absListView.setSelectedChildViewEnabled(z);
    }
}
